package dev.dslam.vkapiclientbydanik.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.dslam.vkapiclientbydanik.R

@Composable
fun VkPostCard() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(), shape = RoundedCornerShape(2.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(4.dp)
        ) {
            VkPostCardHeader()
            VkPostCardBody()
            VkPostCardFooter()
        }
    }
}

@Composable
fun VkPostCardHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp), verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .background(Color.Black),
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(text = "Уволено", fontWeight = FontWeight.Bold, color = MaterialTheme.colors.onPrimary)
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "14:00", color = MaterialTheme.colors.onSecondary)
        }

        Icon(
            imageVector = Icons.Rounded.MoreVert,
            contentDescription = null,
            tint = MaterialTheme.colors.onSecondary
        )
    }
}

@Composable
fun VkPostCardBody() {
    Text(
        text = stringResource(R.string.template_text)
    )

    Image(
        modifier = Modifier.fillMaxWidth(),
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "",
        contentScale = ContentScale.FillWidth
    )
}

@Composable
fun VkPostCardFooter() {
    Row(
        modifier = Modifier.padding(top = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = R.drawable.ic_views_count), contentDescription = null)
            Text(
                modifier = Modifier.absolutePadding(left = 4.dp),
                text = "916",
                color = MaterialTheme.colors.onSecondary
            )
        }

        Spacer(modifier = Modifier.weight(2f))

        Row(modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = R.drawable.ic_share), contentDescription = null)
            Text(
                modifier = Modifier.absolutePadding(left = 4.dp),
                text = "7",
                color = MaterialTheme.colors.onSecondary
            )
        }
        Row(modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = R.drawable.ic_comment), contentDescription = null)
            Text(
                modifier = Modifier.absolutePadding(left = 4.dp),
                text = "8",
                color = MaterialTheme.colors.onSecondary
            )
        }
        Row(modifier = Modifier.weight(1f), verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = R.drawable.ic_like), contentDescription = null)
            Text(
                modifier = Modifier.absolutePadding(left = 4.dp),
                text = "23",
                color = MaterialTheme.colors.onSecondary
            )
        }
    }
}

@Preview
@Composable
fun PreviewLight() {
    VkApiClientByDanikTheme(darkTheme = false) {
        VkPostCard()
    }
}

@Preview
@Composable
fun PreviewDark() {
    VkApiClientByDanikTheme(darkTheme = true) {
        VkPostCard()
    }
}

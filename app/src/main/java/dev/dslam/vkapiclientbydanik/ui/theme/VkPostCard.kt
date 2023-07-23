package dev.dslam.vkapiclientbydanik.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.dslam.vkapiclientbydanik.R

@Preview
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
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Image(
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(Color.Black),
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = ""
                )

                Column(modifier = Modifier.absolutePadding(4.dp)) {
                    Text(text = "Уволено", fontWeight = FontWeight.Bold, color = Color.Black)
                    Text(text = "14:00", color = Color.Gray)
                }

                Spacer(modifier = Modifier.weight(1f))

                Image(painter = painterResource(id = R.drawable.ic_baseline_more_vert_24), contentDescription = "")
            }

            Text(
                text = "кабаныч когда узнал, что если сотрудникам не платить они начинают умирать от голода",
                color = Color.Black, modifier = Modifier.absolutePadding(top = 8.dp, bottom = 8.dp)
            )

            Image(
                modifier = Modifier.fillMaxWidth(),
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                contentScale = ContentScale.FillWidth
            )
        }
    }

}
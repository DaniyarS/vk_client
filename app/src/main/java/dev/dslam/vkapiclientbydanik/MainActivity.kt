package dev.dslam.vkapiclientbydanik

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.dslam.vkapiclientbydanik.ui.theme.VkApiClientByDanikTheme
import dev.dslam.vkapiclientbydanik.ui.theme.VkPostCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppBarTest()
        }
    }
}

@Composable
fun AppBarTest() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "TopAppBarTitle") },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Menu, contentDescription = null)
                    }
                }
            )
        },
        bottomBar = {
            val items = listOf("Songs", "Artists", "Playlists")
            BottomAppBar {
                BottomNavigation() {
                    BottomNavigationItem(
                        selected = true,
                        onClick = { /*TODO*/ },
                        icon = {
                            Icon(Icons.Filled.Favorite, contentDescription = null)
                        },
                        label = {
                            Text(text = "Favorite")
                        }
                    )

                    BottomNavigationItem(
                        selected = true,
                        onClick = { /*TODO*/ },
                        icon = {
                            Icon(Icons.Outlined.Edit, contentDescription = null)
                        },
                        label = {
                            Text(text = "Edit")
                        }
                    )

                    BottomNavigationItem(
                        selected = true,
                        onClick = { /*TODO*/ },
                        icon = {
                            Icon(Icons.Outlined.Delete, contentDescription = null)
                        },
                        label = {
                            Text(text = "Delete")
                        }
                    )
                }
            }
        },
        drawerContent = {
            Text(text = "text 1")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "text 2")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "text 3")
        }
    ) {

    }
}
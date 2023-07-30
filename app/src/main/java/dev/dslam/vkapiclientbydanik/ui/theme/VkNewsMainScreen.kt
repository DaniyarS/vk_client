package dev.dslam.vkapiclientbydanik.ui.theme

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource

@Composable
fun MainScreen() {
    Scaffold(
        bottomBar = {
            BottomNavigation {
                val items = listOf(NavigationItem.Home, NavigationItem.Favorite, NavigationItem.Profile)

                val selectedItemPosition = remember {
                    mutableStateOf(0)
                }

                items.forEachIndexed { idx, item ->
                    BottomNavigationItem(
                        selected = selectedItemPosition.value == idx,
                        onClick = { selectedItemPosition.value = idx },
                        icon = {
                            Icon(item.icon, contentDescription = null)
                        },
                        label = {
                            Text(text = stringResource(id = item.titleResId))
                        },
                        selectedContentColor = MaterialTheme.colors.onPrimary,
                        unselectedContentColor = MaterialTheme.colors.onSecondary
                    )
                }
            }
        }
    ) {

    }
}
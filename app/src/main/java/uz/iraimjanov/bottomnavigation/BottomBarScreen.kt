package uz.iraimjanov.bottomnavigation

import androidx.compose.ui.graphics.vector.ImageVector
import uz.iraimjanov.bottomnavigation.ui.theme.MyIcons

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector,
) {
    object Home : BottomBarScreen(
        route = "Home",
        title = "Home",
        icon = MyIcons.home,
    )

    object Profile : BottomBarScreen(
        route = "Profile",
        title = "Profile",
        icon = MyIcons.profile,
    )

    object Setting : BottomBarScreen(
        route = "Setting",
        title = "Setting",
        icon = MyIcons.setting,
    )
}

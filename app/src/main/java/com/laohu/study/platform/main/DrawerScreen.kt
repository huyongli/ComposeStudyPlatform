package com.laohu.study.platform.main

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.laohu.study.platform.ui.theme.CourseStudyPlatformTheme

@Composable
fun DrawerScreen() {
    Text(text = "Drawer")
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewDrawerScreen() {
    CourseStudyPlatformTheme {
        DrawerScreen()
    }
}
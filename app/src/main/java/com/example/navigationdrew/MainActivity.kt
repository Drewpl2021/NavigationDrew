package com.example.navigationdrew

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigationdrew.ui.presentation.component.MyAppDrawer
import com.example.navigationdrew.ui.theme.LightColorScheme
import com.example.navigationdrew.ui.theme.NavigationDREWTheme
import com.example.navigationdrew.ui.theme.ThemeType
import com.example.navigationdrew.ui.theme.darkBlueScheme
import com.example.navigationdrew.ui.theme.darkGreenScheme
import com.example.navigationdrew.ui.theme.darkRedScheme
import com.example.navigationdrew.ui.theme.darkYellowScheme
import com.example.navigationdrew.ui.theme.lighYellowtScheme
import com.example.navigationdrew.ui.theme.lightBlueScheme
import com.example.navigationdrew.ui.theme.lightGreenScheme
import com.example.navigationdrew.ui.theme.lightRedScheme
import com.example.navigationdrew.ui.utils.conttexto
import com.example.navigationdrew.ui.utils.isNight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val themeType= remember{ mutableStateOf(ThemeType.RED) }
            val darkThemex= isNight()
            val darkTheme = remember { mutableStateOf(darkThemex)}
            val colorScheme=when(themeType.value){
                ThemeType.RED->{if (darkTheme.value)
                    darkRedScheme else
                    lightRedScheme}
                ThemeType.GREEN->{if (darkTheme.value)
                    darkGreenScheme else
                    lightGreenScheme}
                ThemeType.YELLOW->{if (darkTheme.value)
                    darkYellowScheme else
                    lighYellowtScheme}
                ThemeType.BLUE->{if (darkTheme.value)
                    darkBlueScheme else
                    lightBlueScheme}
                else->{lightGreenScheme}
            }
            conttexto.CONTEXTO_APPX=this

            NavigationDREWTheme(colorScheme = colorScheme) {
                /*Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }*/
                MyAppDrawer(darkMode = darkTheme, themeType = themeType)
                }

            }
        }
    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavigationDREWTheme(colorScheme = lightGreenScheme) {
        Greeting("Android")
    }
}
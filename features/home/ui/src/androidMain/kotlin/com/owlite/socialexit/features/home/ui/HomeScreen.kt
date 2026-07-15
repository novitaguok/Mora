package com.owlite.socialexit.features.home.ui

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.owlite.socialexit.core.designsystem.theme.OrbitronFontFamily
import com.owlite.socialexit.core.designsystem.theme.SeTheme
import kotlin.random.Random

@Composable
fun HomeScreen() {
    SeTheme {
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
        ) {
            item {
                Header()
            }
            item {
                StatusCard(
                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp),
                )
            }
            item {
                TriggerOption(
                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp),
                )
            }
            item {
                ScriptOption(
                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp),
                )
            }
        }
    }
}

@Composable
fun Header(modifier: Modifier = Modifier) {
    val title =
        buildAnnotatedString {
            append("SocialExit")
            addStyle(style = SpanStyle(color = Color.White), start = 0, end = 6)
            addStyle(style = SpanStyle(color = Color.Green), start = 6, end = 10)
        }

    Text(
        modifier = modifier,
        text = title,
        fontSize = 40.sp,
        fontFamily = OrbitronFontFamily,
    )
}

@Composable
fun StatusCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        border =
            BorderStroke(
                width = 1.dp,
                color = Color.Gray,
            ),
        colors =
            CardDefaults.cardColors(
                containerColor = Color.Transparent,
            ),
    ) {
        Surface(color = Color.Transparent) {
            Column {
                Text(
                    text = "STATUS",
                    color = Color.White,
                ) // TODO: Armed/waiting, Call in Progress, Disarmed, Cooldown
                Text(
                    text = "Ready to arm",
                    color = Color.White,
                )
                Button(
                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp),
                    onClick = {},
                ) {
                    Text(
                        text = "ARM GUARDIAN ANGEL",
                        textAlign = TextAlign.Center,
                    )
                }
            }
        }
    }
}

/**
 * Trigger Methods
 */
@Composable
fun TriggerOption(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text("TRIGGER METHOD", color = Color.White)
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            items(3) {
                TriggerOptionButton()
            }
        }
    }
}

@Composable
fun TriggerOptionButton(modifier: Modifier = Modifier) {
    Button(modifier = modifier, onClick = {}) {
        Text("Triple Tap")
    }
}

/**
 * Choose Script
 */
data class Script(
    val id: String,
    val title: String,
    val description: String,
    val emoji: String,
)

@Composable
fun ScriptOption(modifier: Modifier = Modifier) {
    val scripts =
        remember {
            listOf(
                Script(
                    "1",
                    "Car being towed",
                    "Neighbor spotted the truck",
                    "🚗",
                ),
                Script("2", "Babysitter SOS", "Needs the emergency key", "👶"),
                Script("3", "Alarm triggered", "Home security alert", "🔥"),
            )
        }

    // Keep track of which script ID is currently selected
    var selectedScriptId by remember { mutableStateOf("1") }

    Column(
        modifier =
            Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(vertical = 16.dp),
    ) {
        Text(
            text = "CHOOSE SCRIPT",
            color = Color.Gray,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 16.dp, bottom = 8.dp),
        )

        scripts.forEach { script ->
            ScriptCard(
                script = script,
                isSelected = script.id == selectedScriptId,
                onClick = { selectedScriptId = script.id },
            )
        }
    }
}

@Composable
fun ScriptCard(
    modifier: Modifier = Modifier,
    script: Script,
    isSelected: Boolean,
    onClick: () -> Unit,
) {
    val animatedBorderColor =
        animateColorAsState(
            targetValue =
                if (isSelected) {
                    MaterialTheme.colorScheme.primary
                } else {
                    Color.Gray
                },
            label = "borderColor",
        )

    Row(
        modifier =
            modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 6.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Transparent)
                .border(
                    width = 1.5.dp,
                    color = animatedBorderColor.value,
                    shape = RoundedCornerShape(16.dp),
                ).clickable { onClick() }
                .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier =
                Modifier
                    .size(44.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(
                        Color(
                            red = Random.nextInt(256),
                            green = Random.nextInt(256),
                            blue = Random.nextInt(256),
                        ).copy(alpha = .3f),
                    ),
            contentAlignment = Alignment.Center,
        ) {
            Text(text = script.emoji, fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.width(16.dp))

        Column(
            modifier = Modifier.weight(1f),
        ) {
            Text(
                text = script.title,
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = script.description,
                color = Color.White,
                fontSize = 14.sp,
            )
        }

        Spacer(modifier = Modifier.width(16.dp))

        if (isSelected) {
            Box(
                modifier =
                    Modifier
                        .size(24.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.primary),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Selected",
                    tint = Color.Black,
                    modifier = Modifier.size(16.dp),
                )
            }
        } else {
            Box(
                modifier =
                    Modifier
                        .size(24.dp)
                        .border(
                            width = 2.dp,
                            color = Color.Gray,
                            shape = CircleShape,
                        ),
            )
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Card(
                title = stringResource(R.string.text_composable),
                description = stringResource(R.string.description_composable),
                modifier = Modifier.weight(1f),
                backgroundColor = Color(0xFFEADDFF)
            )
            Card(
                title = stringResource(R.string.image_composable),
                description = stringResource(R.string.description_image),
                modifier = Modifier.weight(1f),
                backgroundColor = Color(0xFFD0BCFF)
            )
        }

        Row(
            modifier = Modifier.weight(1f)
        ) {
            Card(
                title = stringResource(R.string.row_composable),
                description = stringResource(R.string.description_row),
                modifier = Modifier.weight(1f),
                backgroundColor = Color(0xFFB69DF8)
            )
            Card(
                title = stringResource(R.string.column_composable),
                description = stringResource(R.string.description_column),
                modifier = Modifier.weight(1f),
                backgroundColor = Color(0xFFF6EDFF)
            )
        }
    }
}

@Composable
fun Card(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            color = Color.Black,
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            color = Color.Black,
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Justify,
            modifier = modifier
        )
    }
}
package fdez.collados.fco.javier.t01p02tabs.views.taskmanager

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fdez.collados.fco.javier.t01p02tabs.R

@Composable
fun TaskManagerView(
    painter: Painter,
    taskCompleted: String,
    niceWork: String,
    modifier: Modifier = Modifier

) {

    Column (
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painter,
            contentDescription = stringResource(R.string.green_v_icon_content_description)
        )

        Text(
            text = taskCompleted,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    top = 24.dp,
                    bottom = 8.dp
                )
        )

        Text(
            text = niceWork,
            fontSize = 16.sp
        )

    }

}
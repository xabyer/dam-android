package fdez.collados.fco.javier.businesscard.views.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fdez.collados.fco.javier.businesscard.R

@Composable
fun ProfileCard(
    painter: Painter,
    contentDescription: String,
    profileName: String,
    profileTitle: String,
    modifier: Modifier = Modifier
) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .padding(top = 16.dp)
        ) {
            Image(
                painter,
                contentDescription,
                modifier = modifier
                    .background(Color(0xFF073042))
                    .height(80.dp)
            )

            Text(
                profileName,
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraLight,
                modifier = modifier
                    .padding(top = 8.dp)
            )

            Text(
                profileTitle,
                color = Color(0xFF006D3B),
                modifier = modifier
                    .padding(top = 8.dp)

            )
        }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ProfileCardPreview() {
    ProfileCard(
        painterResource(R.drawable.android_logo),
        stringResource(R.string.android_logo),
        stringResource(R.string.profile_name),
        stringResource(R.string.profile_title)
    )
}
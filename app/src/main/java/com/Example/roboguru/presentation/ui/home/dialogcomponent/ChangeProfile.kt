package com.Example.roboguru.presentation.ui.home.dialogcomponent


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.Example.roboguru.R
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun ChangeProfile(onDismiss: () -> Unit) {
    var editeDialog by remember { mutableStateOf(false) }

    val level = remember { mutableStateOf(TextFieldValue("Higher Education")) }
    val Class = remember { mutableStateOf(TextFieldValue("Higher Education")) }
    val dropdownItemsLevel =
        listOf("Option 1", "Option 2", "Option 3", "Option 4", "Option 5") // List of items
    val dropdownItemsClass =
        listOf("Option 1", "Option 2", "Option 3", "Option 4", "Option 5") // List of items
    val expandedLevel =
        remember { mutableStateOf(false) } // State to control dropdown visibility for level
    val expandedClass =
        remember { mutableStateOf(false) } // State to control dropdown visibility for class
    val blueGradient = Brush.linearGradient(
        colors = listOf(Color(0xff63A7D4), Color(0xffF295BE))
    )
    var showAddScenariosDialog by remember { mutableStateOf(false) }
    if (showAddScenariosDialog) {
        ChangeProfile(onDismiss = { showAddScenariosDialog = false })
    }
    Dialog(
        onDismissRequest = { onDismiss() },
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Box(
            modifier = Modifier
                .statusBarsPadding()
                .fillMaxWidth()
                .fillMaxSize()
                .background(Color(0x66000000), shape = RoundedCornerShape(20.sdp))
                .clickable { onDismiss() }, contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 20.sdp, end = 20.sdp)
                    .height(210.sdp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.sdp))
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Change Level",
                    fontFamily = FontFamily(Font(R.font.catalishhunteraitalic)),
                    fontSize = 15.ssp,
                    color = Color(0xff2494DE),
                    modifier = Modifier.padding(top = 10.sdp)
                )
                Text(
                    "On your Incredible Success",
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(Font(R.font.ralrag)),
                    fontSize = 11.ssp,
                    color = Color(0x80000000),
                )
                Column(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 9.sdp, end = 5.sdp, start = 5.sdp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            "Change Level:-",
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily(Font(R.font.ralrag)),
                            fontSize = 11.ssp,
                            color = Color(0x80000000),
                        )
                        Spacer(modifier = Modifier.padding(start = 3.sdp))
                        Box(
                            modifier = Modifier
                                .width(130.sdp)
                                .height(28.sdp)
                                .background(Color(0x32FFFFFF), shape = RoundedCornerShape(5.sdp))
                                .border(
                                    width = 1.sdp, // Thickness of the border
                                    color = Color(0x4D000000), // Border color
                                    shape = RoundedCornerShape(5.sdp) // Matching shape with the background
                                )
                        ) {
                            BasicTextField(
                                value = level.value,
                                onValueChange = { level.value = it },
                                textStyle = TextStyle(
                                    color = Color(0x80000000), fontSize = 11.ssp
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 3.sdp, end = 4.sdp)
                                    .align(Alignment.CenterStart),
                                singleLine = true
                            )
                            Icon(imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "Dropdown",
                                modifier = Modifier
                                    .align(Alignment.CenterEnd)
                                    .clickable { expandedLevel.value = true }
                                    .padding(end = 8.sdp),
                                tint = Color(0x4D000000))
                            DropdownMenu(
                                expanded = expandedLevel.value,
                                onDismissRequest = { expandedLevel.value = false },
                                modifier = Modifier.border(
                                    width = 5.sdp,
                                    color = Color.White,
                                    shape = RoundedCornerShape(4.sdp)
                                )
                            ) {
                                dropdownItemsLevel.forEach { item ->
                                    DropdownMenuItem(onClick = {
                                        level.value = TextFieldValue(item)
                                        expandedLevel.value = false
                                    }) {
                                        Text(text = item)
                                    }
                                }
                            }
                        }
                    }

                    // Class Row
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 6.sdp, end = 5.sdp, start = 5.sdp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            "Change class:-",
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily(Font(R.font.ralrag)),
                            fontSize = 11.ssp,
                            color = Color(0x80000000),
                        )
                        Spacer(modifier = Modifier.padding(start = 5.sdp))
                        Box(
                            modifier = Modifier
                                .width(130.sdp)
                                .height(28.sdp)
                                .background(Color(0x32FFFFFF), shape = RoundedCornerShape(5.sdp))
                                .border(
                                    width = 1.sdp,
                                    color = Color(0x4D000000),
                                    shape = RoundedCornerShape(5.sdp)
                                )
                        ) {
                            BasicTextField(
                                value = Class.value,
                                onValueChange = { Class.value = it },
                                textStyle = TextStyle(
                                    color = Color(0x80000000), fontSize = 11.ssp
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 3.sdp, end = 4.sdp)
                                    .align(Alignment.CenterStart),
                                singleLine = true
                            )
                            Icon(imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "Dropdown",
                                modifier = Modifier
                                    .align(Alignment.CenterEnd)
                                    .clickable { expandedClass.value = true }
                                    .padding(end = 8.sdp),
                                tint = Color(0x4D000000))
                            DropdownMenu(
                                expanded = expandedClass.value,
                                onDismissRequest = { expandedClass.value = false },
                                modifier = Modifier.border(
                                    width = 5.sdp,
                                    color = Color.White,
                                    shape = RoundedCornerShape(4.sdp)
                                )
                            ) {
                                dropdownItemsClass.forEach { item ->
                                    DropdownMenuItem(onClick = {
                                        Class.value = TextFieldValue(item)
                                        expandedClass.value = false
                                    }) {
                                        Text(text = item)
                                    }
                                }
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.padding(top = 9.sdp))
                Button(
                    onClick = {
                        editeDialog = true

                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .padding(start = 20.sdp, end = 20.sdp)
                        .size(width = 175.sdp, height = 35.sdp)
                        .background(blueGradient, shape = RoundedCornerShape(30.sdp))
                ) {
                    Text(
                        text = "LET’S START",
                        fontSize = 11.ssp,
                        fontFamily = FontFamily(Font(R.font.medium))
                    )
                }
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Text(
                        text = "www.roboguru.com",
                        modifier = Modifier.padding(start = 40.sdp, end = 40.sdp, bottom = 10.sdp),
                        style = TextStyle(
                            color = Color(0x80000000),
                            fontSize = 10.ssp,
                        ),
                        textAlign = TextAlign.Center
                    )
                }

            }
        }
        if (editeDialog) {
            EditProfile(onDismiss = { editeDialog = false })
        }
    }
}


@Composable
fun EditProfile(onDismiss: () -> Unit) {
    val level = remember { mutableStateOf(TextFieldValue("English standard")) }
    val email = remember { mutableStateOf(TextFieldValue("alisha.dome@sample.com")) }
    val dropdownItemsLevel =
        listOf("Option 1", "Option 2", "Option 3", "Option 4", "Option 5") // List of items
    val dropdownItemsClass =
        listOf("Option 1", "Option 2", "Option 3", "Option 4", "Option 5") // List of items
    val expandedLevel =
        remember { mutableStateOf(false) } // State to control dropdown visibility for level
    val expandedClass =
        remember { mutableStateOf(false) } // State to control dropdown visibility for class
    val blueGradient = Brush.linearGradient(
        colors = listOf(Color(0xff63A7D4), Color(0xffF295BE))
    )
    var showAddScenariosDialog by remember { mutableStateOf(false) }
    if (showAddScenariosDialog) {
        EditProfile(onDismiss = { showAddScenariosDialog = false })
    }
    Dialog(
        onDismissRequest = { onDismiss() },
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Box(
            modifier = Modifier
                .statusBarsPadding()
                .fillMaxWidth()
                .fillMaxSize()
                .background(Color(0x66000000), shape = RoundedCornerShape(20.sdp))
                .clickable { onDismiss() }, contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 20.sdp, end = 20.sdp)
                    .height(360.sdp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.sdp))
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Edit Profile",
                    fontFamily = FontFamily(Font(R.font.catalishhunteraitalic)),
                    fontSize = 15.ssp,
                    color = Color(0xff2494DE),
                    modifier = Modifier.padding(top = 10.sdp)
                )
                Text(
                    "On your Incredible Success",
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(Font(R.font.ralrag)),
                    fontSize = 11.ssp,
                    color = Color(0x80000000),
                )
                Card(
                    modifier = Modifier
                        .height(80.sdp)
                        .width(75.sdp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.profileimg),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        "Alisha Dome",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily(Font(R.font.ralsemibo)),
                        fontSize = 17.ssp,
                        color = Color(0x80000000),
                    )
                    Spacer(modifier = Modifier.padding(start = 3.sdp))
                    Image(painter = painterResource(R.drawable.editicon), contentDescription = null)
                }
                Spacer(modifier = Modifier.padding(top = 3.sdp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        "Higher Education",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily(Font(R.font.ralsemibo)),
                        fontSize = 12.ssp,
                        color = Color(0x80000000),
                    )
                    Spacer(modifier = Modifier.padding(start = 4.sdp))
                    Image(
                        painter = painterResource(R.drawable.droupdownicon),
                        contentDescription = null
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.sdp)
                        .background(color = Color(0x26000000)),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Text(
                        text = buildAnnotatedString {
                            append("Class XII")
                            withStyle(
                                style = SpanStyle(
                                    fontSize = 9.ssp, // Superscript font size
                                    baselineShift = BaselineShift.Superscript // Superscript positioning
                                )
                            ) {
                                append("th")
                            }
                        },
                        style = TextStyle(
                            color = Color.Gray, // Adjusted to match the image
                            fontSize = 15.ssp, // Main text size
                        ),
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily(Font(R.font.ralsemibo))
                    )
                }
                Column(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 9.sdp, end = 5.sdp, start = 5.sdp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            "Language:-",
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily(Font(R.font.ralrag)),
                            fontSize = 11.ssp,
                            color = Color(0x80000000),
                        )
                        Spacer(modifier = Modifier.padding(start = 3.sdp))
                        Box(
                            modifier = Modifier
                                .width(110.sdp)
                                .height(28.sdp)
                                .background(Color(0x32FFFFFF), shape = RoundedCornerShape(5.sdp))
                                .border(
                                    width = 1.sdp, // Thickness of the border
                                    color = Color(0x4D000000), // Border color
                                    shape = RoundedCornerShape(5.sdp) // Matching shape with the background
                                )
                        ) {
                            BasicTextField(
                                value = level.value,
                                onValueChange = { level.value = it },
                                textStyle = TextStyle(
                                    color = Color(0x80000000), fontSize = 11.ssp
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 3.sdp, end = 4.sdp)
                                    .align(Alignment.CenterStart),
                                singleLine = true
                            )
                            Icon(imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "Dropdown",
                                modifier = Modifier
                                    .align(Alignment.CenterEnd)
                                    .clickable { expandedLevel.value = true }
                                    .padding(end = 8.sdp),
                                tint = Color(0x4D000000))
                            DropdownMenu(
                                expanded = expandedLevel.value,
                                onDismissRequest = { expandedLevel.value = false },
                                modifier = Modifier.border(
                                    width = 5.sdp,
                                    color = Color.White,
                                    shape = RoundedCornerShape(4.sdp)
                                )
                            ) {
                                dropdownItemsLevel.forEach { item ->
                                    DropdownMenuItem(onClick = {
                                        level.value = TextFieldValue(item)
                                        expandedLevel.value = false
                                    }) {
                                        Text(text = item)
                                    }
                                }
                            }
                        }
                    }

                    // Class Row
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 6.sdp, end = 5.sdp, start = 5.sdp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            "Email ID:-",
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily(Font(R.font.ralrag)),
                            fontSize = 11.ssp,
                            color = Color(0x80000000),
                        )
                        Spacer(modifier = Modifier.padding(start = 5.sdp))
                        Box(
                            modifier = Modifier
                                .width(160.sdp)
                                .height(28.sdp)
                                .background(Color(0x32FFFFFF), shape = RoundedCornerShape(5.sdp))
                                .border(
                                    width = 1.sdp,
                                    color = Color(0x4D000000),
                                    shape = RoundedCornerShape(5.sdp)
                                )
                        ) {
                            BasicTextField(
                                value = email.value,
                                onValueChange = { email.value = it },
                                textStyle = TextStyle(
                                    color = Color(0x80000000), fontSize = 11.ssp
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 3.sdp, end = 4.sdp)
                                    .align(Alignment.CenterStart),
                                singleLine = true
                            )
                            Icon(imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "Dropdown",
                                modifier = Modifier
                                    .align(Alignment.CenterEnd)
                                    .clickable { expandedClass.value = true }
                                    .padding(end = 8.sdp),
                                tint = Color(0x4D000000))
                            DropdownMenu(
                                expanded = expandedClass.value,
                                onDismissRequest = { expandedClass.value = false },
                                modifier = Modifier.border(
                                    width = 5.sdp,
                                    color = Color.White,
                                    shape = RoundedCornerShape(4.sdp)
                                )
                            ) {
                                dropdownItemsClass.forEach { item ->
                                    DropdownMenuItem(onClick = {
                                        email.value = TextFieldValue(item)
                                        expandedClass.value = false
                                    }) {
                                        Text(text = item)
                                    }
                                }
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.padding(top = 9.sdp))
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .padding(start = 20.sdp, end = 20.sdp)
                        .size(width = 175.sdp, height = 35.sdp)
                        .background(blueGradient, shape = RoundedCornerShape(30.sdp))
                ) {
                    Text(
                        text = "LET’S START",
                        fontSize = 11.ssp,
                        fontFamily = FontFamily(Font(R.font.medium))
                    )
                }
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Text(
                        text = "www.roboguru.com",
                        modifier = Modifier.padding(start = 40.sdp, end = 40.sdp, bottom = 10.sdp),
                        style = TextStyle(
                            color = Color(0x80000000),
                            fontSize = 10.ssp,
                        ),
                        textAlign = TextAlign.Center
                    )
                }

            }
        }
    }
}
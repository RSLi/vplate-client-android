# VPlate Client

Made for a hardware hackathon. First time using Raspberry Pi 3. This is the Client-side Android app for VPlate (initially named FoodFrisbee) that utilizes Google assistant's voice control.

Basically, we connected to a Pi via wifi on an Android device with hotspot where a python server on the Pi has established a socket connection on static ip. The Pi in turn connects to an H-bridge controlling the motor of our robot.

The server side code is in this repo: [vplate-server-pi3](https://github.com/fanzhe98/vplate-server-pi3)

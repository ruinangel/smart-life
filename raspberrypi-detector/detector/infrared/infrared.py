#coding=utf8
import RPi.GPIO as GPIO
import time

#infrared senor
Pin_Infrared_Sensor=23
#voice sensor
Pin_Voice_Sensor=5
#led light
Pin_Light=18
#bee louder
Pin_Bee=17

GPIO.setmode(GPIO.BCM)
GPIO.setwarnings(False)
GPIO.setup(Pin_Light, GPIO.OUT)
GPIO.setup(Pin_Bee, GPIO.OUT)
#GPIO.setup(Pin_Voice_Sensor, GPIO.IN, pull_up_down=GPIO.PUD_UP) #voice sensor
GPIO.setup(Pin_Infrared, GPIO.IN)

try:
    while True:
        #if GPIO.input(Pin_Voice_Sensor) == 0:
        if GPIO.input(Pin_Infrared_Sensor) == True:
            print('comming....')
            GPIO.output(Pin_Light, True)
            GPIO.output(Pin_Bee, GPIO.HIGH)
            GPIO.output(Pin_Light, False)
            GPIO.output(Pin_Bee, GPIO.LOW)
            time.sleep(1)
	if GPIO.input(Pin_Infrared_Sensor) == False:
	    print('none....')
	    time.sleep(1)
except KeyboardInterrupt: #Ctrl+C interrupt
    GPIO.cleanup()

#!/usr/bin/env python
#coding=utf8
import RPi.GPIO as GPIO
import time

#switcher pin
Pin_1=5
Pin_2=6
Pin_3=13
Pin_4=19

GPIO.setmode(GPIO.BCM)
GPIO.setwarnings(False)
GPIO.setup(Pin_1, GPIO.OUT)
GPIO.setup(Pin_2, GPIO.OUT)
GPIO.setup(Pin_3, GPIO.OUT)
GPIO.setup(Pin_4, GPIO.OUT)

try:
    while True:
    	print('turn on...')
        GPIO.output(Pin_1, True)
        GPIO.output(Pin_2, True)
        GPIO.output(Pin_3, True)
        GPIO.output(Pin_4, True)
	time.sleep(2)
	print('turn off...')
        GPIO.output(Pin_1, False)
        GPIO.output(Pin_2, False)
        GPIO.output(Pin_3, False)
        GPIO.output(Pin_4, False)
        time.sleep(2)
except KeyboardInterrupt: #Ctrl+C interrupt
        GPIO.output(Pin_1, False)
        GPIO.output(Pin_2, False)
        GPIO.output(Pin_3, False)
        GPIO.output(Pin_4, False)
    GPIO.cleanup()

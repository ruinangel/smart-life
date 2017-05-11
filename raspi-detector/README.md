# 基于python2.7的各种传感器联通

需要先解压并安装python库【/py-detector/resource/RPi.GPIO-0.6.3.tar.gz】才能使用树莓派的端口监听功能。

#### 在树莓派上安装GPIO
GPIO因为需要用到树莓派上的IO针脚，因此只能成功的安装到树莓派上。我曾尝试了Ubuntu和MacOS，都安装失败了。

1.在线安装
- 查看Python环境 ```python --version```
- 安装pip ```sudo easy_install pip ```
- 安装GPIO ```sudo pip install RPi.GPIO```

2.通过/respi-detector/resource/RPi.GPIO-0.6.3.tar.gz安装
- 解压缩 ```tar zxvf RPi.GPIO-0.6.3.tar.gz```
- 进入目录 ```cd RPi.GPIO-0.6.3```
- 开始安装 ```sudo python setup.py install```
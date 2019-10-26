# HON-SDK 

> Huawei Open Network - Software Development Kit for distributed applications
> wiki: [http://159.138.3.74/mediawiki/index.php/%E9%A6%96%E9%A1%B5](http://159.138.3.74/mediawiki/index.php/%E9%A6%96%E9%A1%B5)

## Overall Architecture
![](https://github.com/SJTU-OpenNetwork/D-SDK/blob/master/doc/image/architecture2.png)

## 迁移至第一版SDK说明
1. 把dependency中`io.textile:textile:version` 改成`sjtu.opennet:hon:0.0.1-alpha`
2. maven中增加
	```
    maven {
        url 'http://202.120.38.131:9081/repository/SJTU-OpenNetwork/'
    }
	```
3. 代码中`io.textile.pb` 改成`sjtu.opennet.textilepb`
4. 代码中`io.textile.textile` 改成`sjtu.opennet.hon`

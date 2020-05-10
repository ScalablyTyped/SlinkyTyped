package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSystemInfoResult extends js.Object {
  /**
    * App平台
    */
  var AppPlatform: js.UndefOr[String] = js.native
  /**
    * 客户端基础库版本
    */
  var SDKVersion: js.UndefOr[String] = js.native
  /**
    * 允许微信使用相册的开关（仅 iOS 有效）
    */
  var albumAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 当前运行的客户端
    */
  var app: js.UndefOr[String] = js.native
  /**
    * 宿主APP名称
    */
  var appName: js.UndefOr[String] = js.native
  /**
    * 蓝牙的系统开关
    */
  var bluetoothEnabled: js.UndefOr[Boolean] = js.native
  /**
    * 手机品牌
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * 上一次缓存的位置信息
    */
  var cacheLocation: js.UndefOr[js.Any] = js.native
  /**
    * 允许微信使用摄像头的开关
    */
  var cameraAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 当前电量百分比
    */
  var currentBattery: js.UndefOr[String] = js.native
  /**
    * 用户字体大小设置
    */
  var fontSizeSetting: js.UndefOr[Double] = js.native
  /**
    * 宿主平台
    */
  var host: js.UndefOr[String] = js.native
  /**
    * 程序设置的语言
    */
  var language: js.UndefOr[String] = js.native
  /**
    * 允许微信使用定位的开关
    */
  var locationAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 地理位置的系统开关
    */
  var locationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * 允许微信使用麦克风的开关
    */
  var microphoneAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 手机型号
    */
  var model: js.UndefOr[String] = js.native
  /**
    * 导航栏的高度
    */
  var navigationBarHeight: js.UndefOr[Double] = js.native
  /**
    * 允许微信通知带有提醒的开关（仅 iOS 有效）
    */
  var notificationAlertAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 允许微信通知的开关
    */
  var notificationAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 允许微信通知带有标记的开关（仅 iOS 有效）
    */
  var notificationBadgeAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 允许微信通知带有声音的开关（仅 iOS 有效）
    */
  var notificationSoundAuthorized: js.UndefOr[Boolean] = js.native
  /**
    * 设备像素比
    */
  var pixelRatio: js.UndefOr[Double] = js.native
  /**
    * 客户端平台
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * 在竖屏正方向下的安全区域
    */
  var safeArea: js.UndefOr[SafeAreaResult] = js.native
  /**
    * 屏幕高度
    */
  var screenHeight: js.UndefOr[Double] = js.native
  /**
    * 屏幕宽度
    */
  var screenWidth: js.UndefOr[Double] = js.native
  /**
    * 状态栏的高度
    */
  var statusBarHeight: js.UndefOr[Double] = js.native
  /**
    * 设备磁盘容量
    */
  var storage: js.UndefOr[String] = js.native
  /**
    * 宿主平台版本号
    */
  var swanNativeVersion: js.UndefOr[String] = js.native
  /**
    * 操作系统版本
    */
  var system: js.UndefOr[String] = js.native
  /**
    * 标题栏高度
    */
  var titleBarHeight: js.UndefOr[Double] = js.native
  /**
    * 引擎版本号
    */
  var version: js.UndefOr[Double] = js.native
  /**
    * Wi-Fi 的系统开关
    */
  var wifiEnabled: js.UndefOr[Boolean] = js.native
  /**
    * 可使用窗口的底部位置
    */
  var windowBottom: js.UndefOr[Double] = js.native
  /**
    * 可使用窗口高度
    */
  var windowHeight: js.UndefOr[Double] = js.native
  /**
    * 可使用窗口的顶部位置
    */
  var windowTop: js.UndefOr[Double] = js.native
  /**
    * 可使用窗口宽度
    */
  var windowWidth: js.UndefOr[Double] = js.native
}

object GetSystemInfoResult {
  @scala.inline
  def apply(): GetSystemInfoResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSystemInfoResult]
  }
  @scala.inline
  implicit class GetSystemInfoResultOps[Self <: GetSystemInfoResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppPlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppPlatform")(js.undefined)
        ret
    }
    @scala.inline
    def withSDKVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SDKVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSDKVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SDKVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAlbumAuthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumAuthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbumAuthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumAuthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(js.undefined)
        ret
    }
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(js.undefined)
        ret
    }
    @scala.inline
    def withBluetoothEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBluetoothEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bluetoothEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withBrand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheLocation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withCameraAuthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraAuthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameraAuthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraAuthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentBattery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentBattery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentBattery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentBattery")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSizeSetting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSizeSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationAuthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationAuthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationAuthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationAuthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrophoneAuthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphoneAuthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrophoneAuthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microphoneAuthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationBarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBarHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationBarHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBarHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationAlertAuthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationAlertAuthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationAlertAuthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationAlertAuthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationAuthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationAuthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationAuthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationAuthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationBadgeAuthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationBadgeAuthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationBadgeAuthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationBadgeAuthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationSoundAuthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationSoundAuthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationSoundAuthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationSoundAuthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeArea(value: SafeAreaResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeArea")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusBarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusBarHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(js.undefined)
        ret
    }
    @scala.inline
    def withSwanNativeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swanNativeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwanNativeVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swanNativeVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleBarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBarHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleBarHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleBarHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withWifiEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWifiEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowTop")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowWidth")(js.undefined)
        ret
    }
  }
  
}


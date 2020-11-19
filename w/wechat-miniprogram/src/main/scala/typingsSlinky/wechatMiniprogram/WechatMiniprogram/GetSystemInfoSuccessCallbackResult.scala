package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.dark
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSystemInfoSuccessCallbackResult extends js.Object {
  
  /** 客户端基础库版本
    *
    * 最低基础库： `1.1.0` */
  var SDKVersion: String = js.native
  
  /** 允许微信使用相册的开关（仅 iOS 有效）
    *
    * 最低基础库： `2.6.0` */
  var albumAuthorized: Boolean = js.native
  
  /** 设备性能等级（仅Android小游戏）。取值为：-2 或 0（该设备无法运行小游戏），-1（性能未知），>=1（设备性能值，该值越高，设备性能越好，目前最高不到50）
    *
    * 最低基础库： `1.8.0` */
  var benchmarkLevel: Double = js.native
  
  /** 蓝牙的系统开关
    *
    * 最低基础库： `2.6.0` */
  var bluetoothEnabled: Boolean = js.native
  
  /** 设备品牌
    *
    * 最低基础库： `1.5.0` */
  var brand: String = js.native
  
  /** 允许微信使用摄像头的开关
    *
    * 最低基础库： `2.6.0` */
  var cameraAuthorized: Boolean = js.native
  
  var errMsg: String = js.native
  
  /** 用户字体大小（单位px）。以微信客户端「我-设置-通用-字体大小」中的设置为准
    *
    * 最低基础库： `1.5.0` */
  var fontSizeSetting: Double = js.native
  
  /** 微信设置的语言 */
  var language: String = js.native
  
  /** 允许微信使用定位的开关
    *
    * 最低基础库： `2.6.0` */
  var locationAuthorized: Boolean = js.native
  
  /** 地理位置的系统开关
    *
    * 最低基础库： `2.6.0` */
  var locationEnabled: Boolean = js.native
  
  /** 允许微信使用麦克风的开关
    *
    * 最低基础库： `2.6.0` */
  var microphoneAuthorized: Boolean = js.native
  
  /** 设备型号 */
  var model: String = js.native
  
  /** 允许微信通知带有提醒的开关（仅 iOS 有效）
    *
    * 最低基础库： `2.6.0` */
  var notificationAlertAuthorized: Boolean = js.native
  
  /** 允许微信通知的开关
    *
    * 最低基础库： `2.6.0` */
  var notificationAuthorized: Boolean = js.native
  
  /** 允许微信通知带有标记的开关（仅 iOS 有效）
    *
    * 最低基础库： `2.6.0` */
  var notificationBadgeAuthorized: Boolean = js.native
  
  /** 允许微信通知带有声音的开关（仅 iOS 有效）
    *
    * 最低基础库： `2.6.0` */
  var notificationSoundAuthorized: Boolean = js.native
  
  /** 设备像素比 */
  var pixelRatio: Double = js.native
  
  /** 客户端平台 */
  var platform: String = js.native
  
  /** 在竖屏正方向下的安全区域
    *
    * 最低基础库： `2.7.0` */
  var safeArea: SafeAreaResult = js.native
  
  /** 屏幕高度，单位px
    *
    * 最低基础库： `1.1.0` */
  var screenHeight: Double = js.native
  
  /** 屏幕宽度，单位px
    *
    * 最低基础库： `1.1.0` */
  var screenWidth: Double = js.native
  
  /** 状态栏的高度，单位px
    *
    * 最低基础库： `1.9.0` */
  var statusBarHeight: Double = js.native
  
  /** 操作系统及版本 */
  var system: String = js.native
  
  /** 系统当前主题，取值为`light`或`dark`，全局配置`"darkmode":true`时才能获取，否则为 undefined （不支持小游戏）
    *
    * 可选值：
    * - 'dark': 深色主题;
    * - 'light': 浅色主题;
    *
    * 最低基础库： `2.11.0` */
  var theme: js.UndefOr[dark | light] = js.native
  
  /** 微信版本号 */
  var version: String = js.native
  
  /** Wi-Fi 的系统开关
    *
    * 最低基础库： `2.6.0` */
  var wifiEnabled: Boolean = js.native
  
  /** 可使用窗口高度，单位px */
  var windowHeight: Double = js.native
  
  /** 可使用窗口宽度，单位px */
  var windowWidth: Double = js.native
}
object GetSystemInfoSuccessCallbackResult {
  
  @scala.inline
  def apply(
    SDKVersion: String,
    albumAuthorized: Boolean,
    benchmarkLevel: Double,
    bluetoothEnabled: Boolean,
    brand: String,
    cameraAuthorized: Boolean,
    errMsg: String,
    fontSizeSetting: Double,
    language: String,
    locationAuthorized: Boolean,
    locationEnabled: Boolean,
    microphoneAuthorized: Boolean,
    model: String,
    notificationAlertAuthorized: Boolean,
    notificationAuthorized: Boolean,
    notificationBadgeAuthorized: Boolean,
    notificationSoundAuthorized: Boolean,
    pixelRatio: Double,
    platform: String,
    safeArea: SafeAreaResult,
    screenHeight: Double,
    screenWidth: Double,
    statusBarHeight: Double,
    system: String,
    version: String,
    wifiEnabled: Boolean,
    windowHeight: Double,
    windowWidth: Double
  ): GetSystemInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(SDKVersion = SDKVersion.asInstanceOf[js.Any], albumAuthorized = albumAuthorized.asInstanceOf[js.Any], benchmarkLevel = benchmarkLevel.asInstanceOf[js.Any], bluetoothEnabled = bluetoothEnabled.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], cameraAuthorized = cameraAuthorized.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], fontSizeSetting = fontSizeSetting.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], locationAuthorized = locationAuthorized.asInstanceOf[js.Any], locationEnabled = locationEnabled.asInstanceOf[js.Any], microphoneAuthorized = microphoneAuthorized.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], notificationAlertAuthorized = notificationAlertAuthorized.asInstanceOf[js.Any], notificationAuthorized = notificationAuthorized.asInstanceOf[js.Any], notificationBadgeAuthorized = notificationBadgeAuthorized.asInstanceOf[js.Any], notificationSoundAuthorized = notificationSoundAuthorized.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], safeArea = safeArea.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], wifiEnabled = wifiEnabled.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSystemInfoSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetSystemInfoSuccessCallbackResultOps[Self <: GetSystemInfoSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSDKVersion(value: String): Self = this.set("SDKVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumAuthorized(value: Boolean): Self = this.set("albumAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBenchmarkLevel(value: Double): Self = this.set("benchmarkLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetoothEnabled(value: Boolean): Self = this.set("bluetoothEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraAuthorized(value: Boolean): Self = this.set("cameraAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeSetting(value: Double): Self = this.set("fontSizeSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationAuthorized(value: Boolean): Self = this.set("locationAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationEnabled(value: Boolean): Self = this.set("locationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrophoneAuthorized(value: Boolean): Self = this.set("microphoneAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationAlertAuthorized(value: Boolean): Self = this.set("notificationAlertAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationAuthorized(value: Boolean): Self = this.set("notificationAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationBadgeAuthorized(value: Boolean): Self = this.set("notificationBadgeAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationSoundAuthorized(value: Boolean): Self = this.set("notificationSoundAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeArea(value: SafeAreaResult): Self = this.set("safeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenHeight(value: Double): Self = this.set("screenHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenWidth(value: Double): Self = this.set("screenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarHeight(value: Double): Self = this.set("statusBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: String): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiEnabled(value: Boolean): Self = this.set("wifiEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowHeight(value: Double): Self = this.set("windowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowWidth(value: Double): Self = this.set("windowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: dark | light): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}

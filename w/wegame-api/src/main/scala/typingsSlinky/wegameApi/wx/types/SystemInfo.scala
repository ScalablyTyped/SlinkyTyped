package typingsSlinky.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --系统信息
@js.native
trait SystemInfo extends js.Object {
  /**
    * 客户端基础库版本
    */
  var SDKVersion: String = js.native
  /**
    * 电量，范围 1 - 100
    */
  var battery: Double = js.native
  /**
    * 性能等级
    */
  var benchmarkLevel: Double = js.native
  /**
    * 手机品牌
    */
  var brand: String = js.native
  /**
    * 用户字体大小设置。以“我-设置-通用-字体大小”中的设置为准，单位 px。
    */
  var fontSizeSetting: String = js.native
  /**
    * 微信设置的语言
    */
  var language: String = js.native
  /**
    * 手机型号
    */
  var model: String = js.native
  /**
    * 设备像素比
    */
  var pixelRatio: Double = js.native
  /**
    * 客户端平台
    */
  var platform: String = js.native
  /**
    * 屏幕高度
    */
  var screenHeight: Double = js.native
  /**
    * 屏幕宽度
    */
  var screenWidth: Double = js.native
  /**
    * 操作系统版本
    */
  var system: String = js.native
  /**
    * 微信版本号
    */
  var version: String = js.native
  /**
    * wifi 信号强度，范围 0 - 4
    */
  var wifiSignal: Double = js.native
  /**
    * 可使用窗口高度
    */
  var windowHeight: Double = js.native
  /**
    * 可使用窗口宽度
    */
  var windowWidth: Double = js.native
}

object SystemInfo {
  @scala.inline
  def apply(
    SDKVersion: String,
    battery: Double,
    benchmarkLevel: Double,
    brand: String,
    fontSizeSetting: String,
    language: String,
    model: String,
    pixelRatio: Double,
    platform: String,
    screenHeight: Double,
    screenWidth: Double,
    system: String,
    version: String,
    wifiSignal: Double,
    windowHeight: Double,
    windowWidth: Double
  ): SystemInfo = {
    val __obj = js.Dynamic.literal(SDKVersion = SDKVersion.asInstanceOf[js.Any], battery = battery.asInstanceOf[js.Any], benchmarkLevel = benchmarkLevel.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], fontSizeSetting = fontSizeSetting.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], wifiSignal = wifiSignal.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfo]
  }
  @scala.inline
  implicit class SystemInfoOps[Self <: SystemInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSDKVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SDKVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBattery(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("battery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBenchmarkLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benchmarkLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSizeSetting(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWifiSignal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiSignal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Brand extends js.Object {
  var SDKVersion: String = js.native
  var brand: String = js.native
  var fontSizeSetting: String = js.native
  var language: String = js.native
  var model: String = js.native
  var pixelRatio: Double = js.native
  var platform: String = js.native
  var screenHeight: Double = js.native
  var screenWidth: Double = js.native
  var statusBarHeight: Double = js.native
  var system: String = js.native
  var version: String = js.native
  var windowHeight: Double = js.native
  var windowWidth: Double = js.native
}

object Brand {
  @scala.inline
  def apply(
    SDKVersion: String,
    brand: String,
    fontSizeSetting: String,
    language: String,
    model: String,
    pixelRatio: Double,
    platform: String,
    screenHeight: Double,
    screenWidth: Double,
    statusBarHeight: Double,
    system: String,
    version: String,
    windowHeight: Double,
    windowWidth: Double
  ): Brand = {
    val __obj = js.Dynamic.literal(SDKVersion = SDKVersion.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], fontSizeSetting = fontSizeSetting.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brand]
  }
  @scala.inline
  implicit class BrandOps[Self <: Brand] (val x: Self) extends AnyVal {
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
    def withStatusBarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarHeight")(value.asInstanceOf[js.Any])
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


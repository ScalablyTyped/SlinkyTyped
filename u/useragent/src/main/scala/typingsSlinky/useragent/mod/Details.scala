package typingsSlinky.useragent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Details extends js.Object {
  var android: Boolean = js.native
  var chrome: Boolean = js.native
  var firefox: Boolean = js.native
  var ie: Boolean = js.native
  var mobile_safari: Boolean = js.native
  var mozilla: Boolean = js.native
  var opera: Boolean = js.native
  var safari: Boolean = js.native
  var version: String = js.native
  var webkit: Boolean = js.native
}

object Details {
  @scala.inline
  def apply(
    android: Boolean,
    chrome: Boolean,
    firefox: Boolean,
    ie: Boolean,
    mobile_safari: Boolean,
    mozilla: Boolean,
    opera: Boolean,
    safari: Boolean,
    version: String,
    webkit: Boolean
  ): Details = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], mobile_safari = mobile_safari.asInstanceOf[js.Any], mozilla = mozilla.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
  @scala.inline
  implicit class DetailsOps[Self <: Details] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChrome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirefox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firefox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile_safari(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile_safari")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMozilla(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mozilla")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafari(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safari")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebkit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


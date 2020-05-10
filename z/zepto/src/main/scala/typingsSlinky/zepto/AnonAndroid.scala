package typingsSlinky.zepto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAndroid extends js.Object {
  var android: Boolean = js.native
  var bb10: Boolean = js.native
  var blackberry: Boolean = js.native
  /**
  		* Specific OS
  		**/
  var ios: Boolean = js.native
  var ipad: Boolean = js.native
  /**
  		* Specific device type
  		**/
  var iphone: Boolean = js.native
  var kindle: Boolean = js.native
  /**
  		* General device type
  		**/
  var phone: Boolean = js.native
  var rimtabletos: Boolean = js.native
  var tablet: Boolean = js.native
  var touchpad: Boolean = js.native
  /**
  		* OS version.
  		**/
  var version: String = js.native
  var webos: Boolean = js.native
}

object AnonAndroid {
  @scala.inline
  def apply(
    android: Boolean,
    bb10: Boolean,
    blackberry: Boolean,
    ios: Boolean,
    ipad: Boolean,
    iphone: Boolean,
    kindle: Boolean,
    phone: Boolean,
    rimtabletos: Boolean,
    tablet: Boolean,
    touchpad: Boolean,
    version: String,
    webos: Boolean
  ): AnonAndroid = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], bb10 = bb10.asInstanceOf[js.Any], blackberry = blackberry.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], ipad = ipad.asInstanceOf[js.Any], iphone = iphone.asInstanceOf[js.Any], kindle = kindle.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], rimtabletos = rimtabletos.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], touchpad = touchpad.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], webos = webos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAndroid]
  }
  @scala.inline
  implicit class AnonAndroidOps[Self <: AnonAndroid] (val x: Self) extends AnyVal {
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
    def withBb10(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bb10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlackberry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackberry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIphone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iphone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKindle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kindle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRimtabletos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rimtabletos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTablet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchpad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchpad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


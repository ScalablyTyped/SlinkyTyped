package typingsSlinky.tinymce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Env extends js.Object {
  var android: Boolean = js.native
  var ceFalse: Boolean = js.native
  var contentEditable: Boolean = js.native
  var documentMode: Boolean = js.native
  var fileApi: Boolean = js.native
  var gecko: Boolean = js.native
  var iOS: Boolean = js.native
  var ie: Boolean = js.native
  var mac: Boolean = js.native
  var noCaretAfter: Boolean = js.native
  var opera: Boolean = js.native
  var range: Boolean = js.native
  var transparentSrc: Boolean = js.native
  var webKit: Boolean = js.native
}

object Env {
  @scala.inline
  def apply(
    android: Boolean,
    ceFalse: Boolean,
    contentEditable: Boolean,
    documentMode: Boolean,
    fileApi: Boolean,
    gecko: Boolean,
    iOS: Boolean,
    ie: Boolean,
    mac: Boolean,
    noCaretAfter: Boolean,
    opera: Boolean,
    range: Boolean,
    transparentSrc: Boolean,
    webKit: Boolean
  ): Env = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ceFalse = ceFalse.asInstanceOf[js.Any], contentEditable = contentEditable.asInstanceOf[js.Any], documentMode = documentMode.asInstanceOf[js.Any], fileApi = fileApi.asInstanceOf[js.Any], gecko = gecko.asInstanceOf[js.Any], iOS = iOS.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], noCaretAfter = noCaretAfter.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], transparentSrc = transparentSrc.asInstanceOf[js.Any], webKit = webKit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
  @scala.inline
  implicit class EnvOps[Self <: Env] (val x: Self) extends AnyVal {
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
    def withCeFalse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ceFalse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileApi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGecko(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gecko")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIOS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMac(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoCaretAfter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCaretAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparentSrc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparentSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebKit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webKit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


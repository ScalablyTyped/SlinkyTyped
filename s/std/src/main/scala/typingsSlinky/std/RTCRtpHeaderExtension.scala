package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpHeaderExtension extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.native
  var preferredEncrypt: js.UndefOr[scala.Boolean] = js.native
  var preferredId: js.UndefOr[Double] = js.native
  var uri: js.UndefOr[java.lang.String] = js.native
}

object RTCRtpHeaderExtension {
  @scala.inline
  def apply(): RTCRtpHeaderExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpHeaderExtension]
  }
  @scala.inline
  implicit class RTCRtpHeaderExtensionOps[Self <: RTCRtpHeaderExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredEncrypt(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredEncrypt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredEncrypt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredEncrypt")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredId")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}


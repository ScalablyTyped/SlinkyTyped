package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDtlsParameters extends js.Object {
  var fingerprints: js.UndefOr[js.Array[RTCDtlsFingerprint]] = js.native
  var role: js.UndefOr[RTCDtlsRole] = js.native
}

object RTCDtlsParameters {
  @scala.inline
  def apply(): RTCDtlsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCDtlsParameters]
  }
  @scala.inline
  implicit class RTCDtlsParametersOps[Self <: RTCDtlsParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFingerprints(value: js.Array[RTCDtlsFingerprint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprints")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: RTCDtlsRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCCertificate extends js.Object {
  val expires: Double = js.native
  def getFingerprints(): js.Array[RTCDtlsFingerprint] = js.native
}

object RTCCertificate {
  @scala.inline
  def apply(expires: Double, getFingerprints: () => js.Array[RTCDtlsFingerprint]): RTCCertificate = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], getFingerprints = js.Any.fromFunction0(getFingerprints))
    __obj.asInstanceOf[RTCCertificate]
  }
  @scala.inline
  implicit class RTCCertificateOps[Self <: RTCCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFingerprints(value: () => js.Array[RTCDtlsFingerprint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFingerprints")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


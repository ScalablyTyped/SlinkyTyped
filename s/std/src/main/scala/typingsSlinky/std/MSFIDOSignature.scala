package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSFIDOSignature extends js.Object {
  val authnrData: java.lang.String = js.native
  val clientData: java.lang.String = js.native
  val signature: java.lang.String = js.native
}

object MSFIDOSignature {
  @scala.inline
  def apply(authnrData: java.lang.String, clientData: java.lang.String, signature: java.lang.String): MSFIDOSignature = {
    val __obj = js.Dynamic.literal(authnrData = authnrData.asInstanceOf[js.Any], clientData = clientData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSFIDOSignature]
  }
  @scala.inline
  implicit class MSFIDOSignatureOps[Self <: MSFIDOSignature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthnrData(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authnrData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientData(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


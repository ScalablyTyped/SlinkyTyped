package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredentialRequestOptions extends js.Object {
  var mediation: js.UndefOr[CredentialMediationRequirement] = js.native
  var publicKey: js.UndefOr[PublicKeyCredentialRequestOptions] = js.native
  var signal: js.UndefOr[org.scalajs.dom.experimental.AbortSignal] = js.native
}

object CredentialRequestOptions {
  @scala.inline
  def apply(): CredentialRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialRequestOptions]
  }
  @scala.inline
  implicit class CredentialRequestOptionsOps[Self <: CredentialRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediation(value: CredentialMediationRequirement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediation")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKey(value: PublicKeyCredentialRequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSignal(value: org.scalajs.dom.experimental.AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.undefined)
        ret
    }
  }
  
}


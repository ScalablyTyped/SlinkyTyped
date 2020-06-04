package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyCredentialRequestOptions extends js.Object {
  var allowCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.undefined
  var challenge: BufferSource
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputs] = js.undefined
  var rpId: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var userVerification: js.UndefOr[UserVerificationRequirement] = js.undefined
}

object PublicKeyCredentialRequestOptions {
  @scala.inline
  def apply(challenge: BufferSource): PublicKeyCredentialRequestOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRequestOptions]
  }
  @scala.inline
  implicit class PublicKeyCredentialRequestOptionsOps[Self <: PublicKeyCredentialRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChallengeArrayBufferView(value: js.typedarray.ArrayBufferView): Self = this.set("challenge", value.asInstanceOf[js.Any])
    @scala.inline
    def setChallengeArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("challenge", value.asInstanceOf[js.Any])
    @scala.inline
    def setChallenge(value: BufferSource): Self = this.set("challenge", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowCredentials(value: js.Array[PublicKeyCredentialDescriptor]): Self = this.set("allowCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCredentials: Self = this.set("allowCredentials", js.undefined)
    @scala.inline
    def setExtensions(value: AuthenticationExtensionsClientInputs): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setRpId(value: java.lang.String): Self = this.set("rpId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRpId: Self = this.set("rpId", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUserVerification(value: UserVerificationRequirement): Self = this.set("userVerification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserVerification: Self = this.set("userVerification", js.undefined)
  }
  
}


package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyCredentialRequestOptions extends js.Object {
  var allowCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.native
  var challenge: BufferSource = js.native
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputs] = js.native
  var rpId: js.UndefOr[java.lang.String] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var userVerification: js.UndefOr[UserVerificationRequirement] = js.native
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
    def withChallengeArrayBufferView(value: js.typedarray.ArrayBufferView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChallengeArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChallenge(value: BufferSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowCredentials(value: js.Array[PublicKeyCredentialDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: AuthenticationExtensionsClientInputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withRpId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRpId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpId")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUserVerification(value: UserVerificationRequirement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVerification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVerification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVerification")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.webappsecCredentialManagement

import typingsSlinky.std.BufferSource
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.direct
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.indirect
import typingsSlinky.webappsecCredentialManagement.webappsecCredentialManagementStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-makepublickeycredentialoptions}
  */
@js.native
trait PublicKeyCredentialCreationOptions extends js.Object {
  var attestation: js.UndefOr[none | indirect | direct] = js.native
  var authenticatorSelection: js.UndefOr[AuthenticatorSelectionCriteria] = js.native
  var challenge: BufferSource = js.native
  var excludeCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.native
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputs] = js.native
  var pubKeyCredParams: js.Array[PublicKeyCredentialParameters] = js.native
  var rp: PublicKeyCredentialRpEntity = js.native
  var timeout: js.UndefOr[Double] = js.native
  var user: PublicKeyCredentialUserEntity = js.native
}

object PublicKeyCredentialCreationOptions {
  @scala.inline
  def apply(
    challenge: BufferSource,
    pubKeyCredParams: js.Array[PublicKeyCredentialParameters],
    rp: PublicKeyCredentialRpEntity,
    user: PublicKeyCredentialUserEntity
  ): PublicKeyCredentialCreationOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], pubKeyCredParams = pubKeyCredParams.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialCreationOptions]
  }
  @scala.inline
  implicit class PublicKeyCredentialCreationOptionsOps[Self <: PublicKeyCredentialCreationOptions] (val x: Self) extends AnyVal {
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
    def withPubKeyCredParams(value: js.Array[PublicKeyCredentialParameters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubKeyCredParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRp(value: PublicKeyCredentialRpEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: PublicKeyCredentialUserEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttestation(value: none | indirect | direct): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttestation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attestation")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthenticatorSelection(value: AuthenticatorSelectionCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticatorSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticatorSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticatorSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeCredentials(value: js.Array[PublicKeyCredentialDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeCredentials")(js.undefined)
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
  }
  
}


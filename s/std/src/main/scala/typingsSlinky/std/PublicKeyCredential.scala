package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyCredential extends Credential {
  val rawId: js.typedarray.ArrayBuffer = js.native
  val response: AuthenticatorResponse = js.native
  def getClientExtensionResults(): AuthenticationExtensionsClientOutputs = js.native
}

object PublicKeyCredential {
  @scala.inline
  def apply(
    getClientExtensionResults: () => AuthenticationExtensionsClientOutputs,
    id: java.lang.String,
    rawId: js.typedarray.ArrayBuffer,
    response: AuthenticatorResponse,
    `type`: java.lang.String
  ): PublicKeyCredential = {
    val __obj = js.Dynamic.literal(getClientExtensionResults = js.Any.fromFunction0(getClientExtensionResults), id = id.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredential]
  }
  @scala.inline
  implicit class PublicKeyCredentialOps[Self <: PublicKeyCredential] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetClientExtensionResults(value: () => AuthenticationExtensionsClientOutputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClientExtensionResults")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRawId(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: AuthenticatorResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


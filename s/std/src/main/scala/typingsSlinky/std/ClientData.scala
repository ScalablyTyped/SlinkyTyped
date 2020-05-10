package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientData extends js.Object {
  var challenge: java.lang.String = js.native
  var extensions: js.UndefOr[WebAuthnExtensions] = js.native
  var hashAlg: java.lang.String | org.scalajs.dom.crypto.Algorithm = js.native
  var origin: java.lang.String = js.native
  var rpId: java.lang.String = js.native
  var tokenBinding: js.UndefOr[java.lang.String] = js.native
}

object ClientData {
  @scala.inline
  def apply(
    challenge: java.lang.String,
    hashAlg: java.lang.String | org.scalajs.dom.crypto.Algorithm,
    origin: java.lang.String,
    rpId: java.lang.String
  ): ClientData = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], rpId = rpId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientData]
  }
  @scala.inline
  implicit class ClientDataOps[Self <: ClientData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallenge(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashAlgAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashAlg(value: java.lang.String | org.scalajs.dom.crypto.Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashAlg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRpId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensions(value: WebAuthnExtensions): Self = {
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
    def withTokenBinding(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenBinding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenBinding")(js.undefined)
        ret
    }
  }
  
}


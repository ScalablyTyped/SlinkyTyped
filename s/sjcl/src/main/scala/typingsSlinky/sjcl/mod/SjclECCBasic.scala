package typingsSlinky.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclECCBasic extends js.Object {
  var publicKey: SjclECCPublicKeyFactory[SjclECCPublicKey] = js.native
  var secretKey: SjclECCSecretKeyFactory[SjclECCSecretKey] = js.native
  def generateKeys(cn: String): SjclKeysGenerator[SjclECCPublicKey, SjclECCSecretKey] = js.native
}

object SjclECCBasic {
  @scala.inline
  def apply(
    generateKeys: String => SjclKeysGenerator[SjclECCPublicKey, SjclECCSecretKey],
    publicKey: SjclECCPublicKeyFactory[SjclECCPublicKey],
    secretKey: SjclECCSecretKeyFactory[SjclECCSecretKey]
  ): SjclECCBasic = {
    val __obj = js.Dynamic.literal(generateKeys = js.Any.fromFunction1(generateKeys), publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclECCBasic]
  }
  @scala.inline
  implicit class SjclECCBasicOps[Self <: SjclECCBasic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenerateKeys(value: String => SjclKeysGenerator[SjclECCPublicKey, SjclECCSecretKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateKeys")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPublicKey(value: SjclECCPublicKeyFactory[SjclECCPublicKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretKey(value: SjclECCSecretKeyFactory[SjclECCSecretKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


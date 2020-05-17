package typingsSlinky.web3Core.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cipher extends js.Object {
  var cipher: String = js.native
  var cipherparams: Iv = js.native
  var ciphertext: String = js.native
  var kdf: String = js.native
  var kdfparams: Dklen = js.native
  var mac: String = js.native
}

object Cipher {
  @scala.inline
  def apply(cipher: String, cipherparams: Iv, ciphertext: String, kdf: String, kdfparams: Dklen, mac: String): Cipher = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], cipherparams = cipherparams.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any], kdf = kdf.asInstanceOf[js.Any], kdfparams = kdfparams.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cipher]
  }
  @scala.inline
  implicit class CipherOps[Self <: Cipher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCipher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCipherparams(value: Iv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipherparams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCiphertext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ciphertext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKdf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKdfparams(value: Dklen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kdfparams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMac(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


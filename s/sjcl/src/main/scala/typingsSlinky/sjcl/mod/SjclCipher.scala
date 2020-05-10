package typingsSlinky.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclCipher extends js.Object {
  def decrypt(data: js.Array[Double]): js.Array[Double] = js.native
  def encrypt(data: js.Array[Double]): js.Array[Double] = js.native
}

object SjclCipher {
  @scala.inline
  def apply(decrypt: js.Array[Double] => js.Array[Double], encrypt: js.Array[Double] => js.Array[Double]): SjclCipher = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
    __obj.asInstanceOf[SjclCipher]
  }
  @scala.inline
  implicit class SjclCipherOps[Self <: SjclCipher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecrypt(value: js.Array[Double] => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrypt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncrypt(value: js.Array[Double] => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


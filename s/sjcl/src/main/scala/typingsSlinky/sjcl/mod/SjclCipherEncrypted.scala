package typingsSlinky.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclCipherEncrypted extends SjclCipherEncryptParams {
  var ct: BitArray_ = js.native
  var kemtag: js.UndefOr[BitArray_] = js.native
}

object SjclCipherEncrypted {
  @scala.inline
  def apply(ct: BitArray_, iv: BitArray_, salt: BitArray_): SjclCipherEncrypted = {
    val __obj = js.Dynamic.literal(ct = ct.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherEncrypted]
  }
  @scala.inline
  implicit class SjclCipherEncryptedOps[Self <: SjclCipherEncrypted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCt(value: BitArray_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKemtag(value: BitArray_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kemtag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKemtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kemtag")(js.undefined)
        ret
    }
  }
  
}


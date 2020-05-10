package typingsSlinky.smCrypto.mod

import typingsSlinky.bigi.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyPairPoint extends KeyPairHex {
  var k: ^ = js.native
  var x1: ^ = js.native
}

object KeyPairPoint {
  @scala.inline
  def apply(k: ^, privateKey: String, publicKey: String, x1: ^): KeyPairPoint = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairPoint]
  }
  @scala.inline
  implicit class KeyPairPointOps[Self <: KeyPairPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withK(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX1(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


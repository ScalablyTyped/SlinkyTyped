package typingsSlinky.triplesec.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordArray extends js.Object {
  var sigBytes: Double = js.native
  var words: js.Array[Double] = js.native
  def to_hex(): String = js.native
}

object WordArray {
  @scala.inline
  def apply(sigBytes: Double, to_hex: () => String, words: js.Array[Double]): WordArray = {
    val __obj = js.Dynamic.literal(sigBytes = sigBytes.asInstanceOf[js.Any], to_hex = js.Any.fromFunction0(to_hex), words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordArray]
  }
  @scala.inline
  implicit class WordArrayOps[Self <: WordArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSigBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo_hex(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_hex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWords(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


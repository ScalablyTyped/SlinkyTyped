package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PseudoBigInt extends js.Object {
  var base10Value: java.lang.String = js.native
  var negative: Boolean = js.native
}

object PseudoBigInt {
  @scala.inline
  def apply(base10Value: java.lang.String, negative: Boolean): PseudoBigInt = {
    val __obj = js.Dynamic.literal(base10Value = base10Value.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoBigInt]
  }
  @scala.inline
  implicit class PseudoBigIntOps[Self <: PseudoBigInt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase10Value(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base10Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


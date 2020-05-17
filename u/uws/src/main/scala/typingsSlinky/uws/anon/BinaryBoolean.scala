package typingsSlinky.uws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryBoolean extends js.Object {
  var binary: Boolean = js.native
}

object BinaryBoolean {
  @scala.inline
  def apply(binary: Boolean): BinaryBoolean = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryBoolean]
  }
  @scala.inline
  implicit class BinaryBooleanOps[Self <: BinaryBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.uws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBinaryBoolean extends js.Object {
  var binary: Boolean = js.native
}

object AnonBinaryBoolean {
  @scala.inline
  def apply(binary: Boolean): AnonBinaryBoolean = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBinaryBoolean]
  }
  @scala.inline
  implicit class AnonBinaryBooleanOps[Self <: AnonBinaryBoolean] (val x: Self) extends AnyVal {
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


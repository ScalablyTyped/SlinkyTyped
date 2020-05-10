package typingsSlinky.winrtUwp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReturnValueValue extends js.Object {
  /** Returns true if the method succeeds, or false otherwise. */ var returnValue: Boolean = js.native
  /** The current value of the setting. The units depend on the setting. */ var value: Double = js.native
}

object AnonReturnValueValue {
  @scala.inline
  def apply(returnValue: Boolean, value: Double): AnonReturnValueValue = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReturnValueValue]
  }
  @scala.inline
  implicit class AnonReturnValueValueOps[Self <: AnonReturnValueValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturnValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Media.Capture.PowerlineFrequency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnValueBoolean extends js.Object {
  /** Returns true if the method succeeded, or false otherwise. */ var returnValue: Boolean = js.native
  /** The power line frequency. */ var value: PowerlineFrequency = js.native
}

object ReturnValueBoolean {
  @scala.inline
  def apply(returnValue: Boolean, value: PowerlineFrequency): ReturnValueBoolean = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValueBoolean]
  }
  @scala.inline
  implicit class ReturnValueBooleanOps[Self <: ReturnValueBoolean] (val x: Self) extends AnyVal {
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
    def withValue(value: PowerlineFrequency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


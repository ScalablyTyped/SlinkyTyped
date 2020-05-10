package typingsSlinky.soap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISoapFaultError extends js.Object {
  var Fault: ISoapFault = js.native
}

object ISoapFaultError {
  @scala.inline
  def apply(Fault: ISoapFault): ISoapFaultError = {
    val __obj = js.Dynamic.literal(Fault = Fault.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFaultError]
  }
  @scala.inline
  implicit class ISoapFaultErrorOps[Self <: ISoapFaultError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFault(value: ISoapFault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fault")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


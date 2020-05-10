package typingsSlinky.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnInboundInvokeValue extends js.Object {
  var data: js.Any = js.native
  var procedure: String = js.native
}

object OnInboundInvokeValue {
  @scala.inline
  def apply(data: js.Any, procedure: String): OnInboundInvokeValue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnInboundInvokeValue]
  }
  @scala.inline
  implicit class OnInboundInvokeValueOps[Self <: OnInboundInvokeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcedure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedure")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


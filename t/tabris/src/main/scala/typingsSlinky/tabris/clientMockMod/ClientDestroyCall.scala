package typingsSlinky.tabris.clientMockMod

import typingsSlinky.tabris.tabrisStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientDestroyCall extends js.Object {
  var id: String = js.native
  var op: destroy = js.native
}

object ClientDestroyCall {
  @scala.inline
  def apply(id: String, op: destroy): ClientDestroyCall = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDestroyCall]
  }
  @scala.inline
  implicit class ClientDestroyCallOps[Self <: ClientDestroyCall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOp(value: destroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


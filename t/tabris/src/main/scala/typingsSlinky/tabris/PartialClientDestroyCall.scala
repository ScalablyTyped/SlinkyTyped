package typingsSlinky.tabris

import typingsSlinky.tabris.tabrisStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tabris.tabris/ClientMock.ClientDestroyCall> */
@js.native
trait PartialClientDestroyCall extends js.Object {
  var id: js.UndefOr[String] = js.native
  var op: js.UndefOr[destroy] = js.native
}

object PartialClientDestroyCall {
  @scala.inline
  def apply(): PartialClientDestroyCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClientDestroyCall]
  }
  @scala.inline
  implicit class PartialClientDestroyCallOps[Self <: PartialClientDestroyCall] (val x: Self) extends AnyVal {
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
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withOp(value: destroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(js.undefined)
        ret
    }
  }
  
}


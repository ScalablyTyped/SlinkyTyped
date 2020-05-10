package typingsSlinky.sipJs.apiSessionDescriptionHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionDescriptionHandlerOptions extends js.Object {
  var constraints: js.UndefOr[js.Object] = js.native
}

object SessionDescriptionHandlerOptions {
  @scala.inline
  def apply(): SessionDescriptionHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionDescriptionHandlerOptions]
  }
  @scala.inline
  implicit class SessionDescriptionHandlerOptionsOps[Self <: SessionDescriptionHandlerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraints(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
        ret
    }
  }
  
}


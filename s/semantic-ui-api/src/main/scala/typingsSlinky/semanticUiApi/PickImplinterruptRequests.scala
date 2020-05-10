package typingsSlinky.semanticUiApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'interruptRequests'> */
@js.native
trait PickImplinterruptRequests extends js.Object {
  var interruptRequests: Boolean = js.native
}

object PickImplinterruptRequests {
  @scala.inline
  def apply(interruptRequests: Boolean): PickImplinterruptRequests = {
    val __obj = js.Dynamic.literal(interruptRequests = interruptRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinterruptRequests]
  }
  @scala.inline
  implicit class PickImplinterruptRequestsOps[Self <: PickImplinterruptRequests] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterruptRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruptRequests")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


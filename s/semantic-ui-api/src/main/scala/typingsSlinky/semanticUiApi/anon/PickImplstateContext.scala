package typingsSlinky.semanticUiApi.anon

import typingsSlinky.semanticUiApi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'stateContext'> */
@js.native
trait PickImplstateContext extends js.Object {
  var stateContext: String | JQuery = js.native
}

object PickImplstateContext {
  @scala.inline
  def apply(stateContext: String | JQuery): PickImplstateContext = {
    val __obj = js.Dynamic.literal(stateContext = stateContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplstateContext]
  }
  @scala.inline
  implicit class PickImplstateContextOps[Self <: PickImplstateContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateContext(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.semanticUiApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'exitConditions'> */
@js.native
trait PickImplexitConditions extends js.Object {
  var exitConditions: String = js.native
}

object PickImplexitConditions {
  @scala.inline
  def apply(exitConditions: String): PickImplexitConditions = {
    val __obj = js.Dynamic.literal(exitConditions = exitConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplexitConditions]
  }
  @scala.inline
  implicit class PickImplexitConditionsOps[Self <: PickImplexitConditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExitConditions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitConditions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


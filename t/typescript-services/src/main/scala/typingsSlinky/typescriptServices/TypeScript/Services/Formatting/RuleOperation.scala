package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleOperation extends js.Object {
  var Action: RuleAction = js.native
  var Context: RuleOperationContext = js.native
}

object RuleOperation {
  @scala.inline
  def apply(Action: RuleAction, Context: RuleOperationContext): RuleOperation = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOperation]
  }
  @scala.inline
  implicit class RuleOperationOps[Self <: RuleOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: RuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: RuleOperationContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Context")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


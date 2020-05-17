package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleOperationContext extends js.Object {
  var customContextChecks: js.Any = js.native
  def InContext(context: FormattingContext): Boolean = js.native
  def IsAny(): Boolean = js.native
}

object RuleOperationContext {
  @scala.inline
  def apply(InContext: FormattingContext => Boolean, IsAny: () => Boolean, customContextChecks: js.Any): RuleOperationContext = {
    val __obj = js.Dynamic.literal(InContext = js.Any.fromFunction1(InContext), IsAny = js.Any.fromFunction0(IsAny), customContextChecks = customContextChecks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleOperationContext]
  }
  @scala.inline
  implicit class RuleOperationContextOps[Self <: RuleOperationContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInContext(value: FormattingContext => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsAny(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAny")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCustomContextChecks(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customContextChecks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


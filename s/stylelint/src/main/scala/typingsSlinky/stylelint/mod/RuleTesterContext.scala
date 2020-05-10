package typingsSlinky.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleTesterContext extends js.Object {
  var caseDescription: String = js.native
  var comparisonCount: Double = js.native
  var completeAssertionDescription: String = js.native
  var only: js.UndefOr[Boolean] = js.native
}

object RuleTesterContext {
  @scala.inline
  def apply(caseDescription: String, comparisonCount: Double, completeAssertionDescription: String): RuleTesterContext = {
    val __obj = js.Dynamic.literal(caseDescription = caseDescription.asInstanceOf[js.Any], comparisonCount = comparisonCount.asInstanceOf[js.Any], completeAssertionDescription = completeAssertionDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleTesterContext]
  }
  @scala.inline
  implicit class RuleTesterContextOps[Self <: RuleTesterContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComparisonCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleteAssertionDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeAssertionDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulesBucketConstructionState extends js.Object {
  var rulesInsertionIndexBitmap: js.Any = js.native
  def GetInsertionIndex(maskPosition: RulesPosition): Double = js.native
  def IncreaseInsertionIndex(maskPosition: RulesPosition): Unit = js.native
}

object RulesBucketConstructionState {
  @scala.inline
  def apply(
    GetInsertionIndex: RulesPosition => Double,
    IncreaseInsertionIndex: RulesPosition => Unit,
    rulesInsertionIndexBitmap: js.Any
  ): RulesBucketConstructionState = {
    val __obj = js.Dynamic.literal(GetInsertionIndex = js.Any.fromFunction1(GetInsertionIndex), IncreaseInsertionIndex = js.Any.fromFunction1(IncreaseInsertionIndex), rulesInsertionIndexBitmap = rulesInsertionIndexBitmap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesBucketConstructionState]
  }
  @scala.inline
  implicit class RulesBucketConstructionStateOps[Self <: RulesBucketConstructionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetInsertionIndex(value: RulesPosition => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetInsertionIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncreaseInsertionIndex(value: RulesPosition => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncreaseInsertionIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRulesInsertionIndexBitmap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulesInsertionIndexBitmap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


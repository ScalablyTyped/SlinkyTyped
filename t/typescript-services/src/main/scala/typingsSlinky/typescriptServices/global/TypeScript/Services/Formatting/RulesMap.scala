package typingsSlinky.typescriptServices.global.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.RulesMap")
@js.native
class RulesMap ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesMap {
  /* CompleteClass */
  override var map: js.Array[typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesBucket] = js.native
  /* CompleteClass */
  override var mapRowLength: Double = js.native
  /* CompleteClass */
  /* private */ override def FillRule(rule: js.Any, rulesBucketConstructionStateList: js.Any): js.Any = js.native
  /* CompleteClass */
  override def FillRules(
    rules: js.Array[typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Rule],
    rulesBucketConstructionStateList: js.Array[
      typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesBucketConstructionState
    ]
  ): Unit = js.native
  /* CompleteClass */
  override def GetRule(context: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.FormattingContext): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Rule = js.native
  /* CompleteClass */
  /* private */ override def GetRuleBucketIndex(row: js.Any, column: js.Any): js.Any = js.native
  /* CompleteClass */
  override def Initialize(rules: js.Array[typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Rule]): js.Array[typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesBucket] = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.Formatting.RulesMap")
@js.native
object RulesMap extends js.Object {
  def create(rules: js.Array[typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Rule]): typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesMap = js.native
}


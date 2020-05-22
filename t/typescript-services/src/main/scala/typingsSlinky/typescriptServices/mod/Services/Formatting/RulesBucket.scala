package typingsSlinky.typescriptServices.mod.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.RulesBucket")
@js.native
class RulesBucket ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesBucket {
  /* CompleteClass */
  override var rules: js.Any = js.native
  /* CompleteClass */
  override def AddRule(
    rule: typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Rule,
    specificTokens: Boolean,
    constructionState: js.Array[
      typingsSlinky.typescriptServices.TypeScript.Services.Formatting.RulesBucketConstructionState
    ],
    rulesBucketIndex: Double
  ): Unit = js.native
  /* CompleteClass */
  override def Rules(): js.Array[typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Rule] = js.native
}


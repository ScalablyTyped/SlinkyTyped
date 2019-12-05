package typingsSlinky.tslint

import typingsSlinky.tslint.libLanguageRuleRuleMod.RuleFailure
import typingsSlinky.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/enableDisableRules", JSImport.Namespace)
@js.native
object libEnableDisableRulesMod extends js.Object {
  val ENABLE_DISABLE_REGEX: js.RegExp = js.native
  def removeDisabledFailures(sourceFile: SourceFile, failures: js.Array[RuleFailure]): js.Array[RuleFailure] = js.native
}


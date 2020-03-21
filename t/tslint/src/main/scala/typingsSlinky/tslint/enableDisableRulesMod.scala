package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.RuleFailure
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/enableDisableRules", JSImport.Namespace)
@js.native
object enableDisableRulesMod extends js.Object {
  val ENABLE_DISABLE_REGEX: js.RegExp = js.native
  def removeDisabledFailures(sourceFile: SourceFile, failures: js.Array[RuleFailure]): js.Array[RuleFailure] = js.native
}


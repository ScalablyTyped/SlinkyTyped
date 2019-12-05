package typingsSlinky.tslint.tslintMod

import typingsSlinky.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "RuleFailure")
@js.native
class RuleFailure protected ()
  extends typingsSlinky.tslint.libLanguageRuleRuleMod.RuleFailure {
  def this(sourceFile: SourceFile, start: Double, end: Double, failure: String, ruleName: String) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: js.Array[typingsSlinky.tslint.libLanguageRuleRuleMod.Replacement]
  ) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: typingsSlinky.tslint.libLanguageRuleRuleMod.Replacement
  ) = this()
}

/* static members */
@JSImport("tslint", "RuleFailure")
@js.native
object RuleFailure extends js.Object {
  def compare(
    a: typingsSlinky.tslint.libLanguageRuleRuleMod.RuleFailure,
    b: typingsSlinky.tslint.libLanguageRuleRuleMod.RuleFailure
  ): Double = js.native
}


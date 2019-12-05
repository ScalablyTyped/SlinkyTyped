package typingsSlinky.tslint.tslintMod

import typingsSlinky.tslint.libLanguageRuleRuleMod.Fix
import typingsSlinky.typescript.typescriptMod.Node
import typingsSlinky.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "Replacement")
@js.native
class Replacement protected ()
  extends typingsSlinky.tslint.libLanguageRuleRuleMod.Replacement {
  def this(start: Double, length: Double, text: String) = this()
}

/* static members */
@JSImport("tslint", "Replacement")
@js.native
object Replacement extends js.Object {
  def appendText(start: Double, text: String): typingsSlinky.tslint.libLanguageRuleRuleMod.Replacement = js.native
  def applyAll(content: String, replacements: js.Array[typingsSlinky.tslint.libLanguageRuleRuleMod.Replacement]): String = js.native
  def applyFixes(content: String, fixes: js.Array[Fix]): String = js.native
  def deleteFromTo(start: Double, end: Double): typingsSlinky.tslint.libLanguageRuleRuleMod.Replacement = js.native
  def deleteText(start: Double, length: Double): typingsSlinky.tslint.libLanguageRuleRuleMod.Replacement = js.native
  def replaceFromTo(start: Double, end: Double, text: String): typingsSlinky.tslint.libLanguageRuleRuleMod.Replacement = js.native
  def replaceNode(node: Node, text: String): typingsSlinky.tslint.libLanguageRuleRuleMod.Replacement = js.native
  def replaceNode(node: Node, text: String, sourceFile: SourceFile): typingsSlinky.tslint.libLanguageRuleRuleMod.Replacement = js.native
}


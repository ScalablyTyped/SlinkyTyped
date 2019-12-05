package typingsSlinky.tslint

import typingsSlinky.tslint.libLanguageRuleRuleMod.Fix
import typingsSlinky.tslint.libLanguageRuleRuleMod.RuleFailure
import typingsSlinky.typescript.typescriptMod.Node
import typingsSlinky.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/walkContext", JSImport.Namespace)
@js.native
object libLanguageWalkerWalkContextMod extends js.Object {
  @js.native
  class WalkContext[T] protected () extends js.Object {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
    val failures: js.Array[RuleFailure] = js.native
    val options: T = js.native
    val ruleName: String = js.native
    val sourceFile: SourceFile = js.native
    def addFailure(start: Double, end: Double, failure: String): Unit = js.native
    def addFailure(start: Double, end: Double, failure: String, fix: Fix): Unit = js.native
    /** Add a failure with any arbitrary span. Prefer `addFailureAtNode` if possible. */
    def addFailureAt(start: Double, width: Double, failure: String): Unit = js.native
    def addFailureAt(start: Double, width: Double, failure: String, fix: Fix): Unit = js.native
    /** Add a failure using a node's span. */
    def addFailureAtNode(node: Node, failure: String): Unit = js.native
    def addFailureAtNode(node: Node, failure: String, fix: Fix): Unit = js.native
  }
  
}


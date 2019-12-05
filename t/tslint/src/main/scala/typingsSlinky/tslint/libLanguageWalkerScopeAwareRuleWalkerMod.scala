package typingsSlinky.tslint

import typingsSlinky.tslint.libLanguageRuleRuleMod.IOptions
import typingsSlinky.tslint.libLanguageWalkerRuleWalkerMod.RuleWalker
import typingsSlinky.typescript.typescriptMod.Node
import typingsSlinky.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/scopeAwareRuleWalker", JSImport.Namespace)
@js.native
object libLanguageWalkerScopeAwareRuleWalkerMod extends js.Object {
  @js.native
  abstract class ScopeAwareRuleWalker[T] protected () extends RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions) = this()
    val scopeStack: js.Any = js.native
    def createScope(node: Node): T = js.native
    def getAllScopes(): js.Array[T] = js.native
    def getCurrentDepth(): Double = js.native
    def getCurrentScope(): T = js.native
    /* protected */ def isScopeBoundary(node: Node): Boolean = js.native
    def onScopeEnd(): Unit = js.native
    def onScopeStart(): Unit = js.native
  }
  
}


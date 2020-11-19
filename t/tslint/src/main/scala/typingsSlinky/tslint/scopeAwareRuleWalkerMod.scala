package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleWalkerMod.RuleWalker
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/language/walker/scopeAwareRuleWalker", JSImport.Namespace)
@js.native
object scopeAwareRuleWalkerMod extends js.Object {
  
  @js.native
  abstract class ScopeAwareRuleWalker[T] protected () extends RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions) = this()
    
    def createScope(node: Node): T = js.native
    
    def getAllScopes(): js.Array[T] = js.native
    
    def getCurrentDepth(): Double = js.native
    
    def getCurrentScope(): T = js.native
    
    /* protected */ def isScopeBoundary(node: Node): Boolean = js.native
    
    def onScopeEnd(): Unit = js.native
    
    def onScopeStart(): Unit = js.native
    
    val scopeStack: js.Any = js.native
  }
}

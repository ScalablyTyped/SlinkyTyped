package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.scopeAwareRuleWalkerMod.ScopeAwareRuleWalker
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockScopeAwareRuleWalkerMod {
  
  @JSImport("tslint/lib/language/walker/blockScopeAwareRuleWalker", "BlockScopeAwareRuleWalker")
  @js.native
  abstract class BlockScopeAwareRuleWalker[T, U] protected () extends ScopeAwareRuleWalker[T] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
    
    val blockScopeStack: js.Any = js.native
    
    def createBlockScope(node: Node): U = js.native
    
    def findBlockScope(predicate: js.Function1[/* scope */ U, Boolean]): js.UndefOr[U] = js.native
    
    def getAllBlockScopes(): js.Array[U] = js.native
    
    def getCurrentBlockDepth(): Double = js.native
    
    def getCurrentBlockScope(): U = js.native
    
    var isBlockScopeBoundary: js.Any = js.native
    
    def onBlockScopeEnd(): Unit = js.native
    
    def onBlockScopeStart(): Unit = js.native
  }
}

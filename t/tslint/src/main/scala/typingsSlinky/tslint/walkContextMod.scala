package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.Fix
import typingsSlinky.tslint.ruleMod.RuleFailure
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object walkContextMod {
  
  @JSImport("tslint/lib/language/walker/walkContext", "WalkContext")
  @js.native
  class WalkContext[T] protected () extends StObject {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
    
    def addFailure(start: Double, end: Double, failure: String): Unit = js.native
    def addFailure(start: Double, end: Double, failure: String, fix: Fix): Unit = js.native
    
    /** Add a failure with any arbitrary span. Prefer `addFailureAtNode` if possible. */
    def addFailureAt(start: Double, width: Double, failure: String): Unit = js.native
    def addFailureAt(start: Double, width: Double, failure: String, fix: Fix): Unit = js.native
    
    /** Add a failure using a node's span. */
    def addFailureAtNode(node: Node, failure: String): Unit = js.native
    def addFailureAtNode(node: Node, failure: String, fix: Fix): Unit = js.native
    
    val failures: js.Array[RuleFailure] = js.native
    
    val options: T = js.native
    
    val ruleName: String = js.native
    
    val sourceFile: SourceFile = js.native
  }
}

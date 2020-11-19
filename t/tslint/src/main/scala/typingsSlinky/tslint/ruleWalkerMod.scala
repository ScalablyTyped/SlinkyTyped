package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.Fix
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.Replacement
import typingsSlinky.tslint.ruleMod.RuleFailure
import typingsSlinky.tslint.syntaxWalkerMod.SyntaxWalker
import typingsSlinky.tslint.walkerWalkerMod.IWalker
import typingsSlinky.typescript.mod.LineAndCharacter
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/language/walker/ruleWalker", JSImport.Namespace)
@js.native
object ruleWalkerMod extends js.Object {
  
  @js.native
  class RuleWalker protected ()
    extends SyntaxWalker
       with IWalker {
    def this(sourceFile: SourceFile, options: IOptions) = this()
    
    /** @deprecated Prefer `addFailureAt` and its variants. */
    def addFailure(failure: RuleFailure): Unit = js.native
    
    /** Add a failure with any arbitrary span. Prefer `addFailureAtNode` if possible. */
    def addFailureAt(start: Double, width: Double, failure: String): Unit = js.native
    def addFailureAt(start: Double, width: Double, failure: String, fix: Fix): Unit = js.native
    
    /** Add a failure using a node's span. */
    def addFailureAtNode(node: Node, failure: String): Unit = js.native
    def addFailureAtNode(node: Node, failure: String, fix: Fix): Unit = js.native
    
    /** Like `addFailureAt` but uses start and end instead of start and width. */
    def addFailureFromStartToEnd(start: Double, end: Double, failure: String): Unit = js.native
    def addFailureFromStartToEnd(start: Double, end: Double, failure: String, fix: Fix): Unit = js.native
    
    def appendText(start: Double, text: String): Replacement = js.native
    
    /** @deprecated Prefer `addFailureAt` and its variants. */
    def createFailure(start: Double, width: Double, failure: String): RuleFailure = js.native
    def createFailure(start: Double, width: Double, failure: String, fix: Fix): RuleFailure = js.native
    
    def createReplacement(start: Double, length: Double, text: String): Replacement = js.native
    
    def deleteFromTo(start: Double, end: Double): Replacement = js.native
    
    def deleteText(start: Double, length: Double): Replacement = js.native
    
    val failures: js.Any = js.native
    
    def getLimit(): Double = js.native
    
    def getLineAndCharacterOfPosition(position: Double): LineAndCharacter = js.native
    
    def getOptions(): js.Any = js.native
    
    def getRuleName(): String = js.native
    
    def hasOption(option: String): Boolean = js.native
    
    val limit: js.Any = js.native
    
    val options: js.Any = js.native
    
    val ruleName: js.Any = js.native
    
    val sourceFile: js.Any = js.native
  }
}

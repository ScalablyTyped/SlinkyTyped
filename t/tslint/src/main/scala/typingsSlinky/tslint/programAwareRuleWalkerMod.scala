package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleWalkerMod.RuleWalker
import typingsSlinky.typescript.mod.Program
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/language/walker/programAwareRuleWalker", JSImport.Namespace)
@js.native
object programAwareRuleWalkerMod extends js.Object {
  
  @js.native
  class ProgramAwareRuleWalker protected () extends RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
    
    def getProgram(): Program = js.native
    
    def getTypeChecker(): TypeChecker = js.native
    
    val program: js.Any = js.native
    
    val typeChecker: js.Any = js.native
  }
}

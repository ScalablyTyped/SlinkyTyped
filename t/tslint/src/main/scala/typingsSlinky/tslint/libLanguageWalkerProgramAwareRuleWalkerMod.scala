package typingsSlinky.tslint

import typingsSlinky.tslint.libLanguageRuleRuleMod.IOptions
import typingsSlinky.tslint.libLanguageWalkerRuleWalkerMod.RuleWalker
import typingsSlinky.typescript.typescriptMod.Program
import typingsSlinky.typescript.typescriptMod.SourceFile
import typingsSlinky.typescript.typescriptMod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/programAwareRuleWalker", JSImport.Namespace)
@js.native
object libLanguageWalkerProgramAwareRuleWalkerMod extends js.Object {
  @js.native
  class ProgramAwareRuleWalker protected () extends RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
    val program: js.Any = js.native
    val typeChecker: js.Any = js.native
    def getProgram(): Program = js.native
    def getTypeChecker(): TypeChecker = js.native
  }
  
}


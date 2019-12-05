package typingsSlinky.tslint

import typingsSlinky.tslint.libLanguageRuleRuleMod.IOptions
import typingsSlinky.typescript.typescriptMod.Program
import typingsSlinky.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker", JSImport.Namespace)
@js.native
object libLanguageWalkerMod extends js.Object {
  @js.native
  abstract class AbstractWalker[T] ()
    extends typingsSlinky.tslint.libLanguageWalkerWalkerMod.AbstractWalker[T]
  
  @js.native
  abstract class BlockScopeAwareRuleWalker[T, U] protected ()
    extends typingsSlinky.tslint.libLanguageWalkerBlockScopeAwareRuleWalkerMod.BlockScopeAwareRuleWalker[T, U] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @js.native
  class ProgramAwareRuleWalker protected ()
    extends typingsSlinky.tslint.libLanguageWalkerProgramAwareRuleWalkerMod.ProgramAwareRuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
  }
  
  @js.native
  class RuleWalker protected ()
    extends typingsSlinky.tslint.libLanguageWalkerRuleWalkerMod.RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @js.native
  abstract class ScopeAwareRuleWalker[T] protected ()
    extends typingsSlinky.tslint.libLanguageWalkerScopeAwareRuleWalkerMod.ScopeAwareRuleWalker[T] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @js.native
  class SyntaxWalker ()
    extends typingsSlinky.tslint.libLanguageWalkerSyntaxWalkerMod.SyntaxWalker
  
  @js.native
  class WalkContext[T] protected ()
    extends typingsSlinky.tslint.libLanguageWalkerWalkContextMod.WalkContext[T] {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
  }
  
}


package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.typescript.mod.Program
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker", JSImport.Namespace)
@js.native
object walkerMod extends js.Object {
  @js.native
  abstract class AbstractWalker[T] ()
    extends typingsSlinky.tslint.walkerWalkerMod.AbstractWalker[T]
  
  @js.native
  abstract class BlockScopeAwareRuleWalker[T, U] protected ()
    extends typingsSlinky.tslint.blockScopeAwareRuleWalkerMod.BlockScopeAwareRuleWalker[T, U] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @js.native
  class ProgramAwareRuleWalker protected ()
    extends typingsSlinky.tslint.programAwareRuleWalkerMod.ProgramAwareRuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
  }
  
  @js.native
  class RuleWalker protected ()
    extends typingsSlinky.tslint.ruleWalkerMod.RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @js.native
  abstract class ScopeAwareRuleWalker[T] protected ()
    extends typingsSlinky.tslint.scopeAwareRuleWalkerMod.ScopeAwareRuleWalker[T] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @js.native
  class SyntaxWalker ()
    extends typingsSlinky.tslint.syntaxWalkerMod.SyntaxWalker
  
  @js.native
  class WalkContext[T] protected ()
    extends typingsSlinky.tslint.walkContextMod.WalkContext[T] {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
  }
  
}


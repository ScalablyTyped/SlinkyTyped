package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.typescript.mod.Program
import typingsSlinky.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object walkerMod {
  
  @JSImport("tslint/lib/language/walker", "AbstractWalker")
  @js.native
  abstract class AbstractWalker[T] protected ()
    extends typingsSlinky.tslint.walkerWalkerMod.AbstractWalker[T] {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
  }
  
  @JSImport("tslint/lib/language/walker", "BlockScopeAwareRuleWalker")
  @js.native
  abstract class BlockScopeAwareRuleWalker[T, U] protected ()
    extends typingsSlinky.tslint.blockScopeAwareRuleWalkerMod.BlockScopeAwareRuleWalker[T, U] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @JSImport("tslint/lib/language/walker", "ProgramAwareRuleWalker")
  @js.native
  class ProgramAwareRuleWalker protected ()
    extends typingsSlinky.tslint.programAwareRuleWalkerMod.ProgramAwareRuleWalker {
    def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
  }
  
  @JSImport("tslint/lib/language/walker", "RuleWalker")
  @js.native
  class RuleWalker protected ()
    extends typingsSlinky.tslint.ruleWalkerMod.RuleWalker {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @JSImport("tslint/lib/language/walker", "ScopeAwareRuleWalker")
  @js.native
  abstract class ScopeAwareRuleWalker[T] protected ()
    extends typingsSlinky.tslint.scopeAwareRuleWalkerMod.ScopeAwareRuleWalker[T] {
    def this(sourceFile: SourceFile, options: IOptions) = this()
  }
  
  @JSImport("tslint/lib/language/walker", "SyntaxWalker")
  @js.native
  class SyntaxWalker ()
    extends typingsSlinky.tslint.syntaxWalkerMod.SyntaxWalker
  
  @JSImport("tslint/lib/language/walker", "WalkContext")
  @js.native
  class WalkContext[T] protected ()
    extends typingsSlinky.tslint.walkContextMod.WalkContext[T] {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
  }
}

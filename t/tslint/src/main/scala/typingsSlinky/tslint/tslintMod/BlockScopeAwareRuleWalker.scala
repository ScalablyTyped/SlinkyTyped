package typingsSlinky.tslint.tslintMod

import typingsSlinky.tslint.libLanguageRuleRuleMod.IOptions
import typingsSlinky.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "BlockScopeAwareRuleWalker")
@js.native
abstract class BlockScopeAwareRuleWalker[T, U] protected ()
  extends typingsSlinky.tslint.libLanguageWalkerMod.BlockScopeAwareRuleWalker[T, U] {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}


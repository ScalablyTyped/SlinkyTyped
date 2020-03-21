package typingsSlinky.tslint.mod

import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "BlockScopeAwareRuleWalker")
@js.native
abstract class BlockScopeAwareRuleWalker[T, U] protected ()
  extends typingsSlinky.tslint.walkerMod.BlockScopeAwareRuleWalker[T, U] {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}


package typingsSlinky.tslint.mod

import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "ScopeAwareRuleWalker")
@js.native
abstract class ScopeAwareRuleWalker[T] protected ()
  extends typingsSlinky.tslint.walkerMod.ScopeAwareRuleWalker[T] {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}


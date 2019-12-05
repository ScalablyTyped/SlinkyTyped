package typingsSlinky.tsutils.utilUsageMod

import typingsSlinky.std.Map
import typingsSlinky.typescript.typescriptMod.Identifier
import typingsSlinky.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/usage", "collectVariableUsage")
@js.native
object collectVariableUsage extends js.Object {
  def apply(sourceFile: SourceFile): Map[Identifier, VariableInfo] = js.native
}


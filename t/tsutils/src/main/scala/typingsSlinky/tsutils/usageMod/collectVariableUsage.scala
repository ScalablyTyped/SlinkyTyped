package typingsSlinky.tsutils.usageMod

import typingsSlinky.std.Map
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/usage", "collectVariableUsage")
@js.native
object collectVariableUsage extends js.Object {
  def apply(sourceFile: SourceFile): Map[Identifier, VariableInfo] = js.native
}


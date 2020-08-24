package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.TextChangeRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateSourceFile")
@js.native
object updateSourceFile extends js.Object {
  def apply(sourceFile: SourceFile, newText: String, textChangeRange: TextChangeRange): SourceFile = js.native
  def apply(
    sourceFile: SourceFile,
    newText: String,
    textChangeRange: TextChangeRange,
    aggressiveChecks: Boolean
  ): SourceFile = js.native
}


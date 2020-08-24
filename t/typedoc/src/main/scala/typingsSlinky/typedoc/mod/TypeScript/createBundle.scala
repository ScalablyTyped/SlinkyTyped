package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Bundle
import typingsSlinky.typescript.mod.InputFiles
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.UnparsedSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createBundle")
@js.native
object createBundle extends js.Object {
  def apply(sourceFiles: js.Array[SourceFile]): Bundle = js.native
  def apply(sourceFiles: js.Array[SourceFile], prepends: js.Array[UnparsedSource | InputFiles]): Bundle = js.native
}


package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.Bundle
import typingsSlinky.typescript.mod.InputFiles
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.UnparsedSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createBundle")
@js.native
object createBundle extends js.Object {
  
  /** @deprecated Use `factory.createBundle` or the factory supplied by your transformation context instead. */
  def apply(sourceFiles: js.Array[SourceFile]): Bundle = js.native
  def apply(sourceFiles: js.Array[SourceFile], prepends: js.Array[UnparsedSource | InputFiles]): Bundle = js.native
}

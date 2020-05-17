package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IFileReference
import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.getReferencedFiles")
@js.native
object getReferencedFiles extends js.Object {
  def apply(fileName: String, sourceText: IScriptSnapshot): js.Array[IFileReference] = js.native
}


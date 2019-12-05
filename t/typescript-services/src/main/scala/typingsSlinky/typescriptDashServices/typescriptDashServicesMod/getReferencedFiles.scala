package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.IFileReference
import typingsSlinky.typescriptDashServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "getReferencedFiles")
@js.native
object getReferencedFiles extends js.Object {
  def apply(fileName: String, sourceText: IScriptSnapshot): js.Array[IFileReference] = js.native
}


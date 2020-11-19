package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IFileReference
import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "getReferencedFiles")
@js.native
object getReferencedFiles extends js.Object {
  
  def apply(fileName: String, sourceText: IScriptSnapshot): js.Array[IFileReference] = js.native
}

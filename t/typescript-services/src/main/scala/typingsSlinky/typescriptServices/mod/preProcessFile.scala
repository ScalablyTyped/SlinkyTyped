package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IPreProcessedFileInfo
import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "preProcessFile")
@js.native
object preProcessFile extends js.Object {
  
  def apply(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo = js.native
  def apply(fileName: String, sourceText: IScriptSnapshot, readImportFiles: Boolean): IPreProcessedFileInfo = js.native
}

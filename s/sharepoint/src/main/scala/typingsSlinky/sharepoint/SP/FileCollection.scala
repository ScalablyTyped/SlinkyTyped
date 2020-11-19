package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileCollection extends ClientObjectCollection[File] {
  
  def add(parameters: FileCreationInformation): File = js.native
  
  def addTemplateFile(urlOfFile: String, templateFileType: TemplateFileType): File = js.native
  
  def getByUrl(url: String): File = js.native
  
  def get_item(index: Double): File = js.native
  
  def itemAt(index: Double): File = js.native
}

package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewCollection extends ClientObjectCollection[View] {
  
  def add(parameters: ViewCreationInformation): View = js.native
  
  def getById(guidId: Guid): View = js.native
  
  def getByTitle(strTitle: String): View = js.native
  
  def get_item(index: Double): View = js.native
  
  def itemAt(index: Double): View = js.native
}

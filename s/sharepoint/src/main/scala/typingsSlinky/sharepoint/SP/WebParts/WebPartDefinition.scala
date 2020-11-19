package typingsSlinky.sharepoint.SP.WebParts

import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebPartDefinition extends ClientObject {
  
  def closeWebPart(): Unit = js.native
  
  def deleteWebPart(): Unit = js.native
  
  def get_id(): Guid = js.native
  
  def get_webPart(): WebPart = js.native
  
  def get_zoneId(): String = js.native
  
  def moveWebPartTo(zoneID: String, zoneIndex: Double): Unit = js.native
  
  def openWebPart(): Unit = js.native
  
  def saveWebPartChanges(): Unit = js.native
}

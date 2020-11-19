package typingsSlinky.sharepoint.SP.WebParts

import typingsSlinky.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LimitedWebPartManager extends ClientObject {
  
  def addWebPart(webPart: WebPart, zoneId: String, zoneIndex: Double): WebPartDefinition = js.native
  
  def get_hasPersonalizedParts(): Boolean = js.native
  
  def get_scope(): PersonalizationScope = js.native
  
  def get_webParts(): WebPartDefinitionCollection = js.native
  
  def importWebPart(webPartXml: String): WebPartDefinition = js.native
}

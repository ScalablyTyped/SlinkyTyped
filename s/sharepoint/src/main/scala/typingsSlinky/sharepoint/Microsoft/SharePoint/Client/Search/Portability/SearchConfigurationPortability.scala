package typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Portability

import typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectOwner
import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.JsonObjectResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchConfigurationPortability extends ClientObject {
  
  def deleteSearchConfiguration(owningScope: SearchObjectOwner, searchConfiguration: String): Unit = js.native
  
  def exportSearchConfiguration(owningScope: SearchObjectOwner): JsonObjectResult = js.native
  
  def get_importWarnings(): String = js.native
  
  def importSearchConfiguration(owningScope: SearchObjectOwner, searchConfiguration: String): Unit = js.native
}

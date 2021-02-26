package typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search

import typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectOwner
import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.JsonObjectResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portability {
  
  @js.native
  trait SearchConfigurationPortability extends ClientObject {
    
    def deleteSearchConfiguration(owningScope: SearchObjectOwner, searchConfiguration: String): Unit = js.native
    
    def exportSearchConfiguration(owningScope: SearchObjectOwner): JsonObjectResult = js.native
    
    def get_importWarnings(): String = js.native
    
    def importSearchConfiguration(owningScope: SearchObjectOwner, searchConfiguration: String): Unit = js.native
  }
  
  @js.native
  trait SearchConfigurationPortabilityPropertyNames extends StObject
}

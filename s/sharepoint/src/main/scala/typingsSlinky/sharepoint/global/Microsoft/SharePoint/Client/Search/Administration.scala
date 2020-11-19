package typingsSlinky.sharepoint.global.Microsoft.SharePoint.Client.Search

import typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel
import typingsSlinky.sharepoint.SP.ClientContext
import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.Site
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.SharePoint.Client.Search.Administration")
@js.native
object Administration extends js.Object {
  
  @js.native
  class DocumentCrawlLog protected ()
    extends typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Administration.DocumentCrawlLog {
    def this(context: ClientContext, site: Site) = this()
  }
  
  @js.native
  object SearchObjectLevel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel with Double
      ] = js.native
    
    /* 1 */ val spSite: typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.spSite with Double = js.native
    
    /* 2 */ val spSiteSubscription: typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.spSiteSubscription with Double = js.native
    
    /* 0 */ val spWeb: typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.spWeb with Double = js.native
    
    /* 3 */ val ssa: typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.ssa with Double = js.native
  }
  
  @js.native
  class SearchObjectOwner protected () extends ClientObject {
    def this(context: ClientContext, lowestCurrentLevelToUse: SearchObjectLevel) = this()
  }
}

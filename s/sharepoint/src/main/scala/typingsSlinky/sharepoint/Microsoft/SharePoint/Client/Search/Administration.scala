package typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search

import typingsSlinky.sharepoint.Anon_High
import typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel
import typingsSlinky.sharepoint.SP.ClientContext
import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.JsonObjectResult
import typingsSlinky.sharepoint.SP.Site
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.Administration")
@js.native
object Administration extends js.Object {
  @js.native
  class DocumentCrawlLog protected () extends ClientObject {
    def this(context: ClientContext, site: Site) = this()
    def getCrawledUrls(
      getCountOnly: Boolean,
      maxRows: Anon_High,
      queryString: String,
      isLike: Boolean,
      contentSourceID: Double,
      errorLevel: Double,
      errorID: Double,
      startDateTime: js.Date,
      endDateTime: js.Date
    ): JsonObjectResult = js.native
  }
  
  @js.native
  sealed trait SearchObjectLevel extends js.Object
  
  @js.native
  class SearchObjectOwner protected () extends ClientObject {
    def this(context: ClientContext, lowestCurrentLevelToUse: SearchObjectLevel) = this()
  }
  
  @js.native
  object SearchObjectLevel extends js.Object {
    @js.native
    sealed trait spSite extends SearchObjectLevel
    
    @js.native
    sealed trait spSiteSubscription extends SearchObjectLevel
    
    @js.native
    sealed trait spWeb extends SearchObjectLevel
    
    @js.native
    sealed trait ssa extends SearchObjectLevel
    
    /* 1 */ val spSite: typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.spSite with Double = js.native
    /* 2 */ val spSiteSubscription: typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.spSiteSubscription with Double = js.native
    /* 0 */ val spWeb: typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.spWeb with Double = js.native
    /* 3 */ val ssa: typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Administration.SearchObjectLevel.ssa with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SearchObjectLevel with Double] = js.native
  }
  
}


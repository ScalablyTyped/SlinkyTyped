package typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typingsSlinky.sharepoint.SP.ClientContext
import typingsSlinky.sharepoint.SP.ClientObject
import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.JsonObjectResult
import typingsSlinky.sharepoint.SP.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**Executes queries against a search server.*/
@JSGlobal("Microsoft.SharePoint.Client.Search.Query.SearchExecutor")
@js.native
class SearchExecutor protected () extends ClientObject {
  def this(context: ClientContext) = this()
  def executeQueries(
    queryIds: js.Array[String],
    queries: js.Array[typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Query.Query],
    handleExceptions: Boolean
  ): JsonObjectResult = js.native
  /**Runs a query.*/
  def executeQuery(query: typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Query.Query): JsonObjectResult = js.native
  def exportPopularQueries(web: Web, sourceId: Guid): JsonObjectResult = js.native
  def recordPageClick(
    pageInfo: String,
    clickType: String,
    blockType: Double,
    clickedResultId: String,
    subResultIndex: Double,
    immediacySourceId: String,
    immediacyQueryString: String,
    immediacyTitle: String,
    immediacyUrl: String
  ): Unit = js.native
}


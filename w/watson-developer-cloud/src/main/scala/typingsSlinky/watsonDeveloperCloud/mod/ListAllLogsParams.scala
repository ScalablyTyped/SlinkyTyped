package typingsSlinky.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listAllLogs` operation. */
@js.native
trait ListAllLogsParams extends StObject {
  
  /** A token identifying the page of results to retrieve. */
  var cursor: js.UndefOr[String] = js.native
  
  /** A cacheable parameter that limits the results to those matching the specified filter. You must specify a filter query that includes a value for `language`, as well as a value for `workspace_id` or `request.context.metadata.deployment`. For more information, see the [documentation](https://cloud.ibm.com/docs/services/assistant/filter-reference.html#filter-reference-syntax). */
  var filter: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** The number of records to return in each page of results. */
  var page_limit: js.UndefOr[Double] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** How to sort the returned log events. You can sort by **request_timestamp**. To reverse the sort order, prefix the parameter value with a minus sign (`-`). */
  var sort: js.UndefOr[String] = js.native
}
object ListAllLogsParams {
  
  @scala.inline
  def apply(filter: String): ListAllLogsParams = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAllLogsParams]
  }
  
  @scala.inline
  implicit class ListAllLogsParamsMutableBuilder[Self <: ListAllLogsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setPage_limit(value: Double): Self = StObject.set(x, "page_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_limitUndefined: Self = StObject.set(x, "page_limit", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}

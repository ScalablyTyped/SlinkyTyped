package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listTrainingExamples` operation. */
@js.native
trait ListTrainingExamplesParams extends StObject {
  
  /** The ID of the collection. */
  var collection_id: String = js.native
  
  /** The ID of the environment. */
  var environment_id: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** The ID of the query used for training. */
  var query_id: String = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object ListTrainingExamplesParams {
  
  @scala.inline
  def apply(collection_id: String, environment_id: String, query_id: String): ListTrainingExamplesParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], query_id = query_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrainingExamplesParams]
  }
  
  @scala.inline
  implicit class ListTrainingExamplesParamsMutableBuilder[Self <: ListTrainingExamplesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setQuery_id(value: String): Self = StObject.set(x, "query_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}

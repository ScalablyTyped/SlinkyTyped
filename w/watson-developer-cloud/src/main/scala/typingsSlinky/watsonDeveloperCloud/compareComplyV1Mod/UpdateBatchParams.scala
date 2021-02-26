package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Action
import typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `updateBatch` operation. */
@js.native
trait UpdateBatchParams extends StObject {
  
  /** The action you want to perform on the specified batch-processing job. */
  var action: Action | String = js.native
  
  /** The ID of the batch-processing job you want to update. */
  var batch_id: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  var model: js.UndefOr[Model | String] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
}
object UpdateBatchParams {
  
  @scala.inline
  def apply(action: Action | String, batch_id: String): UpdateBatchParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBatchParams]
  }
  
  @scala.inline
  implicit class UpdateBatchParamsMutableBuilder[Self <: UpdateBatchParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Action | String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatch_id(value: String): Self = StObject.set(x, "batch_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setModel(value: Model | String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}

package typingsSlinky.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `deleteDialogNode` operation. */
@js.native
trait DeleteDialogNodeParams extends StObject {
  
  /** The dialog node ID (for example, `get_order`). */
  var dialog_node: String = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** Unique identifier of the workspace. */
  var workspace_id: String = js.native
}
object DeleteDialogNodeParams {
  
  @scala.inline
  def apply(dialog_node: String, workspace_id: String): DeleteDialogNodeParams = {
    val __obj = js.Dynamic.literal(dialog_node = dialog_node.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDialogNodeParams]
  }
  
  @scala.inline
  implicit class DeleteDialogNodeParamsMutableBuilder[Self <: DeleteDialogNodeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialog_node(value: String): Self = StObject.set(x, "dialog_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}

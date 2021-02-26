package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about the Continuous Relevancy Training for this environment. */
@js.native
trait SearchStatus extends StObject {
  
  /** The date stamp of the most recent completed training for this environment. */
  var last_trained: js.UndefOr[String] = js.native
  
  /** Current scope of the training. Always returned as `environment`. */
  var scope: js.UndefOr[String] = js.native
  
  /** The current status of Continuous Relevancy Training for this environment. */
  var status: js.UndefOr[String] = js.native
  
  /** Long description of the current Continuous Relevancy Training status. */
  var status_description: js.UndefOr[String] = js.native
}
object SearchStatus {
  
  @scala.inline
  def apply(): SearchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchStatus]
  }
  
  @scala.inline
  implicit class SearchStatusMutableBuilder[Self <: SearchStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLast_trained(value: String): Self = StObject.set(x, "last_trained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_trainedUndefined: Self = StObject.set(x, "last_trained", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStatus_description(value: String): Self = StObject.set(x, "status_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_descriptionUndefined: Self = StObject.set(x, "status_description", js.undefined)
  }
}

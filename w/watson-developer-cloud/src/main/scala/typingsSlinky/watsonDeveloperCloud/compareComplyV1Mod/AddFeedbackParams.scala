package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `addFeedback` operation. */
@js.native
trait AddFeedbackParams extends StObject {
  
  /** An optional comment on or description of the feedback. */
  var comment: js.UndefOr[String] = js.native
  
  /** Feedback data for submission. */
  var feedback_data: FeedbackDataInput = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** An optional string identifying the user. */
  var user_id: js.UndefOr[String] = js.native
}
object AddFeedbackParams {
  
  @scala.inline
  def apply(feedback_data: FeedbackDataInput): AddFeedbackParams = {
    val __obj = js.Dynamic.literal(feedback_data = feedback_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFeedbackParams]
  }
  
  @scala.inline
  implicit class AddFeedbackParamsMutableBuilder[Self <: AddFeedbackParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setFeedback_data(value: FeedbackDataInput): Self = StObject.set(x, "feedback_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}

package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewReply extends StObject {
  
  /**
    * Id of the reply
    */
  var id: Double = js.native
  
  /**
    * Flag for soft deletion
    */
  var isDeleted: Boolean = js.native
  
  /**
    * Version of the product when the reply was submitted or updated
    */
  var productVersion: String = js.native
  
  /**
    * Content of the reply
    */
  var replyText: String = js.native
  
  /**
    * Id of the review, to which this reply belongs
    */
  var reviewId: Double = js.native
  
  /**
    * Title of the reply
    */
  var title: String = js.native
  
  /**
    * Date the reply was submitted or updated
    */
  var updatedDate: js.Date = js.native
  
  /**
    * Id of the user who left the reply
    */
  var userId: String = js.native
}
object ReviewReply {
  
  @scala.inline
  def apply(
    id: Double,
    isDeleted: Boolean,
    productVersion: String,
    replyText: String,
    reviewId: Double,
    title: String,
    updatedDate: js.Date,
    userId: String
  ): ReviewReply = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], productVersion = productVersion.asInstanceOf[js.Any], replyText = replyText.asInstanceOf[js.Any], reviewId = reviewId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewReply]
  }
  
  @scala.inline
  implicit class ReviewReplyMutableBuilder[Self <: ReviewReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductVersion(value: String): Self = StObject.set(x, "productVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyText(value: String): Self = StObject.set(x, "replyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewId(value: Double): Self = StObject.set(x, "reviewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDate(value: js.Date): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserReportedConcern extends StObject {
  
  /**
    * Category of the concern
    */
  var category: ConcernCategory = js.native
  
  /**
    * User comment associated with the report
    */
  var concernText: String = js.native
  
  /**
    * Id of the review which was reported
    */
  var reviewId: Double = js.native
  
  /**
    * Date the report was submitted
    */
  var submittedDate: js.Date = js.native
  
  /**
    * Id of the user who reported a review
    */
  var userId: String = js.native
}
object UserReportedConcern {
  
  @scala.inline
  def apply(
    category: ConcernCategory,
    concernText: String,
    reviewId: Double,
    submittedDate: js.Date,
    userId: String
  ): UserReportedConcern = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], concernText = concernText.asInstanceOf[js.Any], reviewId = reviewId.asInstanceOf[js.Any], submittedDate = submittedDate.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserReportedConcern]
  }
  
  @scala.inline
  implicit class UserReportedConcernMutableBuilder[Self <: UserReportedConcern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: ConcernCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcernText(value: String): Self = StObject.set(x, "concernText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewId(value: Double): Self = StObject.set(x, "reviewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedDate(value: js.Date): Self = StObject.set(x, "submittedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}

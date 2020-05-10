package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Question extends QnAItem {
  /**
    * List of answers in for the question / thread
    */
  var responses: js.Array[Response] = js.native
}

object Question {
  @scala.inline
  def apply(
    createdDate: js.Date,
    id: Double,
    responses: js.Array[Response],
    status: QnAItemStatus,
    text: String,
    updatedDate: js.Date,
    user: UserIdentityRef
  ): Question = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Question]
  }
  @scala.inline
  implicit class QuestionOps[Self <: Question] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponses(value: js.Array[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


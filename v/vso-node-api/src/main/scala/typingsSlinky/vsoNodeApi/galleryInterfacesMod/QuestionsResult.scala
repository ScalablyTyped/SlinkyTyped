package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuestionsResult extends js.Object {
  /**
    * Flag indicating if there are more QnA threads to be shown (for paging)
    */
  var hasMoreQuestions: Boolean = js.native
  /**
    * List of the QnA threads
    */
  var questions: js.Array[Question] = js.native
}

object QuestionsResult {
  @scala.inline
  def apply(hasMoreQuestions: Boolean, questions: js.Array[Question]): QuestionsResult = {
    val __obj = js.Dynamic.literal(hasMoreQuestions = hasMoreQuestions.asInstanceOf[js.Any], questions = questions.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionsResult]
  }
  @scala.inline
  implicit class QuestionsResultOps[Self <: QuestionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasMoreQuestions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreQuestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestions(value: js.Array[Question]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


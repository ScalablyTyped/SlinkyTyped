package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldRatingScaleQuestionAnswer extends ClientValueObject {
  def get_answer(): Double = js.native
  def get_question(): String = js.native
  def set_answer(value: Double): Unit = js.native
  def set_question(value: String): Unit = js.native
}

object FieldRatingScaleQuestionAnswer {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_answer: () => Double,
    get_question: () => String,
    get_typeId: () => String,
    set_answer: Double => Unit,
    set_question: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FieldRatingScaleQuestionAnswer = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_answer = js.Any.fromFunction0(get_answer), get_question = js.Any.fromFunction0(get_question), get_typeId = js.Any.fromFunction0(get_typeId), set_answer = js.Any.fromFunction1(set_answer), set_question = js.Any.fromFunction1(set_question), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FieldRatingScaleQuestionAnswer]
  }
  @scala.inline
  implicit class FieldRatingScaleQuestionAnswerOps[Self <: FieldRatingScaleQuestionAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_answer(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_answer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_question(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_question")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_answer(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_answer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_question(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_question")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


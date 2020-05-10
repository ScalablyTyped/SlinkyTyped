package typingsSlinky.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnCellQuestionUpdate extends js.Object {
  var properties: js.Array[String] = js.native
  def onCellQuestionUpdate(cellQuestion: js.Any, column: js.Any, question: js.Any, data: js.Any): Unit = js.native
}

object AnonOnCellQuestionUpdate {
  @scala.inline
  def apply(onCellQuestionUpdate: (js.Any, js.Any, js.Any, js.Any) => Unit, properties: js.Array[String]): AnonOnCellQuestionUpdate = {
    val __obj = js.Dynamic.literal(onCellQuestionUpdate = js.Any.fromFunction4(onCellQuestionUpdate), properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnCellQuestionUpdate]
  }
  @scala.inline
  implicit class AnonOnCellQuestionUpdateOps[Self <: AnonOnCellQuestionUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCellQuestionUpdate(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellQuestionUpdate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


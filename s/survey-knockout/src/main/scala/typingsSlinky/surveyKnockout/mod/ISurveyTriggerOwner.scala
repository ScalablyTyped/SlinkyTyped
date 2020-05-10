package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISurveyTriggerOwner extends js.Object {
  def copyTriggerValue(name: String, fromName: String): js.Any = js.native
  def focusQuestion(name: String): Boolean = js.native
  def getObjects(pages: js.Array[String], questions: js.Array[String]): js.Array[_] = js.native
  def setCompleted(): js.Any = js.native
  def setTriggerValue(name: String, value: js.Any, isVariable: Boolean): js.Any = js.native
}

object ISurveyTriggerOwner {
  @scala.inline
  def apply(
    copyTriggerValue: (String, String) => js.Any,
    focusQuestion: String => Boolean,
    getObjects: (js.Array[String], js.Array[String]) => js.Array[_],
    setCompleted: () => js.Any,
    setTriggerValue: (String, js.Any, Boolean) => js.Any
  ): ISurveyTriggerOwner = {
    val __obj = js.Dynamic.literal(copyTriggerValue = js.Any.fromFunction2(copyTriggerValue), focusQuestion = js.Any.fromFunction1(focusQuestion), getObjects = js.Any.fromFunction2(getObjects), setCompleted = js.Any.fromFunction0(setCompleted), setTriggerValue = js.Any.fromFunction3(setTriggerValue))
    __obj.asInstanceOf[ISurveyTriggerOwner]
  }
  @scala.inline
  implicit class ISurveyTriggerOwnerOps[Self <: ISurveyTriggerOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyTriggerValue(value: (String, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyTriggerValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFocusQuestion(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusQuestion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetObjects(value: (js.Array[String], js.Array[String]) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getObjects")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetCompleted(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCompleted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetTriggerValue(value: (String, js.Any, Boolean) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTriggerValue")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}


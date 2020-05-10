package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISurveyImpl extends js.Object {
  def geSurveyData(): ISurveyData = js.native
  def getSurvey(): ISurvey = js.native
  def getTextProcessor(): ITextProcessor = js.native
}

object ISurveyImpl {
  @scala.inline
  def apply(geSurveyData: () => ISurveyData, getSurvey: () => ISurvey, getTextProcessor: () => ITextProcessor): ISurveyImpl = {
    val __obj = js.Dynamic.literal(geSurveyData = js.Any.fromFunction0(geSurveyData), getSurvey = js.Any.fromFunction0(getSurvey), getTextProcessor = js.Any.fromFunction0(getTextProcessor))
    __obj.asInstanceOf[ISurveyImpl]
  }
  @scala.inline
  implicit class ISurveyImplOps[Self <: ISurveyImpl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeSurveyData(value: () => ISurveyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geSurveyData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSurvey(value: () => ISurvey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSurvey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTextProcessor(value: () => ITextProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextProcessor")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


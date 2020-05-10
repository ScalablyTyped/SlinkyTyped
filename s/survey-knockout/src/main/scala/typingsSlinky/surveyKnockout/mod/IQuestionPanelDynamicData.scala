package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQuestionPanelDynamicData extends js.Object {
  def getItemIndex(item: ISurveyData): Double = js.native
  def getPanelItemData(item: ISurveyData): js.Any = js.native
  def getRootData(): ISurveyData = js.native
  def getSharedQuestionFromArray(name: String, panelIndex: Double): Question = js.native
  def getSurvey(): ISurvey = js.native
  def setPanelItemData(item: ISurveyData, name: String, `val`: js.Any): js.Any = js.native
}

object IQuestionPanelDynamicData {
  @scala.inline
  def apply(
    getItemIndex: ISurveyData => Double,
    getPanelItemData: ISurveyData => js.Any,
    getRootData: () => ISurveyData,
    getSharedQuestionFromArray: (String, Double) => Question,
    getSurvey: () => ISurvey,
    setPanelItemData: (ISurveyData, String, js.Any) => js.Any
  ): IQuestionPanelDynamicData = {
    val __obj = js.Dynamic.literal(getItemIndex = js.Any.fromFunction1(getItemIndex), getPanelItemData = js.Any.fromFunction1(getPanelItemData), getRootData = js.Any.fromFunction0(getRootData), getSharedQuestionFromArray = js.Any.fromFunction2(getSharedQuestionFromArray), getSurvey = js.Any.fromFunction0(getSurvey), setPanelItemData = js.Any.fromFunction3(setPanelItemData))
    __obj.asInstanceOf[IQuestionPanelDynamicData]
  }
  @scala.inline
  implicit class IQuestionPanelDynamicDataOps[Self <: IQuestionPanelDynamicData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetItemIndex(value: ISurveyData => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetPanelItemData(value: ISurveyData => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPanelItemData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRootData(value: () => ISurveyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSharedQuestionFromArray(value: (String, Double) => Question): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSharedQuestionFromArray")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetSurvey(value: () => ISurvey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSurvey")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPanelItemData(value: (ISurveyData, String, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPanelItemData")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}


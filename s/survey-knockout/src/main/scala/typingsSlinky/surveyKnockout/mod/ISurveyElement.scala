package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISurveyElement extends js.Object {
  var containsErrors: Boolean = js.native
  var isPage: Boolean = js.native
  var isPanel: Boolean = js.native
  var isReadOnly: Boolean = js.native
  var isVisible: Boolean = js.native
  var name: String = js.native
  def delete(): js.Any = js.native
  def getType(): String = js.native
  def locStrsChanged(): js.Any = js.native
  def onFirstRendering(): js.Any = js.native
  def onSurveyLoad(): js.Any = js.native
  def setSurveyImpl(value: ISurveyImpl): js.Any = js.native
  def setVisibleIndex(value: Double): Double = js.native
}

object ISurveyElement {
  @scala.inline
  def apply(
    containsErrors: Boolean,
    delete: () => js.Any,
    getType: () => String,
    isPage: Boolean,
    isPanel: Boolean,
    isReadOnly: Boolean,
    isVisible: Boolean,
    locStrsChanged: () => js.Any,
    name: String,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: Double => Double
  ): ISurveyElement = {
    val __obj = js.Dynamic.literal(containsErrors = containsErrors.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), getType = js.Any.fromFunction0(getType), isPage = isPage.asInstanceOf[js.Any], isPanel = isPanel.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name.asInstanceOf[js.Any], onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex))
    __obj.asInstanceOf[ISurveyElement]
  }
  @scala.inline
  implicit class ISurveyElementOps[Self <: ISurveyElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainsErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocStrsChanged(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locStrsChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnFirstRendering(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFirstRendering")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnSurveyLoad(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSurveyLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSurveyImpl(value: ISurveyImpl => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSurveyImpl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVisibleIndex(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisibleIndex")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IElement
  extends IConditionRunner
     with ISurveyElement {
  var parent: IPanel = js.native
  var renderWidth: String = js.native
  var rightIndent: Double = js.native
  var startWithNewLine: Boolean = js.native
  var visible: Boolean = js.native
  var width: String = js.native
  def clearErrors(): js.Any = js.native
  def clearIncorrectValues(): js.Any = js.native
  def getLayoutType(): String = js.native
  def getPanel(): IPanel = js.native
  def isLayoutTypeSupported(layoutType: String): Boolean = js.native
  def onAnyValueChanged(name: String): js.Any = js.native
  def removeElement(el: IElement): Boolean = js.native
  def updateCustomWidgets(): js.Any = js.native
}

object IElement {
  @scala.inline
  def apply(
    clearErrors: () => js.Any,
    clearIncorrectValues: () => js.Any,
    containsErrors: Boolean,
    delete: () => js.Any,
    getLayoutType: () => String,
    getPanel: () => IPanel,
    getType: () => String,
    isLayoutTypeSupported: String => Boolean,
    isPage: Boolean,
    isPanel: Boolean,
    isReadOnly: Boolean,
    isVisible: Boolean,
    locStrsChanged: () => js.Any,
    name: String,
    onAnyValueChanged: String => js.Any,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    parent: IPanel,
    removeElement: IElement => Boolean,
    renderWidth: String,
    rightIndent: Double,
    runCondition: (HashTable[_], HashTable[_]) => js.Any,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: Double => Double,
    startWithNewLine: Boolean,
    updateCustomWidgets: () => js.Any,
    visible: Boolean,
    width: String
  ): IElement = {
    val __obj = js.Dynamic.literal(clearErrors = js.Any.fromFunction0(clearErrors), clearIncorrectValues = js.Any.fromFunction0(clearIncorrectValues), containsErrors = containsErrors.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), getLayoutType = js.Any.fromFunction0(getLayoutType), getPanel = js.Any.fromFunction0(getPanel), getType = js.Any.fromFunction0(getType), isLayoutTypeSupported = js.Any.fromFunction1(isLayoutTypeSupported), isPage = isPage.asInstanceOf[js.Any], isPanel = isPanel.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name.asInstanceOf[js.Any], onAnyValueChanged = js.Any.fromFunction1(onAnyValueChanged), onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), parent = parent.asInstanceOf[js.Any], removeElement = js.Any.fromFunction1(removeElement), renderWidth = renderWidth.asInstanceOf[js.Any], rightIndent = rightIndent.asInstanceOf[js.Any], runCondition = js.Any.fromFunction2(runCondition), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex), startWithNewLine = startWithNewLine.asInstanceOf[js.Any], updateCustomWidgets = js.Any.fromFunction0(updateCustomWidgets), visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IElement]
  }
  @scala.inline
  implicit class IElementOps[Self <: IElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearErrors(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearErrors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearIncorrectValues(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIncorrectValues")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLayoutType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayoutType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPanel(value: () => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPanel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLayoutTypeSupported(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLayoutTypeSupported")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAnyValueChanged(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnyValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParent(value: IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveElement(value: IElement => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartWithNewLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWithNewLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateCustomWidgets(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCustomWidgets")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.surveyKnockout.mod.IParentElement because var conflicts: isReadOnly. Inlined addElement, removeElement */ @js.native
trait IPanel extends ISurveyElement {
  var elements: js.Array[IElement] = js.native
  var parent: IPanel = js.native
  def addElement(element: IElement, index: Double): js.Any = js.native
  def elementWidthChanged(el: IElement): js.Any = js.native
  def getChildrenLayoutType(): String = js.native
  def getQuestionTitleLocation(): String = js.native
  def indexOf(el: IElement): Double = js.native
  def removeElement(element: IElement): Boolean = js.native
}

object IPanel {
  @scala.inline
  def apply(
    addElement: (IElement, Double) => js.Any,
    containsErrors: Boolean,
    delete: () => js.Any,
    elementWidthChanged: IElement => js.Any,
    elements: js.Array[IElement],
    getChildrenLayoutType: () => String,
    getQuestionTitleLocation: () => String,
    getType: () => String,
    indexOf: IElement => Double,
    isPage: Boolean,
    isPanel: Boolean,
    isReadOnly: Boolean,
    isVisible: Boolean,
    locStrsChanged: () => js.Any,
    name: String,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    parent: IPanel,
    removeElement: IElement => Boolean,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: Double => Double
  ): IPanel = {
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction2(addElement), containsErrors = containsErrors.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), elementWidthChanged = js.Any.fromFunction1(elementWidthChanged), elements = elements.asInstanceOf[js.Any], getChildrenLayoutType = js.Any.fromFunction0(getChildrenLayoutType), getQuestionTitleLocation = js.Any.fromFunction0(getQuestionTitleLocation), getType = js.Any.fromFunction0(getType), indexOf = js.Any.fromFunction1(indexOf), isPage = isPage.asInstanceOf[js.Any], isPanel = isPanel.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name.asInstanceOf[js.Any], onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), parent = parent.asInstanceOf[js.Any], removeElement = js.Any.fromFunction1(removeElement), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex))
    __obj.asInstanceOf[IPanel]
  }
  @scala.inline
  implicit class IPanelOps[Self <: IPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddElement(value: (IElement, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withElementWidthChanged(value: IElement => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementWidthChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElements(value: js.Array[IElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetChildrenLayoutType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildrenLayoutType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetQuestionTitleLocation(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQuestionTitleLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndexOf(value: IElement => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(js.Any.fromFunction1(value))
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
  }
  
}


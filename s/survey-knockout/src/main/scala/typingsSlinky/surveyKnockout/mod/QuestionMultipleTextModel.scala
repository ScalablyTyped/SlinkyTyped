package typingsSlinky.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.surveyKnockout.mod.IParentElement because var conflicts: isReadOnly. Inlined addElement
- typingsSlinky.surveyKnockout.mod.ISurveyElement because Already inherited
- typingsSlinky.surveyKnockout.mod.IPanel because var conflicts: containsErrors, isPage, isPanel, isReadOnly, isVisible, name, parent. Inlined getChildrenLayoutType, getQuestionTitleLocation, getQuestionStartIndex, elementWidthChanged, indexOf, elements
- typingsSlinky.surveyKnockout.mod.ILocalizableOwner because Already inherited
- typingsSlinky.surveyKnockout.mod.IMultipleTextData because var conflicts: containsErrors, isPage, isPanel, isReadOnly, isVisible, name, parent. Inlined getSurvey, getTextProcessor, getMultipleTextValue, setMultipleTextValue, getItemDefaultValue, getIsRequiredText */ @JSImport("survey-knockout", "QuestionMultipleTextModel")
@js.native
class QuestionMultipleTextModel protected () extends Question {
  def this(name: String) = this()
  
  def addElement(element: IElement, index: Double): js.Any = js.native
  @JSName("addElement")
  def addElement_Unit(element: IElement, index: Double): Unit = js.native
  
  /**
    * Add a new text item.
    * @param name a item name
    * @param title a item title (optional)
    */
  def addItem(name: String): MultipleTextItemModel = js.native
  def addItem(name: String, title: String): MultipleTextItemModel = js.native
  
  /**
    * The number of columns. Items are rendred in one line if the value is 0.
    */
  var colCount: Double = js.native
  
  def colCountChangedCallback(): Unit = js.native
  
  /* protected */ def createTextItem(name: String, title: String): MultipleTextItemModel = js.native
  
  def elementWidthChanged(el: IElement): js.Any = js.native
  @JSName("elementWidthChanged")
  def elementWidthChanged_Unit(el: IElement): Unit = js.native
  
  val elements: js.Array[IElement] = js.native
  
  def getChildrenLayoutType(): String = js.native
  
  def getIsRequiredText(): String = js.native
  
  def getItemByName(name: String): MultipleTextItemModel = js.native
  
  def getItemDefaultValue(name: String): js.Any = js.native
  
  def getMultipleTextValue(name: String): js.Any = js.native
  
  def getQuestionStartIndex(): String = js.native
  
  def getQuestionTitleLocation(): String = js.native
  
  /**
    * Returns the list of rendered rows.
    */
  def getRows(): js.Array[_] = js.native
  
  def getSurvey(): ISurvey = js.native
  
  def getTextProcessor(): ITextProcessor = js.native
  
  def indexOf(el: IElement): Double = js.native
  
  /**
    * The default text input size.
    */
  var itemSize: Double = js.native
  
  /**
    * The list of input items.
    */
  var items: js.Array[MultipleTextItemModel] = js.native
  
  /* protected */ def onItemValueChanged(): Unit = js.native
  
  def setMultipleTextValue(name: String, value: js.Any): js.Any = js.native
  @JSName("setMultipleTextValue")
  def setMultipleTextValue_Unit(name: String, value: js.Any): Unit = js.native
}

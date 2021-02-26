package typingsSlinky.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.surveyKnockout.mod.IParentElement because var conflicts: isReadOnly. Inlined addElement
- typingsSlinky.surveyKnockout.mod.ISurveyElement because Already inherited
- typingsSlinky.surveyKnockout.mod.IPanel because var conflicts: containsErrors, isPage, isPanel, isReadOnly, isVisible, name, parent. Inlined getChildrenLayoutType, getQuestionTitleLocation, getQuestionStartIndex, elementWidthChanged, indexOf, elements */ @JSImport("survey-knockout", "QuestionCustomModelBase")
@js.native
abstract class QuestionCustomModelBase protected ()
  extends Question
     with ISurveyImpl
     with ISurveyData {
  def this(name: String, customQuestion: ComponentQuestionJSON) = this()
  
  def addElement(element: IElement, index: Double): js.Any = js.native
  @JSName("addElement")
  def addElement_Unit(element: IElement, index: Double): Unit = js.native
  
  /* protected */ def convertDataName(name: String): String = js.native
  
  /* protected */ def convertDataValue(name: String, newValue: js.Any): js.Any = js.native
  
  /* protected */ def createWrapper(): Unit = js.native
  
  var customQuestion: ComponentQuestionJSON = js.native
  
  def elementWidthChanged(el: IElement): js.Any = js.native
  @JSName("elementWidthChanged")
  def elementWidthChanged_Unit(el: IElement): Unit = js.native
  
  val elements: js.Array[IElement] = js.native
  
  /* InferMemberOverrides */
  override def getAllValues(): js.Any = js.native
  
  def getChildrenLayoutType(): String = js.native
  
  /* protected */ def getElement(): SurveyElement = js.native
  
  def getQuestionStartIndex(): String = js.native
  
  def getQuestionTitleLocation(): String = js.native
  
  /* InferMemberOverrides */
  override def getType(): String = js.native
  
  def indexOf(el: IElement): Double = js.native
  
  /* protected */ def initElement(el: SurveyElement): Unit = js.native
  
  /* InferMemberOverrides */
  override def locStrsChanged(): js.Any with Unit = js.native
}

package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionCheckbox")
@js.native
class QuestionCheckbox protected () extends QuestionCheckboxModel {
  def this(name: String) = this()
  
  def getItemClass(item: js.Any): js.Any = js.native
  
  def getItemIndex(item: js.Any): Double = js.native
  
  def getLabelClass(item: js.Any): js.Any = js.native
  
  var koAllSelected: js.Any = js.native
  
  /* protected */ def updateAllSelected(): Unit = js.native
}

package typingsSlinky.surveyKnockout.mod

import typingsSlinky.surveyKnockout.surveyKnockoutStrings.`survey-panel`
import typingsSlinky.surveyKnockout.surveyKnockoutStrings.`survey-question`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionRow")
@js.native
class QuestionRow protected () extends QuestionRowModel {
  def this(panel: PanelModelBase) = this()
  
  def getElementType(el: js.Any): `survey-panel` | `survey-question` = js.native
  
  def koAfterRender(el: js.Any, con: js.Any): Unit = js.native
  
  var koElementAfterRender: js.Any = js.native
  
  var koGetType: js.Any = js.native
}

package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrix")
@js.native
class QuestionMatrix protected () extends QuestionMatrixModel {
  def this(name: String) = this()
  
  def getItemCss(row: js.Any, column: js.Any): String = js.native
  
  var koVisibleColumns: js.Any = js.native
  
  var koVisibleRows: js.Any = js.native
}

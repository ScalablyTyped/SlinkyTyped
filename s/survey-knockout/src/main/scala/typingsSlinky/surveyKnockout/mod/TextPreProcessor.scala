package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "TextPreProcessor")
@js.native
class TextPreProcessor () extends js.Object {
  
  val hasAllValuesOnLastRun: Boolean = js.native
  
  def onProcess(textValue: TextPreProcessorValue): Unit = js.native
  
  def process(text: String): String = js.native
  def process(text: String, returnDisplayValue: js.UndefOr[scala.Nothing], doEncoding: Boolean): String = js.native
  def process(text: String, returnDisplayValue: Boolean): String = js.native
  def process(text: String, returnDisplayValue: Boolean, doEncoding: Boolean): String = js.native
}

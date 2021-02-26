package typingsSlinky.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyValidator")
@js.native
class SurveyValidator () extends Base {
  
  /* protected */ def createCustomError(name: String): SurveyError = js.native
  
  var errorOwner: ISurveyErrorOwner = js.native
  
  /* protected */ def getDefaultErrorText(name: String): String = js.native
  
  /* protected */ def getErrorText(name: String): String = js.native
  
  def getLocale(): String = js.native
  
  def getMarkdownHtml(text: String): String = js.native
  
  def getProcessedText(text: String): String = js.native
  
  val isAsync: Boolean = js.native
  
  val isRunning: Boolean = js.native
  
  val isValidateAllValues: Boolean = js.native
  
  val locText: LocalizableString = js.native
  
  def onAsyncCompleted(result: ValidatorResult): Unit = js.native
  
  var text: String = js.native
  
  def validate(value: js.Any): ValidatorResult = js.native
  def validate(
    value: js.Any,
    name: js.UndefOr[scala.Nothing],
    values: js.UndefOr[scala.Nothing],
    properties: js.Any
  ): ValidatorResult = js.native
  def validate(value: js.Any, name: js.UndefOr[scala.Nothing], values: js.Any): ValidatorResult = js.native
  def validate(value: js.Any, name: js.UndefOr[scala.Nothing], values: js.Any, properties: js.Any): ValidatorResult = js.native
  def validate(value: js.Any, name: String): ValidatorResult = js.native
  def validate(value: js.Any, name: String, values: js.UndefOr[scala.Nothing], properties: js.Any): ValidatorResult = js.native
  def validate(value: js.Any, name: String, values: js.Any): ValidatorResult = js.native
  def validate(value: js.Any, name: String, values: js.Any, properties: js.Any): ValidatorResult = js.native
}

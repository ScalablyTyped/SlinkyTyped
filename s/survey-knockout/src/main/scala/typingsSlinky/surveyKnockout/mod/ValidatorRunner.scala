package typingsSlinky.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ValidatorRunner")
@js.native
class ValidatorRunner () extends StObject {
  
  def onAsyncCompleted(errors: js.Array[SurveyError]): Unit = js.native
  
  def run(owner: IValidatorOwner): js.Array[SurveyError] = js.native
}

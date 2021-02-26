package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BacklogInError extends StObject {
  
  var backlogInError: scala.Double = js.native
  
  var doesntExistOrAccessDenied: scala.Double = js.native
  
  var maxTeamFieldsExceeded: scala.Double = js.native
  
  var maxTeamsExceeded: scala.Double = js.native
  
  var missingTeamFieldValue: scala.Double = js.native
  
  var noIterationsExist: scala.Double = js.native
  
  var oK: scala.Double = js.native
}
object BacklogInError {
  
  @scala.inline
  def apply(
    backlogInError: scala.Double,
    doesntExistOrAccessDenied: scala.Double,
    maxTeamFieldsExceeded: scala.Double,
    maxTeamsExceeded: scala.Double,
    missingTeamFieldValue: scala.Double,
    noIterationsExist: scala.Double,
    oK: scala.Double
  ): BacklogInError = {
    val __obj = js.Dynamic.literal(backlogInError = backlogInError.asInstanceOf[js.Any], doesntExistOrAccessDenied = doesntExistOrAccessDenied.asInstanceOf[js.Any], maxTeamFieldsExceeded = maxTeamFieldsExceeded.asInstanceOf[js.Any], maxTeamsExceeded = maxTeamsExceeded.asInstanceOf[js.Any], missingTeamFieldValue = missingTeamFieldValue.asInstanceOf[js.Any], noIterationsExist = noIterationsExist.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogInError]
  }
  
  @scala.inline
  implicit class BacklogInErrorMutableBuilder[Self <: BacklogInError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBacklogInError(value: scala.Double): Self = StObject.set(x, "backlogInError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoesntExistOrAccessDenied(value: scala.Double): Self = StObject.set(x, "doesntExistOrAccessDenied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTeamFieldsExceeded(value: scala.Double): Self = StObject.set(x, "maxTeamFieldsExceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTeamsExceeded(value: scala.Double): Self = StObject.set(x, "maxTeamsExceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingTeamFieldValue(value: scala.Double): Self = StObject.set(x, "missingTeamFieldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoIterationsExist(value: scala.Double): Self = StObject.set(x, "noIterationsExist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOK(value: scala.Double): Self = StObject.set(x, "oK", value.asInstanceOf[js.Any])
  }
}

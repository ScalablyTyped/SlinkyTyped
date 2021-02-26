package typingsSlinky.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputValidation extends StObject {
  
  var dataType: InputDataType = js.native
  
  var isRequired: Boolean = js.native
  
  var maxLength: Double = js.native
  
  var maxValue: Double = js.native
  
  var minLength: Double = js.native
  
  var minValue: Double = js.native
  
  var pattern: String = js.native
  
  var patternMismatchErrorMessage: String = js.native
}
object InputValidation {
  
  @scala.inline
  def apply(
    dataType: InputDataType,
    isRequired: Boolean,
    maxLength: Double,
    maxValue: Double,
    minLength: Double,
    minValue: Double,
    pattern: String,
    patternMismatchErrorMessage: String
  ): InputValidation = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], isRequired = isRequired.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternMismatchErrorMessage = patternMismatchErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValidation]
  }
  
  @scala.inline
  implicit class InputValidationMutableBuilder[Self <: InputValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: InputDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternMismatchErrorMessage(value: String): Self = StObject.set(x, "patternMismatchErrorMessage", value.asInstanceOf[js.Any])
  }
}

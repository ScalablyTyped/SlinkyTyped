package typingsSlinky.sparkpost.mod

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparkPostError extends Error {
  
  var errors: js.Array[ErrorWithDescription | ErrorWithParam] = js.native
  
  @JSName("name")
  var name_SparkPostError: typingsSlinky.sparkpost.sparkpostStrings.SparkPostError = js.native
  
  var statusCode: Double = js.native
}
object SparkPostError {
  
  @scala.inline
  def apply(
    errors: js.Array[ErrorWithDescription | ErrorWithParam],
    message: String,
    name: typingsSlinky.sparkpost.sparkpostStrings.SparkPostError,
    statusCode: Double
  ): SparkPostError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkPostError]
  }
  
  @scala.inline
  implicit class SparkPostErrorMutableBuilder[Self <: SparkPostError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[ErrorWithDescription | ErrorWithParam]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: (ErrorWithDescription | ErrorWithParam)*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setName(value: typingsSlinky.sparkpost.sparkpostStrings.SparkPostError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IROOM_CREATION_ERROR extends StObject {
  
  var errorCode: Double = js.native
  
  var errorMessage: String = js.native
}
object IROOM_CREATION_ERROR {
  
  @scala.inline
  def apply(errorCode: Double, errorMessage: String): IROOM_CREATION_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_CREATION_ERROR]
  }
  
  @scala.inline
  implicit class IROOM_CREATION_ERRORMutableBuilder[Self <: IROOM_CREATION_ERROR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentSessionKey extends StObject {
  
  /**
    * Gets or sets a value indicating whether or not the key value is encrypted. If this value is true, the property should be decrypted using the RSA key exchanged with the server during registration.
    */
  var encrypted: Boolean = js.native
  
  /**
    * Gets or sets the symmetric key value.
    */
  var value: js.Array[Double] = js.native
}
object TaskAgentSessionKey {
  
  @scala.inline
  def apply(encrypted: Boolean, value: js.Array[Double]): TaskAgentSessionKey = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentSessionKey]
  }
  
  @scala.inline
  implicit class TaskAgentSessionKeyMutableBuilder[Self <: TaskAgentSessionKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}

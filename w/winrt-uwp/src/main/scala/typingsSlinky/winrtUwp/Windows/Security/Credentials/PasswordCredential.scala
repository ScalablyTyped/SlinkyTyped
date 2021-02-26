package typingsSlinky.winrtUwp.Windows.Security.Credentials

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the password credential store. */
@js.native
trait PasswordCredential extends StObject {
  
  /** Gets or sets the password string of the credential. */
  var password: String = js.native
  
  /** This API is intended for internal use only should not be used in your code. */
  var properties: IPropertySet = js.native
  
  /** Gets or sets the resource of the credential. */
  var resource: String = js.native
  
  /** Populates the password for the credential. After the operation returns successfully, you can get the password from the Password property. */
  def retrievePassword(): Unit = js.native
  
  /** Gets or sets the user name of the credential. */
  var userName: String = js.native
}
object PasswordCredential {
  
  @scala.inline
  def apply(
    password: String,
    properties: IPropertySet,
    resource: String,
    retrievePassword: () => Unit,
    userName: String
  ): PasswordCredential = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], retrievePassword = js.Any.fromFunction0(retrievePassword), userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordCredential]
  }
  
  @scala.inline
  implicit class PasswordCredentialMutableBuilder[Self <: PasswordCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrievePassword(value: () => Unit): Self = StObject.set(x, "retrievePassword", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}

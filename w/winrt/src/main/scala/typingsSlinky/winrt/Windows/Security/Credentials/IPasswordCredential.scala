package typingsSlinky.winrt.Windows.Security.Credentials

import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPasswordCredential extends StObject {
  
  var password: String = js.native
  
  var properties: IPropertySet = js.native
  
  var resource: String = js.native
  
  def retrievePassword(): Unit = js.native
  
  var userName: String = js.native
}
object IPasswordCredential {
  
  @scala.inline
  def apply(
    password: String,
    properties: IPropertySet,
    resource: String,
    retrievePassword: () => Unit,
    userName: String
  ): IPasswordCredential = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], retrievePassword = js.Any.fromFunction0(retrievePassword), userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPasswordCredential]
  }
  
  @scala.inline
  implicit class IPasswordCredentialMutableBuilder[Self <: IPasswordCredential] (val x: Self) extends AnyVal {
    
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

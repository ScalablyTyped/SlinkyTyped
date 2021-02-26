package typingsSlinky.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-passwordcredentialdata}
  */
@js.native
trait PasswordCredentialData extends SiteBoundCredentialData {
  
  /**
    * The plain-text password.
    */
  var password: String = js.native
}
object PasswordCredentialData {
  
  @scala.inline
  def apply(id: String, password: String): PasswordCredentialData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordCredentialData]
  }
  
  @scala.inline
  implicit class PasswordCredentialDataMutableBuilder[Self <: PasswordCredentialData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.winrtUwp.Windows.Web.Http

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a set of properties and methods to manage an HTTP cookie. */
@js.native
trait HttpCookie extends StObject {
  
  /** Get the domain for which the HttpCookie is valid. */
  var domain: String = js.native
  
  /** Get or set the expiration date and time for the HttpCookie . */
  var expires: js.Date = js.native
  
  /** Get or set a value that controls whether a script or other active content can access this HttpCookie . */
  var httpOnly: Boolean = js.native
  
  /** Get the token that represents the HttpCookie name. */
  var name: String = js.native
  
  /** Get the URI path component to which the HttpCookie applies. */
  var path: String = js.native
  
  /** Get or set the security level for the HttpCookie . */
  var secure: Boolean = js.native
  
  /** Get or set the value for the HttpCookie . */
  var value: String = js.native
}
object HttpCookie {
  
  @scala.inline
  def apply(
    domain: String,
    expires: js.Date,
    httpOnly: Boolean,
    name: String,
    path: String,
    secure: Boolean,
    value: String
  ): HttpCookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpCookie]
  }
  
  @scala.inline
  implicit class HttpCookieMutableBuilder[Self <: HttpCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

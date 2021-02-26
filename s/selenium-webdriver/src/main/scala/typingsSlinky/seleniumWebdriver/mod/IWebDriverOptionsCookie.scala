package typingsSlinky.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebDriverOptionsCookie extends StObject {
  
  /**
    * The domain the cookie is visible to. Defaults to the current browsing
    * context's document's URL when adding a cookie.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * When the cookie expires.
    *
    * When {@linkplain Options#addCookie() adding a cookie}, this may be
    * specified in _seconds_ since Unix epoch (January 1, 1970). The expiry will
    * default to 20 years in the future if omitted.
    *
    * The expiry is always returned in seconds since epoch when
    * {@linkplain Options#getCookies() retrieving cookies} from the browser.
    *
    * @type {(!Date|number|undefined)}
    */
  var expiry: js.UndefOr[Double | js.Date] = js.native
  
  /**
    * Whether the cookie is an HTTP only cookie. Defaults to false when adding a
    * new cookie.
    */
  var httpOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the cookie.
    */
  var name: String = js.native
  
  /**
    * The cookie path. Defaults to "/" when adding a cookie.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Whether the cookie is a secure cookie. Defaults to false when adding a new
    * cookie.
    */
  var secure: js.UndefOr[Boolean] = js.native
  
  /**
    * The cookie value.
    */
  var value: String = js.native
}
object IWebDriverOptionsCookie {
  
  @scala.inline
  def apply(name: String, value: String): IWebDriverOptionsCookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebDriverOptionsCookie]
  }
  
  @scala.inline
  implicit class IWebDriverOptionsCookieMutableBuilder[Self <: IWebDriverOptionsCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setExpiry(value: Double | js.Date): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryDate(value: js.Date): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    @scala.inline
    def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

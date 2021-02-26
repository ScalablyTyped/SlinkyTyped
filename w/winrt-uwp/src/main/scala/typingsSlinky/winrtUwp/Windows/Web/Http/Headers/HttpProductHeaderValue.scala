package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents product information used by the HttpProductHeaderValue and HttpProductInfoHeaderValueCollection classes in the User-Agent HTTP header. */
@js.native
trait HttpProductHeaderValue extends StObject {
  
  /** Gets a token that represents the name of the product to be used in the User-Agent HTTP header. */
  var name: String = js.native
  
  /** Gets a token that represents the version of the product to be used in the User-Agent HTTP header. */
  var version: String = js.native
}
object HttpProductHeaderValue {
  
  @scala.inline
  def apply(name: String, version: String): HttpProductHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProductHeaderValue]
  }
  
  @scala.inline
  implicit class HttpProductHeaderValueMutableBuilder[Self <: HttpProductHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

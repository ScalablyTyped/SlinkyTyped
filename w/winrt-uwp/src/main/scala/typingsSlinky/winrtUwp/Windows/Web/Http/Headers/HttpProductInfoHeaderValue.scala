package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents product information used in the User-Agent HTTP header on an HTTP request. */
@js.native
trait HttpProductInfoHeaderValue extends StObject {
  
  /** Gets the product comment from the HttpProductInfoHeaderValue used in the User-Agent HTTP header. */
  var comment: String = js.native
  
  /** Gets the product from the HttpProductInfoHeaderValue used in the User-Agent HTTP header. */
  var product: HttpProductHeaderValue = js.native
}
object HttpProductInfoHeaderValue {
  
  @scala.inline
  def apply(comment: String, product: HttpProductHeaderValue): HttpProductInfoHeaderValue = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProductInfoHeaderValue]
  }
  
  @scala.inline
  implicit class HttpProductInfoHeaderValueMutableBuilder[Self <: HttpProductInfoHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: HttpProductHeaderValue): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
  }
}

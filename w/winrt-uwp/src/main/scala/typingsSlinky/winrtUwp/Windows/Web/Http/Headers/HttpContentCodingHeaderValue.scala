package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents content encoding information used in the Content-Encoding HTTP header on HTTP content in a request or a response. */
@js.native
trait HttpContentCodingHeaderValue extends StObject {
  
  /** Gets the value of the content-coding information used in the Content-Encoding HTTP header. */
  var contentCoding: String = js.native
}
object HttpContentCodingHeaderValue {
  
  @scala.inline
  def apply(contentCoding: String): HttpContentCodingHeaderValue = {
    val __obj = js.Dynamic.literal(contentCoding = contentCoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpContentCodingHeaderValue]
  }
  
  @scala.inline
  implicit class HttpContentCodingHeaderValueMutableBuilder[Self <: HttpContentCodingHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentCoding(value: String): Self = StObject.set(x, "contentCoding", value.asInstanceOf[js.Any])
  }
}

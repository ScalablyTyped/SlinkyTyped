package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object describing the current status of the wordlist. */
@js.native
trait TokenDictStatusResponse extends StObject {
  
  /** Current wordlist status for the specified collection. */
  var status: js.UndefOr[String] = js.native
  
  /** The type for this wordlist. Can be `tokenization_dictionary` or `stopwords`. */
  var `type`: js.UndefOr[String] = js.native
}
object TokenDictStatusResponse {
  
  @scala.inline
  def apply(): TokenDictStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenDictStatusResponse]
  }
  
  @scala.inline
  implicit class TokenDictStatusResponseMutableBuilder[Self <: TokenDictStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

package typingsSlinky.vegaTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encode extends StObject {
  
  var encode: String = js.native
}
object Encode {
  
  @scala.inline
  def apply(encode: String): Encode = {
    val __obj = js.Dynamic.literal(encode = encode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encode]
  }
  
  @scala.inline
  implicit class EncodeMutableBuilder[Self <: Encode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncode(value: String): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
  }
}

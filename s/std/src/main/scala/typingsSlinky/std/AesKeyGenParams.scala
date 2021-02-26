package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AesKeyGenParams extends Algorithm {
  
  var length: Double = js.native
}
object AesKeyGenParams {
  
  @scala.inline
  def apply(length: Double, name: java.lang.String): org.scalajs.dom.crypto.AesKeyGenParams = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.AesKeyGenParams]
  }
  
  @scala.inline
  implicit class AesKeyGenParamsMutableBuilder[Self <: org.scalajs.dom.crypto.AesKeyGenParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}

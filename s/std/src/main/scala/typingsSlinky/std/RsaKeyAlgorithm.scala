package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaKeyAlgorithm extends KeyAlgorithm {
  
  var modulusLength: Double = js.native
  
  var publicExponent: js.typedarray.Uint8Array = js.native
}
object RsaKeyAlgorithm {
  
  @scala.inline
  def apply(modulusLength: Double, name: java.lang.String, publicExponent: js.typedarray.Uint8Array): org.scalajs.dom.crypto.RsaKeyAlgorithm = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.RsaKeyAlgorithm]
  }
  
  @scala.inline
  implicit class RsaKeyAlgorithmMutableBuilder[Self <: org.scalajs.dom.crypto.RsaKeyAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicExponent(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
  }
}

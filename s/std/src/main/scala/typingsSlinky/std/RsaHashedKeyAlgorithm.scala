package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaHashedKeyAlgorithm extends RsaKeyAlgorithm {
  
  var hash: org.scalajs.dom.crypto.KeyAlgorithm = js.native
}
object RsaHashedKeyAlgorithm {
  
  @scala.inline
  def apply(
    hash: org.scalajs.dom.crypto.KeyAlgorithm,
    modulusLength: Double,
    name: java.lang.String,
    publicExponent: js.typedarray.Uint8Array
  ): org.scalajs.dom.crypto.RsaHashedKeyAlgorithm = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.RsaHashedKeyAlgorithm]
  }
  
  @scala.inline
  implicit class RsaHashedKeyAlgorithmMutableBuilder[Self <: org.scalajs.dom.crypto.RsaHashedKeyAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: org.scalajs.dom.crypto.KeyAlgorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
  }
}

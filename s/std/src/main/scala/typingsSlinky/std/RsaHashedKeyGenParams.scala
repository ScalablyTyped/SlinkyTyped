package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaHashedKeyGenParams extends RsaKeyGenParams {
  
  var hash: HashAlgorithmIdentifier = js.native
}
object RsaHashedKeyGenParams {
  
  @scala.inline
  def apply(
    hash: HashAlgorithmIdentifier,
    modulusLength: Double,
    name: java.lang.String,
    publicExponent: js.typedarray.Uint8Array
  ): org.scalajs.dom.crypto.RsaHashedKeyGenParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.RsaHashedKeyGenParams]
  }
  
  @scala.inline
  implicit class RsaHashedKeyGenParamsMutableBuilder[Self <: org.scalajs.dom.crypto.RsaHashedKeyGenParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: HashAlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
  }
}

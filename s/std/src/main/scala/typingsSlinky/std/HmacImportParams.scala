package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HmacImportParams extends Algorithm {
  
  var hash: HashAlgorithmIdentifier = js.native
  
  var length: js.UndefOr[Double] = js.native
}
object HmacImportParams {
  
  @scala.inline
  def apply(hash: HashAlgorithmIdentifier, name: java.lang.String): org.scalajs.dom.crypto.HmacImportParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.HmacImportParams]
  }
  
  @scala.inline
  implicit class HmacImportParamsMutableBuilder[Self <: org.scalajs.dom.crypto.HmacImportParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: HashAlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}

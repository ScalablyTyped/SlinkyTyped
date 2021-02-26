package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EcdsaParams extends Algorithm {
  
  var hash: HashAlgorithmIdentifier = js.native
}
object EcdsaParams {
  
  @scala.inline
  def apply(hash: HashAlgorithmIdentifier, name: java.lang.String): org.scalajs.dom.crypto.EcdsaParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.EcdsaParams]
  }
  
  @scala.inline
  implicit class EcdsaParamsMutableBuilder[Self <: org.scalajs.dom.crypto.EcdsaParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: HashAlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
  }
}

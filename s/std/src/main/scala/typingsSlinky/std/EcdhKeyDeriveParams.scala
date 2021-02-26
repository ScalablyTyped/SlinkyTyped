package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EcdhKeyDeriveParams extends Algorithm {
  
  var public: org.scalajs.dom.crypto.CryptoKey = js.native
}
object EcdhKeyDeriveParams {
  
  @scala.inline
  def apply(name: java.lang.String, public: org.scalajs.dom.crypto.CryptoKey): org.scalajs.dom.crypto.EcdhKeyDeriveParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.EcdhKeyDeriveParams]
  }
  
  @scala.inline
  implicit class EcdhKeyDeriveParamsMutableBuilder[Self <: org.scalajs.dom.crypto.EcdhKeyDeriveParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublic(value: org.scalajs.dom.crypto.CryptoKey): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
  }
}

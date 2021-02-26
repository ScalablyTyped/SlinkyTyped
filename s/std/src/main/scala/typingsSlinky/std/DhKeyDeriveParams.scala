package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DhKeyDeriveParams extends Algorithm {
  
  var public: org.scalajs.dom.crypto.CryptoKey = js.native
}
object DhKeyDeriveParams {
  
  @scala.inline
  def apply(name: java.lang.String, public: org.scalajs.dom.crypto.CryptoKey): org.scalajs.dom.crypto.DhKeyDeriveParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.DhKeyDeriveParams]
  }
  
  @scala.inline
  implicit class DhKeyDeriveParamsMutableBuilder[Self <: org.scalajs.dom.crypto.DhKeyDeriveParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublic(value: org.scalajs.dom.crypto.CryptoKey): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
  }
}

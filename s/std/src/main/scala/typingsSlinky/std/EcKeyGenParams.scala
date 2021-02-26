package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EcKeyGenParams extends Algorithm {
  
  var namedCurve: NamedCurve = js.native
}
object EcKeyGenParams {
  
  @scala.inline
  def apply(name: java.lang.String, namedCurve: NamedCurve): org.scalajs.dom.crypto.EcKeyGenParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namedCurve = namedCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.EcKeyGenParams]
  }
  
  @scala.inline
  implicit class EcKeyGenParamsMutableBuilder[Self <: org.scalajs.dom.crypto.EcKeyGenParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedCurve(value: NamedCurve): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
  }
}

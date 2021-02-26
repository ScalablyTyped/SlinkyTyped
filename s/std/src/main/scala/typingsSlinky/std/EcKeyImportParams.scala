package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EcKeyImportParams extends Algorithm {
  
  var namedCurve: NamedCurve = js.native
}
object EcKeyImportParams {
  
  @scala.inline
  def apply(name: java.lang.String, namedCurve: NamedCurve): org.scalajs.dom.crypto.EcKeyImportParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namedCurve = namedCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.EcKeyImportParams]
  }
  
  @scala.inline
  implicit class EcKeyImportParamsMutableBuilder[Self <: org.scalajs.dom.crypto.EcKeyImportParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedCurve(value: NamedCurve): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
  }
}

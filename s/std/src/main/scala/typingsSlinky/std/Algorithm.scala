package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Algorithm extends StObject {
  
  var name: java.lang.String = js.native
}
object Algorithm {
  
  @scala.inline
  def apply(name: java.lang.String): org.scalajs.dom.crypto.Algorithm = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.Algorithm]
  }
  
  @scala.inline
  implicit class AlgorithmMutableBuilder[Self <: org.scalajs.dom.crypto.Algorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

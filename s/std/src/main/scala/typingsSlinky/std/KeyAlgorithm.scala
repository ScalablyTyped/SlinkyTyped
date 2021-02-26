package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyAlgorithm extends StObject {
  
  var name: java.lang.String = js.native
}
object KeyAlgorithm {
  
  @scala.inline
  def apply(name: java.lang.String): org.scalajs.dom.crypto.KeyAlgorithm = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.KeyAlgorithm]
  }
  
  @scala.inline
  implicit class KeyAlgorithmMutableBuilder[Self <: org.scalajs.dom.crypto.KeyAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

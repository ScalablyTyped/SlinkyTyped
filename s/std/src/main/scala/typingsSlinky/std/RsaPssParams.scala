package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaPssParams extends Algorithm {
  
  var saltLength: Double = js.native
}
object RsaPssParams {
  
  @scala.inline
  def apply(name: java.lang.String, saltLength: Double): org.scalajs.dom.crypto.RsaPssParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.RsaPssParams]
  }
  
  @scala.inline
  implicit class RsaPssParamsMutableBuilder[Self <: org.scalajs.dom.crypto.RsaPssParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
  }
}

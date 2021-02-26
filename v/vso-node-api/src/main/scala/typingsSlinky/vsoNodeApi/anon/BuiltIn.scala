package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuiltIn extends StObject {
  
  var builtIn: scala.Double = js.native
  
  var trusted: scala.Double = js.native
}
object BuiltIn {
  
  @scala.inline
  def apply(builtIn: scala.Double, trusted: scala.Double): BuiltIn = {
    val __obj = js.Dynamic.literal(builtIn = builtIn.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltIn]
  }
  
  @scala.inline
  implicit class BuiltInMutableBuilder[Self <: BuiltIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuiltIn(value: scala.Double): Self = StObject.set(x, "builtIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrusted(value: scala.Double): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
  }
}

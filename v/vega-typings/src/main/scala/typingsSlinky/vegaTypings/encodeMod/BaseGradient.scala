package typingsSlinky.vegaTypings.encodeMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.linear
import typingsSlinky.vegaTypings.vegaTypingsStrings.radial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseGradient extends StObject {
  
  /**
    * The type of gradient.
    */
  var gradient: linear | radial = js.native
}
object BaseGradient {
  
  @scala.inline
  def apply(gradient: linear | radial): BaseGradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseGradient]
  }
  
  @scala.inline
  implicit class BaseGradientMutableBuilder[Self <: BaseGradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGradient(value: linear | radial): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
  }
}

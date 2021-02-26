package typingsSlinky.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Theta extends StObject {
  
  val radius: typingsSlinky.vegaLite.vegaLiteNumbers.`1` = js.native
  
  val theta: typingsSlinky.vegaLite.vegaLiteNumbers.`1` = js.native
}
object Theta {
  
  @scala.inline
  def apply(
    radius: typingsSlinky.vegaLite.vegaLiteNumbers.`1`,
    theta: typingsSlinky.vegaLite.vegaLiteNumbers.`1`
  ): Theta = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], theta = theta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theta]
  }
  
  @scala.inline
  implicit class ThetaMutableBuilder[Self <: Theta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: typingsSlinky.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheta(value: typingsSlinky.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
  }
}

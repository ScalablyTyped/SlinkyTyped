package typingsSlinky.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Radius extends StObject {
  
  val radius: typingsSlinky.vegaLite.vegaLiteNumbers.`1` = js.native
  
  val radius2: typingsSlinky.vegaLite.vegaLiteNumbers.`1` = js.native
  
  val theta: typingsSlinky.vegaLite.vegaLiteNumbers.`1` = js.native
  
  val theta2: typingsSlinky.vegaLite.vegaLiteNumbers.`1` = js.native
}
object Radius {
  
  @scala.inline
  def apply(
    radius: typingsSlinky.vegaLite.vegaLiteNumbers.`1`,
    radius2: typingsSlinky.vegaLite.vegaLiteNumbers.`1`,
    theta: typingsSlinky.vegaLite.vegaLiteNumbers.`1`,
    theta2: typingsSlinky.vegaLite.vegaLiteNumbers.`1`
  ): Radius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], radius2 = radius2.asInstanceOf[js.Any], theta = theta.asInstanceOf[js.Any], theta2 = theta2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
  
  @scala.inline
  implicit class RadiusMutableBuilder[Self <: Radius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: typingsSlinky.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius2(value: typingsSlinky.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheta(value: typingsSlinky.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheta2(value: typingsSlinky.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "theta2", value.asInstanceOf[js.Any])
  }
}

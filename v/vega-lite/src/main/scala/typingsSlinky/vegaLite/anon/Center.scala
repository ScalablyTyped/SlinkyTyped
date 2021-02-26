package typingsSlinky.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Center extends StObject {
  
  val center: typingsSlinky.vegaLite.vegaLiteNumbers.`1` = js.native
  
  val normalize: typingsSlinky.vegaLite.vegaLiteNumbers.`1` = js.native
  
  val zero: typingsSlinky.vegaLite.vegaLiteNumbers.`1` = js.native
}
object Center {
  
  @scala.inline
  def apply(
    center: typingsSlinky.vegaLite.vegaLiteNumbers.`1`,
    normalize: typingsSlinky.vegaLite.vegaLiteNumbers.`1`,
    zero: typingsSlinky.vegaLite.vegaLiteNumbers.`1`
  ): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], normalize = normalize.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit class CenterMutableBuilder[Self <: Center] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: typingsSlinky.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalize(value: typingsSlinky.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZero(value: typingsSlinky.vegaLite.vegaLiteNumbers.`1`): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceEventMap extends StObject {
  
  var resourcetimingbufferfull: org.scalajs.dom.raw.Event = js.native
}
object PerformanceEventMap {
  
  @scala.inline
  def apply(resourcetimingbufferfull: org.scalajs.dom.raw.Event): PerformanceEventMap = {
    val __obj = js.Dynamic.literal(resourcetimingbufferfull = resourcetimingbufferfull.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceEventMap]
  }
  
  @scala.inline
  implicit class PerformanceEventMapMutableBuilder[Self <: PerformanceEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourcetimingbufferfull(value: org.scalajs.dom.raw.Event): Self = StObject.set(x, "resourcetimingbufferfull", value.asInstanceOf[js.Any])
  }
}

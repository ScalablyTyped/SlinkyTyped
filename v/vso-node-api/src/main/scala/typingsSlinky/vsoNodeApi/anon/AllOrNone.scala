package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllOrNone extends StObject {
  
  var allOrNone: scala.Double = js.native
  
  var bestEffort: scala.Double = js.native
}
object AllOrNone {
  
  @scala.inline
  def apply(allOrNone: scala.Double, bestEffort: scala.Double): AllOrNone = {
    val __obj = js.Dynamic.literal(allOrNone = allOrNone.asInstanceOf[js.Any], bestEffort = bestEffort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllOrNone]
  }
  
  @scala.inline
  implicit class AllOrNoneMutableBuilder[Self <: AllOrNone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllOrNone(value: scala.Double): Self = StObject.set(x, "allOrNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestEffort(value: scala.Double): Self = StObject.set(x, "bestEffort", value.asInstanceOf[js.Any])
  }
}

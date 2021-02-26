package typingsSlinky.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a time event that triggers a background task to run. */
@js.native
trait TimeTrigger extends StObject {
  
  /** Gets the interval of a time event trigger. */
  var freshnessTime: Double = js.native
  
  /** Gets whether the time event trigger will be used only once or each time the FreshnessTime interval elapses. */
  var oneShot: Boolean = js.native
}
object TimeTrigger {
  
  @scala.inline
  def apply(freshnessTime: Double, oneShot: Boolean): TimeTrigger = {
    val __obj = js.Dynamic.literal(freshnessTime = freshnessTime.asInstanceOf[js.Any], oneShot = oneShot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeTrigger]
  }
  
  @scala.inline
  implicit class TimeTriggerMutableBuilder[Self <: TimeTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFreshnessTime(value: Double): Self = StObject.set(x, "freshnessTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneShot(value: Boolean): Self = StObject.set(x, "oneShot", value.asInstanceOf[js.Any])
  }
}

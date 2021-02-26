package typingsSlinky.timezonecomplete

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timesourceMod {
  
  @JSImport("timezonecomplete/dist/lib/timesource", "RealTimeSource")
  @js.native
  class RealTimeSource () extends TimeSource
  
  @js.native
  trait TimeSource extends StObject {
    
    /**
      * Return the current date+time as a javascript Date object
      * @throws nothing
      */
    def now(): js.Date = js.native
  }
  object TimeSource {
    
    @scala.inline
    def apply(now: () => js.Date): TimeSource = {
      val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
      __obj.asInstanceOf[TimeSource]
    }
    
    @scala.inline
    implicit class TimeSourceMutableBuilder[Self <: TimeSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNow(value: () => js.Date): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
    }
  }
}

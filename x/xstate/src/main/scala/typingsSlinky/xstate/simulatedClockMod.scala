package typingsSlinky.xstate

import typingsSlinky.xstate.interpreterMod.Clock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstate/lib/SimulatedClock", JSImport.Namespace)
@js.native
object simulatedClockMod extends js.Object {
  
  @js.native
  class SimulatedClock () extends Clock {
    
    var _id: js.Any = js.native
    
    var _now: js.Any = js.native
    
    def clearTimeout(id: Double): Unit = js.native
    
    var flushTimeouts: js.Any = js.native
    
    var getId: js.Any = js.native
    
    def increment(ms: Double): Unit = js.native
    
    def now(): Double = js.native
    
    def set(ms: Double): Unit = js.native
    
    def start(speed: Double): Unit = js.native
    
    var timeouts: js.Any = js.native
  }
}

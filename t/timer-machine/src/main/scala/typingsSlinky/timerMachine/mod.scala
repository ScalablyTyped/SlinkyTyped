package typingsSlinky.timerMachine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("timer-machine", JSImport.Namespace)
  @js.native
  class ^ () extends Timer {
    def this(started: Boolean) = this()
  }
  
  /* static member */
  @JSImport("timer-machine", "destroy")
  @js.native
  def destroy(reference: String): Timer = js.native
  
  /* static member */
  @JSImport("timer-machine", "get")
  @js.native
  def get(reference: String): Timer = js.native
  
  @js.native
  trait Timer extends StObject {
    
    def emitTime(): Unit = js.native
    
    def isStarted(): Boolean = js.native
    
    def isStopped(): Boolean = js.native
    
    def on(event: TimerEvent): Unit = js.native
    def on(event: TimerEvent, callback: js.Function0[Unit]): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def time(): Double = js.native
    
    def timeFromStart(): Double = js.native
    
    def toggle(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.timerMachine.timerMachineStrings.start
    - typingsSlinky.timerMachine.timerMachineStrings.stop
    - typingsSlinky.timerMachine.timerMachineStrings.time
  */
  trait TimerEvent extends StObject
  object TimerEvent {
    
    @scala.inline
    def start: typingsSlinky.timerMachine.timerMachineStrings.start = "start".asInstanceOf[typingsSlinky.timerMachine.timerMachineStrings.start]
    
    @scala.inline
    def stop: typingsSlinky.timerMachine.timerMachineStrings.stop = "stop".asInstanceOf[typingsSlinky.timerMachine.timerMachineStrings.stop]
    
    @scala.inline
    def time: typingsSlinky.timerMachine.timerMachineStrings.time = "time".asInstanceOf[typingsSlinky.timerMachine.timerMachineStrings.time]
  }
}

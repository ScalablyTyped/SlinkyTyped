package typingsSlinky.tocktimer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tocktimer", JSImport.Namespace)
  @js.native
  def apply(): Tock = js.native
  @JSImport("tocktimer", JSImport.Namespace)
  @js.native
  def apply(opts: TockOptions): Tock = js.native
  
  @JSImport("tocktimer", "Tock")
  @js.native
  /**
    * Create a Tock instance
    */
  class Tock () extends StObject {
    def this(opts: TockOptions) = this()
    
    /**
      * Returns the elapsed time in milliseconds
      */
    def lap(): Double = js.native
    
    /**
      * Convert number of milliseconds to a MM:SS time string. Won't handle times greater than 1 hour
      */
    def msToTime(ms: Double): String = js.native
    
    /**
      * Convert number of milliseconds to timecode string
      */
    def msToTimecode(ms: Double): String = js.native
    def msToTimecode(ms: Double, showMs: Boolean): String = js.native
    
    /**
      * Stop the clock if it's running, continue clock if paused
      */
    def pause(): Unit = js.native
    
    /**
      * Reset times to zero. Countdown clocks need a duration to be passed to start() after reset() is called.
      */
    def reset(): Unit = js.native
    
    /**
      * Start the timer
      * @param time Can be either a countdown value or a starting value.
      * If a countdown timer then set time to count down from.
      * If a starting value then set time to the desired start time to count up from.
      */
    def start(): Unit = js.native
    def start(time: Double): Unit = js.native
    
    /**
      * Stop the clock and clear the timeout
      */
    def stop(): Unit = js.native
    
    /**
      * Convert a time string to a number of milliseconds. Should be a duration as a string of form MM:SS, MM:SS:ms, MM:SS.ms, HH:MM:SS
      * Alternatively a time in the future can be provided using the form yyyy-mm-dd HH:MM:SS.ms. The difference between this time and present will be returned.
      * If the input cannot be recognized as one of the above then 0 is returned
      */
    def timeToMS(time: String): Double = js.native
  }
  
  @js.native
  trait TockOptions extends StObject {
    
    /**
      * Callback function executed on each tick
      */
    def callback(): Unit = js.native
    
    /**
      * Callback function executed when the timer is complete
      */
    def complete(): Unit = js.native
    
    /**
      * Defaults to false. If true, the clock will count down from a given time, otherwise it will count up from 0:00.
      */
    var countdown: js.UndefOr[Boolean] = js.native
    
    /**
      * Defaults to 10 milliseconds. How often, in milliseconds, that the clock will tick.
      */
    var interval: js.UndefOr[Double] = js.native
  }
  object TockOptions {
    
    @scala.inline
    def apply(callback: () => Unit, complete: () => Unit): TockOptions = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), complete = js.Any.fromFunction0(complete))
      __obj.asInstanceOf[TockOptions]
    }
    
    @scala.inline
    implicit class TockOptionsMutableBuilder[Self <: TockOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCountdown(value: Boolean): Self = StObject.set(x, "countdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountdownUndefined: Self = StObject.set(x, "countdown", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    }
  }
}

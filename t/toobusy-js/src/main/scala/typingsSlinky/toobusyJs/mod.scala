package typingsSlinky.toobusyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Main export function.
    * @return True if node process is too busy.
    */
  @JSImport("toobusy-js", JSImport.Namespace)
  @js.native
  def apply(): Boolean = js.native
  
  /**
    * Sets or gets the current check interval.
    * If you want more sensitive checking, set a faster (lower) interval. A lower maxLag can also create a more
    * sensitive check.
    * @param  [newInterval] New interval to set. If not provided, will return the existing interval.
    * @return               New or existing interval.
    */
  @JSImport("toobusy-js", "interval")
  @js.native
  def interval(): Double = js.native
  @JSImport("toobusy-js", "interval")
  @js.native
  def interval(newInterval: Double): Double = js.native
  
  /**
    * Returns last lag reading from last check interval.
    * @return Lag in ms.
    */
  @JSImport("toobusy-js", "lag")
  @js.native
  def lag(): Double = js.native
  
  /**
    * Set or get the current max latency threshold. Default is 70ms.
    *
    * Note that if event loop lag goes over this threshold, the process is not always 'too busy' - the farther
    * it goes over the threshold, the more likely the process will be considered too busy.
    *
    * The percentage is equal to the percent over the max lag threshold. So 1.25x over the maxLag will indicate
    * too busy 25% of the time. 2x over the maxLag threshold will indicate too busy 100% of the time.
    * @param  [newLag] New maxLag (highwater) threshold.
    * @return          New or existing maxLag (highwater) threshold.
    */
  @JSImport("toobusy-js", "maxLag")
  @js.native
  def maxLag(): Double = js.native
  @JSImport("toobusy-js", "maxLag")
  @js.native
  def maxLag(newLag: Double): Double = js.native
  
  /**
    * Registers an event listener for lag events,
    * optionally specify a minimum value threshold for events being emitted
    * @param fn                 Function of form onLag(value: number) => void
    * @param [threshold=maxLag] Optional minimum lag value for events to be emitted
    */
  @JSImport("toobusy-js", "onLag")
  @js.native
  def onLag(fn: js.Function1[/* lag */ Double, Unit]): Unit = js.native
  @JSImport("toobusy-js", "onLag")
  @js.native
  def onLag(fn: js.Function1[/* lag */ Double, Unit], threshold: Double): Unit = js.native
  
  /**
    * Shuts down toobusy.
    *
    * Not necessary to call this manually, only do this if you know what you're doing. `unref()` is called
    * on toobusy's check interval, so it will never keep the server open.
    */
  @JSImport("toobusy-js", "shutdown")
  @js.native
  def shutdown(): Unit = js.native
  
  /**
    * Set or get the smoothing factor. Default is 0.3333....
    *
    * The smoothing factor per the standard exponential smoothing formula "αtn + (1-α)tn-1"
    * See: https://en.wikipedia.org/wiki/Exponential_smoothing
    *
    * @param  [newFactor] New smoothing factor.
    * @return             New or existing smoothing factor.
    */
  @JSImport("toobusy-js", "smoothingFactor")
  @js.native
  def smoothingFactor(): Double = js.native
  @JSImport("toobusy-js", "smoothingFactor")
  @js.native
  def smoothingFactor(newFactor: Double): Double = js.native
  
  @JSImport("toobusy-js", "started")
  @js.native
  def started(): Boolean = js.native
}

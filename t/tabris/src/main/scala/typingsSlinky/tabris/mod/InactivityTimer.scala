package typingsSlinky.tabris.mod

import typingsSlinky.tabris.anon.OmitInactivityTimerset
import typingsSlinky.tabris.tabrisStrings.delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "InactivityTimer")
@js.native
class InactivityTimer () extends NativeObject {
  def this(properties: Properties[InactivityTimer, OmitInactivityTimerset]) = this()
  /**
    * The interval of user inactivity that will trigger the timer. Given in milliseconds. Changes to this
    * property will not affect a running timer.
    */
  var delay: Double = js.native
  /**
    * Fired when the [*delay*](#delay) property has changed.
    */
  var onDelayChanged: ChangeListeners[this.type, delay] = js.native
  /**
    * Fired when the app has not been interacted with since the configured delay.
    */
  var onTimeout: Listeners[EventObject[this.type]] = js.native
  /**
    * Stops and resets the timer.
    */
  def cancel(): Unit = js.native
  /**
    * Starts the timer with the currently configured delay. After the first `timeout` event, the timer will
    * stop but it can be started again.
    */
  def start(): Unit = js.native
}


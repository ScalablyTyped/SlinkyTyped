package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.alarmtimeoutexpired
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The cash drawer close alarm. Parameter defaults are provided, however the user can update them as appropriate. */
@js.native
trait CashDrawerCloseAlarm extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_alarmtimeoutexpired(`type`: alarmtimeoutexpired, listener: TypedEventHandler[CashDrawerCloseAlarm, _]): Unit = js.native
  
  /** Gets or sets the alarm timeout for the cash drawer close alarm. */
  var alarmTimeout: Double = js.native
  
  /** Delay between cash drawer closed alarm beeps. */
  var beepDelay: Double = js.native
  
  /** Duration of the cash drawer close alarm beep. */
  var beepDuration: Double = js.native
  
  /** Frequency of beep tone. */
  var beepFrequency: Double = js.native
  
  /** Event allowing the app to be notified if the alarm timeout has been triggered. */
  def onalarmtimeoutexpired(ev: js.Any with WinRTEvent[CashDrawerCloseAlarm]): Unit = js.native
  /** Event allowing the app to be notified if the alarm timeout has been triggered. */
  @JSName("onalarmtimeoutexpired")
  var onalarmtimeoutexpired_Original: TypedEventHandler[CashDrawerCloseAlarm, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_alarmtimeoutexpired(`type`: alarmtimeoutexpired, listener: TypedEventHandler[CashDrawerCloseAlarm, _]): Unit = js.native
  
  /**
    * Starts the alarm countdown, returning an awaitable object that completes when the cash drawer is closed.
    * @return True if the drawer has been closed; otherwise, false indicates a problem has occurred.
    */
  def startAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
}

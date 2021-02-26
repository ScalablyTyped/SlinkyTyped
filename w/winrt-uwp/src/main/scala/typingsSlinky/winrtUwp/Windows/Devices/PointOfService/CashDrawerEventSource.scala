package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.drawerclosed
import typingsSlinky.winrtUwp.winrtUwpStrings.draweropened
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides event sources that allow a developer to detect when the cash drawer is opened or closed. */
@js.native
trait CashDrawerEventSource extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drawerclosed(
    `type`: drawerclosed,
    listener: TypedEventHandler[CashDrawerEventSource, CashDrawerClosedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_draweropened(
    `type`: draweropened,
    listener: TypedEventHandler[CashDrawerEventSource, CashDrawerOpenedEventArgs]
  ): Unit = js.native
  
  /** Occurs when the cash drawer is closed. */
  def ondrawerclosed(ev: CashDrawerClosedEventArgs with WinRTEvent[CashDrawerEventSource]): Unit = js.native
  /** Occurs when the cash drawer is closed. */
  @JSName("ondrawerclosed")
  var ondrawerclosed_Original: TypedEventHandler[CashDrawerEventSource, CashDrawerClosedEventArgs] = js.native
  
  /** Occurs when the cash drawer is opened. */
  def ondraweropened(ev: CashDrawerOpenedEventArgs with WinRTEvent[CashDrawerEventSource]): Unit = js.native
  /** Occurs when the cash drawer is opened. */
  @JSName("ondraweropened")
  var ondraweropened_Original: TypedEventHandler[CashDrawerEventSource, CashDrawerOpenedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drawerclosed(
    `type`: drawerclosed,
    listener: TypedEventHandler[CashDrawerEventSource, CashDrawerClosedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_draweropened(
    `type`: draweropened,
    listener: TypedEventHandler[CashDrawerEventSource, CashDrawerOpenedEventArgs]
  ): Unit = js.native
}

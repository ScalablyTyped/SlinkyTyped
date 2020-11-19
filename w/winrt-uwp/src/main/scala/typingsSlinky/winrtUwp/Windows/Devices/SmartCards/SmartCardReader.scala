package typingsSlinky.winrtUwp.Windows.Devices.SmartCards

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.cardadded
import typingsSlinky.winrtUwp.winrtUwpStrings.cardremoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents info about a smart card reader. */
@js.native
trait SmartCardReader extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cardadded(`type`: cardadded, listener: TypedEventHandler[SmartCardReader, CardAddedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cardremoved(`type`: cardremoved, listener: TypedEventHandler[SmartCardReader, CardRemovedEventArgs]): Unit = js.native
  
  /** Gets the smart card reader's device ID. */
  var deviceId: String = js.native
  
  /**
    * Returns a list of info about all smart cards that are connected to the smart card reader.
    * @return After the operation completes, returns the list of info about all smart cards that are connected to the smart card reader.
    */
  def findAllCardsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /**
    * Returns the smart card reader's status.
    * @return After the status request completes, returns one of the SmartCardReaderStatus enumeration values, representing the smart card reader's status.
    */
  def getStatusAsync(): IPromiseWithIAsyncOperation[SmartCardReaderStatus] = js.native
  
  /** Gets the smart card reader's type. */
  var kind: SmartCardReaderKind = js.native
  
  /** Gets the smart card reader's device name. */
  var name: String = js.native
  
  /** Occurs when a smart card is inserted into the smart card reader or tapped on an NFC reader. */
  def oncardadded(ev: CardAddedEventArgs with WinRTEvent[SmartCardReader]): Unit = js.native
  /** Occurs when a smart card is inserted into the smart card reader or tapped on an NFC reader. */
  @JSName("oncardadded")
  var oncardadded_Original: TypedEventHandler[SmartCardReader, CardAddedEventArgs] = js.native
  
  /** Occurs when a smart card is taken out of the smart card reader. */
  def oncardremoved(ev: CardRemovedEventArgs with WinRTEvent[SmartCardReader]): Unit = js.native
  /** Occurs when a smart card is taken out of the smart card reader. */
  @JSName("oncardremoved")
  var oncardremoved_Original: TypedEventHandler[SmartCardReader, CardRemovedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cardadded(`type`: cardadded, listener: TypedEventHandler[SmartCardReader, CardAddedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cardremoved(`type`: cardremoved, listener: TypedEventHandler[SmartCardReader, CardRemovedEventArgs]): Unit = js.native
}

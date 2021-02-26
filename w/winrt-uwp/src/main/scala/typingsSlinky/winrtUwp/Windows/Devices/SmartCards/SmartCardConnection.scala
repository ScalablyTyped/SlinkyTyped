package typingsSlinky.winrtUwp.Windows.Devices.SmartCards

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a connection to a smart card. */
@js.native
trait SmartCardConnection extends StObject {
  
  /** Completes the smart card authentication challenge/response operation and frees associated system resources. */
  def close(): Unit = js.native
  
  /**
    * Asynchronously transmits the supplied application protocol data unit (APDU) command and returns the response.
    * @param command The APDU command to transmit to the smart card.
    * @return An asynchronous operation that, when completed, returns the response to the command that was transmitted.
    */
  def transmitAsync(command: IBuffer): IPromiseWithIAsyncOperation[IBuffer] = js.native
}
object SmartCardConnection {
  
  @scala.inline
  def apply(close: () => Unit, transmitAsync: IBuffer => IPromiseWithIAsyncOperation[IBuffer]): SmartCardConnection = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), transmitAsync = js.Any.fromFunction1(transmitAsync))
    __obj.asInstanceOf[SmartCardConnection]
  }
  
  @scala.inline
  implicit class SmartCardConnectionMutableBuilder[Self <: SmartCardConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransmitAsync(value: IBuffer => IPromiseWithIAsyncOperation[IBuffer]): Self = StObject.set(x, "transmitAsync", js.Any.fromFunction1(value))
  }
}

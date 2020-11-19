package typingsSlinky.winrtUwp.Windows.Devices.SerialCommunication

import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IOutputStream
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.errorreceived
import typingsSlinky.winrtUwp.winrtUwpStrings.pinchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a serial port. The object provides methods and properties that an app can use to find the port (in the system). */
@js.native
trait SerialDevice extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_errorreceived(`type`: errorreceived, listener: TypedEventHandler[SerialDevice, ErrorReceivedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pinchanged(`type`: pinchanged, listener: TypedEventHandler[SerialDevice, PinChangedEventArgs]): Unit = js.native
  
  /** Gets or sets the baud rate. */
  var baudRate: Double = js.native
  
  /** Gets or sets the break signal state. */
  var breakSignalState: Boolean = js.native
  
  /** Represents the number of bytes received by the last read operation of the input stream. */
  var bytesReceived: Double = js.native
  
  /** Gets the state of the Carrier Detect (CD) line. */
  var carrierDetectState: Boolean = js.native
  
  /** Gets the state of the Clear-to-Send (CTS) line. */
  var clearToSendState: Boolean = js.native
  
  /** Releases the reference to the SerialDevice object that was previously obtained by calling FromIdAsync . */
  def close(): Unit = js.native
  
  /** The number of data bits in each character value that is transmitted or received, and does not include parity bits or stop bits. */
  var dataBits: Double = js.native
  
  /** Gets the state of the Data Set Ready (DSR) signal. */
  var dataSetReadyState: Boolean = js.native
  
  /** Gets or sets the handshaking protocol for flow control. */
  var handshake: SerialHandshake = js.native
  
  /** Input stream that contains the data received on the serial port. */
  var inputStream: IInputStream = js.native
  
  /** Gets or sets a value that enables the Data Terminal Ready (DTR) signal. */
  var isDataTerminalReadyEnabled: Boolean = js.native
  
  /** Gets or sets a value that enables the Request to Send (RTS) signal. */
  var isRequestToSendEnabled: Boolean = js.native
  
  /** Event handler that is invoked when error occurs on the serial port. */
  def onerrorreceived(ev: ErrorReceivedEventArgs with WinRTEvent[SerialDevice]): Unit = js.native
  /** Event handler that is invoked when error occurs on the serial port. */
  @JSName("onerrorreceived")
  var onerrorreceived_Original: TypedEventHandler[SerialDevice, ErrorReceivedEventArgs] = js.native
  
  /** Event handler that is invoked when the state of a signal or line changes on the serial port. */
  def onpinchanged(ev: PinChangedEventArgs with WinRTEvent[SerialDevice]): Unit = js.native
  /** Event handler that is invoked when the state of a signal or line changes on the serial port. */
  @JSName("onpinchanged")
  var onpinchanged_Original: TypedEventHandler[SerialDevice, PinChangedEventArgs] = js.native
  
  /** Gets an output stream to which the app can write data to transmit through the serial port. */
  var outputStream: IOutputStream = js.native
  
  /** Gets or sets the parity bit for error-checking. */
  var parity: SerialParity = js.native
  
  /** Gets the port name for serial communications. */
  var portName: String = js.native
  
  /** Gets or sets the time-out value for a read operation. */
  var readTimeout: Double = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_errorreceived(`type`: errorreceived, listener: TypedEventHandler[SerialDevice, ErrorReceivedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pinchanged(`type`: pinchanged, listener: TypedEventHandler[SerialDevice, PinChangedEventArgs]): Unit = js.native
  
  /** Gets or sets the standard number of stop bits per byte. */
  var stopBits: SerialStopBitCount = js.native
  
  /** Gets the idProduct field of the USB device descriptor. This value indicates the device-specific product identifier and is assigned by the manufacturer. */
  var usbProductId: Double = js.native
  
  /** Gets the idVendor field of the USB device descriptor. The value indicates the vendor identifier for the device as assigned by the USB specification committee. */
  var usbVendorId: Double = js.native
  
  /** Gets or sets the time-out value for a write operation. */
  var writeTimeout: Double = js.native
}

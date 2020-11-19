package typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.Rfcomm

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import typingsSlinky.winrtUwp.Windows.Networking.Sockets.StreamSocketListener
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an instance of a local RFCOMM service. */
@js.native
trait RfcommServiceProvider extends js.Object {
  
  /** Gets a collection of SDP attributes for advertising. */
  var sdpRawAttributes: IMap[Double, IBuffer] = js.native
  
  /** Gets the RfcommServiceId of this local RFCOMM service instance. */
  var serviceId: RfcommServiceId = js.native
  
  /**
    * Begins advertising the SDP attributes.
    * @param listener The StreamSocketListener that is listening for incoming connections.
    */
  def startAdvertising(listener: StreamSocketListener): Unit = js.native
  /**
    * Begins advertising the SDP attributes.
    * @param listener The StreamSocketListener that is listening for incoming connections.
    * @param radioDiscoverable Indicates whether the radio is discoverable (true) or not (false).
    */
  def startAdvertising(listener: StreamSocketListener, radioDiscoverable: Boolean): Unit = js.native
  
  /** Stops advertising the SDP attributes. */
  def stopAdvertising(): Unit = js.native
}

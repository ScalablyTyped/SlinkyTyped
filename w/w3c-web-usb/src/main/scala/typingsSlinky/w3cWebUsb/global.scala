package typingsSlinky.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class USB ()
    extends typingsSlinky.w3cWebUsb.USB
  
  @js.native
  class USBAlternateInterface protected ()
    extends typingsSlinky.w3cWebUsb.USBAlternateInterface {
    def this(deviceInterface: typingsSlinky.w3cWebUsb.USBInterface, alternateSetting: Double) = this()
    /* CompleteClass */
    override val alternateSetting: Double = js.native
    /* CompleteClass */
    override val endpoints: js.Array[USBEndpoint] = js.native
    /* CompleteClass */
    override val interfaceClass: Double = js.native
    /* CompleteClass */
    override val interfaceProtocol: Double = js.native
    /* CompleteClass */
    override val interfaceSubclass: Double = js.native
  }
  
  @js.native
  class USBConfiguration ()
    extends typingsSlinky.w3cWebUsb.USBConfiguration {
    /* CompleteClass */
    override val configurationValue: Double = js.native
    /* CompleteClass */
    override val interfaces: js.Array[typingsSlinky.w3cWebUsb.USBInterface] = js.native
  }
  
  @js.native
  class USBConnectionEvent protected ()
    extends typingsSlinky.w3cWebUsb.USBConnectionEvent {
    def this(`type`: String, eventInitDict: USBConnectionEventInit) = this()
  }
  
  @js.native
  class USBDevice ()
    extends typingsSlinky.w3cWebUsb.USBDevice
  
  @js.native
  class USBInTransferResult protected ()
    extends typingsSlinky.w3cWebUsb.USBInTransferResult {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, data: js.typedarray.DataView) = this()
  }
  
  @js.native
  class USBInterface protected ()
    extends typingsSlinky.w3cWebUsb.USBInterface {
    def this(configuration: typingsSlinky.w3cWebUsb.USBConfiguration, interfaceNumber: Double) = this()
    /* CompleteClass */
    override val alternate: typingsSlinky.w3cWebUsb.USBAlternateInterface = js.native
    /* CompleteClass */
    override val alternates: js.Array[typingsSlinky.w3cWebUsb.USBAlternateInterface] = js.native
    /* CompleteClass */
    override val claimed: Boolean = js.native
    /* CompleteClass */
    override val interfaceNumber: Double = js.native
  }
  
  @js.native
  class USBIsochronousInTransferPacket protected ()
    extends typingsSlinky.w3cWebUsb.USBIsochronousInTransferPacket {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, data: js.typedarray.DataView) = this()
  }
  
  @js.native
  class USBIsochronousInTransferResult protected ()
    extends typingsSlinky.w3cWebUsb.USBIsochronousInTransferResult {
    def this(packets: js.Array[typingsSlinky.w3cWebUsb.USBIsochronousInTransferPacket]) = this()
    def this(
      packets: js.Array[typingsSlinky.w3cWebUsb.USBIsochronousInTransferPacket],
      data: js.typedarray.DataView
    ) = this()
    /* CompleteClass */
    override val packets: js.Array[typingsSlinky.w3cWebUsb.USBIsochronousInTransferPacket] = js.native
  }
  
  @js.native
  class USBIsochronousOutTransferPacket protected ()
    extends typingsSlinky.w3cWebUsb.USBIsochronousOutTransferPacket {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, bytesWritten: Double) = this()
    /* CompleteClass */
    override val bytesWritten: Double = js.native
    /* CompleteClass */
    override val status: USBTransferStatus = js.native
  }
  
  @js.native
  class USBIsochronousOutTransferResult protected ()
    extends typingsSlinky.w3cWebUsb.USBIsochronousOutTransferResult {
    def this(packets: js.Array[typingsSlinky.w3cWebUsb.USBIsochronousOutTransferPacket]) = this()
    /* CompleteClass */
    override val packets: js.Array[typingsSlinky.w3cWebUsb.USBIsochronousOutTransferPacket] = js.native
  }
  
  @js.native
  class USBOutTransferResult protected ()
    extends typingsSlinky.w3cWebUsb.USBOutTransferResult {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, bytesWriten: Double) = this()
    /* CompleteClass */
    override val bytesWritten: Double = js.native
    /* CompleteClass */
    override val status: USBTransferStatus = js.native
  }
  
}


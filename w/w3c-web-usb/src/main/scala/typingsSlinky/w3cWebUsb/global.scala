package typingsSlinky.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("USB")
  @js.native
  class USB ()
    extends typingsSlinky.w3cWebUsb.USB
  
  @JSGlobal("USBAlternateInterface")
  @js.native
  class USBAlternateInterface protected ()
    extends typingsSlinky.w3cWebUsb.USBAlternateInterface {
    def this(deviceInterface: typingsSlinky.w3cWebUsb.USBInterface, alternateSetting: Double) = this()
  }
  
  @JSGlobal("USBConfiguration")
  @js.native
  class USBConfiguration ()
    extends typingsSlinky.w3cWebUsb.USBConfiguration
  
  @JSGlobal("USBConnectionEvent")
  @js.native
  class USBConnectionEvent protected ()
    extends typingsSlinky.w3cWebUsb.USBConnectionEvent {
    def this(`type`: String, eventInitDict: USBConnectionEventInit) = this()
  }
  
  @JSGlobal("USBDevice")
  @js.native
  class USBDevice ()
    extends typingsSlinky.w3cWebUsb.USBDevice
  
  @JSGlobal("USBInTransferResult")
  @js.native
  class USBInTransferResult protected ()
    extends typingsSlinky.w3cWebUsb.USBInTransferResult {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, data: js.typedarray.DataView) = this()
  }
  
  @JSGlobal("USBInterface")
  @js.native
  class USBInterface protected ()
    extends typingsSlinky.w3cWebUsb.USBInterface {
    def this(configuration: typingsSlinky.w3cWebUsb.USBConfiguration, interfaceNumber: Double) = this()
  }
  
  @JSGlobal("USBIsochronousInTransferPacket")
  @js.native
  class USBIsochronousInTransferPacket protected ()
    extends typingsSlinky.w3cWebUsb.USBIsochronousInTransferPacket {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, data: js.typedarray.DataView) = this()
  }
  
  @JSGlobal("USBIsochronousInTransferResult")
  @js.native
  class USBIsochronousInTransferResult protected ()
    extends typingsSlinky.w3cWebUsb.USBIsochronousInTransferResult {
    def this(packets: js.Array[typingsSlinky.w3cWebUsb.USBIsochronousInTransferPacket]) = this()
    def this(
      packets: js.Array[typingsSlinky.w3cWebUsb.USBIsochronousInTransferPacket],
      data: js.typedarray.DataView
    ) = this()
  }
  
  @JSGlobal("USBIsochronousOutTransferPacket")
  @js.native
  class USBIsochronousOutTransferPacket protected ()
    extends typingsSlinky.w3cWebUsb.USBIsochronousOutTransferPacket {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, bytesWritten: Double) = this()
  }
  
  @JSGlobal("USBIsochronousOutTransferResult")
  @js.native
  class USBIsochronousOutTransferResult protected ()
    extends typingsSlinky.w3cWebUsb.USBIsochronousOutTransferResult {
    def this(packets: js.Array[typingsSlinky.w3cWebUsb.USBIsochronousOutTransferPacket]) = this()
  }
  
  @JSGlobal("USBOutTransferResult")
  @js.native
  class USBOutTransferResult protected ()
    extends typingsSlinky.w3cWebUsb.USBOutTransferResult {
    def this(status: USBTransferStatus) = this()
    def this(status: USBTransferStatus, bytesWriten: Double) = this()
  }
}

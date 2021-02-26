package typingsSlinky.winrtUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UsbEndpointType extends StObject
/** Defines constants that indicate the type of USB endpoint: control, bulk, isochronous, or interrupt. */
@JSGlobal("Windows.Devices.Usb.UsbEndpointType")
@js.native
object UsbEndpointType extends StObject {
  
  /** Indicates a USB bulk endpoint. */
  @js.native
  sealed trait bulk extends UsbEndpointType
  
  /** Indicates a USB control endpoint (Endpoint 0). */
  @js.native
  sealed trait control extends UsbEndpointType
  
  /** Indicates a USB interrupt endpoint. */
  @js.native
  sealed trait interrupt extends UsbEndpointType
  
  /** Indicates a USB isochronous endpoint. */
  @js.native
  sealed trait isochronous extends UsbEndpointType
}

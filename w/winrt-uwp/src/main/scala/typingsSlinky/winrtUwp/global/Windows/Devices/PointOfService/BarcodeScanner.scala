package typingsSlinky.winrtUwp.global.Windows.Devices.PointOfService

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the barcode scanner device. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScanner")
@js.native
abstract class BarcodeScanner ()
  extends typingsSlinky.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner
object BarcodeScanner {
  
  /**
    * Creates BarcodeScanner object from the DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific barcode scanner, which can be retrieved from the DeviceId property.
    * @return The barcode scanner specified by the unique device identifier. Returns a null object in the following cases:
    */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.BarcodeScanner.fromIdAsync")
  @js.native
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner] = js.native
  
  /**
    * Returns the first available barcode scanner.
    * @return The first available barcode scanner. Returns a null object in the following cases:
    */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.BarcodeScanner.getDefaultAsync")
  @js.native
  def getDefaultAsync(): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner] = js.native
  
  /**
    * Gets an Advanced Query Syntax (AQS) string that you can use to list the available barcode scanners.
    * @return An Advanced Query Syntax (AQS) string that is used to enumerate available barcode scanners.
    */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.BarcodeScanner.getDeviceSelector")
  @js.native
  def getDeviceSelector(): String = js.native
}

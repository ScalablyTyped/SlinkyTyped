package typingsSlinky.winrtUwp.Windows.Devices.Enumeration

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information and enables pairing for a device. */
@js.native
trait DeviceInformationPairing extends StObject {
  
  /** Gets a value that indicates whether the device can be paired. */
  var canPair: Boolean = js.native
  
  /** Gets the DeviceInformationCustomPairing object necessary for custom pairing. */
  var custom: DeviceInformationCustomPairing = js.native
  
  /** Gets a value that indicates whether the device is currently paired. */
  var isPaired: Boolean = js.native
  
  /**
    * Attempts to pair the device.
    * @return The result of the pairing action.
    */
  def pairAsync(): IPromiseWithIAsyncOperation[DevicePairingResult] = js.native
  /**
    * Attempts to pair the device using a provided level of protection.
    * @param minProtectionLevel The required level of protection to use for the pairing action.
    * @return The result of the pairing action.
    */
  def pairAsync(minProtectionLevel: DevicePairingProtectionLevel): IPromiseWithIAsyncOperation[DevicePairingResult] = js.native
  /**
    * Attempts to pair a device object with a specified protection level and custom settings.
    * @param minProtectionLevel The required level of protection to use for the pairing action.
    * @param devicePairingSettings The custom device pairing settings.
    * @return The result of the pairing action.
    */
  def pairAsync(minProtectionLevel: DevicePairingProtectionLevel, devicePairingSettings: IDevicePairingSettings): IPromiseWithIAsyncOperation[DevicePairingResult] = js.native
  
  /** Gets the level of protection used to pair the device. */
  var protectionLevel: DevicePairingProtectionLevel = js.native
  
  /**
    * Attempts to unpair the device.
    * @return The result of the unpairing action.
    */
  def unpairAsync(): IPromiseWithIAsyncOperation[DeviceUnpairingResult] = js.native
}

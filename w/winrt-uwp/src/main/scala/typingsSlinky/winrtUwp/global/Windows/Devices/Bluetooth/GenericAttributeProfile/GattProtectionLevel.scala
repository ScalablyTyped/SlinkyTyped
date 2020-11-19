package typingsSlinky.winrtUwp.global.Windows.Devices.Bluetooth.GenericAttributeProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the desired security level. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel")
@js.native
object GattProtectionLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel with Double
  ] = js.native
  
  /* 1 */ val authenticationRequired: typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel.authenticationRequired with Double = js.native
  
  /* 3 */ val encryptionAndAuthenticationRequired: typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel.encryptionAndAuthenticationRequired with Double = js.native
  
  /* 2 */ val encryptionRequired: typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel.encryptionRequired with Double = js.native
  
  /* 0 */ val plain: typingsSlinky.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel.plain with Double = js.native
}

package typingsSlinky.winrtUwp.global.Windows.Devices.PointOfService

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A cash drawer device in a retail scenario. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawer")
@js.native
abstract class CashDrawer ()
  extends typingsSlinky.winrtUwp.Windows.Devices.PointOfService.CashDrawer
/* static members */
@JSGlobal("Windows.Devices.PointOfService.CashDrawer")
@js.native
object CashDrawer extends js.Object {
  
  /**
    * Creates CashDrawer object from the DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific cash drawer, which can be retrieved from the DeviceId property.
    * @return The cash drawer specified by the unique device identifier. Returns a null object in the following cases:
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.PointOfService.CashDrawer] = js.native
  
  /**
    * Gets the default paired or locally-connected cash drawer.
    * @return The default locally-connected drawer. May return null if there is no drawer available.
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Devices.PointOfService.CashDrawer] = js.native
  
  /**
    * Gets an Advanced Query Syntax (AQS) string that you can use to list the available cash drawers.
    * @return An Advanced Query Syntax (AQS) string that is used to enumerate available cash drawers.
    */
  def getDeviceSelector(): String = js.native
}

package typingsSlinky.winrt.global.Windows.Networking.NetworkOperators

import typingsSlinky.winrt.Windows.Devices.Sms.CellularClass
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation")
@js.native
class MobileBroadbandDeviceInformation ()
  extends typingsSlinky.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation {
  /* CompleteClass */
  override var cellularClass: CellularClass = js.native
  /* CompleteClass */
  override var currentRadioState: typingsSlinky.winrt.Windows.Networking.NetworkOperators.MobileBroadbandRadioState = js.native
  /* CompleteClass */
  override var customDataClass: String = js.native
  /* CompleteClass */
  override var dataClasses: typingsSlinky.winrt.Windows.Networking.NetworkOperators.DataClasses = js.native
  /* CompleteClass */
  override var deviceId: String = js.native
  /* CompleteClass */
  override var deviceType: typingsSlinky.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType = js.native
  /* CompleteClass */
  override var firmwareInformation: String = js.native
  /* CompleteClass */
  override var manufacturer: String = js.native
  /* CompleteClass */
  override var mobileEquipmentId: String = js.native
  /* CompleteClass */
  override var model: String = js.native
  /* CompleteClass */
  override var networkDeviceStatus: typingsSlinky.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus = js.native
  /* CompleteClass */
  override var simIccId: String = js.native
  /* CompleteClass */
  override var subscriberId: String = js.native
  /* CompleteClass */
  override var telephoneNumbers: IVectorView[String] = js.native
}


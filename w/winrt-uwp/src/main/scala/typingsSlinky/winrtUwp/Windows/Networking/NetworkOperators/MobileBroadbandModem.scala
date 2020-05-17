package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mobile broadband modem. */
@js.native
trait MobileBroadbandModem extends js.Object {
  /** Gets the MobileBroadbandAccount associated currently with the mobile broadband modem. */
  var currentAccount: MobileBroadbandAccount = js.native
  /** Gets an object that describes the mobile broadband network that this modem us currently attached to. */
  var currentNetwork: MobileBroadbandNetwork = js.native
  /** Gets the MobileBroadbandDeviceInformation for the mobile broadband modem. */
  var deviceInformation: MobileBroadbandDeviceInformation = js.native
  /** Gets a list of the device services available for the mobile broadband modem. */
  var deviceServices: IVectorView[MobileBroadbandDeviceServiceInformation] = js.native
  /** Gets a value indicating whether the mobile broadband modem allows a reset operation. */
  var isResetSupported: Boolean = js.native
  /** Gets the maximum device service command size, in bytes, for the mobile broadband modem. */
  var maxDeviceServiceCommandSizeInBytes: Double = js.native
  /** Gets the maximum device service data size, in bytes, for the mobile broadband modem. */
  var maxDeviceServiceDataSizeInBytes: Double = js.native
  /**
    * Asynchronously retrieves mobile broadband modem configuration information.
    * @return An asynchronous retrieval operation. On successful completion, contains a MobileBroadbandModemConfiguration object representing the current configuration.
    */
  def getCurrentConfigurationAsync(): IPromiseWithIAsyncOperation[MobileBroadbandModemConfiguration] = js.native
  /**
    * Gets a specific device service for the mobile broadband modem.
    * @param deviceServiceId The unique device service identifier for the device service to be retrieved.
    * @return The mobile broadband device service retrieved.
    */
  def getDeviceService(deviceServiceId: String): MobileBroadbandDeviceService = js.native
  /**
    * Asynchronously performs a reset operation on the mobile broadband modem.
    * @return An asynchronous reset operation.
    */
  def resetAsync(): IPromiseWithIAsyncAction = js.native
}

object MobileBroadbandModem {
  @scala.inline
  def apply(
    currentAccount: MobileBroadbandAccount,
    currentNetwork: MobileBroadbandNetwork,
    deviceInformation: MobileBroadbandDeviceInformation,
    deviceServices: IVectorView[MobileBroadbandDeviceServiceInformation],
    getCurrentConfigurationAsync: () => IPromiseWithIAsyncOperation[MobileBroadbandModemConfiguration],
    getDeviceService: String => MobileBroadbandDeviceService,
    isResetSupported: Boolean,
    maxDeviceServiceCommandSizeInBytes: Double,
    maxDeviceServiceDataSizeInBytes: Double,
    resetAsync: () => IPromiseWithIAsyncAction
  ): MobileBroadbandModem = {
    val __obj = js.Dynamic.literal(currentAccount = currentAccount.asInstanceOf[js.Any], currentNetwork = currentNetwork.asInstanceOf[js.Any], deviceInformation = deviceInformation.asInstanceOf[js.Any], deviceServices = deviceServices.asInstanceOf[js.Any], getCurrentConfigurationAsync = js.Any.fromFunction0(getCurrentConfigurationAsync), getDeviceService = js.Any.fromFunction1(getDeviceService), isResetSupported = isResetSupported.asInstanceOf[js.Any], maxDeviceServiceCommandSizeInBytes = maxDeviceServiceCommandSizeInBytes.asInstanceOf[js.Any], maxDeviceServiceDataSizeInBytes = maxDeviceServiceDataSizeInBytes.asInstanceOf[js.Any], resetAsync = js.Any.fromFunction0(resetAsync))
    __obj.asInstanceOf[MobileBroadbandModem]
  }
  @scala.inline
  implicit class MobileBroadbandModemOps[Self <: MobileBroadbandModem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentAccount(value: MobileBroadbandAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentNetwork(value: MobileBroadbandNetwork): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceInformation(value: MobileBroadbandDeviceInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceServices(value: IVectorView[MobileBroadbandDeviceServiceInformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCurrentConfigurationAsync(value: () => IPromiseWithIAsyncOperation[MobileBroadbandModemConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentConfigurationAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDeviceService(value: String => MobileBroadbandDeviceService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeviceService")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsResetSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResetSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDeviceServiceCommandSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeviceServiceCommandSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDeviceServiceDataSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeviceServiceDataSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetAsync(value: () => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


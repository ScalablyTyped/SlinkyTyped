package typingsSlinky.winrtUwp.Windows.Media.DialProtocol

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DIAL application running on a remote device. */
@js.native
trait DialApp extends js.Object {
  /** Gets the applications registered DIAL name. */
  var appName: String = js.native
  /**
    * Gets the current status of the application on the remote device.
    * @return The app status, a value from DialAppStateDetails .
    */
  def getAppStateAsync(): IPromiseWithIAsyncOperation[DialAppStateDetails] = js.native
  /**
    * Initiates the launching of the app on the remote device. When this method is called, the DialDevice is paired if necessary, the user is prompted to allow access to the device, connection is established, app existence is validated on the device, and finally the application is launched with the provided argument.
    * @param appArgument Optional.
    * @return Indicates the result of attempting to launch the app.
    */
  def requestLaunchAsync(appArgument: String): IPromiseWithIAsyncOperation[DialAppLaunchResult] = js.native
  /**
    * Stops the app on the remote device, if the remote device supports this functionality.
    * @return The result of sending the request to stop the app.
    */
  def stopAsync(): IPromiseWithIAsyncOperation[DialAppStopResult] = js.native
}

object DialApp {
  @scala.inline
  def apply(
    appName: String,
    getAppStateAsync: () => IPromiseWithIAsyncOperation[DialAppStateDetails],
    requestLaunchAsync: String => IPromiseWithIAsyncOperation[DialAppLaunchResult],
    stopAsync: () => IPromiseWithIAsyncOperation[DialAppStopResult]
  ): DialApp = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], getAppStateAsync = js.Any.fromFunction0(getAppStateAsync), requestLaunchAsync = js.Any.fromFunction1(requestLaunchAsync), stopAsync = js.Any.fromFunction0(stopAsync))
    __obj.asInstanceOf[DialApp]
  }
  @scala.inline
  implicit class DialAppOps[Self <: DialApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAppStateAsync(value: () => IPromiseWithIAsyncOperation[DialAppStateDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAppStateAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequestLaunchAsync(value: String => IPromiseWithIAsyncOperation[DialAppLaunchResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestLaunchAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStopAsync(value: () => IPromiseWithIAsyncOperation[DialAppStopResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


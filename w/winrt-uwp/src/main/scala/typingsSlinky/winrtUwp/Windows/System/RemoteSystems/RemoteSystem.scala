package typingsSlinky.winrtUwp.Windows.System.RemoteSystems

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This class manages the attributes of a discovered remote system (device) and provides the capabilities to discover remote systems as part of Project Rome. */
@js.native
trait RemoteSystem extends js.Object {
  /** A list of the applications on this remote system that have registered with the Connected Devices Platform. */
  var apps: IVectorView[RemoteSystemApp] = js.native
  /** Gets the machine name of the given remote system. */
  var displayName: String = js.native
  /** Gets the unique string identifier for the given remote system. */
  var id: String = js.native
  /** Checks whether the given remote system is available through proximal connection (such as a Bluetooth or local network connection) as opposed to cloud connection. */
  var isAvailableByProximity: Boolean = js.native
  /** Checks whether the given remote system is available through spatially proximal connection. */
  var isAvailableBySpatialProximity: Boolean = js.native
  /** Gets a String representation of the device type of the given remote system (desktop, Xbox, ...). */
  var kind: String = js.native
  /** Gets the manufacturer name of the given remote system. */
  var manufacturerDisplayName: String = js.native
  /** Gets the model name of the given remote system. */
  var modelDisplayName: String = js.native
  /** Gets a value describing the OS platform that this remote system is running. */
  var platform: RemoteSystemPlatform = js.native
  /** Gets the status of this remote system's availability. */
  var status: RemoteSystemStatus = js.native
  /** Reports whether the RemoteSystem is capable of the given Remote System feature. */
  def getCapabilitySupportedAsync(capabilityName: String): IPromiseWithIAsyncOperation[Boolean] = js.native
}

object RemoteSystem {
  @scala.inline
  def apply(
    apps: IVectorView[RemoteSystemApp],
    displayName: String,
    getCapabilitySupportedAsync: String => IPromiseWithIAsyncOperation[Boolean],
    id: String,
    isAvailableByProximity: Boolean,
    isAvailableBySpatialProximity: Boolean,
    kind: String,
    manufacturerDisplayName: String,
    modelDisplayName: String,
    platform: RemoteSystemPlatform,
    status: RemoteSystemStatus
  ): RemoteSystem = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], getCapabilitySupportedAsync = js.Any.fromFunction1(getCapabilitySupportedAsync), id = id.asInstanceOf[js.Any], isAvailableByProximity = isAvailableByProximity.asInstanceOf[js.Any], isAvailableBySpatialProximity = isAvailableBySpatialProximity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], manufacturerDisplayName = manufacturerDisplayName.asInstanceOf[js.Any], modelDisplayName = modelDisplayName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteSystem]
  }
  @scala.inline
  implicit class RemoteSystemOps[Self <: RemoteSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApps(value: IVectorView[RemoteSystemApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCapabilitySupportedAsync(value: String => IPromiseWithIAsyncOperation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCapabilitySupportedAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAvailableByProximity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAvailableByProximity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAvailableBySpatialProximity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAvailableBySpatialProximity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturerDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: RemoteSystemPlatform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: RemoteSystemStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


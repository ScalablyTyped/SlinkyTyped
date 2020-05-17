package typingsSlinky.winrtUwp.Windows.Media.Casting

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a physical device that is capable of supporting casting connections and rendering media content sent to it. */
@js.native
trait CastingDevice extends js.Object {
  /** A human-readable name for the device, retrieved from the device itself. */
  var friendlyName: String = js.native
  /** An icon representing the device. */
  var icon: IRandomAccessStreamWithContentType = js.native
  /** The device ID. This is the same ID used with Windows.Devices.Enumeration APIs. */
  var id: String = js.native
  /**
    * Creates a new CastingConnection object. This method does not establish a connection to the casting device.
    * @return The object that represents the casting connection.
    */
  def createCastingConnection(): CastingConnection = js.native
  /**
    * Gets the media types supported by the device. containing
    * @return The media types, CastingPlaybackTypes , supported by the device.
    */
  def getSupportedCastingPlaybackTypesAsync(): IPromiseWithIAsyncOperation[CastingPlaybackTypes] = js.native
}

object CastingDevice {
  @scala.inline
  def apply(
    createCastingConnection: () => CastingConnection,
    friendlyName: String,
    getSupportedCastingPlaybackTypesAsync: () => IPromiseWithIAsyncOperation[CastingPlaybackTypes],
    icon: IRandomAccessStreamWithContentType,
    id: String
  ): CastingDevice = {
    val __obj = js.Dynamic.literal(createCastingConnection = js.Any.fromFunction0(createCastingConnection), friendlyName = friendlyName.asInstanceOf[js.Any], getSupportedCastingPlaybackTypesAsync = js.Any.fromFunction0(getSupportedCastingPlaybackTypesAsync), icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastingDevice]
  }
  @scala.inline
  implicit class CastingDeviceOps[Self <: CastingDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateCastingConnection(value: () => CastingConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCastingConnection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSupportedCastingPlaybackTypesAsync(value: () => IPromiseWithIAsyncOperation[CastingPlaybackTypes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSupportedCastingPlaybackTypesAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIcon(value: IRandomAccessStreamWithContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


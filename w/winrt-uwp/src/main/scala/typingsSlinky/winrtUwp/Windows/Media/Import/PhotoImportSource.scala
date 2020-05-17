package typingsSlinky.winrtUwp.Windows.Media.Import

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the source device for a photo import session. */
@js.native
trait PhotoImportSource extends js.Object {
  /** The battery level of the source device. */
  var batteryLevelPercent: Double = js.native
  /** Gets the connection protocol that is being used to communicate with the source device. */
  var connectionProtocol: String = js.native
  /** Gets a value indicating the transport mechanism that is being used for importing items from the source device. */
  var connectionTransport: PhotoImportConnectionTransport = js.native
  /** Gets the current date and time on the device. */
  var dateTime: js.Date = js.native
  /** Gets a human-readable description of the source device. */
  var description: String = js.native
  /** Gets the human-readable display name for the source device. */
  var displayName: String = js.native
  /** Gets a unique 16-byte identifier that is common across multiple transports supported by the device. */
  var id: String = js.native
  /** Gets a value indicating if the source device is locked. */
  var isLocked: Boolean = js.native
  /** Gets a value indicating if the source device is a mass storage device. */
  var isMassStorage: Boolean = js.native
  /** Gets the source device's human-readable manufacturer name. */
  var manufacturer: String = js.native
  /** Gets the device model name. */
  var model: String = js.native
  /** Gets a value indicating the type of power source being used by the source device, if it is known. */
  var powerSource: PhotoImportPowerSource = js.native
  /** Gets the serial number of the device. */
  var serialNumber: String = js.native
  /** Gets a list of objects representing the different storage media exposed by the source device. */
  var storageMedia: IVectorView[PhotoImportStorageMedium] = js.native
  /** Gets a reference to a stream containing the thumbnail image for the source device. */
  var thumbnail: IRandomAccessStreamReference = js.native
  /** Gets a value indicating the type of the source device. */
  var `type`: PhotoImportSourceType = js.native
  /**
    * Creates a new photo import session.
    * @return The new PhotoImportSession object.
    */
  def createImportSession(): PhotoImportSession = js.native
}

object PhotoImportSource {
  @scala.inline
  def apply(
    batteryLevelPercent: Double,
    connectionProtocol: String,
    connectionTransport: PhotoImportConnectionTransport,
    createImportSession: () => PhotoImportSession,
    dateTime: js.Date,
    description: String,
    displayName: String,
    id: String,
    isLocked: Boolean,
    isMassStorage: Boolean,
    manufacturer: String,
    model: String,
    powerSource: PhotoImportPowerSource,
    serialNumber: String,
    storageMedia: IVectorView[PhotoImportStorageMedium],
    thumbnail: IRandomAccessStreamReference,
    `type`: PhotoImportSourceType
  ): PhotoImportSource = {
    val __obj = js.Dynamic.literal(batteryLevelPercent = batteryLevelPercent.asInstanceOf[js.Any], connectionProtocol = connectionProtocol.asInstanceOf[js.Any], connectionTransport = connectionTransport.asInstanceOf[js.Any], createImportSession = js.Any.fromFunction0(createImportSession), dateTime = dateTime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isMassStorage = isMassStorage.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], powerSource = powerSource.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], storageMedia = storageMedia.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportSource]
  }
  @scala.inline
  implicit class PhotoImportSourceOps[Self <: PhotoImportSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatteryLevelPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batteryLevelPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionTransport(value: PhotoImportConnectionTransport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTransport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateImportSession(value: () => PhotoImportSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createImportSession")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMassStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMassStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerSource(value: PhotoImportPowerSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageMedia(value: IVectorView[PhotoImportStorageMedium]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageMedia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PhotoImportSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


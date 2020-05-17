package typingsSlinky.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper object that provides indexing names for Windows photo file properties. */
@js.native
trait SystemPhotoProperties extends js.Object {
  /** Gets the name of the System.Photo.CameraManufacturer property (one of the Windows photo file properties). */
  var cameraManufacturer: String = js.native
  /** Gets the name of the System.Photo.CameraModel property (one of the Windows photo file properties). */
  var cameraModel: String = js.native
  /** Gets the name of the System.Photo.DateTaken property (one of the Windows photo file properties). */
  var dateTaken: String = js.native
  /** Gets the name of the System.Photo.Orientation property (one of the Windows photo file properties). */
  var orientation: String = js.native
  /** Gets the name of the System.Photo.PeopleNames property (one of the Windows photo file properties). */
  var peopleNames: String = js.native
}

object SystemPhotoProperties {
  @scala.inline
  def apply(
    cameraManufacturer: String,
    cameraModel: String,
    dateTaken: String,
    orientation: String,
    peopleNames: String
  ): SystemPhotoProperties = {
    val __obj = js.Dynamic.literal(cameraManufacturer = cameraManufacturer.asInstanceOf[js.Any], cameraModel = cameraModel.asInstanceOf[js.Any], dateTaken = dateTaken.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], peopleNames = peopleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemPhotoProperties]
  }
  @scala.inline
  implicit class SystemPhotoPropertiesOps[Self <: SystemPhotoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCameraManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraManufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCameraModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateTaken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTaken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeopleNames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peopleNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


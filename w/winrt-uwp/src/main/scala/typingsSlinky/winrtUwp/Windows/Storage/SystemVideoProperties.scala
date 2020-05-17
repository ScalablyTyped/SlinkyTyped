package typingsSlinky.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper object that provides indexing names for video file properties. */
@js.native
trait SystemVideoProperties extends js.Object {
  /** Gets the name of the System.Video.Director property (one of the Windows video file properties). */
  var director: String = js.native
  /** Gets the name of the System.Video.FrameHeight property (one of the Windows video file properties). */
  var frameHeight: String = js.native
  /** Gets the name of the System.Video.FrameWidth property (one of the Windows video file properties). */
  var frameWidth: String = js.native
  /** Gets the name of the System.Video.Orientation property (one of the Windows video file properties). */
  var orientation: String = js.native
  /** Gets the name of the System.Video.TotalBitrate property (one of the Windows video file properties). */
  var totalBitrate: String = js.native
}

object SystemVideoProperties {
  @scala.inline
  def apply(
    director: String,
    frameHeight: String,
    frameWidth: String,
    orientation: String,
    totalBitrate: String
  ): SystemVideoProperties = {
    val __obj = js.Dynamic.literal(director = director.asInstanceOf[js.Any], frameHeight = frameHeight.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], totalBitrate = totalBitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemVideoProperties]
  }
  @scala.inline
  implicit class SystemVideoPropertiesOps[Self <: SystemVideoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("director")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalBitrate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBitrate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


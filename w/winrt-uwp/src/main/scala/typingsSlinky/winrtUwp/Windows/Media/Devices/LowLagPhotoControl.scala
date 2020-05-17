package typingsSlinky.winrtUwp.Windows.Media.Devices

import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaRatio
import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaThumbnailFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for managing the low shutter lag photo capture mode on the capture device. */
@js.native
trait LowLagPhotoControl extends js.Object {
  /** Gets or sets the desired size for thumbnails, which is the largest length of the image, either width or height. */
  var desiredThumbnailSize: Double = js.native
  /** Gets a value that specifies if hardware acceleration is supported for thumbnails. */
  var hardwareAcceleratedThumbnailSupported: Double = js.native
  /** Gets a value that enables and disables thumbnail support. */
  var thumbnailEnabled: Boolean = js.native
  /** Gets or sets the media format for the thumbnails. */
  var thumbnailFormat: MediaThumbnailFormat = js.native
  /**
    * Gets the current frame rate at which pictures can be taken.
    * @return The current frame rate.
    */
  def getCurrentFrameRate(): MediaRatio = js.native
  /**
    * Gets the highest frame rate supported when video and photos are being captured concurrently.
    * @param captureProperties The media encoding properties.
    * @return The highest concurrent frames per second.
    */
  def getHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties): MediaRatio = js.native
}

object LowLagPhotoControl {
  @scala.inline
  def apply(
    desiredThumbnailSize: Double,
    getCurrentFrameRate: () => MediaRatio,
    getHighestConcurrentFrameRate: IMediaEncodingProperties => MediaRatio,
    hardwareAcceleratedThumbnailSupported: Double,
    thumbnailEnabled: Boolean,
    thumbnailFormat: MediaThumbnailFormat
  ): LowLagPhotoControl = {
    val __obj = js.Dynamic.literal(desiredThumbnailSize = desiredThumbnailSize.asInstanceOf[js.Any], getCurrentFrameRate = js.Any.fromFunction0(getCurrentFrameRate), getHighestConcurrentFrameRate = js.Any.fromFunction1(getHighestConcurrentFrameRate), hardwareAcceleratedThumbnailSupported = hardwareAcceleratedThumbnailSupported.asInstanceOf[js.Any], thumbnailEnabled = thumbnailEnabled.asInstanceOf[js.Any], thumbnailFormat = thumbnailFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowLagPhotoControl]
  }
  @scala.inline
  implicit class LowLagPhotoControlOps[Self <: LowLagPhotoControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredThumbnailSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredThumbnailSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCurrentFrameRate(value: () => MediaRatio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentFrameRate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHighestConcurrentFrameRate(value: IMediaEncodingProperties => MediaRatio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHighestConcurrentFrameRate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHardwareAcceleratedThumbnailSupported(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareAcceleratedThumbnailSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnailEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnailFormat(value: MediaThumbnailFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailFormat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


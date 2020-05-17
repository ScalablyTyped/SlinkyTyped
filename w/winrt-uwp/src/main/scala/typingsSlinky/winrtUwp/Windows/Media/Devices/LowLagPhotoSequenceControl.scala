package typingsSlinky.winrtUwp.Windows.Media.Devices

import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaRatio
import typingsSlinky.winrtUwp.Windows.Media.MediaProperties.MediaThumbnailFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for managing the low shutter lag photo sequence mode on the capture device. */
@js.native
trait LowLagPhotoSequenceControl extends js.Object {
  /** Gets or sets the desired size for thumbnails, which is the largest length of the image, either width or height. */
  var desiredThumbnailSize: Double = js.native
  /** Gets a value that specifies if hardware acceleration is supported for thumbnails in photo sequence mode. */
  var hardwareAcceleratedThumbnailSupported: Double = js.native
  /** Gets the maximum number of past photos that can be stored. */
  var maxPastPhotos: Double = js.native
  /** Gets the maximum number of photos that can be taken per second. */
  var maxPhotosPerSecond: Double = js.native
  /** Gets or sets a value that specifies the number of past photos to store. */
  var pastPhotoLimit: Double = js.native
  /** Gets or sets the number of photos that are taken per second. */
  var photosPerSecondLimit: Double = js.native
  /** Gets a value that specifies if the capture device supports low shutter lag photo sequence mode. */
  var supported: Boolean = js.native
  /** Gets a value that enables and disables thumbnail support in photo sequence mode. */
  var thumbnailEnabled: Boolean = js.native
  /** Gets or sets the media format for the thumbnails. */
  var thumbnailFormat: MediaThumbnailFormat = js.native
  /**
    * Gets the current frame rate at which pictures can be taken.
    * @return The current frame rate.
    */
  def getCurrentFrameRate(): MediaRatio = js.native
  /**
    * Gets the highest frame rate supported when video and photos sequences are being captured concurrently.
    * @param captureProperties The media encoding properties.
    * @return The highest concurrent frames per second.
    */
  def getHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties): MediaRatio = js.native
}

object LowLagPhotoSequenceControl {
  @scala.inline
  def apply(
    desiredThumbnailSize: Double,
    getCurrentFrameRate: () => MediaRatio,
    getHighestConcurrentFrameRate: IMediaEncodingProperties => MediaRatio,
    hardwareAcceleratedThumbnailSupported: Double,
    maxPastPhotos: Double,
    maxPhotosPerSecond: Double,
    pastPhotoLimit: Double,
    photosPerSecondLimit: Double,
    supported: Boolean,
    thumbnailEnabled: Boolean,
    thumbnailFormat: MediaThumbnailFormat
  ): LowLagPhotoSequenceControl = {
    val __obj = js.Dynamic.literal(desiredThumbnailSize = desiredThumbnailSize.asInstanceOf[js.Any], getCurrentFrameRate = js.Any.fromFunction0(getCurrentFrameRate), getHighestConcurrentFrameRate = js.Any.fromFunction1(getHighestConcurrentFrameRate), hardwareAcceleratedThumbnailSupported = hardwareAcceleratedThumbnailSupported.asInstanceOf[js.Any], maxPastPhotos = maxPastPhotos.asInstanceOf[js.Any], maxPhotosPerSecond = maxPhotosPerSecond.asInstanceOf[js.Any], pastPhotoLimit = pastPhotoLimit.asInstanceOf[js.Any], photosPerSecondLimit = photosPerSecondLimit.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], thumbnailEnabled = thumbnailEnabled.asInstanceOf[js.Any], thumbnailFormat = thumbnailFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowLagPhotoSequenceControl]
  }
  @scala.inline
  implicit class LowLagPhotoSequenceControlOps[Self <: LowLagPhotoSequenceControl] (val x: Self) extends AnyVal {
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
    def withMaxPastPhotos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPastPhotos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxPhotosPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPhotosPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPastPhotoLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pastPhotoLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotosPerSecondLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photosPerSecondLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported")(value.asInstanceOf[js.Any])
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


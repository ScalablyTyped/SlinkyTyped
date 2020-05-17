package typingsSlinky.winrtUwp.Windows.Media

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.StorageFile
import typingsSlinky.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality to update the music information that is displayed on the SystemMediaTransportControls . */
@js.native
trait SystemMediaTransportControlsDisplayUpdater extends js.Object {
  /** Gets or sets the media id of the app. */
  var appMediaId: String = js.native
  /** Gets the image properties associated with the currently playing media. */
  var imageProperties: ImageDisplayProperties = js.native
  /** Gets the music properties associated with the currently playing media. */
  var musicProperties: MusicDisplayProperties = js.native
  /** Gets or sets thumbnail image associated with the currently playing media. */
  var thumbnail: RandomAccessStreamReference = js.native
  /** Gets or sets the type of media. */
  var `type`: MediaPlaybackType = js.native
  /** Gets the video properties associated with the currently playing media. */
  var videoProperties: VideoDisplayProperties = js.native
  /** Clears out all of the media metadata. */
  def clearAll(): Unit = js.native
  /**
    * Initialize the media properties using the specified file.
    * @param type The type of media.
    * @param source The file to initialize the media properties.
    * @return When this method completes, it returns a boolean value that indicates true if the operation succeeded; otherwise, false.
    */
  def copyFromFileAsync(`type`: MediaPlaybackType, source: StorageFile): IPromiseWithIAsyncOperation[Boolean] = js.native
  /** Updates the metadata for the currently playing media. */
  def update(): Unit = js.native
}

object SystemMediaTransportControlsDisplayUpdater {
  @scala.inline
  def apply(
    appMediaId: String,
    clearAll: () => Unit,
    copyFromFileAsync: (MediaPlaybackType, StorageFile) => IPromiseWithIAsyncOperation[Boolean],
    imageProperties: ImageDisplayProperties,
    musicProperties: MusicDisplayProperties,
    thumbnail: RandomAccessStreamReference,
    `type`: MediaPlaybackType,
    update: () => Unit,
    videoProperties: VideoDisplayProperties
  ): SystemMediaTransportControlsDisplayUpdater = {
    val __obj = js.Dynamic.literal(appMediaId = appMediaId.asInstanceOf[js.Any], clearAll = js.Any.fromFunction0(clearAll), copyFromFileAsync = js.Any.fromFunction2(copyFromFileAsync), imageProperties = imageProperties.asInstanceOf[js.Any], musicProperties = musicProperties.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), videoProperties = videoProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaTransportControlsDisplayUpdater]
  }
  @scala.inline
  implicit class SystemMediaTransportControlsDisplayUpdaterOps[Self <: SystemMediaTransportControlsDisplayUpdater] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppMediaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appMediaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCopyFromFileAsync(value: (MediaPlaybackType, StorageFile) => IPromiseWithIAsyncOperation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyFromFileAsync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withImageProperties(value: ImageDisplayProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMusicProperties(value: MusicDisplayProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("musicProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: RandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MediaPlaybackType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVideoProperties(value: VideoDisplayProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


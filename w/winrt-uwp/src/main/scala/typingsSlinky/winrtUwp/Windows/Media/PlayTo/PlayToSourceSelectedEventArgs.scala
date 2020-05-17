package typingsSlinky.winrtUwp.Windows.Media.PlayTo

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the SourceSelected event. */
@js.native
trait PlayToSourceSelectedEventArgs extends js.Object {
  /** Gets the display name of the selected Play To source. */
  var friendlyName: String = js.native
  /** Gets the display icon for the selected Play To source. */
  var icon: IRandomAccessStreamWithContentType = js.native
  /** Gets a value that indicates whether the selected Play To source supports audio. */
  var supportsAudio: Boolean = js.native
  /** Gets a value that indicates whether the selected Play To source supports displaying images. */
  var supportsImage: Boolean = js.native
  /** Gets a value that indicates whether the selected Play To source supports video. */
  var supportsVideo: Boolean = js.native
}

object PlayToSourceSelectedEventArgs {
  @scala.inline
  def apply(
    friendlyName: String,
    icon: IRandomAccessStreamWithContentType,
    supportsAudio: Boolean,
    supportsImage: Boolean,
    supportsVideo: Boolean
  ): PlayToSourceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], supportsAudio = supportsAudio.asInstanceOf[js.Any], supportsImage = supportsImage.asInstanceOf[js.Any], supportsVideo = supportsVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToSourceSelectedEventArgs]
  }
  @scala.inline
  implicit class PlayToSourceSelectedEventArgsOps[Self <: PlayToSourceSelectedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: IRandomAccessStreamWithContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsImage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportsVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsVideo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


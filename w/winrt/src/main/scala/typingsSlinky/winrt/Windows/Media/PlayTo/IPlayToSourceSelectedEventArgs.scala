package typingsSlinky.winrt.Windows.Media.PlayTo

import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlayToSourceSelectedEventArgs extends js.Object {
  var friendlyName: String = js.native
  var icon: IRandomAccessStreamWithContentType = js.native
  var supportsAudio: Boolean = js.native
  var supportsImage: Boolean = js.native
  var supportsVideo: Boolean = js.native
}

object IPlayToSourceSelectedEventArgs {
  @scala.inline
  def apply(
    friendlyName: String,
    icon: IRandomAccessStreamWithContentType,
    supportsAudio: Boolean,
    supportsImage: Boolean,
    supportsVideo: Boolean
  ): IPlayToSourceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], supportsAudio = supportsAudio.asInstanceOf[js.Any], supportsImage = supportsImage.asInstanceOf[js.Any], supportsVideo = supportsVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToSourceSelectedEventArgs]
  }
  @scala.inline
  implicit class IPlayToSourceSelectedEventArgsOps[Self <: IPlayToSourceSelectedEventArgs] (val x: Self) extends AnyVal {
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


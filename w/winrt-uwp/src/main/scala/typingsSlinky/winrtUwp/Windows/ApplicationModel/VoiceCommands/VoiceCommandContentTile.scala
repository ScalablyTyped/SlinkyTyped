package typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands

import typingsSlinky.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An asset, containing image, text, and link data, provided by the background app service for display on the Cortana canvas. */
@js.native
trait VoiceCommandContentTile extends js.Object {
  /** Gets or sets supplementary information the background app service can associate with the content tile. This information is not used by Cortana. */
  var appContext: js.Any = js.native
  /** Gets or sets a string as a launch parameter that can be associated with the response by the background app service. */
  var appLaunchArgument: String = js.native
  /** Gets or sets the layout template used to display the content tile on the Cortana canvas. */
  var contentTileType: VoiceCommandContentTileType = js.native
  /** Gets or sets an image the background app service can associate with the content tile. */
  var image: IStorageFile = js.native
  /** Gets or sets the first line of text the background app service can associate with the content tile. */
  var textLine1: String = js.native
  /** Gets or sets the second line of text the background app service can associate with the content tile. */
  var textLine2: String = js.native
  /** Gets or sets the third line of text the background app service can associate with the content tile. */
  var textLine3: String = js.native
  /** Gets or sets the title the background app service can associate with the content tile. */
  var title: String = js.native
}

object VoiceCommandContentTile {
  @scala.inline
  def apply(
    appContext: js.Any,
    appLaunchArgument: String,
    contentTileType: VoiceCommandContentTileType,
    image: IStorageFile,
    textLine1: String,
    textLine2: String,
    textLine3: String,
    title: String
  ): VoiceCommandContentTile = {
    val __obj = js.Dynamic.literal(appContext = appContext.asInstanceOf[js.Any], appLaunchArgument = appLaunchArgument.asInstanceOf[js.Any], contentTileType = contentTileType.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], textLine1 = textLine1.asInstanceOf[js.Any], textLine2 = textLine2.asInstanceOf[js.Any], textLine3 = textLine3.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandContentTile]
  }
  @scala.inline
  implicit class VoiceCommandContentTileOps[Self <: VoiceCommandContentTile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppLaunchArgument(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appLaunchArgument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentTileType(value: VoiceCommandContentTileType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: IStorageFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextLine1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLine1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextLine2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLine2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextLine3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLine3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.winrtUwp.Windows.ApplicationModel.DataTransfer.ShareTarget

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents shortcuts that help users share content with the apps they use most. */
@js.native
trait QuickLink extends js.Object {
  /** Specifies an ID for the QuickLink. Your app receives this ID when the user selects its QuickLink. You can use this ID to further customize the sharing process for the user. */
  var id: String = js.native
  /** An array of strings that specify the data formats supported by the QuickLink app. The system shows the QuickLink only when the data that a user wants to share matches a format in this array. */
  var supportedDataFormats: IVector[String] = js.native
  /** An array of strings that specify the file types supported by a QuickLink app. The system shows the QuickLink only when the data that a user wants to share contains file items, and the file extensions for those file items match a file type in this array. */
  var supportedFileTypes: IVector[String] = js.native
  /** Specifies a thumbnail image for the QuickLink. The system displays this image when the user is presented with a list of possible apps to share content with. */
  var thumbnail: RandomAccessStreamReference = js.native
  /** Specifies the title of a QuickLink. The system displays this info when the user is presented with a list of possible apps to share content with. */
  var title: String = js.native
}

object QuickLink {
  @scala.inline
  def apply(
    id: String,
    supportedDataFormats: IVector[String],
    supportedFileTypes: IVector[String],
    thumbnail: RandomAccessStreamReference,
    title: String
  ): QuickLink = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], supportedDataFormats = supportedDataFormats.asInstanceOf[js.Any], supportedFileTypes = supportedFileTypes.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickLink]
  }
  @scala.inline
  implicit class QuickLinkOps[Self <: QuickLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedDataFormats(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedDataFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedFileTypes(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedFileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: RandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
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


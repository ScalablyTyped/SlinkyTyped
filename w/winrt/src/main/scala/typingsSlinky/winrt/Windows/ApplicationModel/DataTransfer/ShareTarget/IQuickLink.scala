package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQuickLink extends js.Object {
  var id: String = js.native
  var supportedDataFormats: IVector[String] = js.native
  var supportedFileTypes: IVector[String] = js.native
  var thumbnail: RandomAccessStreamReference = js.native
  var title: String = js.native
}

object IQuickLink {
  @scala.inline
  def apply(
    id: String,
    supportedDataFormats: IVector[String],
    supportedFileTypes: IVector[String],
    thumbnail: RandomAccessStreamReference,
    title: String
  ): IQuickLink = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], supportedDataFormats = supportedDataFormats.asInstanceOf[js.Any], supportedFileTypes = supportedFileTypes.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuickLink]
  }
  @scala.inline
  implicit class IQuickLinkOps[Self <: IQuickLink] (val x: Self) extends AnyVal {
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


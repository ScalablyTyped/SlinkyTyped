package typingsSlinky.winrt.Windows.Graphics.Imaging

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBitmapCodecInformation extends js.Object {
  var codecId: String = js.native
  var fileExtensions: IVectorView[String] = js.native
  var friendlyName: String = js.native
  var mimeTypes: IVectorView[String] = js.native
}

object IBitmapCodecInformation {
  @scala.inline
  def apply(
    codecId: String,
    fileExtensions: IVectorView[String],
    friendlyName: String,
    mimeTypes: IVectorView[String]
  ): IBitmapCodecInformation = {
    val __obj = js.Dynamic.literal(codecId = codecId.asInstanceOf[js.Any], fileExtensions = fileExtensions.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], mimeTypes = mimeTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapCodecInformation]
  }
  @scala.inline
  implicit class IBitmapCodecInformationOps[Self <: IBitmapCodecInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodecId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codecId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileExtensions(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeTypes(value: IVectorView[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


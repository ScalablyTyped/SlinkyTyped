package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStandardDataFormatsStatics extends js.Object {
  var bitmap: String = js.native
  var html: String = js.native
  var rtf: String = js.native
  var storageItems: String = js.native
  var text: String = js.native
  var uri: String = js.native
}

object IStandardDataFormatsStatics {
  @scala.inline
  def apply(bitmap: String, html: String, rtf: String, storageItems: String, text: String, uri: String): IStandardDataFormatsStatics = {
    val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], rtf = rtf.asInstanceOf[js.Any], storageItems = storageItems.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStandardDataFormatsStatics]
  }
  @scala.inline
  implicit class IStandardDataFormatsStaticsOps[Self <: IStandardDataFormatsStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitmap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRtf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageItems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


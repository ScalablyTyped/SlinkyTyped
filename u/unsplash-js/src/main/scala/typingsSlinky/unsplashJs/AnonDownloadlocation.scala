package typingsSlinky.unsplashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDownloadlocation extends js.Object {
  var download_location: String = js.native
}

object AnonDownloadlocation {
  @scala.inline
  def apply(download_location: String): AnonDownloadlocation = {
    val __obj = js.Dynamic.literal(download_location = download_location.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDownloadlocation]
  }
  @scala.inline
  implicit class AnonDownloadlocationOps[Self <: AnonDownloadlocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownload_location(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download_location")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


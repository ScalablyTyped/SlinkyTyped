package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to the [scanMediaFiles](Titanium.Media.Android.scanMediaFiles) callback.
  */
@js.native
trait MediaScannerResponse extends js.Object {
  /**
  	 * Path to the media file that was scanned.
  	 */
  var path: js.UndefOr[java.lang.String] = js.native
  /**
  	 * URI to the file if it was scanned and added to the media library, or `null`
  	 * if the file was not added.
  	 */
  var uri: js.UndefOr[java.lang.String] = js.native
}

object MediaScannerResponse {
  @scala.inline
  def apply(): MediaScannerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaScannerResponse]
  }
  @scala.inline
  implicit class MediaScannerResponseOps[Self <: MediaScannerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}


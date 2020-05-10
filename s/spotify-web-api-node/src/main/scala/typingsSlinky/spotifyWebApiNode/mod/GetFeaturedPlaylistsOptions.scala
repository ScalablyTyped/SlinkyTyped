package typingsSlinky.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFeaturedPlaylistsOptions
  extends PaginationOptions
     with LocaleOptions {
  var timestamp: js.UndefOr[String] = js.native
}

object GetFeaturedPlaylistsOptions {
  @scala.inline
  def apply(): GetFeaturedPlaylistsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFeaturedPlaylistsOptions]
  }
  @scala.inline
  implicit class GetFeaturedPlaylistsOptionsOps[Self <: GetFeaturedPlaylistsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}


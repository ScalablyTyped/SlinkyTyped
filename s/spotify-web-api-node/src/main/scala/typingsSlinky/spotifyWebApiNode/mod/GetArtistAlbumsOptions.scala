package typingsSlinky.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetArtistAlbumsOptions
  extends PaginationOptions
     with CountryOptions {
  var include_groups: js.UndefOr[String] = js.native
}

object GetArtistAlbumsOptions {
  @scala.inline
  def apply(): GetArtistAlbumsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetArtistAlbumsOptions]
  }
  @scala.inline
  implicit class GetArtistAlbumsOptionsOps[Self <: GetArtistAlbumsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInclude_groups(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_groups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_groups")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.spotifyWebApiNode.mod

import typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.long_term
import typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.medium_term
import typingsSlinky.spotifyWebApiNode.spotifyWebApiNodeStrings.short_term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTopOptions extends PaginationOptions {
  var time_range: js.UndefOr[long_term | medium_term | short_term] = js.native
}

object GetTopOptions {
  @scala.inline
  def apply(): GetTopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTopOptions]
  }
  @scala.inline
  implicit class GetTopOptionsOps[Self <: GetTopOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTime_range(value: long_term | medium_term | short_term): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime_range: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_range")(js.undefined)
        ret
    }
  }
  
}


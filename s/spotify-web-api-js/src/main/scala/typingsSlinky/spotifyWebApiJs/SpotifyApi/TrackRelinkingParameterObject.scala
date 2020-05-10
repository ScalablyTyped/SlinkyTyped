package typingsSlinky.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackRelinkingParameterObject extends js.Object {
  var market: js.UndefOr[String] = js.native
}

object TrackRelinkingParameterObject {
  @scala.inline
  def apply(): TrackRelinkingParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackRelinkingParameterObject]
  }
  @scala.inline
  implicit class TrackRelinkingParameterObjectOps[Self <: TrackRelinkingParameterObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("market")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("market")(js.undefined)
        ret
    }
  }
  
}


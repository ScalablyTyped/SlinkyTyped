package typingsSlinky.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistDetailsOptions extends PublicOptions {
  var collaborative: js.UndefOr[Boolean] = js.native
  var description: js.UndefOr[String] = js.native
}

object PlaylistDetailsOptions {
  @scala.inline
  def apply(): PlaylistDetailsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistDetailsOptions]
  }
  @scala.inline
  implicit class PlaylistDetailsOptionsOps[Self <: PlaylistDetailsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollaborative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollaborative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborative")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}


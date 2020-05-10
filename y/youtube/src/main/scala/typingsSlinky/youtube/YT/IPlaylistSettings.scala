package typingsSlinky.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlaylistSettings extends VideoOrPlaylistSettings {
  /**
  		 * Start index of the playlist, if not 0.
  		 */
  var index: js.UndefOr[Double] = js.native
  /**
  		 * Identifier for the listType videos list.
  		 */
  var list: String = js.native
  /**
  		 * Which type of content loads in the player.
  		 */
  var listType: js.UndefOr[ListType] = js.native
}

object IPlaylistSettings {
  @scala.inline
  def apply(list: String): IPlaylistSettings = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaylistSettings]
  }
  @scala.inline
  implicit class IPlaylistSettingsOps[Self <: IPlaylistSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withListType(value: ListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(js.undefined)
        ret
    }
  }
  
}


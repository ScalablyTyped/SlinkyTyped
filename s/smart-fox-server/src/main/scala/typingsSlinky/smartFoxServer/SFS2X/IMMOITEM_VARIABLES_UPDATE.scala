package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.MMOItem
import typingsSlinky.smartFoxServer.SFS2X.Entities.MMORoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMMOITEM_VARIABLES_UPDATE extends js.Object {
  var changedVars: js.Array[String] = js.native
  var mmoItem: MMOItem = js.native
  var room: MMORoom = js.native
}

object IMMOITEM_VARIABLES_UPDATE {
  @scala.inline
  def apply(changedVars: js.Array[String], mmoItem: MMOItem, room: MMORoom): IMMOITEM_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(changedVars = changedVars.asInstanceOf[js.Any], mmoItem = mmoItem.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMMOITEM_VARIABLES_UPDATE]
  }
  @scala.inline
  implicit class IMMOITEM_VARIABLES_UPDATEOps[Self <: IMMOITEM_VARIABLES_UPDATE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangedVars(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedVars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMmoItem(value: MMOItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mmoItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoom(value: MMORoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("room")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


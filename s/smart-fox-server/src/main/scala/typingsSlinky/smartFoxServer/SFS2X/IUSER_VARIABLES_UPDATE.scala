package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUSER_VARIABLES_UPDATE extends js.Object {
  var changedVars: js.Array[String] = js.native
  var user: SFSUser = js.native
}

object IUSER_VARIABLES_UPDATE {
  @scala.inline
  def apply(changedVars: js.Array[String], user: SFSUser): IUSER_VARIABLES_UPDATE = {
    val __obj = js.Dynamic.literal(changedVars = changedVars.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUSER_VARIABLES_UPDATE]
  }
  @scala.inline
  implicit class IUSER_VARIABLES_UPDATEOps[Self <: IUSER_VARIABLES_UPDATE] (val x: Self) extends AnyVal {
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
    def withUser(value: SFSUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


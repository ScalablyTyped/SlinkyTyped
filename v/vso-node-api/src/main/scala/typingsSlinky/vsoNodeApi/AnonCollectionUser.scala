package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCollectionUser extends js.Object {
  var collection_User: Double = js.native
  var project_Team: Double = js.native
}

object AnonCollectionUser {
  @scala.inline
  def apply(collection_User: Double, project_Team: Double): AnonCollectionUser = {
    val __obj = js.Dynamic.literal(collection_User = collection_User.asInstanceOf[js.Any], project_Team = project_Team.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollectionUser]
  }
  @scala.inline
  implicit class AnonCollectionUserOps[Self <: AnonCollectionUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection_User(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection_User")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject_Team(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project_Team")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionUser extends js.Object {
  var collection_User: scala.Double = js.native
  var project_Team: scala.Double = js.native
}

object CollectionUser {
  @scala.inline
  def apply(collection_User: scala.Double, project_Team: scala.Double): CollectionUser = {
    val __obj = js.Dynamic.literal(collection_User = collection_User.asInstanceOf[js.Any], project_Team = project_Team.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionUser]
  }
  @scala.inline
  implicit class CollectionUserOps[Self <: CollectionUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection_User(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection_User")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject_Team(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project_Team")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	VoxImplant roster item
	*/
@js.native
trait RosterItem extends js.Object {
  /**
  		*	Groups this roster item belongs to
  		*/
  var groups: js.Array[String] = js.native
  /**
  		*	User id
  		*/
  var id: String = js.native
  /**
  		*	User display name
  		*/
  var name: String = js.native
  /**
  		*	Resources
  		*/
  var resources: js.Array[String] = js.native
  /**
  		*	Subscription type
  		*/
  var subscription_type: Double = js.native
}

object RosterItem {
  @scala.inline
  def apply(
    groups: js.Array[String],
    id: String,
    name: String,
    resources: js.Array[String],
    subscription_type: Double
  ): RosterItem = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], subscription_type = subscription_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterItem]
  }
  @scala.inline
  implicit class RosterItemOps[Self <: RosterItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscription_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscription_type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


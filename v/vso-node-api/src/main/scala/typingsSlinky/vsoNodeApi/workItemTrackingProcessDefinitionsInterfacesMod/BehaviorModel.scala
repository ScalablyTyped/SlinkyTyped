package typingsSlinky.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BehaviorModel extends js.Object {
  /**
    * Is the behavior abstract (i.e. can not be associated with any work item type)
    */
  var `abstract`: Boolean = js.native
  /**
    * Color
    */
  var color: String = js.native
  /**
    * Description
    */
  var description: String = js.native
  /**
    * Behavior Id
    */
  var id: String = js.native
  /**
    * Parent behavior reference
    */
  var inherits: WorkItemBehaviorReference = js.native
  /**
    * Behavior Name
    */
  var name: String = js.native
  /**
    * Is the behavior overrides a behavior from system process
    */
  var overridden: Boolean = js.native
  /**
    * Rank
    */
  var rank: Double = js.native
  /**
    * Url of the behavior
    */
  var url: String = js.native
}

object BehaviorModel {
  @scala.inline
  def apply(
    `abstract`: Boolean,
    color: String,
    description: String,
    id: String,
    inherits: WorkItemBehaviorReference,
    name: String,
    overridden: Boolean,
    rank: Double,
    url: String
  ): BehaviorModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inherits = inherits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overridden = overridden.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BehaviorModel]
  }
  @scala.inline
  implicit class BehaviorModelOps[Self <: BehaviorModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbstract(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInherits(value: WorkItemBehaviorReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverridden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


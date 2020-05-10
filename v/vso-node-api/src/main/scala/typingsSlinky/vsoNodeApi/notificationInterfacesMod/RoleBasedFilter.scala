package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleBasedFilter extends ExpressionFilter {
  var exclusions: js.Array[String] = js.native
  var inclusions: js.Array[String] = js.native
}

object RoleBasedFilter {
  @scala.inline
  def apply(
    criteria: ExpressionFilterModel,
    eventType: String,
    exclusions: js.Array[String],
    inclusions: js.Array[String],
    `type`: String
  ): RoleBasedFilter = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], exclusions = exclusions.asInstanceOf[js.Any], inclusions = inclusions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleBasedFilter]
  }
  @scala.inline
  implicit class RoleBasedFilterOps[Self <: RoleBasedFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclusions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


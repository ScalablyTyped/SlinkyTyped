package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryViewData extends PlanViewData {
  /**
    * Work item child id to parenet id map
    */
  var childIdToParentIdMap: NumberDictionary[Double] = js.native
  /**
    * Filter criteria status of the timeline
    */
  var criteriaStatus: TimelineCriteriaStatus = js.native
  /**
    * The end date of the delivery view data
    */
  var endDate: js.Date = js.native
  /**
    * The start date for the delivery view data
    */
  var startDate: js.Date = js.native
  /**
    * All the team data
    */
  var teams: js.Array[TimelineTeamData] = js.native
}

object DeliveryViewData {
  @scala.inline
  def apply(
    childIdToParentIdMap: NumberDictionary[Double],
    criteriaStatus: TimelineCriteriaStatus,
    endDate: js.Date,
    id: String,
    revision: Double,
    startDate: js.Date,
    teams: js.Array[TimelineTeamData]
  ): DeliveryViewData = {
    val __obj = js.Dynamic.literal(childIdToParentIdMap = childIdToParentIdMap.asInstanceOf[js.Any], criteriaStatus = criteriaStatus.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryViewData]
  }
  @scala.inline
  implicit class DeliveryViewDataOps[Self <: DeliveryViewData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildIdToParentIdMap(value: NumberDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childIdToParentIdMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCriteriaStatus(value: TimelineCriteriaStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteriaStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeams(value: js.Array[TimelineTeamData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


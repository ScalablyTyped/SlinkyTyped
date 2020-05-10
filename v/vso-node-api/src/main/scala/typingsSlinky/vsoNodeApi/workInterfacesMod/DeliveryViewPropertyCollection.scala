package typingsSlinky.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryViewPropertyCollection extends PlanPropertyCollection {
  /**
    * Card settings
    */
  var cardSettings: CardSettings = js.native
  /**
    * Field criteria
    */
  var criteria: js.Array[FilterClause] = js.native
  /**
    * Markers. Will be missing/null if there are no markers.
    */
  var markers: js.Array[Marker] = js.native
  /**
    * Team backlog mappings
    */
  var teamBacklogMappings: js.Array[TeamBacklogMapping] = js.native
}

object DeliveryViewPropertyCollection {
  @scala.inline
  def apply(
    cardSettings: CardSettings,
    criteria: js.Array[FilterClause],
    markers: js.Array[Marker],
    teamBacklogMappings: js.Array[TeamBacklogMapping]
  ): DeliveryViewPropertyCollection = {
    val __obj = js.Dynamic.literal(cardSettings = cardSettings.asInstanceOf[js.Any], criteria = criteria.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], teamBacklogMappings = teamBacklogMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryViewPropertyCollection]
  }
  @scala.inline
  implicit class DeliveryViewPropertyCollectionOps[Self <: DeliveryViewPropertyCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardSettings(value: CardSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCriteria(value: js.Array[FilterClause]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkers(value: js.Array[Marker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeamBacklogMappings(value: js.Array[TeamBacklogMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamBacklogMappings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


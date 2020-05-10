package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing additional pathfinding flags.
  */
@js.native
trait PathFinderOpts extends js.Object {
  /**
    * Instead of searching for a path to the goals this will search for a path away from the goals.
    * The cheapest path that is out of range of every goal will be returned. The default is false.
    */
  var flee: js.UndefOr[Boolean] = js.native
  /**
    * Weight to apply to the heuristic in the A* formula F = G + weight * H. Use this option only if you understand
    * the underlying A* algorithm mechanics! The default value is 1.
    */
  var heuristicWeight: js.UndefOr[Double] = js.native
  /**
    * The maximum allowed cost of the path returned. If at any point the pathfinder detects that it is impossible to find
    * a path with a cost less than or equal to maxCost it will immediately halt the search. The default is Infinity.
    */
  var maxCost: js.UndefOr[Double] = js.native
  /**
    * The maximum allowed pathfinding operations. You can limit CPU time used for the search based on ratio 1 op ~ 0.001 CPU. The default value is 2000.
    */
  var maxOps: js.UndefOr[Double] = js.native
  /**
    * The maximum allowed rooms to search. The default (and maximum) is 16.
    */
  var maxRooms: js.UndefOr[Double] = js.native
  /**
    * Cost for walking on plain positions. The default is 1.
    */
  var plainCost: js.UndefOr[Double] = js.native
  /**
    * Request from the pathfinder to generate a CostMatrix for a certain room. The callback accepts one argument, roomName.
    * This callback will only be called once per room per search. If you are running multiple pathfinding operations in a
    * single room and in a single tick you may consider caching your CostMatrix to speed up your code. Please read the
    * CostMatrix documentation below for more information on CostMatrix.
    *
    * @param roomName The name of the room the pathfinder needs a cost matrix for.
    */
  var roomCallback: js.UndefOr[js.Function1[/* roomName */ String, Boolean | CostMatrix]] = js.native
  /**
    * Cost for walking on swamp positions. The default is 5.
    */
  var swampCost: js.UndefOr[Double] = js.native
}

object PathFinderOpts {
  @scala.inline
  def apply(): PathFinderOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathFinderOpts]
  }
  @scala.inline
  implicit class PathFinderOptsOps[Self <: PathFinderOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlee(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flee")(js.undefined)
        ret
    }
    @scala.inline
    def withHeuristicWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heuristicWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeuristicWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heuristicWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCost")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxOps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxOps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOps")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRooms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRooms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRooms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRooms")(js.undefined)
        ret
    }
    @scala.inline
    def withPlainCost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plainCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlainCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plainCost")(js.undefined)
        ret
    }
    @scala.inline
    def withRoomCallback(value: /* roomName */ String => Boolean | CostMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRoomCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withSwampCost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swampCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwampCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swampCost")(js.undefined)
        ret
    }
  }
  
}


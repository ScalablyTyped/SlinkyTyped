package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing:
  * path - An array of RoomPosition objects.
  * ops - Total number of operations performed before this path was calculated.
  * cost - The total cost of the path as derived from `plainCost`, `swampCost` and any given CostMatrix instances.
  * incomplete - If the pathfinder fails to find a complete path, this will be true.
  *   Note that `path` will still be populated with a partial path which represents the closest path it could find given the search parameters.
  */
@js.native
trait PathFinderPath extends js.Object {
  /**
    * The total cost of the path as derived from `plainCost`, `swampCost` and any given CostMatrix instances.
    */
  var cost: Double = js.native
  /**
    * If the pathfinder fails to find a complete path, this will be true.
    *
    * Note that `path` will still be populated with a partial path which represents the closest path it could find given the search parameters.
    */
  var incomplete: Boolean = js.native
  /**
    * Total number of operations performed before this path was calculated.
    */
  var ops: Double = js.native
  /**
    * An array of RoomPosition objects.
    */
  var path: js.Array[RoomPosition] = js.native
}

object PathFinderPath {
  @scala.inline
  def apply(cost: Double, incomplete: Boolean, ops: Double, path: js.Array[RoomPosition]): PathFinderPath = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathFinderPath]
  }
  @scala.inline
  implicit class PathFinderPathOps[Self <: PathFinderPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[RoomPosition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


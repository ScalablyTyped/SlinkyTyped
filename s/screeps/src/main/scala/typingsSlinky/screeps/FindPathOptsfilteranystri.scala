package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined screeps.FindPathOpts & {  filter ? :any | string,   algorithm ? :string} */
@js.native
trait FindPathOptsfilteranystri extends js.Object {
  var algorithm: js.UndefOr[String] = js.native
  /**
    * An array of the room's objects or RoomPosition objects which should be treated as obstacles during the search. This option cannot
    * be used when the new PathFinder is enabled (use costCallback option instead).
    */
  var avoid: js.UndefOr[js.Array[_ | RoomPosition]] = js.native
  /**
    * You can use this callback to modify a CostMatrix for any room during the search. The callback accepts two arguments, roomName
    * and costMatrix. Use the costMatrix instance to make changes to the positions costs. If you return a new matrix from this callback,
    * it will be used instead of the built-in cached one. This option is only used when the new PathFinder is enabled.
    *
    * @param roomName The name of the room.
    * @param costMatrix The current CostMatrix
    * @returns The new CostMatrix to use
    */
  var costCallback: js.UndefOr[
    js.Function2[/* roomName */ String, /* costMatrix */ CostMatrix, Boolean | CostMatrix]
  ] = js.native
  var filter: js.UndefOr[js.Any | String] = js.native
  /**
    * Weight to apply to the heuristic in the A* formula F = G + weight * H. Use this option only if you understand the underlying
    * A* algorithm mechanics! The default value is 1.2.
    */
  var heuristicWeight: js.UndefOr[Double] = js.native
  /**
    * An array of the room's objects or RoomPosition objects which should be treated as walkable tiles during the search. This option
    * cannot be used when the new PathFinder is enabled (use costCallback option instead).
    */
  var ignore: js.UndefOr[js.Array[_ | RoomPosition]] = js.native
  /**
    * Treat squares with creeps as walkable. Can be useful with too many moving creeps around or in some other cases. The default
    * value is false.
    */
  var ignoreCreeps: js.UndefOr[Boolean] = js.native
  /**
    * Treat squares with destructible structures (constructed walls, ramparts, spawns, extensions) as walkable. Use this flag when
    * you need to move through a territory blocked by hostile structures. If a creep with an ATTACK body part steps on such a square,
    * it automatically attacks the structure. The default value is false.
    */
  var ignoreDestructibleStructures: js.UndefOr[Boolean] = js.native
  /**
    * Ignore road structures. Enabling this option can speed up the search. The default value is false. This is only used when the
    * new PathFinder is enabled.
    */
  var ignoreRoads: js.UndefOr[Boolean] = js.native
  /**
    * The maximum limit of possible pathfinding operations. You can limit CPU time used for the search based on ratio 1 op ~ 0.001 CPU.
    * The default value is 2000.
    */
  var maxOps: js.UndefOr[Double] = js.native
  /**
    * The maximum allowed rooms to search. The default (and maximum) is 16. This is only used when the new PathFinder is enabled.
    */
  var maxRooms: js.UndefOr[Double] = js.native
  /**
    * Cost for walking on plain positions. The default is 1.
    */
  var plainCost: js.UndefOr[Double] = js.native
  /**
    * Path to within (range) tiles of target tile. The default is to path to the tile that the target is on (0).
    */
  var range: js.UndefOr[Double] = js.native
  /**
    * If true, the result path will be serialized using Room.serializePath. The default is false.
    */
  var serialize: js.UndefOr[Boolean] = js.native
  /**
    * Cost for walking on swamp positions. The default is 5.
    */
  var swampCost: js.UndefOr[Double] = js.native
}

object FindPathOptsfilteranystri {
  @scala.inline
  def apply(): FindPathOptsfilteranystri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindPathOptsfilteranystri]
  }
  @scala.inline
  implicit class FindPathOptsfilteranystriOps[Self <: FindPathOptsfilteranystri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withAvoid(value: js.Array[_ | RoomPosition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoid")(js.undefined)
        ret
    }
    @scala.inline
    def withCostCallback(value: (/* roomName */ String, /* costMatrix */ CostMatrix) => Boolean | CostMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCostCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: js.Any | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
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
    def withIgnore(value: js.Array[_ | RoomPosition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreCreeps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCreeps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCreeps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCreeps")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDestructibleStructures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDestructibleStructures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDestructibleStructures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDestructibleStructures")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreRoads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRoads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreRoads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRoads")(js.undefined)
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
    def withRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
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


package typingsSlinky.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A non-player structure.
  * Instantly teleports your creeps to a distant room acting as a room exit tile.
  * Portals appear randomly in the central room of each sector.
  */
@js.native
trait StructurePortal
  extends Structure[STRUCTURE_PORTAL]
     with AnyStructure
     with ConcreteStructure[js.Any] {
  /**
    * If this is an inter-room portal, then this property contains a RoomPosition object leading to the point in the destination room.
    * If this is an inter-shard portal, then this property contains an object with shard and room string properties.
    * Exact coordinates are undetermined, the creep will appear at any free spot in the destination room.
    */
  var destination: RoomPosition | AnonShard = js.native
  /**
    * The amount of game ticks when the portal disappears, or undefined when the portal is stable.
    */
  var ticksToDecay: js.UndefOr[Double] = js.native
}

@JSGlobal("StructurePortal")
@js.native
object StructurePortal extends TopLevel[StructurePortalConstructor]


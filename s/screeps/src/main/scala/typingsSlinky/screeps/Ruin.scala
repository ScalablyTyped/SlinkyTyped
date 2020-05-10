package typingsSlinky.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A destroyed structure. This is a walkable object.
  * <ul>
  *     <li>Decay: 500 ticks except some special cases</li>
  * </ul>
  */
@js.native
trait Ruin extends RoomObject {
  /**
    * Time of destruction.
    */
  var destroyTime: Double = js.native
  /**
    * A unique object identificator.
    * You can use {@link Game.getObjectById} method to retrieve an object instance by its id.
    */
  var id: Id[this.type] = js.native
  /**
    * An object with the ruin contents.
    */
  var store: StoreDefinitionUnlimited = js.native
  /**
    * An object containing the destroyed structure.
    */
  var structure: AnyStructure = js.native
  /**
    * The amount of game ticks before this ruin decays.
    */
  var ticksToDecay: Double = js.native
}

@JSGlobal("Ruin")
@js.native
object Ruin extends TopLevel[RuinConstructor]


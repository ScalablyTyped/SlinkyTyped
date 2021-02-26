package typingsSlinky.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Ruin {
  
  @scala.inline
  def apply(
    destroyTime: Double,
    effects: js.Array[RoomObjectEffect],
    id: Id[Ruin],
    pos: RoomPosition,
    store: StoreDefinitionUnlimited,
    structure: AnyStructure,
    ticksToDecay: Double
  ): Ruin = {
    val __obj = js.Dynamic.literal(destroyTime = destroyTime.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], structure = structure.asInstanceOf[js.Any], ticksToDecay = ticksToDecay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ruin]
  }
  
  @scala.inline
  implicit class RuinMutableBuilder[Self <: Ruin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroyTime(value: Double): Self = StObject.set(x, "destroyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Id[Ruin]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: StoreDefinitionUnlimited): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructure(value: AnyStructure): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksToDecay(value: Double): Self = StObject.set(x, "ticksToDecay", value.asInstanceOf[js.Any])
  }
}

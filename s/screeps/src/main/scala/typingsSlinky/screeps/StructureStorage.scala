package typingsSlinky.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structure that can store huge amount of resource units. Only one structure
  * per room is allowed that can be addressed by `Room.storage` property.
  */
@js.native
trait StructureStorage
  extends OwnedStructure[STRUCTURE_STORAGE]
     with AnyOwnedStructure
     with AnyStoreStructure
     with ConcreteStructure[js.Any] {
  
  /**
    * An object with the storage contents.
    */
  var store: StoreDefinition = js.native
  
  /**
    * The total amount of resources the storage can contain.
    * @deprecated An alias for .store.getCapacity().
    */
  var storeCapacity: Double = js.native
}
object StructureStorage {
  
  @scala.inline
  def apply(
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureStorage],
    isActive: () => Boolean,
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    store: StoreDefinition,
    storeCapacity: Double,
    structureType: STRUCTURE_STORAGE
  ): StructureStorage = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], storeCapacity = storeCapacity.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureStorage]
  }
  
  @scala.inline
  implicit class StructureStorageMutableBuilder[Self <: StructureStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStore(value: StoreDefinition): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreCapacity(value: Double): Self = StObject.set(x, "storeCapacity", value.asInstanceOf[js.Any])
  }
}

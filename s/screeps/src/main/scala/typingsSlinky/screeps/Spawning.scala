package typingsSlinky.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// legacy alias
// declare type Spawn = StructureSpawn;
@js.native
trait Spawning extends StObject {
  
  /**
    * Cancel spawning immediately. Energy spent on spawning is not returned.
    */
  def cancel(): ScreepsReturnCode with (OK | ERR_NOT_OWNER) = js.native
  
  /**
    * An array with the spawn directions
    * @see http://docs.screeps.com/api/#StructureSpawn.Spawning.setDirections
    */
  var directions: js.Array[DirectionConstant] = js.native
  
  /**
    * The name of the creep
    */
  var name: String = js.native
  
  /**
    * Time needed in total to complete the spawning.
    */
  var needTime: Double = js.native
  
  /**
    * Remaining time to go.
    */
  var remainingTime: Double = js.native
  
  /**
    * Set desired directions where the creep should move when spawned.
    * @param directions An array with the spawn directions
    */
  def setDirections(directions: js.Array[DirectionConstant]): ScreepsReturnCode with (OK | ERR_NOT_OWNER | ERR_INVALID_ARGS) = js.native
  
  /**
    * A link to the spawn
    */
  var spawn: StructureSpawn = js.native
}
object Spawning {
  
  @scala.inline
  def apply(
    cancel: () => ScreepsReturnCode with (OK | ERR_NOT_OWNER),
    directions: js.Array[DirectionConstant],
    name: String,
    needTime: Double,
    remainingTime: Double,
    setDirections: js.Array[DirectionConstant] => ScreepsReturnCode with (OK | ERR_NOT_OWNER | ERR_INVALID_ARGS),
    spawn: StructureSpawn
  ): Spawning = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), directions = directions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needTime = needTime.asInstanceOf[js.Any], remainingTime = remainingTime.asInstanceOf[js.Any], setDirections = js.Any.fromFunction1(setDirections), spawn = spawn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spawning]
  }
  
  @scala.inline
  implicit class SpawningMutableBuilder[Self <: Spawning] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => ScreepsReturnCode with (OK | ERR_NOT_OWNER)): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDirections(value: js.Array[DirectionConstant]): Self = StObject.set(x, "directions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionsVarargs(value: DirectionConstant*): Self = StObject.set(x, "directions", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedTime(value: Double): Self = StObject.set(x, "needTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingTime(value: Double): Self = StObject.set(x, "remainingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDirections(
      value: js.Array[DirectionConstant] => ScreepsReturnCode with (OK | ERR_NOT_OWNER | ERR_INVALID_ARGS)
    ): Self = StObject.set(x, "setDirections", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpawn(value: StructureSpawn): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
  }
}

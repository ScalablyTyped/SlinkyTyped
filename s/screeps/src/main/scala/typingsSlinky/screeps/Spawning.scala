package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// declare type Spawn = StructureSpawn;
@js.native
trait Spawning extends js.Object {
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
    * A link to the spawn
    */
  var spawn: StructureSpawn = js.native
  /**
    * Cancel spawning immediately. Energy spent on spawning is not returned.
    */
  def cancel(): ScreepsReturnCode with (OK | ERR_NOT_OWNER) = js.native
  /**
    * Set desired directions where the creep should move when spawned.
    * @param directions An array with the spawn directions
    */
  def setDirections(directions: js.Array[DirectionConstant]): ScreepsReturnCode with (OK | ERR_NOT_OWNER | ERR_INVALID_ARGS) = js.native
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
  implicit class SpawningOps[Self <: Spawning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => ScreepsReturnCode with (OK | ERR_NOT_OWNER)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDirections(value: js.Array[DirectionConstant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemainingTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDirections(
      value: js.Array[DirectionConstant] => ScreepsReturnCode with (OK | ERR_NOT_OWNER | ERR_INVALID_ARGS)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirections")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSpawn(value: StructureSpawn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


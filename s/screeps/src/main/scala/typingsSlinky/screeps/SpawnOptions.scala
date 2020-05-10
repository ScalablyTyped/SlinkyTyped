package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object with additional options for the spawning process.
  */
@js.native
trait SpawnOptions extends js.Object {
  /**
    * Set desired directions where the creep should move when spawned.
    * An array with the direction constants.
    */
  var directions: js.UndefOr[js.Array[DirectionConstant]] = js.native
  /**
    * If dryRun is <code>true</code>, the operation will only check if it is possible to create a creep.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  /**
    * Array of spawns/extensions from which to draw energy for the spawning process.
    * Structures will be used according to the array order.
    */
  var energyStructures: js.UndefOr[js.Array[StructureSpawn | StructureExtension]] = js.native
  /**
    * Memory of the new creep. If provided, it will be immediately stored into Memory.creeps[name].
    */
  var memory: js.UndefOr[CreepMemory] = js.native
}

object SpawnOptions {
  @scala.inline
  def apply(): SpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnOptions]
  }
  @scala.inline
  implicit class SpawnOptionsOps[Self <: SpawnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirections(value: js.Array[DirectionConstant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directions")(js.undefined)
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withEnergyStructures(value: js.Array[StructureSpawn | StructureExtension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energyStructures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnergyStructures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energyStructures")(js.undefined)
        ret
    }
    @scala.inline
    def withMemory(value: CreepMemory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(js.undefined)
        ret
    }
  }
  
}


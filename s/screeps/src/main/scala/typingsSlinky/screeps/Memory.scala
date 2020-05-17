package typingsSlinky.screeps

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Memory extends js.Object {
  var creeps: StringDictionary[CreepMemory] = js.native
  var flags: StringDictionary[FlagMemory] = js.native
  var powerCreeps: StringDictionary[PowerCreepMemory] = js.native
  var rooms: StringDictionary[RoomMemory] = js.native
  var spawns: StringDictionary[SpawnMemory] = js.native
}

object Memory {
  @scala.inline
  def apply(
    creeps: StringDictionary[CreepMemory],
    flags: StringDictionary[FlagMemory],
    powerCreeps: StringDictionary[PowerCreepMemory],
    rooms: StringDictionary[RoomMemory],
    spawns: StringDictionary[SpawnMemory]
  ): Memory = {
    val __obj = js.Dynamic.literal(creeps = creeps.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], powerCreeps = powerCreeps.asInstanceOf[js.Any], rooms = rooms.asInstanceOf[js.Any], spawns = spawns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Memory]
  }
  @scala.inline
  implicit class MemoryOps[Self <: Memory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreeps(value: StringDictionary[CreepMemory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creeps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: StringDictionary[FlagMemory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerCreeps(value: StringDictionary[PowerCreepMemory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerCreeps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRooms(value: StringDictionary[RoomMemory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rooms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpawns(value: StringDictionary[SpawnMemory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


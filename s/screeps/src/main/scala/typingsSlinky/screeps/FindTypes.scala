package typingsSlinky.screeps

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindTypes extends /* key */ NumberDictionary[
      RoomPosition | AnyCreep | Source | Resource[ResourceConstant] | Structure[StructureConstant] | Flag | ConstructionSite[BuildableStructureConstant] | Mineral[MineralConstant] | Nuke | Tombstone | Deposit | Ruin
    ] {
  var `1`: RoomPosition = js.native
   // FIND_EXIT_LEFT
  var `10`: RoomPosition = js.native
   // FIND_EXIT
  var `101`: Creep = js.native
   // FIND_CREEPS
  var `102`: Creep = js.native
   // FIND_MY_CREEPS
  var `103`: Creep = js.native
   // FIND_HOSTILE_CREEPS
  var `104`: Source = js.native
   // FIND_SOURCES_ACTIVE
  var `105`: Source = js.native
   // FIND_SOURCES
  var `106`: Resource[ResourceConstant] = js.native
   // FIND_DROPPED_RESOURCES
  var `107`: AnyStructure = js.native
   // FIND_STRUCTURES
  var `108`: AnyOwnedStructure = js.native
   // FIND_MY_STRUCTURES
  var `109`: AnyOwnedStructure = js.native
   // FIND_HOSTILE_STRUCTURES
  var `110`: Flag = js.native
   // FIND_FLAGS
  var `111`: ConstructionSite[BuildableStructureConstant] = js.native
   // FIND_CONSTRUCTION_SITES
  var `112`: StructureSpawn = js.native
   // FIND_MY_SPAWNS
  var `113`: StructureSpawn = js.native
   // FIND_HOSTILE_SPAWNS
  var `114`: ConstructionSite[BuildableStructureConstant] = js.native
   // FIND_MY_CONSTRUCTION_SITES
  var `115`: ConstructionSite[BuildableStructureConstant] = js.native
   // FIND_HOSTILE_CONSTRUCTION_SITES
  var `116`: Mineral[MineralConstant] = js.native
   // FIND_MINERALS
  var `117`: Nuke = js.native
   // FIND_NUKES
  var `118`: Tombstone = js.native
   // FIND_TOMBSTONES
  var `119`: PowerCreep = js.native
   // FIND_POWER_CREEPS
  var `120`: PowerCreep = js.native
   // FIND_MY_POWER_CREEPS
  var `121`: PowerCreep = js.native
   // FIND_HOSTILE_POWER_CREEPS
  var `122`: Deposit = js.native
   // FIND_DEPOSITS
  var `123`: Ruin = js.native
   // FIND_EXIT_TOP
  var `3`: RoomPosition = js.native
   // FIND_EXIT_RIGHT
  var `5`: RoomPosition = js.native
   // FIND_EXIT_BOTTOM
  var `7`: RoomPosition = js.native
}

object FindTypes {
  @scala.inline
  def apply(
    `1`: RoomPosition,
    `10`: RoomPosition,
    `101`: Creep,
    `102`: Creep,
    `103`: Creep,
    `104`: Source,
    `105`: Source,
    `106`: Resource[ResourceConstant],
    `107`: AnyStructure,
    `108`: AnyOwnedStructure,
    `109`: AnyOwnedStructure,
    `110`: Flag,
    `111`: ConstructionSite[BuildableStructureConstant],
    `112`: StructureSpawn,
    `113`: StructureSpawn,
    `114`: ConstructionSite[BuildableStructureConstant],
    `115`: ConstructionSite[BuildableStructureConstant],
    `116`: Mineral[MineralConstant],
    `117`: Nuke,
    `118`: Tombstone,
    `119`: PowerCreep,
    `120`: PowerCreep,
    `121`: PowerCreep,
    `122`: Deposit,
    `123`: Ruin,
    `3`: RoomPosition,
    `5`: RoomPosition,
    `7`: RoomPosition
  ): FindTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("10")(`10`.asInstanceOf[js.Any])
    __obj.updateDynamic("101")(`101`.asInstanceOf[js.Any])
    __obj.updateDynamic("102")(`102`.asInstanceOf[js.Any])
    __obj.updateDynamic("103")(`103`.asInstanceOf[js.Any])
    __obj.updateDynamic("104")(`104`.asInstanceOf[js.Any])
    __obj.updateDynamic("105")(`105`.asInstanceOf[js.Any])
    __obj.updateDynamic("106")(`106`.asInstanceOf[js.Any])
    __obj.updateDynamic("107")(`107`.asInstanceOf[js.Any])
    __obj.updateDynamic("108")(`108`.asInstanceOf[js.Any])
    __obj.updateDynamic("109")(`109`.asInstanceOf[js.Any])
    __obj.updateDynamic("110")(`110`.asInstanceOf[js.Any])
    __obj.updateDynamic("111")(`111`.asInstanceOf[js.Any])
    __obj.updateDynamic("112")(`112`.asInstanceOf[js.Any])
    __obj.updateDynamic("113")(`113`.asInstanceOf[js.Any])
    __obj.updateDynamic("114")(`114`.asInstanceOf[js.Any])
    __obj.updateDynamic("115")(`115`.asInstanceOf[js.Any])
    __obj.updateDynamic("116")(`116`.asInstanceOf[js.Any])
    __obj.updateDynamic("117")(`117`.asInstanceOf[js.Any])
    __obj.updateDynamic("118")(`118`.asInstanceOf[js.Any])
    __obj.updateDynamic("119")(`119`.asInstanceOf[js.Any])
    __obj.updateDynamic("120")(`120`.asInstanceOf[js.Any])
    __obj.updateDynamic("121")(`121`.asInstanceOf[js.Any])
    __obj.updateDynamic("122")(`122`.asInstanceOf[js.Any])
    __obj.updateDynamic("123")(`123`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindTypes]
  }
  @scala.inline
  implicit class FindTypesOps[Self <: FindTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with1(value: RoomPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with10(value: RoomPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with101(value: Creep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("101")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with102(value: Creep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("102")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with103(value: Creep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("103")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with104(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("104")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with105(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("105")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with106(value: Resource[ResourceConstant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("106")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with107(value: AnyStructure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("107")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with108(value: AnyOwnedStructure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("108")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with109(value: AnyOwnedStructure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("109")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with110(value: Flag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("110")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with111(value: ConstructionSite[BuildableStructureConstant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("111")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with112(value: StructureSpawn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("112")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with113(value: StructureSpawn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("113")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with114(value: ConstructionSite[BuildableStructureConstant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("114")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with115(value: ConstructionSite[BuildableStructureConstant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("115")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with116(value: Mineral[MineralConstant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("116")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with117(value: Nuke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("117")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with118(value: Tombstone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("118")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with119(value: PowerCreep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("119")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with120(value: PowerCreep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("120")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with121(value: PowerCreep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("121")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with122(value: Deposit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("122")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with123(value: Ruin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("123")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with3(value: RoomPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with5(value: RoomPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with7(value: RoomPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("7")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


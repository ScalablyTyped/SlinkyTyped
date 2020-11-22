package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object screeps {
  
  type ACCESS_KEY = typingsSlinky.screeps.screepsStrings.accessKey
  
  type ATTACK = typingsSlinky.screeps.screepsStrings.attack
  
  type BOTTOM = typingsSlinky.screeps.screepsNumbers.`5`
  
  type BOTTOM_LEFT = typingsSlinky.screeps.screepsNumbers.`6`
  
  type BOTTOM_RIGHT = typingsSlinky.screeps.screepsNumbers.`4`
  
  // Body Part Constants
  type BodyPartConstant = typingsSlinky.screeps.MOVE | typingsSlinky.screeps.WORK | typingsSlinky.screeps.CARRY | typingsSlinky.screeps.ATTACK | typingsSlinky.screeps.RANGED_ATTACK | typingsSlinky.screeps.TOUGH | typingsSlinky.screeps.HEAL | typingsSlinky.screeps.CLAIM
  
  /**
    * Describes one part of a creep’s body.
    */
  type BodyPartDefinition[T /* <: typingsSlinky.screeps.BodyPartConstant */] = typingsSlinky.screeps.anon.Boost[T]
  
  // Structure Constants
  type BuildableStructureConstant = typingsSlinky.screeps.STRUCTURE_EXTENSION | typingsSlinky.screeps.STRUCTURE_RAMPART | typingsSlinky.screeps.STRUCTURE_ROAD | typingsSlinky.screeps.STRUCTURE_SPAWN | typingsSlinky.screeps.STRUCTURE_LINK | typingsSlinky.screeps.STRUCTURE_WALL | typingsSlinky.screeps.STRUCTURE_STORAGE | typingsSlinky.screeps.STRUCTURE_TOWER | typingsSlinky.screeps.STRUCTURE_OBSERVER | typingsSlinky.screeps.STRUCTURE_POWER_SPAWN | typingsSlinky.screeps.STRUCTURE_EXTRACTOR | typingsSlinky.screeps.STRUCTURE_LAB | typingsSlinky.screeps.STRUCTURE_TERMINAL | typingsSlinky.screeps.STRUCTURE_CONTAINER | typingsSlinky.screeps.STRUCTURE_NUKER | typingsSlinky.screeps.STRUCTURE_FACTORY
  
  type CARRY = typingsSlinky.screeps.screepsStrings.carry
  
  type CLAIM = typingsSlinky.screeps.screepsStrings.claim
  
  type COLOR_BLUE = typingsSlinky.screeps.screepsNumbers.`3`
  
  type COLOR_BROWN = typingsSlinky.screeps.screepsNumbers.`8`
  
  type COLOR_CYAN = typingsSlinky.screeps.screepsNumbers.`4`
  
  type COLOR_GREEN = typingsSlinky.screeps.screepsNumbers.`5`
  
  type COLOR_GREY = typingsSlinky.screeps.screepsNumbers.`9`
  
  type COLOR_ORANGE = typingsSlinky.screeps.screepsNumbers.`7`
  
  type COLOR_PURPLE = typingsSlinky.screeps.screepsNumbers.`2`
  
  type COLOR_RED = typingsSlinky.screeps.screepsNumbers.`1`
  
  type COLOR_WHITE = typingsSlinky.screeps.screepsNumbers.`10`
  
  type COLOR_YELLOW = typingsSlinky.screeps.screepsNumbers.`6`
  
  type CPUShardLimits = org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  type CPU_UNLOCK = typingsSlinky.screeps.screepsStrings.cpuUnlock
  
  // Color Constants
  type ColorConstant = typingsSlinky.screeps.COLOR_RED | typingsSlinky.screeps.COLOR_PURPLE | typingsSlinky.screeps.COLOR_BLUE | typingsSlinky.screeps.COLOR_CYAN | typingsSlinky.screeps.COLOR_GREEN | typingsSlinky.screeps.COLOR_YELLOW | typingsSlinky.screeps.COLOR_ORANGE | typingsSlinky.screeps.COLOR_BROWN | typingsSlinky.screeps.COLOR_GREY | typingsSlinky.screeps.COLOR_WHITE
  
  /** The commodities, produced by the Factory */
  type CommodityConstant = typingsSlinky.screeps.RESOURCE_UTRIUM_BAR | typingsSlinky.screeps.RESOURCE_LEMERGIUM_BAR | typingsSlinky.screeps.RESOURCE_ZYNTHIUM_BAR | typingsSlinky.screeps.RESOURCE_KEANIUM_BAR | typingsSlinky.screeps.RESOURCE_GHODIUM_MELT | typingsSlinky.screeps.RESOURCE_OXIDANT | typingsSlinky.screeps.RESOURCE_REDUCTANT | typingsSlinky.screeps.RESOURCE_PURIFIER | typingsSlinky.screeps.RESOURCE_BATTERY | typingsSlinky.screeps.RESOURCE_COMPOSITE | typingsSlinky.screeps.RESOURCE_CRYSTAL | typingsSlinky.screeps.RESOURCE_LIQUID | typingsSlinky.screeps.RESOURCE_WIRE | typingsSlinky.screeps.RESOURCE_SWITCH | typingsSlinky.screeps.RESOURCE_TRANSISTOR | typingsSlinky.screeps.RESOURCE_MICROCHIP | typingsSlinky.screeps.RESOURCE_CIRCUIT | typingsSlinky.screeps.RESOURCE_DEVICE | typingsSlinky.screeps.RESOURCE_CELL | typingsSlinky.screeps.RESOURCE_PHLEGM | typingsSlinky.screeps.RESOURCE_TISSUE | typingsSlinky.screeps.RESOURCE_MUSCLE | typingsSlinky.screeps.RESOURCE_ORGANOID | typingsSlinky.screeps.RESOURCE_ORGANISM | typingsSlinky.screeps.RESOURCE_ALLOY | typingsSlinky.screeps.RESOURCE_TUBE | typingsSlinky.screeps.RESOURCE_FIXTURES | typingsSlinky.screeps.RESOURCE_FRAME | typingsSlinky.screeps.RESOURCE_HYDRAULICS | typingsSlinky.screeps.RESOURCE_MACHINE | typingsSlinky.screeps.RESOURCE_CONDENSATE | typingsSlinky.screeps.RESOURCE_CONCENTRATE | typingsSlinky.screeps.RESOURCE_EXTRACT | typingsSlinky.screeps.RESOURCE_SPIRIT | typingsSlinky.screeps.RESOURCE_EMANATION | typingsSlinky.screeps.RESOURCE_ESSENCE
  
  type CreepActionReturnCode = typingsSlinky.screeps.OK | typingsSlinky.screeps.ERR_NOT_OWNER | typingsSlinky.screeps.ERR_BUSY | typingsSlinky.screeps.ERR_INVALID_TARGET | typingsSlinky.screeps.ERR_NOT_IN_RANGE | typingsSlinky.screeps.ERR_NO_BODYPART | typingsSlinky.screeps.ERR_TIRED
  
  type CreepMoveReturnCode = typingsSlinky.screeps.OK | typingsSlinky.screeps.ERR_NOT_OWNER | typingsSlinky.screeps.ERR_BUSY | typingsSlinky.screeps.ERR_TIRED | typingsSlinky.screeps.ERR_NO_BODYPART
  
  /** The raw deposits */
  type DepositConstant = typingsSlinky.screeps.RESOURCE_MIST | typingsSlinky.screeps.RESOURCE_BIOMASS | typingsSlinky.screeps.RESOURCE_METAL | typingsSlinky.screeps.RESOURCE_SILICON
  
  // Direction Constants
  type DirectionConstant = typingsSlinky.screeps.TOP | typingsSlinky.screeps.TOP_RIGHT | typingsSlinky.screeps.RIGHT | typingsSlinky.screeps.BOTTOM_RIGHT | typingsSlinky.screeps.BOTTOM | typingsSlinky.screeps.BOTTOM_LEFT | typingsSlinky.screeps.LEFT | typingsSlinky.screeps.TOP_LEFT
  
  type EFFECT_COLLAPSE_TIMER = typingsSlinky.screeps.screepsNumbers.`1002`
  
  type EFFECT_INVULNERABILITY = typingsSlinky.screeps.screepsNumbers.`1001`
  
  type ERR_BUSY = typingsSlinky.screeps.screepsNumbers.`-4`
  
  type ERR_FULL = typingsSlinky.screeps.screepsNumbers.`-8`
  
  type ERR_GCL_NOT_ENOUGH = typingsSlinky.screeps.screepsNumbers.`-15`
  
  type ERR_INVALID_ARGS = typingsSlinky.screeps.screepsNumbers.`-10`
  
  type ERR_INVALID_TARGET = typingsSlinky.screeps.screepsNumbers.`-7`
  
  type ERR_NAME_EXISTS = typingsSlinky.screeps.screepsNumbers.`-3`
  
  type ERR_NOT_ENOUGH_ENERGY = typingsSlinky.screeps.screepsNumbers.`-6`
  
  type ERR_NOT_ENOUGH_EXTENSIONS = typingsSlinky.screeps.screepsNumbers.`-6`
  
  type ERR_NOT_ENOUGH_RESOURCES = typingsSlinky.screeps.screepsNumbers.`-6`
  
  type ERR_NOT_FOUND = typingsSlinky.screeps.screepsNumbers.`-5`
  
  type ERR_NOT_IN_RANGE = typingsSlinky.screeps.screepsNumbers.`-9`
  
  type ERR_NOT_OWNER = typingsSlinky.screeps.screepsNumbers.`-1`
  
  type ERR_NO_BODYPART = typingsSlinky.screeps.screepsNumbers.`-12`
  
  type ERR_NO_PATH = typingsSlinky.screeps.screepsNumbers.`-2`
  
  type ERR_RCL_NOT_ENOUGH = typingsSlinky.screeps.screepsNumbers.`-14`
  
  type ERR_TIRED = typingsSlinky.screeps.screepsNumbers.`-11`
  
  type EVENT_ATTACK = typingsSlinky.screeps.screepsNumbers.`1`
  
  type EVENT_ATTACK_CONTROLLER = typingsSlinky.screeps.screepsNumbers.`3`
  
  type EVENT_ATTACK_TYPE_DISMANTLE = typingsSlinky.screeps.screepsNumbers.`4`
  
  type EVENT_ATTACK_TYPE_HIT_BACK = typingsSlinky.screeps.screepsNumbers.`5`
  
  type EVENT_ATTACK_TYPE_MELEE = typingsSlinky.screeps.screepsNumbers.`1`
  
  type EVENT_ATTACK_TYPE_NUKE = typingsSlinky.screeps.screepsNumbers.`6`
  
  type EVENT_ATTACK_TYPE_RANGED = typingsSlinky.screeps.screepsNumbers.`2`
  
  type EVENT_ATTACK_TYPE_RANGED_MASS = typingsSlinky.screeps.screepsNumbers.`3`
  
  type EVENT_BUILD = typingsSlinky.screeps.screepsNumbers.`4`
  
  type EVENT_EXIT = typingsSlinky.screeps.screepsNumbers.`10`
  
  type EVENT_HARVEST = typingsSlinky.screeps.screepsNumbers.`5`
  
  type EVENT_HEAL = typingsSlinky.screeps.screepsNumbers.`6`
  
  type EVENT_HEAL_TYPE_MELEE = typingsSlinky.screeps.screepsNumbers.`1`
  
  type EVENT_HEAL_TYPE_RANGED = typingsSlinky.screeps.screepsNumbers.`2`
  
  type EVENT_OBJECT_DESTROYED = typingsSlinky.screeps.screepsNumbers.`2`
  
  type EVENT_POWER = typingsSlinky.screeps.screepsNumbers.`11`
  
  type EVENT_REPAIR = typingsSlinky.screeps.screepsNumbers.`7`
  
  type EVENT_RESERVE_CONTROLLER = typingsSlinky.screeps.screepsNumbers.`8`
  
  type EVENT_TRANSFER = typingsSlinky.screeps.screepsNumbers.`12`
  
  type EVENT_UPGRADE_CONTROLLER = typingsSlinky.screeps.screepsNumbers.`9`
  
  type EffectConstant = typingsSlinky.screeps.EFFECT_INVULNERABILITY | typingsSlinky.screeps.EFFECT_COLLAPSE_TIMER
  
  type EventAttackType = typingsSlinky.screeps.EVENT_ATTACK_TYPE_MELEE | typingsSlinky.screeps.EVENT_ATTACK_TYPE_RANGED | typingsSlinky.screeps.EVENT_ATTACK_TYPE_RANGED_MASS | typingsSlinky.screeps.EVENT_ATTACK_TYPE_DISMANTLE | typingsSlinky.screeps.EVENT_ATTACK_TYPE_HIT_BACK | typingsSlinky.screeps.EVENT_ATTACK_TYPE_NUKE
  
  type EventConstant = typingsSlinky.screeps.EVENT_ATTACK | typingsSlinky.screeps.EVENT_OBJECT_DESTROYED | typingsSlinky.screeps.EVENT_ATTACK_CONTROLLER | typingsSlinky.screeps.EVENT_BUILD | typingsSlinky.screeps.EVENT_HARVEST | typingsSlinky.screeps.EVENT_HEAL | typingsSlinky.screeps.EVENT_REPAIR | typingsSlinky.screeps.EVENT_RESERVE_CONTROLLER | typingsSlinky.screeps.EVENT_UPGRADE_CONTROLLER | typingsSlinky.screeps.EVENT_EXIT | typingsSlinky.screeps.EVENT_POWER | typingsSlinky.screeps.EVENT_TRANSFER
  
  type EventDestroyType = typingsSlinky.screeps.screepsStrings.creep | typingsSlinky.screeps.StructureConstant
  
  type EventHealType = typingsSlinky.screeps.EVENT_HEAL_TYPE_MELEE | typingsSlinky.screeps.EVENT_HEAL_TYPE_RANGED
  
  // Find Constants
  type ExitConstant = typingsSlinky.screeps.FIND_EXIT_TOP | typingsSlinky.screeps.FIND_EXIT_RIGHT | typingsSlinky.screeps.FIND_EXIT_BOTTOM | typingsSlinky.screeps.FIND_EXIT_LEFT
  
  type FIND_CONSTRUCTION_SITES = typingsSlinky.screeps.screepsNumbers.`111`
  
  type FIND_CREEPS = typingsSlinky.screeps.screepsNumbers.`101`
  
  type FIND_DEPOSITS = typingsSlinky.screeps.screepsNumbers.`122`
  
  type FIND_DROPPED_RESOURCES = typingsSlinky.screeps.screepsNumbers.`106`
  
  type FIND_EXIT = typingsSlinky.screeps.screepsNumbers.`10`
  
  type FIND_EXIT_BOTTOM = typingsSlinky.screeps.screepsNumbers.`5`
  
  type FIND_EXIT_LEFT = typingsSlinky.screeps.screepsNumbers.`7`
  
  type FIND_EXIT_RIGHT = typingsSlinky.screeps.screepsNumbers.`3`
  
  type FIND_EXIT_TOP = typingsSlinky.screeps.screepsNumbers.`1`
  
  type FIND_FLAGS = typingsSlinky.screeps.screepsNumbers.`110`
  
  type FIND_HOSTILE_CONSTRUCTION_SITES = typingsSlinky.screeps.screepsNumbers.`115`
  
  type FIND_HOSTILE_CREEPS = typingsSlinky.screeps.screepsNumbers.`103`
  
  type FIND_HOSTILE_POWER_CREEPS = typingsSlinky.screeps.screepsNumbers.`121`
  
  type FIND_HOSTILE_SPAWNS = typingsSlinky.screeps.screepsNumbers.`113`
  
  type FIND_HOSTILE_STRUCTURES = typingsSlinky.screeps.screepsNumbers.`109`
  
  type FIND_MINERALS = typingsSlinky.screeps.screepsNumbers.`116`
  
  type FIND_MY_CONSTRUCTION_SITES = typingsSlinky.screeps.screepsNumbers.`114`
  
  type FIND_MY_CREEPS = typingsSlinky.screeps.screepsNumbers.`102`
  
  type FIND_MY_POWER_CREEPS = typingsSlinky.screeps.screepsNumbers.`120`
  
  type FIND_MY_SPAWNS = typingsSlinky.screeps.screepsNumbers.`112`
  
  type FIND_MY_STRUCTURES = typingsSlinky.screeps.screepsNumbers.`108`
  
  type FIND_NUKES = typingsSlinky.screeps.screepsNumbers.`117`
  
  type FIND_POWER_CREEPS = typingsSlinky.screeps.screepsNumbers.`119`
  
  type FIND_RUINS = typingsSlinky.screeps.screepsNumbers.`123`
  
  type FIND_SOURCES = typingsSlinky.screeps.screepsNumbers.`105`
  
  type FIND_SOURCES_ACTIVE = typingsSlinky.screeps.screepsNumbers.`104`
  
  type FIND_STRUCTURES = typingsSlinky.screeps.screepsNumbers.`107`
  
  type FIND_TOMBSTONES = typingsSlinky.screeps.screepsNumbers.`118`
  
  type FilterFunction[T /* <: typingsSlinky.screeps.FindConstant */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: screeps.FindTypes[T] */ /* object */ js.Any, 
    scala.Boolean
  ]
  
  type FilterObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type FindConstant = typingsSlinky.screeps.FIND_EXIT_TOP | typingsSlinky.screeps.FIND_EXIT_RIGHT | typingsSlinky.screeps.FIND_EXIT_BOTTOM | typingsSlinky.screeps.FIND_EXIT_LEFT | typingsSlinky.screeps.FIND_EXIT | typingsSlinky.screeps.FIND_CREEPS | typingsSlinky.screeps.FIND_MY_CREEPS | typingsSlinky.screeps.FIND_HOSTILE_CREEPS | typingsSlinky.screeps.FIND_SOURCES_ACTIVE | typingsSlinky.screeps.FIND_SOURCES | typingsSlinky.screeps.FIND_DROPPED_RESOURCES | typingsSlinky.screeps.FIND_STRUCTURES | typingsSlinky.screeps.FIND_MY_STRUCTURES | typingsSlinky.screeps.FIND_HOSTILE_STRUCTURES | typingsSlinky.screeps.FIND_FLAGS | typingsSlinky.screeps.FIND_CONSTRUCTION_SITES | typingsSlinky.screeps.FIND_MY_SPAWNS | typingsSlinky.screeps.FIND_HOSTILE_SPAWNS | typingsSlinky.screeps.FIND_MY_CONSTRUCTION_SITES | typingsSlinky.screeps.FIND_HOSTILE_CONSTRUCTION_SITES | typingsSlinky.screeps.FIND_MINERALS | typingsSlinky.screeps.FIND_NUKES | typingsSlinky.screeps.FIND_TOMBSTONES | typingsSlinky.screeps.FIND_POWER_CREEPS | typingsSlinky.screeps.FIND_MY_POWER_CREEPS | typingsSlinky.screeps.FIND_HOSTILE_POWER_CREEPS | typingsSlinky.screeps.FIND_DEPOSITS | typingsSlinky.screeps.FIND_RUINS
  
  type HEAL = typingsSlinky.screeps.screepsStrings.heal
  
  type Id[T] = java.lang.String with typingsSlinky.screeps.Tag.OpaqueTag[T]
  
  type InterShardResourceConstant = typingsSlinky.screeps.SUBSCRIPTION_TOKEN | typingsSlinky.screeps.CPU_UNLOCK | typingsSlinky.screeps.PIXEL | typingsSlinky.screeps.ACCESS_KEY
  
  type LEFT = typingsSlinky.screeps.screepsNumbers.`7`
  
  type LOOK_CONSTRUCTION_SITES = typingsSlinky.screeps.screepsStrings.constructionSite
  
  type LOOK_CREEPS = typingsSlinky.screeps.screepsStrings.creep
  
  type LOOK_DEPOSITS = typingsSlinky.screeps.screepsStrings.deposit
  
  type LOOK_ENERGY = typingsSlinky.screeps.screepsStrings.energy
  
  type LOOK_FLAGS = typingsSlinky.screeps.screepsStrings.flag
  
  type LOOK_MINERALS = typingsSlinky.screeps.screepsStrings.mineral
  
  type LOOK_NUKES = typingsSlinky.screeps.screepsStrings.nuke
  
  type LOOK_POWER_CREEPS = typingsSlinky.screeps.screepsStrings.powerCreep
  
  type LOOK_RESOURCES = typingsSlinky.screeps.screepsStrings.resource
  
  type LOOK_RUINS = typingsSlinky.screeps.screepsStrings.ruin
  
  type LOOK_SOURCES = typingsSlinky.screeps.screepsStrings.source
  
  type LOOK_STRUCTURES = typingsSlinky.screeps.screepsStrings.structure
  
  type LOOK_TERRAIN = typingsSlinky.screeps.screepsStrings.terrain
  
  type LOOK_TOMBSTONES = typingsSlinky.screeps.screepsStrings.tombstone
  
  type LookAtResult[K /* <: typingsSlinky.screeps.LookConstant */] = (typingsSlinky.std.Pick[typingsSlinky.screeps.LookAtTypes, K]) with typingsSlinky.screeps.anon.Type[K]
  
  type LookAtResultMatrix[K /* <: typingsSlinky.screeps.LookConstant */] = org.scalablytyped.runtime.NumberDictionary[
    org.scalablytyped.runtime.NumberDictionary[js.Array[typingsSlinky.screeps.LookAtResult[K]]]
  ]
  
  type LookAtResultWithPos[K /* <: typingsSlinky.screeps.LookConstant */] = typingsSlinky.screeps.LookAtResult[K] with typingsSlinky.screeps.anon.X
  
  // Look Constants
  type LookConstant = typingsSlinky.screeps.LOOK_CREEPS | typingsSlinky.screeps.LOOK_ENERGY | typingsSlinky.screeps.LOOK_RESOURCES | typingsSlinky.screeps.LOOK_SOURCES | typingsSlinky.screeps.LOOK_MINERALS | typingsSlinky.screeps.LOOK_DEPOSITS | typingsSlinky.screeps.LOOK_STRUCTURES | typingsSlinky.screeps.LOOK_FLAGS | typingsSlinky.screeps.LOOK_CONSTRUCTION_SITES | typingsSlinky.screeps.LOOK_NUKES | typingsSlinky.screeps.LOOK_TERRAIN | typingsSlinky.screeps.LOOK_TOMBSTONES | typingsSlinky.screeps.LOOK_POWER_CREEPS | typingsSlinky.screeps.LOOK_RUINS
  
  type LookForAtAreaResultArray[T, K /* <: typingsSlinky.screeps.screepsStrings.tombstone | typingsSlinky.screeps.screepsStrings.exit | typingsSlinky.screeps.screepsStrings.resource | typingsSlinky.screeps.screepsStrings.creep | typingsSlinky.screeps.screepsStrings.structure | typingsSlinky.screeps.screepsStrings.source | typingsSlinky.screeps.screepsStrings.deposit | typingsSlinky.screeps.screepsStrings.constructionSite | typingsSlinky.screeps.screepsStrings.mineral | typingsSlinky.screeps.screepsStrings.nuke | typingsSlinky.screeps.screepsStrings.flag | typingsSlinky.screeps.screepsStrings.energy | typingsSlinky.screeps.screepsStrings.ruin | typingsSlinky.screeps.screepsStrings.terrain | typingsSlinky.screeps.screepsStrings.powerCreep */] = js.Array[typingsSlinky.screeps.LookForAtAreaResultWithPos[T, K]]
  
  type LookForAtAreaResultMatrix[T, K /* <: typingsSlinky.screeps.screepsStrings.tombstone | typingsSlinky.screeps.screepsStrings.exit | typingsSlinky.screeps.screepsStrings.resource | typingsSlinky.screeps.screepsStrings.creep | typingsSlinky.screeps.screepsStrings.structure | typingsSlinky.screeps.screepsStrings.source | typingsSlinky.screeps.screepsStrings.deposit | typingsSlinky.screeps.screepsStrings.constructionSite | typingsSlinky.screeps.screepsStrings.mineral | typingsSlinky.screeps.screepsStrings.nuke | typingsSlinky.screeps.screepsStrings.flag | typingsSlinky.screeps.screepsStrings.energy | typingsSlinky.screeps.screepsStrings.ruin | typingsSlinky.screeps.screepsStrings.terrain | typingsSlinky.screeps.screepsStrings.powerCreep */] = org.scalablytyped.runtime.NumberDictionary[
    org.scalablytyped.runtime.NumberDictionary[js.Array[typingsSlinky.screeps.LookForAtAreaResult[T, K]]]
  ]
  
  type LookForAtAreaResultWithPos[T, K /* <: typingsSlinky.screeps.screepsStrings.tombstone | typingsSlinky.screeps.screepsStrings.exit | typingsSlinky.screeps.screepsStrings.resource | typingsSlinky.screeps.screepsStrings.creep | typingsSlinky.screeps.screepsStrings.structure | typingsSlinky.screeps.screepsStrings.source | typingsSlinky.screeps.screepsStrings.deposit | typingsSlinky.screeps.screepsStrings.constructionSite | typingsSlinky.screeps.screepsStrings.mineral | typingsSlinky.screeps.screepsStrings.nuke | typingsSlinky.screeps.screepsStrings.flag | typingsSlinky.screeps.screepsStrings.energy | typingsSlinky.screeps.screepsStrings.ruin | typingsSlinky.screeps.screepsStrings.terrain | typingsSlinky.screeps.screepsStrings.powerCreep */] = (typingsSlinky.screeps.LookForAtAreaResult[T, K]) with typingsSlinky.screeps.anon.X
  
  type MOVE = typingsSlinky.screeps.screepsStrings.move
  
  type MarketResourceConstant = typingsSlinky.screeps.ResourceConstant | typingsSlinky.screeps.InterShardResourceConstant
  
  /** The compounds which can't boost */
  type MineralBaseCompoundsConstant = typingsSlinky.screeps.RESOURCE_HYDROXIDE | typingsSlinky.screeps.RESOURCE_ZYNTHIUM_KEANITE | typingsSlinky.screeps.RESOURCE_UTRIUM_LEMERGITE | typingsSlinky.screeps.RESOURCE_GHODIUM
  
  /** The boosts (from tier 1 to tier 3) */
  type MineralBoostConstant = typingsSlinky.screeps.RESOURCE_UTRIUM_HYDRIDE | typingsSlinky.screeps.RESOURCE_UTRIUM_OXIDE | typingsSlinky.screeps.RESOURCE_KEANIUM_HYDRIDE | typingsSlinky.screeps.RESOURCE_KEANIUM_OXIDE | typingsSlinky.screeps.RESOURCE_LEMERGIUM_HYDRIDE | typingsSlinky.screeps.RESOURCE_LEMERGIUM_OXIDE | typingsSlinky.screeps.RESOURCE_ZYNTHIUM_HYDRIDE | typingsSlinky.screeps.RESOURCE_ZYNTHIUM_OXIDE | typingsSlinky.screeps.RESOURCE_GHODIUM_HYDRIDE | typingsSlinky.screeps.RESOURCE_GHODIUM_OXIDE | typingsSlinky.screeps.RESOURCE_UTRIUM_ACID | typingsSlinky.screeps.RESOURCE_UTRIUM_ALKALIDE | typingsSlinky.screeps.RESOURCE_KEANIUM_ACID | typingsSlinky.screeps.RESOURCE_KEANIUM_ALKALIDE | typingsSlinky.screeps.RESOURCE_LEMERGIUM_ACID | typingsSlinky.screeps.RESOURCE_LEMERGIUM_ALKALIDE | typingsSlinky.screeps.RESOURCE_ZYNTHIUM_ACID | typingsSlinky.screeps.RESOURCE_ZYNTHIUM_ALKALIDE | typingsSlinky.screeps.RESOURCE_GHODIUM_ACID | typingsSlinky.screeps.RESOURCE_GHODIUM_ALKALIDE | typingsSlinky.screeps.RESOURCE_CATALYZED_UTRIUM_ACID | typingsSlinky.screeps.RESOURCE_CATALYZED_UTRIUM_ALKALIDE | typingsSlinky.screeps.RESOURCE_CATALYZED_KEANIUM_ACID | typingsSlinky.screeps.RESOURCE_CATALYZED_KEANIUM_ALKALIDE | typingsSlinky.screeps.RESOURCE_CATALYZED_LEMERGIUM_ACID | typingsSlinky.screeps.RESOURCE_CATALYZED_LEMERGIUM_ALKALIDE | typingsSlinky.screeps.RESOURCE_CATALYZED_ZYNTHIUM_ACID | typingsSlinky.screeps.RESOURCE_CATALYZED_ZYNTHIUM_ALKALIDE | typingsSlinky.screeps.RESOURCE_CATALYZED_GHODIUM_ACID | typingsSlinky.screeps.RESOURCE_CATALYZED_GHODIUM_ALKALIDE
  
  /** All the mineral compounds */
  type MineralCompoundConstant = typingsSlinky.screeps.MineralBaseCompoundsConstant | typingsSlinky.screeps.MineralBoostConstant
  
  /** The raw harvestable minerals */
  type MineralConstant = typingsSlinky.screeps.RESOURCE_UTRIUM | typingsSlinky.screeps.RESOURCE_LEMERGIUM | typingsSlinky.screeps.RESOURCE_KEANIUM | typingsSlinky.screeps.RESOURCE_ZYNTHIUM | typingsSlinky.screeps.RESOURCE_OXYGEN | typingsSlinky.screeps.RESOURCE_HYDROGEN | typingsSlinky.screeps.RESOURCE_CATALYST
  
  type OK = typingsSlinky.screeps.screepsNumbers.`0`
  
  type ORDER_BUY = typingsSlinky.screeps.screepsStrings.buy
  
  type ORDER_SELL = typingsSlinky.screeps.screepsStrings.sell
  
  type PIXEL = typingsSlinky.screeps.screepsStrings.pixel
  
  type PWR_DISRUPT_SOURCE = typingsSlinky.screeps.screepsNumbers.`11`
  
  type PWR_DISRUPT_SPAWN = typingsSlinky.screeps.screepsNumbers.`9`
  
  type PWR_DISRUPT_TERMINAL = typingsSlinky.screeps.screepsNumbers.`15`
  
  type PWR_DISRUPT_TOWER = typingsSlinky.screeps.screepsNumbers.`10`
  
  type PWR_FORTIFY = typingsSlinky.screeps.screepsNumbers.`17`
  
  type PWR_GENERATE_OPS = typingsSlinky.screeps.screepsNumbers.`1`
  
  type PWR_OPERATE_CONTROLLER = typingsSlinky.screeps.screepsNumbers.`18`
  
  type PWR_OPERATE_EXTENSION = typingsSlinky.screeps.screepsNumbers.`6`
  
  type PWR_OPERATE_FACTORY = typingsSlinky.screeps.screepsNumbers.`19`
  
  type PWR_OPERATE_LAB = typingsSlinky.screeps.screepsNumbers.`5`
  
  type PWR_OPERATE_OBSERVER = typingsSlinky.screeps.screepsNumbers.`7`
  
  type PWR_OPERATE_POWER = typingsSlinky.screeps.screepsNumbers.`16`
  
  type PWR_OPERATE_SPAWN = typingsSlinky.screeps.screepsNumbers.`2`
  
  type PWR_OPERATE_STORAGE = typingsSlinky.screeps.screepsNumbers.`4`
  
  type PWR_OPERATE_TERMINAL = typingsSlinky.screeps.screepsNumbers.`8`
  
  type PWR_OPERATE_TOWER = typingsSlinky.screeps.screepsNumbers.`3`
  
  type PWR_REGEN_MINERAL = typingsSlinky.screeps.screepsNumbers.`14`
  
  type PWR_REGEN_SOURCE = typingsSlinky.screeps.screepsNumbers.`13`
  
  type PWR_SHIELD = typingsSlinky.screeps.screepsNumbers.`12`
  
  /* Inlined screeps.POWER_CLASS['OPERATOR'] */
  type PowerClassConstant = typingsSlinky.screeps.screepsStrings.operator
  
  type PowerConstant = typingsSlinky.screeps.PWR_GENERATE_OPS | typingsSlinky.screeps.PWR_OPERATE_SPAWN | typingsSlinky.screeps.PWR_OPERATE_TOWER | typingsSlinky.screeps.PWR_OPERATE_STORAGE | typingsSlinky.screeps.PWR_OPERATE_LAB | typingsSlinky.screeps.PWR_OPERATE_EXTENSION | typingsSlinky.screeps.PWR_OPERATE_OBSERVER | typingsSlinky.screeps.PWR_OPERATE_TERMINAL | typingsSlinky.screeps.PWR_DISRUPT_SPAWN | typingsSlinky.screeps.PWR_DISRUPT_TOWER | typingsSlinky.screeps.PWR_DISRUPT_SOURCE | typingsSlinky.screeps.PWR_SHIELD | typingsSlinky.screeps.PWR_REGEN_SOURCE | typingsSlinky.screeps.PWR_REGEN_MINERAL | typingsSlinky.screeps.PWR_DISRUPT_TERMINAL | typingsSlinky.screeps.PWR_OPERATE_POWER | typingsSlinky.screeps.PWR_FORTIFY | typingsSlinky.screeps.PWR_OPERATE_CONTROLLER | typingsSlinky.screeps.PWR_OPERATE_FACTORY
  
  /**
    * Available powers, an object with power ID as a key, and the following properties
    */
  type PowerCreepPowers = org.scalablytyped.runtime.NumberDictionary[typingsSlinky.screeps.anon.Cooldown]
  
  type RANGED_ATTACK = typingsSlinky.screeps.screepsStrings.ranged_attack
  
  type RESOURCE_ALLOY = typingsSlinky.screeps.screepsStrings.alloy
  
  type RESOURCE_BATTERY = typingsSlinky.screeps.screepsStrings.battery
  
  type RESOURCE_BIOMASS = typingsSlinky.screeps.screepsStrings.biomass
  
  type RESOURCE_CATALYST = typingsSlinky.screeps.screepsStrings.X
  
  type RESOURCE_CATALYZED_GHODIUM_ACID = typingsSlinky.screeps.screepsStrings.XGH2O
  
  type RESOURCE_CATALYZED_GHODIUM_ALKALIDE = typingsSlinky.screeps.screepsStrings.XGHO2
  
  type RESOURCE_CATALYZED_KEANIUM_ACID = typingsSlinky.screeps.screepsStrings.XKH2O
  
  type RESOURCE_CATALYZED_KEANIUM_ALKALIDE = typingsSlinky.screeps.screepsStrings.XKHO2
  
  type RESOURCE_CATALYZED_LEMERGIUM_ACID = typingsSlinky.screeps.screepsStrings.XLH2O
  
  type RESOURCE_CATALYZED_LEMERGIUM_ALKALIDE = typingsSlinky.screeps.screepsStrings.XLHO2
  
  type RESOURCE_CATALYZED_UTRIUM_ACID = typingsSlinky.screeps.screepsStrings.XUH2O
  
  type RESOURCE_CATALYZED_UTRIUM_ALKALIDE = typingsSlinky.screeps.screepsStrings.XUHO2
  
  type RESOURCE_CATALYZED_ZYNTHIUM_ACID = typingsSlinky.screeps.screepsStrings.XZH2O
  
  type RESOURCE_CATALYZED_ZYNTHIUM_ALKALIDE = typingsSlinky.screeps.screepsStrings.XZHO2
  
  type RESOURCE_CELL = typingsSlinky.screeps.screepsStrings.cell
  
  type RESOURCE_CIRCUIT = typingsSlinky.screeps.screepsStrings.circuit
  
  type RESOURCE_COMPOSITE = typingsSlinky.screeps.screepsStrings.composite
  
  type RESOURCE_CONCENTRATE = typingsSlinky.screeps.screepsStrings.concentrate
  
  type RESOURCE_CONDENSATE = typingsSlinky.screeps.screepsStrings.condensate
  
  type RESOURCE_CRYSTAL = typingsSlinky.screeps.screepsStrings.crystal
  
  type RESOURCE_DEVICE = typingsSlinky.screeps.screepsStrings.device
  
  type RESOURCE_EMANATION = typingsSlinky.screeps.screepsStrings.emanation
  
  type RESOURCE_ENERGY = typingsSlinky.screeps.screepsStrings.energy
  
  type RESOURCE_ESSENCE = typingsSlinky.screeps.screepsStrings.essence
  
  type RESOURCE_EXTRACT = typingsSlinky.screeps.screepsStrings.extract
  
  type RESOURCE_FIXTURES = typingsSlinky.screeps.screepsStrings.fixtures
  
  type RESOURCE_FRAME = typingsSlinky.screeps.screepsStrings.frame
  
  type RESOURCE_GHODIUM = typingsSlinky.screeps.screepsStrings.G
  
  type RESOURCE_GHODIUM_ACID = typingsSlinky.screeps.screepsStrings.GH2O
  
  type RESOURCE_GHODIUM_ALKALIDE = typingsSlinky.screeps.screepsStrings.GHO2
  
  type RESOURCE_GHODIUM_HYDRIDE = typingsSlinky.screeps.screepsStrings.GH
  
  type RESOURCE_GHODIUM_MELT = typingsSlinky.screeps.screepsStrings.ghodium_melt
  
  type RESOURCE_GHODIUM_OXIDE = typingsSlinky.screeps.screepsStrings.GO
  
  type RESOURCE_HYDRAULICS = typingsSlinky.screeps.screepsStrings.hydraulics
  
  type RESOURCE_HYDROGEN = typingsSlinky.screeps.screepsStrings.H
  
  type RESOURCE_HYDROXIDE = typingsSlinky.screeps.screepsStrings.OH
  
  type RESOURCE_KEANIUM = typingsSlinky.screeps.screepsStrings.K
  
  type RESOURCE_KEANIUM_ACID = typingsSlinky.screeps.screepsStrings.KH2O
  
  type RESOURCE_KEANIUM_ALKALIDE = typingsSlinky.screeps.screepsStrings.KHO2
  
  type RESOURCE_KEANIUM_BAR = typingsSlinky.screeps.screepsStrings.keanium_bar
  
  type RESOURCE_KEANIUM_HYDRIDE = typingsSlinky.screeps.screepsStrings.KH
  
  type RESOURCE_KEANIUM_OXIDE = typingsSlinky.screeps.screepsStrings.KO
  
  type RESOURCE_LEMERGIUM = typingsSlinky.screeps.screepsStrings.L
  
  type RESOURCE_LEMERGIUM_ACID = typingsSlinky.screeps.screepsStrings.LH2O
  
  type RESOURCE_LEMERGIUM_ALKALIDE = typingsSlinky.screeps.screepsStrings.LHO2
  
  type RESOURCE_LEMERGIUM_BAR = typingsSlinky.screeps.screepsStrings.lemergium_bar
  
  type RESOURCE_LEMERGIUM_HYDRIDE = typingsSlinky.screeps.screepsStrings.LH
  
  type RESOURCE_LEMERGIUM_OXIDE = typingsSlinky.screeps.screepsStrings.LO
  
  type RESOURCE_LIQUID = typingsSlinky.screeps.screepsStrings.liquid
  
  type RESOURCE_MACHINE = typingsSlinky.screeps.screepsStrings.machine
  
  type RESOURCE_METAL = typingsSlinky.screeps.screepsStrings.metal
  
  type RESOURCE_MICROCHIP = typingsSlinky.screeps.screepsStrings.microchip
  
  type RESOURCE_MIST = typingsSlinky.screeps.screepsStrings.mist
  
  type RESOURCE_MUSCLE = typingsSlinky.screeps.screepsStrings.muscle
  
  type RESOURCE_OPS = typingsSlinky.screeps.screepsStrings.ops
  
  type RESOURCE_ORGANISM = typingsSlinky.screeps.screepsStrings.organism
  
  type RESOURCE_ORGANOID = typingsSlinky.screeps.screepsStrings.organoid
  
  type RESOURCE_OXIDANT = typingsSlinky.screeps.screepsStrings.oxidant
  
  type RESOURCE_OXYGEN = typingsSlinky.screeps.screepsStrings.O
  
  type RESOURCE_PHLEGM = typingsSlinky.screeps.screepsStrings.phlegm
  
  type RESOURCE_POWER = typingsSlinky.screeps.screepsStrings.power
  
  type RESOURCE_PURIFIER = typingsSlinky.screeps.screepsStrings.purifier
  
  type RESOURCE_REDUCTANT = typingsSlinky.screeps.screepsStrings.reductant
  
  type RESOURCE_SILICON = typingsSlinky.screeps.screepsStrings.silicon
  
  type RESOURCE_SPIRIT = typingsSlinky.screeps.screepsStrings.spirit
  
  type RESOURCE_SWITCH = typingsSlinky.screeps.screepsStrings.switch
  
  type RESOURCE_TISSUE = typingsSlinky.screeps.screepsStrings.tissue
  
  type RESOURCE_TRANSISTOR = typingsSlinky.screeps.screepsStrings.transistor
  
  type RESOURCE_TUBE = typingsSlinky.screeps.screepsStrings.tube
  
  type RESOURCE_UTRIUM = typingsSlinky.screeps.screepsStrings.U
  
  type RESOURCE_UTRIUM_ACID = typingsSlinky.screeps.screepsStrings.UH2O
  
  type RESOURCE_UTRIUM_ALKALIDE = typingsSlinky.screeps.screepsStrings.UHO2
  
  type RESOURCE_UTRIUM_BAR = typingsSlinky.screeps.screepsStrings.utrium_bar
  
  type RESOURCE_UTRIUM_HYDRIDE = typingsSlinky.screeps.screepsStrings.UH
  
  type RESOURCE_UTRIUM_LEMERGITE = typingsSlinky.screeps.screepsStrings.UL
  
  type RESOURCE_UTRIUM_OXIDE = typingsSlinky.screeps.screepsStrings.UO
  
  type RESOURCE_WIRE = typingsSlinky.screeps.screepsStrings.wire
  
  type RESOURCE_ZYNTHIUM = typingsSlinky.screeps.screepsStrings.Z
  
  type RESOURCE_ZYNTHIUM_ACID = typingsSlinky.screeps.screepsStrings.ZH2O
  
  type RESOURCE_ZYNTHIUM_ALKALIDE = typingsSlinky.screeps.screepsStrings.ZHO2
  
  type RESOURCE_ZYNTHIUM_BAR = typingsSlinky.screeps.screepsStrings.zynthium_bar
  
  type RESOURCE_ZYNTHIUM_HYDRIDE = typingsSlinky.screeps.screepsStrings.ZH
  
  type RESOURCE_ZYNTHIUM_KEANITE = typingsSlinky.screeps.screepsStrings.ZK
  
  type RESOURCE_ZYNTHIUM_OXIDE = typingsSlinky.screeps.screepsStrings.ZO
  
  type RIGHT = typingsSlinky.screeps.screepsNumbers.`3`
  
  // Resource Constants
  type ResourceConstant = typingsSlinky.screeps.RESOURCE_ENERGY | typingsSlinky.screeps.RESOURCE_POWER | typingsSlinky.screeps.RESOURCE_OPS | typingsSlinky.screeps.MineralConstant | typingsSlinky.screeps.MineralCompoundConstant | typingsSlinky.screeps.DepositConstant | typingsSlinky.screeps.CommodityConstant
  
  type STRUCTURE_CONTAINER = typingsSlinky.screeps.screepsStrings.container
  
  type STRUCTURE_CONTROLLER = typingsSlinky.screeps.screepsStrings.controller
  
  type STRUCTURE_EXTENSION = typingsSlinky.screeps.screepsStrings.extension
  
  type STRUCTURE_EXTRACTOR = typingsSlinky.screeps.screepsStrings.extractor
  
  type STRUCTURE_FACTORY = typingsSlinky.screeps.screepsStrings.factory
  
  type STRUCTURE_INVADER_CORE = typingsSlinky.screeps.screepsStrings.invaderCore
  
  type STRUCTURE_KEEPER_LAIR = typingsSlinky.screeps.screepsStrings.keeperLair
  
  type STRUCTURE_LAB = typingsSlinky.screeps.screepsStrings.lab
  
  type STRUCTURE_LINK = typingsSlinky.screeps.screepsStrings.link
  
  type STRUCTURE_NUKER = typingsSlinky.screeps.screepsStrings.nuker
  
  type STRUCTURE_OBSERVER = typingsSlinky.screeps.screepsStrings.observer
  
  type STRUCTURE_PORTAL = typingsSlinky.screeps.screepsStrings.portal
  
  type STRUCTURE_POWER_BANK = typingsSlinky.screeps.screepsStrings.powerBank
  
  type STRUCTURE_POWER_SPAWN = typingsSlinky.screeps.screepsStrings.powerSpawn
  
  type STRUCTURE_RAMPART = typingsSlinky.screeps.screepsStrings.rampart
  
  type STRUCTURE_ROAD = typingsSlinky.screeps.screepsStrings.road
  
  type STRUCTURE_SPAWN = typingsSlinky.screeps.screepsStrings.spawn
  
  type STRUCTURE_STORAGE = typingsSlinky.screeps.screepsStrings.storage
  
  type STRUCTURE_TERMINAL = typingsSlinky.screeps.screepsStrings.terminal
  
  type STRUCTURE_TOWER = typingsSlinky.screeps.screepsStrings.tower
  
  type STRUCTURE_WALL = typingsSlinky.screeps.screepsStrings.constructedWall
  
  type SUBSCRIPTION_TOKEN = typingsSlinky.screeps.screepsStrings.token
  
  // Return Codes
  type ScreepsReturnCode = typingsSlinky.screeps.OK | typingsSlinky.screeps.ERR_NOT_OWNER | typingsSlinky.screeps.ERR_NO_PATH | typingsSlinky.screeps.ERR_BUSY | typingsSlinky.screeps.ERR_NAME_EXISTS | typingsSlinky.screeps.ERR_NOT_FOUND | typingsSlinky.screeps.ERR_NOT_ENOUGH_RESOURCES | typingsSlinky.screeps.ERR_NOT_ENOUGH_ENERGY | typingsSlinky.screeps.ERR_INVALID_TARGET | typingsSlinky.screeps.ERR_FULL | typingsSlinky.screeps.ERR_NOT_IN_RANGE | typingsSlinky.screeps.ERR_INVALID_ARGS | typingsSlinky.screeps.ERR_TIRED | typingsSlinky.screeps.ERR_NO_BODYPART | typingsSlinky.screeps.ERR_NOT_ENOUGH_EXTENSIONS | typingsSlinky.screeps.ERR_RCL_NOT_ENOUGH | typingsSlinky.screeps.ERR_GCL_NOT_ENOUGH
  
  type Store[POSSIBLE_RESOURCES /* <: typingsSlinky.screeps.ResourceConstant */, UNLIMITED_STORE /* <: scala.Boolean */] = (typingsSlinky.screeps.StoreBase[POSSIBLE_RESOURCES, UNLIMITED_STORE]) with typingsSlinky.screeps.screepsStrings.Store with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type StructureConstant = typingsSlinky.screeps.BuildableStructureConstant | typingsSlinky.screeps.STRUCTURE_KEEPER_LAIR | typingsSlinky.screeps.STRUCTURE_CONTROLLER | typingsSlinky.screeps.STRUCTURE_POWER_BANK | typingsSlinky.screeps.STRUCTURE_PORTAL | typingsSlinky.screeps.STRUCTURE_INVADER_CORE
  
  type TERRAIN_MASK_LAVA = typingsSlinky.screeps.screepsNumbers.`4`
  
  type TERRAIN_MASK_SWAMP = typingsSlinky.screeps.screepsNumbers.`2`
  
  // Terrain mask constants
  type TERRAIN_MASK_WALL = typingsSlinky.screeps.screepsNumbers.`1`
  
  type TOMBSTONE_DECAY_PER_PART = typingsSlinky.screeps.screepsNumbers.`5`
  
  type TOP = typingsSlinky.screeps.screepsNumbers.`1`
  
  type TOP_LEFT = typingsSlinky.screeps.screepsNumbers.`8`
  
  type TOP_RIGHT = typingsSlinky.screeps.screepsNumbers.`2`
  
  type TOUGH = typingsSlinky.screeps.screepsStrings.tough
  
  type WORK = typingsSlinky.screeps.screepsStrings.work
}

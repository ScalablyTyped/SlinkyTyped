package typingsSlinky.screeps

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
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

@JSGlobal("Memory")
@js.native
object Memory extends TopLevel[Memory]


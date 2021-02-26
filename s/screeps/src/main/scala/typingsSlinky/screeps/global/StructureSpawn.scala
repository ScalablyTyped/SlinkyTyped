package typingsSlinky.screeps.global

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.screeps.Id
import typingsSlinky.screeps.StructureSpawnConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("StructureSpawn")
@js.native
class StructureSpawn protected ()
  extends typingsSlinky.screeps.StructureSpawn {
  def this(id: Id[typingsSlinky.screeps.StructureSpawn]) = this()
}
object StructureSpawn extends Shortcut {
  
  @JSGlobal("StructureSpawn")
  @js.native
  val ^ : StructureSpawnConstructor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("StructureSpawn.Spawning")
  @js.native
  class Spawning protected ()
    extends typingsSlinky.screeps.Spawning {
    def this(id: Id[typingsSlinky.screeps.Spawning]) = this()
  }
  
  type _To = StructureSpawnConstructor
  
  /* This means you don't have to write `^`, but can instead just say `StructureSpawn.foo` */
  override def _to: StructureSpawnConstructor = ^
}

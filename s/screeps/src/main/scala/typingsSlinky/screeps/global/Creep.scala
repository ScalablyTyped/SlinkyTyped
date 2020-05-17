package typingsSlinky.screeps.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.screeps.CreepConstructor
import typingsSlinky.screeps.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Creep")
@js.native
class Creep protected ()
  extends typingsSlinky.screeps.Creep {
  def this(id: Id[typingsSlinky.screeps.Creep]) = this()
}

@JSGlobal("Creep")
@js.native
object Creep extends TopLevel[CreepConstructor]


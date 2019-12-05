package typingsSlinky.unlDashCore.unlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSImport("unl-core", "Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait East extends Direction
  
  @js.native
  sealed trait North extends Direction
  
  @js.native
  sealed trait South extends Direction
  
  @js.native
  sealed trait West extends Direction
  
  /* "E" */ val East: typingsSlinky.unlDashCore.unlDashCoreMod.Direction.East with String = js.native
  /* "N" */ val North: typingsSlinky.unlDashCore.unlDashCoreMod.Direction.North with String = js.native
  /* "S" */ val South: typingsSlinky.unlDashCore.unlDashCoreMod.Direction.South with String = js.native
  /* "W" */ val West: typingsSlinky.unlDashCore.unlDashCoreMod.Direction.West with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Direction with String] = js.native
}


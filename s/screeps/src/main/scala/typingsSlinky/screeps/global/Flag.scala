package typingsSlinky.screeps.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.screeps.ColorConstant
import typingsSlinky.screeps.FlagConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Flag")
@js.native
class Flag protected ()
  extends typingsSlinky.screeps.Flag {
  def this(
    name: String,
    color: ColorConstant,
    secondaryColor: ColorConstant,
    roomName: String,
    x: Double,
    y: Double
  ) = this()
}

@JSGlobal("Flag")
@js.native
object Flag extends TopLevel[FlagConstructor]


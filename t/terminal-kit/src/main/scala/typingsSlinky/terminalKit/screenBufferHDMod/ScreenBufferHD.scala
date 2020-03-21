package typingsSlinky.terminalKit.screenBufferHDMod

import typingsSlinky.terminalKit.AnonAttrChar
import typingsSlinky.terminalKit.AnonBlending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenBufferHD
  extends typingsSlinky.terminalKit.screenBufferMod.^ {
  @JSName("blending")
  val blending_ScreenBufferHD: IsBlending = js.native
  def draw(options: AnonBlending): Unit = js.native
  def fill(options: AnonAttrChar): Unit = js.native
}


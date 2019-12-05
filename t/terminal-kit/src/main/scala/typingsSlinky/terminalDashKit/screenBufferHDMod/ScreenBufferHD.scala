package typingsSlinky.terminalDashKit.screenBufferHDMod

import typingsSlinky.terminalDashKit.Anon_AttrCharAttributes
import typingsSlinky.terminalDashKit.Anon_Blending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenBufferHD
  extends typingsSlinky.terminalDashKit.screenBufferMod.^ {
  @JSName("blending")
  val blending_ScreenBufferHD: IsBlending = js.native
  def draw(options: Anon_Blending): Unit = js.native
  def fill(options: Anon_AttrCharAttributes): Unit = js.native
}


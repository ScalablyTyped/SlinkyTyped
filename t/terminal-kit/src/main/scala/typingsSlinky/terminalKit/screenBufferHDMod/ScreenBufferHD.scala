package typingsSlinky.terminalKit.screenBufferHDMod

import typingsSlinky.terminalKit.anon.AttrChar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenBufferHD
  extends typingsSlinky.terminalKit.screenBufferMod.^ {
  
  @JSName("blending")
  val blending_ScreenBufferHD: IsBlending = js.native
  
  def draw(options: typingsSlinky.terminalKit.anon.Blending): Unit = js.native
  
  def fill(options: AttrChar): Unit = js.native
}

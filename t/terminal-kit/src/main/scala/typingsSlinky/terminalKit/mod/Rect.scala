package typingsSlinky.terminalKit.mod

import typingsSlinky.terminalKit.anon.DstRect
import typingsSlinky.terminalKit.rectMod.AbsoluteOptions
import typingsSlinky.terminalKit.rectMod.Region
import typingsSlinky.terminalKit.rectMod.^
import typingsSlinky.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("terminal-kit", "Rect")
@js.native
class Rect protected () extends ^ {
  def this(options: AbsoluteOptions) = this()
  def this(options: typingsSlinky.terminalKit.rectMod.Rect) = this()
  def this(options: Region) = this()
  def this(options: typingsSlinky.terminalKit.screenBufferMod.^) = this()
  def this(options: Terminal) = this()
  def this(options: typingsSlinky.terminalKit.textBufferMod.^) = this()
  def this(xmin: Double, xmax: Double, ymin: Double, ymax: Double) = this()
}
/* static members */
@JSImport("terminal-kit", "Rect")
@js.native
object Rect extends js.Object {
  
  def wrappingRect(params: DstRect): Unit = js.native
}

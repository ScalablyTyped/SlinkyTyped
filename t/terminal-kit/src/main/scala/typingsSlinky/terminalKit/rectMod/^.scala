package typingsSlinky.terminalKit.rectMod

import typingsSlinky.terminalKit.anon.DstRect
import typingsSlinky.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("terminal-kit/Rect", JSImport.Namespace)
@js.native
class ^ protected () extends Rect {
  def this(options: AbsoluteOptions) = this()
  def this(options: Rect) = this()
  def this(options: Region) = this()
  def this(options: typingsSlinky.terminalKit.screenBufferMod.^) = this()
  def this(options: Terminal) = this()
  def this(options: typingsSlinky.terminalKit.textBufferMod.^) = this()
  def this(xmin: Double, xmax: Double, ymin: Double, ymax: Double) = this()
}

@JSImport("terminal-kit/Rect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def wrappingRect(params: DstRect): Unit = js.native
}


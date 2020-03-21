package typingsSlinky.seen.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.seen.AnonFill
import typingsSlinky.seen.AnonStroke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "CanvasStyler")
@js.native
class CanvasStyler protected () extends js.Object {
  def this(ctx: CanvasRenderingContext2D) = this()
  def draw(): this.type = js.native
  def draw(style: AnonStroke): this.type = js.native
  def fill(): this.type = js.native
  def fill(style: AnonFill): this.type = js.native
}


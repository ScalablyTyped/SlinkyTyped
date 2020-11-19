package typingsSlinky.seen.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.seen.anon.Fill
import typingsSlinky.seen.anon.Stroke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "CanvasStyler")
@js.native
class CanvasStyler protected () extends js.Object {
  def this(ctx: CanvasRenderingContext2D) = this()
  
  def draw(): this.type = js.native
  def draw(style: Stroke): this.type = js.native
  
  def fill(): this.type = js.native
  def fill(style: Fill): this.type = js.native
}

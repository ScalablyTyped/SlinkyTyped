package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.Vex.IFont
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Cache
import typingsSlinky.vexflow.anon.Outline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Glyph")
@js.native
class Glyph protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Glyph {
  def this(code: String, point: Double) = this()
  def this(code: String, point: Double, options: Cache) = this()
}
/* static members */
@JSGlobal("Vex.Flow.Glyph")
@js.native
object Glyph extends js.Object {
  
  def loadMetrics(font: IFont, code: String, cache: Boolean): Outline = js.native
  
  def renderOutline(ctx: IRenderContext, outline: js.Array[Double], scale: Double, x_pos: Double, y_pos: Double): Unit = js.native
}

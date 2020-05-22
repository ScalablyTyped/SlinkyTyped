package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.Vex.IFont
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Cache
import typingsSlinky.vexflow.anon.Outline
import typingsSlinky.vexflow.anon.Xmax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Glyph")
@js.native
class Glyph protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Glyph {
  def this(code: String, point: Double) = this()
  def this(code: String, point: Double, options: Cache) = this()
  /* CompleteClass */
  override def getContext(): IRenderContext = js.native
  /* CompleteClass */
  override def getMetrics(): Xmax = js.native
  /* CompleteClass */
  override def render(ctx: IRenderContext, x_pos: Double, y_pos: Double): Unit = js.native
  /* CompleteClass */
  override def renderToStave(x: Double): Unit = js.native
  /* CompleteClass */
  override def reset(): Unit = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsSlinky.vexflow.Vex.Flow.Glyph = js.native
  /* CompleteClass */
  override def setOptions(options: Cache): Unit = js.native
  /* CompleteClass */
  override def setStave(stave: typingsSlinky.vexflow.Vex.Flow.Stave): typingsSlinky.vexflow.Vex.Flow.Glyph = js.native
  /* CompleteClass */
  override def setWidth(width: Double): typingsSlinky.vexflow.Vex.Flow.Glyph = js.native
  /* CompleteClass */
  override def setXShift(x_shift: Double): typingsSlinky.vexflow.Vex.Flow.Glyph = js.native
  /* CompleteClass */
  override def setYShift(y_shift: Double): typingsSlinky.vexflow.Vex.Flow.Glyph = js.native
}

/* static members */
@JSImport("vexflow", "Flow.Glyph")
@js.native
object Glyph extends js.Object {
  def loadMetrics(font: IFont, code: String, cache: Boolean): Outline = js.native
  def renderOutline(ctx: IRenderContext, outline: js.Array[Double], scale: Double, x_pos: Double, y_pos: Double): Unit = js.native
}


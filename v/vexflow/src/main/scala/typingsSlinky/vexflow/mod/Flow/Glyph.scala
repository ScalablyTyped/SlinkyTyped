package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.Vex.IFont
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Cache
import typingsSlinky.vexflow.anon.Outline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Glyph")
@js.native
class Glyph protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Glyph {
  def this(code: String, point: Double) = this()
  def this(code: String, point: Double, options: Cache) = this()
}
object Glyph {
  
  /* static member */
  @JSImport("vexflow", "Flow.Glyph.loadMetrics")
  @js.native
  def loadMetrics(font: IFont, code: String, cache: Boolean): Outline = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.Glyph.renderOutline")
  @js.native
  def renderOutline(ctx: IRenderContext, outline: js.Array[Double], scale: Double, x_pos: Double, y_pos: Double): Unit = js.native
}

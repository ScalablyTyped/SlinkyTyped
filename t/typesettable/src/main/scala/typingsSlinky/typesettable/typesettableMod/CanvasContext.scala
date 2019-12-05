package typingsSlinky.typesettable.typesettableMod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.typesettable.buildSrcContextsCanvasMod.ICanvasFontStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "CanvasContext")
@js.native
class CanvasContext protected ()
  extends typingsSlinky.typesettable.buildSrcContextsMod.CanvasContext {
  def this(ctx: CanvasRenderingContext2D) = this()
  def this(ctx: CanvasRenderingContext2D, lineHeight: Double) = this()
  def this(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle) = this()
}


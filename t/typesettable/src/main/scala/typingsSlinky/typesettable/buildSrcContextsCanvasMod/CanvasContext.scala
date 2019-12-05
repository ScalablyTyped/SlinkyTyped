package typingsSlinky.typesettable.buildSrcContextsCanvasMod

import typingsSlinky.std.CanvasRenderingContext2D
import typingsSlinky.typesettable.buildSrcContextsMod.IPenFactoryContext
import typingsSlinky.typesettable.buildSrcContextsMod.IRulerFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts/canvas", "CanvasContext")
@js.native
class CanvasContext protected ()
  extends IPenFactoryContext[CanvasRenderingContext2D]
     with IRulerFactoryContext {
  def this(ctx: org.scalajs.dom.raw.CanvasRenderingContext2D) = this()
  def this(ctx: org.scalajs.dom.raw.CanvasRenderingContext2D, lineHeight: Double) = this()
  def this(ctx: org.scalajs.dom.raw.CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle) = this()
  var ctx: js.Any = js.native
  var lineHeight: js.Any = js.native
  var style: js.Any = js.native
  /* private */ def createCanvasPen(ctx: js.Any): js.Any = js.native
}


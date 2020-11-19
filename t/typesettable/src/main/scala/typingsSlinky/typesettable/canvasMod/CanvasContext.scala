package typingsSlinky.typesettable.canvasMod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.typesettable.contextsMod.IPenFactoryContext
import typingsSlinky.typesettable.contextsMod.IRulerFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typesettable/build/src/contexts/canvas", "CanvasContext")
@js.native
class CanvasContext protected ()
  extends IPenFactoryContext[CanvasRenderingContext2D]
     with IRulerFactoryContext {
  def this(ctx: CanvasRenderingContext2D) = this()
  def this(ctx: CanvasRenderingContext2D, lineHeight: Double) = this()
  def this(ctx: CanvasRenderingContext2D, lineHeight: js.UndefOr[scala.Nothing], style: ICanvasFontStyle) = this()
  def this(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle) = this()
  
  /* private */ def createCanvasPen(ctx: js.Any): js.Any = js.native
  
  var ctx: js.Any = js.native
  
  var lineHeight: js.Any = js.native
  
  var style: js.Any = js.native
}

package typingsSlinky.typesettable.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.typesettable.canvasMod.ICanvasFontStyle
import typingsSlinky.typesettable.contextsMod.ITypesetterContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "Typesetter")
@js.native
class Typesetter protected ()
  extends typingsSlinky.typesettable.typesetterMod.Typesetter {
  def this(context: ITypesetterContext[_]) = this()
}

/* static members */
@JSImport("typesettable", "Typesetter")
@js.native
object Typesetter extends js.Object {
  def canvas(ctx: CanvasRenderingContext2D): typingsSlinky.typesettable.typesetterMod.Typesetter = js.native
  def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double): typingsSlinky.typesettable.typesetterMod.Typesetter = js.native
  def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle): typingsSlinky.typesettable.typesetterMod.Typesetter = js.native
  def html(element: HTMLElement): typingsSlinky.typesettable.typesetterMod.Typesetter = js.native
  def html(element: HTMLElement, className: String): typingsSlinky.typesettable.typesetterMod.Typesetter = js.native
  def html(element: HTMLElement, className: String, addTitle: Boolean): typingsSlinky.typesettable.typesetterMod.Typesetter = js.native
  def svg(element: SVGElement): typingsSlinky.typesettable.typesetterMod.Typesetter = js.native
  def svg(element: SVGElement, className: String): typingsSlinky.typesettable.typesetterMod.Typesetter = js.native
  def svg(element: SVGElement, className: String, addTitleElement: Boolean): typingsSlinky.typesettable.typesetterMod.Typesetter = js.native
}


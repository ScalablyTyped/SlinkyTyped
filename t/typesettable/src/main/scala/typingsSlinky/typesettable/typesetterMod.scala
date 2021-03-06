package typingsSlinky.typesettable

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.typesettable.canvasMod.ICanvasFontStyle
import typingsSlinky.typesettable.contextsMod.ITypesetterContext
import typingsSlinky.typesettable.measurersMod.CacheMeasurer
import typingsSlinky.typesettable.wrappersMod.Wrapper
import typingsSlinky.typesettable.writerMod.IWriteOptions
import typingsSlinky.typesettable.writersMod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesetterMod {
  
  @JSImport("typesettable/build/src/typesetter", "Typesetter")
  @js.native
  class Typesetter protected () extends StObject {
    def this(context: ITypesetterContext[_]) = this()
    
    /**
      * Clears the `Measurer`'s CacheMeasurer.
      *
      * Call this if your font style changee in SVG.
      */
    def clearMeasurerCache(): Unit = js.native
    
    var context: js.Any = js.native
    
    var measurer: CacheMeasurer = js.native
    
    var wrapper: Wrapper = js.native
    
    /**
      * Wraps the given string into the width/height and writes it into the
      * canvas or SVG (depending on context).
      *
      * Delegates to `Writer.write` using the internal `ITypesetterContext`.
      */
    def write(text: String, width: Double, height: Double): Unit = js.native
    def write(text: String, width: Double, height: Double, options: js.UndefOr[scala.Nothing], into: js.Any): Unit = js.native
    def write(text: String, width: Double, height: Double, options: IWriteOptions): Unit = js.native
    def write(text: String, width: Double, height: Double, options: IWriteOptions, into: js.Any): Unit = js.native
    
    var writer: Writer = js.native
  }
  /* static members */
  object Typesetter {
    
    @JSImport("typesettable/build/src/typesetter", "Typesetter.canvas")
    @js.native
    def canvas(ctx: CanvasRenderingContext2D): Typesetter = js.native
    @JSImport("typesettable/build/src/typesetter", "Typesetter.canvas")
    @js.native
    def canvas(ctx: CanvasRenderingContext2D, lineHeight: js.UndefOr[scala.Nothing], style: ICanvasFontStyle): Typesetter = js.native
    @JSImport("typesettable/build/src/typesetter", "Typesetter.canvas")
    @js.native
    def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double): Typesetter = js.native
    @JSImport("typesettable/build/src/typesetter", "Typesetter.canvas")
    @js.native
    def canvas(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle): Typesetter = js.native
    
    @JSImport("typesettable/build/src/typesetter", "Typesetter.html")
    @js.native
    def html(element: HTMLElement): Typesetter = js.native
    @JSImport("typesettable/build/src/typesetter", "Typesetter.html")
    @js.native
    def html(element: HTMLElement, className: js.UndefOr[scala.Nothing], addTitle: Boolean): Typesetter = js.native
    @JSImport("typesettable/build/src/typesetter", "Typesetter.html")
    @js.native
    def html(element: HTMLElement, className: String): Typesetter = js.native
    @JSImport("typesettable/build/src/typesetter", "Typesetter.html")
    @js.native
    def html(element: HTMLElement, className: String, addTitle: Boolean): Typesetter = js.native
    
    @JSImport("typesettable/build/src/typesetter", "Typesetter.svg")
    @js.native
    def svg(element: SVGElement): Typesetter = js.native
    @JSImport("typesettable/build/src/typesetter", "Typesetter.svg")
    @js.native
    def svg(element: SVGElement, className: js.UndefOr[scala.Nothing], addTitleElement: Boolean): Typesetter = js.native
    @JSImport("typesettable/build/src/typesetter", "Typesetter.svg")
    @js.native
    def svg(element: SVGElement, className: String): Typesetter = js.native
    @JSImport("typesettable/build/src/typesetter", "Typesetter.svg")
    @js.native
    def svg(element: SVGElement, className: String, addTitleElement: Boolean): Typesetter = js.native
  }
}

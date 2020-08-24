package typingsSlinky.typesettable

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.std.SVGGraphicsElement
import typingsSlinky.typesettable.abstractMeasurerMod.IDimensions
import typingsSlinky.typesettable.abstractMeasurerMod.IRuler
import typingsSlinky.typesettable.abstractMeasurerMod.IRulerFactory
import typingsSlinky.typesettable.canvasMod.ICanvasFontStyle
import typingsSlinky.typesettable.writerMod.IPen
import typingsSlinky.typesettable.writerMod.IPenFactory
import typingsSlinky.typesettable.writerMod.ITransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts", JSImport.Namespace)
@js.native
object contextsMod extends js.Object {
  @js.native
  class CanvasContext protected ()
    extends typingsSlinky.typesettable.canvasMod.CanvasContext {
    def this(ctx: CanvasRenderingContext2D) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: js.UndefOr[scala.Nothing], style: ICanvasFontStyle) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle) = this()
  }
  
  @js.native
  class HtmlContext protected ()
    extends typingsSlinky.typesettable.htmlMod.HtmlContext {
    /**
      * @param element - The CSS font styles applied to `element` will determine the
      * size of text measurements. Also the default text block container.
      * @param className - added to new text blocks
      * @param addTitle - enable title attribute to be added to new text blocks.
      */
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, className: String) = this()
    def this(element: HTMLElement, className: js.UndefOr[scala.Nothing], addTitle: Boolean) = this()
    def this(element: HTMLElement, className: String, addTitle: Boolean) = this()
  }
  
  @js.native
  class HtmlUtils ()
    extends typingsSlinky.typesettable.htmlMod.HtmlUtils
  
  @js.native
  trait IPenFactoryContext[T] extends js.Object {
    @JSName("createPen")
    var createPen_Original: IPenFactory[T] = js.native
    def createPen(text: String, transform: ITransform): IPen = js.native
    def createPen(text: String, transform: ITransform, container: T): IPen = js.native
  }
  
  @js.native
  trait IRulerFactoryContext extends js.Object {
    @JSName("createRuler")
    var createRuler_Original: IRulerFactory = js.native
    def createRuler(): IRuler = js.native
  }
  
  @js.native
  trait ITypesetterContext[T]
    extends IPenFactoryContext[T]
       with IRulerFactoryContext
  
  @js.native
  class SvgContext protected ()
    extends typingsSlinky.typesettable.svgMod.SvgContext {
    def this(element: SVGElement) = this()
    def this(element: SVGElement, className: String) = this()
    def this(element: SVGElement, className: js.UndefOr[scala.Nothing], addTitleElement: Boolean) = this()
    def this(element: SVGElement, className: String, addTitleElement: Boolean) = this()
  }
  
  @js.native
  class SvgUtils ()
    extends typingsSlinky.typesettable.svgMod.SvgUtils
  
  /* static members */
  @js.native
  object HtmlUtils extends js.Object {
    /**
      * Adds the variadic classnames to the Element
      */
    def addClasses(element: Element, classNames: String*): Unit = js.native
    /**
      * Appends an HTML element with the specified tag name to the provided element.
      * The variadic classnames are added to the new element.
      *
      * Returns the new element.
      */
    def append(element: Element, tagName: String, classNames: String*): HTMLElement = js.native
    /**
      * Creates and returns a new HTMLElement with the attached classnames.
      */
    def create(tagName: String, classNames: String*): HTMLElement = js.native
    /**
      * Returns the width/height of HTMLElement's bounding box
      */
    def getDimensions(element: HTMLElement): IDimensions = js.native
  }
  
  /* static members */
  @js.native
  object SvgContext extends js.Object {
    var AnchorMap: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object SvgUtils extends js.Object {
    var SVG_NS: String = js.native
    /**
      * Appends an SVG element with the specified tag name to the provided element.
      * The variadic classnames are added to the new element.
      *
      * Returns the new element.
      */
    def append(element: Element, tagName: String, classNames: String*): SVGElement = js.native
    /**
      * Creates and returns a new SVGElement with the attached classnames.
      */
    def create(tagName: String, classNames: String*): SVGElement = js.native
    /**
      * Returns the width/height of svg element's bounding box
      */
    def getDimensions(element: SVGGraphicsElement): IDimensions = js.native
  }
  
}


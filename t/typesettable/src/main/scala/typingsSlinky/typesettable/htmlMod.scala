package typingsSlinky.typesettable

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.typesettable.abstractMeasurerMod.IDimensions
import typingsSlinky.typesettable.anon.Write
import typingsSlinky.typesettable.contextsMod.IPenFactoryContext
import typingsSlinky.typesettable.contextsMod.IRulerFactoryContext
import typingsSlinky.typesettable.writerMod.ITransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typesettable/build/src/contexts/html", JSImport.Namespace)
@js.native
object htmlMod extends js.Object {
  
  @js.native
  class HtmlContext protected ()
    extends IPenFactoryContext[HTMLElement]
       with IRulerFactoryContext {
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
    
    var addTitle: js.Any = js.native
    
    var className: js.Any = js.native
    
    /* private */ def createHtmlLinePen(textBlock: js.Any): js.Any = js.native
    
    def createPen(text: String, transform: ITransform, element: Element): Write = js.native
    
    var element: js.Any = js.native
    
    def setAddTitle(addTitle: Boolean): Unit = js.native
  }
  
  @js.native
  class HtmlUtils () extends js.Object
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
}

package typingsSlinky.typesettable

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.std.SVGGraphicsElement
import typingsSlinky.typesettable.abstractMeasurerMod.IDimensions
import typingsSlinky.typesettable.anon.Write
import typingsSlinky.typesettable.contextsMod.ITypesetterContext
import typingsSlinky.typesettable.writerMod.ITransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgMod {
  
  @JSImport("typesettable/build/src/contexts/svg", "SvgContext")
  @js.native
  class SvgContext protected () extends ITypesetterContext[SVGElement] {
    def this(element: SVGElement) = this()
    def this(element: SVGElement, className: String) = this()
    def this(element: SVGElement, className: js.UndefOr[scala.Nothing], addTitleElement: Boolean) = this()
    def this(element: SVGElement, className: String, addTitleElement: Boolean) = this()
    
    var addTitleElement: js.Any = js.native
    
    var className: js.Any = js.native
    
    def createPen(text: String, transform: ITransform, element: Element): Write = js.native
    
    /* private */ def createSvgLinePen(textBlockGroup: js.Any): js.Any = js.native
    
    var element: js.Any = js.native
    
    /* private */ def getTextElements(element: js.Any): js.Any = js.native
    
    def setAddTitleElement(addTitleElement: Boolean): Unit = js.native
  }
  /* static members */
  object SvgContext {
    
    @JSImport("typesettable/build/src/contexts/svg", "SvgContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable/build/src/contexts/svg", "SvgContext.AnchorMap")
    @js.native
    def AnchorMap: js.Any = js.native
    @scala.inline
    def AnchorMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnchorMap")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typesettable/build/src/contexts/svg", "SvgUtils")
  @js.native
  class SvgUtils () extends StObject
  /* static members */
  object SvgUtils {
    
    @JSImport("typesettable/build/src/contexts/svg", "SvgUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable/build/src/contexts/svg", "SvgUtils.SVG_NS")
    @js.native
    def SVG_NS: String = js.native
    @scala.inline
    def SVG_NS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SVG_NS")(x.asInstanceOf[js.Any])
    
    /**
      * Appends an SVG element with the specified tag name to the provided element.
      * The variadic classnames are added to the new element.
      *
      * Returns the new element.
      */
    @JSImport("typesettable/build/src/contexts/svg", "SvgUtils.append")
    @js.native
    def append(element: Element, tagName: String, classNames: String*): SVGElement = js.native
    
    /**
      * Creates and returns a new SVGElement with the attached classnames.
      */
    @JSImport("typesettable/build/src/contexts/svg", "SvgUtils.create")
    @js.native
    def create(tagName: String, classNames: String*): SVGElement = js.native
    
    /**
      * Returns the width/height of svg element's bounding box
      */
    @JSImport("typesettable/build/src/contexts/svg", "SvgUtils.getDimensions")
    @js.native
    def getDimensions(element: SVGGraphicsElement): IDimensions = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typesettable.typesettableStrings.start
    - typingsSlinky.typesettable.typesettableStrings.middle
    - typingsSlinky.typesettable.typesettableStrings.end
  */
  trait IAnchor extends StObject
  object IAnchor {
    
    @scala.inline
    def end: typingsSlinky.typesettable.typesettableStrings.end = "end".asInstanceOf[typingsSlinky.typesettable.typesettableStrings.end]
    
    @scala.inline
    def middle: typingsSlinky.typesettable.typesettableStrings.middle = "middle".asInstanceOf[typingsSlinky.typesettable.typesettableStrings.middle]
    
    @scala.inline
    def start: typingsSlinky.typesettable.typesettableStrings.start = "start".asInstanceOf[typingsSlinky.typesettable.typesettableStrings.start]
  }
}

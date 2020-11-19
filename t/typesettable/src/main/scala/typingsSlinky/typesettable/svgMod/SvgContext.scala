package typingsSlinky.typesettable.svgMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.typesettable.anon.Write
import typingsSlinky.typesettable.contextsMod.IPenFactoryContext
import typingsSlinky.typesettable.contextsMod.IRulerFactoryContext
import typingsSlinky.typesettable.writerMod.ITransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typesettable/build/src/contexts/svg", "SvgContext")
@js.native
class SvgContext protected ()
  extends IPenFactoryContext[SVGElement]
     with IRulerFactoryContext {
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
@JSImport("typesettable/build/src/contexts/svg", "SvgContext")
@js.native
object SvgContext extends js.Object {
  
  var AnchorMap: js.Any = js.native
}

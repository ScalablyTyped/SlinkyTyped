package typingsSlinky.typesettable.buildSrcContextsSvgMod

import org.scalajs.dom.raw.Element
import typingsSlinky.std.SVGElement
import typingsSlinky.typesettable.Anon_Line
import typingsSlinky.typesettable.buildSrcContextsMod.IPenFactoryContext
import typingsSlinky.typesettable.buildSrcContextsMod.IRulerFactoryContext
import typingsSlinky.typesettable.buildSrcWritersWriterMod.ITransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts/svg", "SvgContext")
@js.native
class SvgContext protected ()
  extends IPenFactoryContext[SVGElement]
     with IRulerFactoryContext {
  def this(element: org.scalajs.dom.raw.SVGElement) = this()
  def this(element: org.scalajs.dom.raw.SVGElement, className: String) = this()
  def this(element: org.scalajs.dom.raw.SVGElement, className: String, addTitleElement: Boolean) = this()
  var addTitleElement: js.Any = js.native
  var className: js.Any = js.native
  var element: js.Any = js.native
  def createPen(text: String, transform: ITransform, element: Element): Anon_Line = js.native
  /* private */ def createSvgLinePen(textBlockGroup: js.Any): js.Any = js.native
  /* private */ def getTextElements(element: js.Any): js.Any = js.native
  def setAddTitleElement(addTitleElement: Boolean): Unit = js.native
}

/* static members */
@JSImport("typesettable/build/src/contexts/svg", "SvgContext")
@js.native
object SvgContext extends js.Object {
  var AnchorMap: js.Any = js.native
}


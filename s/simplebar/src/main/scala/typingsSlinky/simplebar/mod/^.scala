package typingsSlinky.simplebar.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.simplebar.PickWeakMapHTMLElementSim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simplebar", JSImport.Namespace)
@js.native
class ^ protected () extends SimpleBar {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: Options) = this()
  /* CompleteClass */
  override def getContentElement(): Element = js.native
  /* CompleteClass */
  override def getScrollElement(): Element = js.native
  /* CompleteClass */
  override def recalculate(): Unit = js.native
}

@JSImport("simplebar", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var instances: PickWeakMapHTMLElementSim = js.native
  def removeObserver(): Unit = js.native
}


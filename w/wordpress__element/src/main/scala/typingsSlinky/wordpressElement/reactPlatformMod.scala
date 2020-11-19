package typingsSlinky.wordpressElement

import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.react.mod.ReactPortal
import typingsSlinky.reactDom.mod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/element/build-types/react-platform", JSImport.Namespace)
@js.native
object reactPlatformMod extends js.Object {
  
  def createPortal(children: ReactElement, container: Element): ReactPortal = js.native
  def createPortal(children: ReactElement, container: Element, key: String): ReactPortal = js.native
  
  def findDOMNode(): Element | Null | Text = js.native
  def findDOMNode(instance: ReactInstance): Element | Null | Text = js.native
  
  val render: Renderer = js.native
  
  def unmountComponentAtNode(container: DocumentFragment): Boolean = js.native
  def unmountComponentAtNode(container: Element): Boolean = js.native
}

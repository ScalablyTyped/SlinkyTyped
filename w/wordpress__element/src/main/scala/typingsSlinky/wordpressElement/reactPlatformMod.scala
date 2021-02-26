package typingsSlinky.wordpressElement

import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.react.mod.ReactPortal
import typingsSlinky.reactDom.mod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactPlatformMod {
  
  @JSImport("@wordpress/element/build-types/react-platform", "createPortal")
  @js.native
  def createPortal(children: ReactElement, container: Element): ReactPortal = js.native
  @JSImport("@wordpress/element/build-types/react-platform", "createPortal")
  @js.native
  def createPortal(children: ReactElement, container: Element, key: String): ReactPortal = js.native
  
  @JSImport("@wordpress/element/build-types/react-platform", "findDOMNode")
  @js.native
  def findDOMNode(): Element | Null | Text = js.native
  @JSImport("@wordpress/element/build-types/react-platform", "findDOMNode")
  @js.native
  def findDOMNode(instance: ReactInstance): Element | Null | Text = js.native
  
  @JSImport("@wordpress/element/build-types/react-platform", "render")
  @js.native
  val render: Renderer = js.native
  
  @JSImport("@wordpress/element/build-types/react-platform", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: DocumentFragment): Boolean = js.native
  @JSImport("@wordpress/element/build-types/react-platform", "unmountComponentAtNode")
  @js.native
  def unmountComponentAtNode(container: Element): Boolean = js.native
}

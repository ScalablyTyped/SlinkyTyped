package typingsSlinky.singleDashSpaDashReact

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.react.reactMod.CElement
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.DOMAttributes
import typingsSlinky.react.reactMod.DOMElement
import typingsSlinky.react.reactMod.ReactElement
import typingsSlinky.react.reactMod.ReactInstance
import typingsSlinky.react.reactMod.ReactPortal
import typingsSlinky.reactDashDom.reactDashDomMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofReactDOM extends js.Object {
  val hydrate: Renderer = js.native
  val render: Renderer = js.native
  val version: String = js.native
  def createPortal(children: TagMod[Any], container: Element): ReactPortal = js.native
  def createPortal(children: TagMod[Any], container: Element, key: String): ReactPortal = js.native
  def findDOMNode(): Element | Null | Text = js.native
  def findDOMNode(instance: ReactInstance): Element | Null | Text = js.native
  def unmountComponentAtNode(container: Element): Boolean = js.native
  def unstable_batchedUpdates(callback: js.Function0[_]): Unit = js.native
  def unstable_batchedUpdates[A](callback: js.Function1[/* a */ A, _], a: A): Unit = js.native
  def unstable_batchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, _], a: A, b: B): Unit = js.native
  def unstable_renderSubtreeIntoContainer[T /* <: Element */](
    parentComponent: ReactComponentClass[_],
    element: DOMElement[DOMAttributes[T], T],
    container: Element
  ): T = js.native
  def unstable_renderSubtreeIntoContainer[T /* <: Element */](
    parentComponent: ReactComponentClass[_],
    element: DOMElement[DOMAttributes[T], T],
    container: Element,
    callback: js.Function1[/* element */ T, _]
  ): T = js.native
  def unstable_renderSubtreeIntoContainer[P](parentComponent: ReactComponentClass[_], element: ReactElement, container: Element): ReactComponentClass[P] | Element | Unit = js.native
  def unstable_renderSubtreeIntoContainer[P](
    parentComponent: ReactComponentClass[_],
    element: ReactElement,
    container: Element,
    callback: js.Function1[
      /* component */ js.UndefOr[(Component[P, ComponentState, _]) | typingsSlinky.std.Element], 
      _
    ]
  ): ReactComponentClass[P] | Element | Unit = js.native
  def unstable_renderSubtreeIntoContainer[P, T /* <: ReactComponentClass[P] */](parentComponent: ReactComponentClass[_], element: CElement[P, T], container: Element): T = js.native
  def unstable_renderSubtreeIntoContainer[P, T /* <: ReactComponentClass[P] */](
    parentComponent: ReactComponentClass[_],
    element: CElement[P, T],
    container: Element,
    callback: js.Function1[/* component */ T, _]
  ): T = js.native
}


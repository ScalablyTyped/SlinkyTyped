package typingsSlinky.skatejs.typesMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.Node
import typingsSlinky.std.AddEventListenerOptions
import typingsSlinky.std.EventListenerOrEventListenerObject
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("skatejs/types", "WithRenderer")
@js.native
class WithRenderer[O] ()
  extends HTMLElement
     with Renderer[O] {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  def render(): O = js.native
  def render(props: js.UndefOr[scala.Nothing], state: Mixed): O = js.native
  def render(props: Mixed): O = js.native
  def render(props: Mixed, state: Mixed): O = js.native
  
  // getter for turning off ShadowDOM
  def renderRoot: this.type | Mixed = js.native
  
  // called after render
  var rendered: js.UndefOr[js.Function0[Unit]] = js.native
  
  // Default renderer, returns string returned from render and adds it to root via innerHTML
  // -> override to get own renderer
  def renderer(root: Element, html: js.Function1[/* props */ js.UndefOr[Mixed], O]): Unit = js.native
  def renderer(root: Node, html: js.Function1[/* props */ js.UndefOr[Mixed], O]): Unit = js.native
  def renderer(root: ShadowRoot, html: js.Function1[/* props */ js.UndefOr[Mixed], O]): Unit = js.native
  
  // called before render
  var rendering: js.UndefOr[js.Function0[Unit]] = js.native
  
  def updated(): Unit = js.native
  def updated(props: js.UndefOr[scala.Nothing], state: Mixed): Unit = js.native
  def updated(props: Mixed): Unit = js.native
  def updated(props: Mixed, state: Mixed): Unit = js.native
}

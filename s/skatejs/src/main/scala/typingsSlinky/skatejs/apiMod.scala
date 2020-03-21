package typingsSlinky.skatejs

import typingsSlinky.skatejs.typesMod.ComposedCustomEvent
import typingsSlinky.skatejs.typesMod.Constructor
import typingsSlinky.skatejs.typesMod.CustomElement
import typingsSlinky.skatejs.typesMod.EventOptions
import typingsSlinky.skatejs.typesMod.HTMLElementClass
import typingsSlinky.skatejs.typesMod.PropOptions
import typingsSlinky.skatejs.typesMod.WithChildren
import typingsSlinky.skatejs.typesMod.WithComponent
import typingsSlinky.skatejs.typesMod.WithContext
import typingsSlinky.skatejs.typesMod.WithLifecycle
import typingsSlinky.skatejs.typesMod.WithRenderer
import typingsSlinky.skatejs.typesMod.WithUpdate
import typingsSlinky.std.EventTarget
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.PropertyDecorator
import typingsSlinky.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs/api", JSImport.Namespace)
@js.native
object apiMod extends js.Object {
  def define[T /* <: HTMLElementClass */](ctor: T): T = js.native
  def emit(elem: HTMLElementClass, eventName: String): Boolean = js.native
  def emit(elem: HTMLElementClass, eventName: String, eventOptions: EventOptions): Boolean = js.native
  def emit(elem: EventTarget, eventName: String): Boolean = js.native
  def emit(elem: EventTarget, eventName: String, eventOptions: EventOptions): Boolean = js.native
  def link(elem: CustomElement): js.Function1[/* e */ ComposedCustomEvent, Unit] = js.native
  def link(elem: CustomElement, target: String): js.Function1[/* e */ ComposedCustomEvent, Unit] = js.native
  def name(): String = js.native
  def name(componentName: String): String = js.native
  def prop(): PropertyDecorator with PropOptions[_] = js.native
  def prop(ops: PropOptions[_]): PropertyDecorator with PropOptions[_] = js.native
  def shadow(elem: CustomElement): ShadowRoot = js.native
  def shadow(elem: HTMLElement): ShadowRoot = js.native
  def withChildren[T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](): Constructor[WithChildren] with T = js.native
  def withChildren[T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](Base: T): Constructor[WithChildren] with T = js.native
  def withComponent[T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](): TypeofWithComponent = js.native
  def withComponent[T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](Base: T): TypeofWithComponent = js.native
  @JSName("withComponent")
  def withComponent_PSCT_ConstructorHTMLElement_Intersection[P, S, C, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](): (Constructor[WithComponent[P, S, C]]) with T = js.native
  @JSName("withComponent")
  def withComponent_PSCT_ConstructorHTMLElement_Intersection[P, S, C, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](Base: T): (Constructor[WithComponent[P, S, C]]) with T = js.native
  def withContext[C, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](): Constructor[WithContext[C]] with T = js.native
  def withContext[C, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](Base: T): Constructor[WithContext[C]] with T = js.native
  def withLifecycle[T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](): Constructor[WithLifecycle] with T = js.native
  def withLifecycle[T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](Base: T): Constructor[WithLifecycle] with T = js.native
  def withRenderer[O, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](): Constructor[WithRenderer[O]] with T = js.native
  def withRenderer[O, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](Base: T): Constructor[WithRenderer[O]] with T = js.native
  def withUpdate[P, S, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](): (Constructor[WithUpdate[P, S]]) with T = js.native
  def withUpdate[P, S, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](Base: T): (Constructor[WithUpdate[P, S]]) with T = js.native
  @js.native
  object props extends js.Object {
    def any(target: js.Object, propertyKey: String): Unit = js.native
    def any(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    def array(target: js.Object, propertyKey: String): Unit = js.native
    def array(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    def boolean(target: js.Object, propertyKey: String): Unit = js.native
    def boolean(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    def number(target: js.Object, propertyKey: String): Unit = js.native
    def number(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    def `object`(target: js.Object, propertyKey: String): Unit = js.native
    def `object`(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    def string(target: js.Object, propertyKey: String): Unit = js.native
    def string(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  }
  
}


package typingsSlinky.skatejs

import typingsSlinky.skatejs.typesMod.ComposedCustomEvent
import typingsSlinky.skatejs.typesMod.Constructor
import typingsSlinky.skatejs.typesMod.EventOptions
import typingsSlinky.skatejs.typesMod.HTMLElementClass
import typingsSlinky.skatejs.typesMod.PropOptions
import typingsSlinky.std.EventTarget
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.PropertyDecorator
import typingsSlinky.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs", JSImport.Namespace)
@js.native
object skatejsMod extends js.Object {
  @js.native
  class CustomElement ()
    extends typingsSlinky.skatejs.typesMod.CustomElement
  
  @js.native
  class WithChildren ()
    extends typingsSlinky.skatejs.typesMod.WithChildren
  
  @js.native
  class WithComponent[P, S, C] ()
    extends typingsSlinky.skatejs.typesMod.WithComponent[P, S, C]
  
  @js.native
  class WithContext[C] ()
    extends typingsSlinky.skatejs.typesMod.WithContext[C]
  
  @js.native
  class WithLifecycle ()
    extends typingsSlinky.skatejs.typesMod.WithLifecycle
  
  @js.native
  class WithRenderer[O] ()
    extends typingsSlinky.skatejs.typesMod.WithRenderer[O]
  
  @js.native
  class WithUpdate[P, S] ()
    extends typingsSlinky.skatejs.typesMod.WithUpdate[P, S]
  
  val props: Anon_Any = js.native
  def define[T /* <: HTMLElementClass */](ctor: T): T = js.native
  def emit(elem: HTMLElementClass, eventName: String): Boolean = js.native
  def emit(elem: HTMLElementClass, eventName: String, eventOptions: EventOptions): Boolean = js.native
  def emit(elem: EventTarget, eventName: String): Boolean = js.native
  def emit(elem: EventTarget, eventName: String, eventOptions: EventOptions): Boolean = js.native
  def link(elem: typingsSlinky.skatejs.typesMod.CustomElement): js.Function1[/* e */ ComposedCustomEvent, Unit] = js.native
  def link(elem: typingsSlinky.skatejs.typesMod.CustomElement, target: String): js.Function1[/* e */ ComposedCustomEvent, Unit] = js.native
  def name(): String = js.native
  def name(componentName: String): String = js.native
  def prop(): PropertyDecorator with PropOptions[_] = js.native
  def prop(ops: PropOptions[_]): PropertyDecorator with PropOptions[_] = js.native
  def shadow(elem: typingsSlinky.skatejs.typesMod.CustomElement): ShadowRoot = js.native
  def shadow(elem: HTMLElement): ShadowRoot = js.native
  def withChildren[T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](): Constructor[typingsSlinky.skatejs.typesMod.WithChildren] with T = js.native
  def withChildren[T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](Base: T): Constructor[typingsSlinky.skatejs.typesMod.WithChildren] with T = js.native
  def withComponent[T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](): TypeofClassWithComponent = js.native
  def withComponent[T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](Base: T): TypeofClassWithComponent = js.native
  @JSName("withComponent")
  def withComponent_PSCT_ConstructorHTMLElement_Intersection[P, S, C, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](): (Constructor[typingsSlinky.skatejs.typesMod.WithComponent[P, S, C]]) with T = js.native
  @JSName("withComponent")
  def withComponent_PSCT_ConstructorHTMLElement_Intersection[P, S, C, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](Base: T): (Constructor[typingsSlinky.skatejs.typesMod.WithComponent[P, S, C]]) with T = js.native
  def withContext[C, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](): Constructor[typingsSlinky.skatejs.typesMod.WithContext[C]] with T = js.native
  def withContext[C, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](Base: T): Constructor[typingsSlinky.skatejs.typesMod.WithContext[C]] with T = js.native
  def withLifecycle[T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](): Constructor[typingsSlinky.skatejs.typesMod.WithLifecycle] with T = js.native
  def withLifecycle[T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](Base: T): Constructor[typingsSlinky.skatejs.typesMod.WithLifecycle] with T = js.native
  def withRenderer[O, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](): Constructor[typingsSlinky.skatejs.typesMod.WithRenderer[O]] with T = js.native
  def withRenderer[O, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](Base: T): Constructor[typingsSlinky.skatejs.typesMod.WithRenderer[O]] with T = js.native
  def withUpdate[P, S, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](): (Constructor[typingsSlinky.skatejs.typesMod.WithUpdate[P, S]]) with T = js.native
  def withUpdate[P, S, T /* <: Constructor[org.scalajs.dom.raw.HTMLElement] */](Base: T): (Constructor[typingsSlinky.skatejs.typesMod.WithUpdate[P, S]]) with T = js.native
  /* static members */
  @js.native
  object CustomElement extends js.Object {
    val observedAttributes: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object WithComponent extends js.Object {
    val observedAttributes: js.Array[String] = js.native
  }
  
}


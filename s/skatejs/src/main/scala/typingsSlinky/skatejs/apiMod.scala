package typingsSlinky.skatejs

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.skatejs.anon.TypeofWithComponent
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
import typingsSlinky.std.PropertyDecorator
import typingsSlinky.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("skatejs/api", "define")
  @js.native
  def define[T /* <: HTMLElementClass */](ctor: T): T = js.native
  
  @JSImport("skatejs/api", "emit")
  @js.native
  def emit(elem: EventTarget, eventName: String): Boolean = js.native
  @JSImport("skatejs/api", "emit")
  @js.native
  def emit(elem: EventTarget, eventName: String, eventOptions: EventOptions): Boolean = js.native
  @JSImport("skatejs/api", "emit")
  @js.native
  def emit(elem: HTMLElementClass, eventName: String): Boolean = js.native
  @JSImport("skatejs/api", "emit")
  @js.native
  def emit(elem: HTMLElementClass, eventName: String, eventOptions: EventOptions): Boolean = js.native
  
  @JSImport("skatejs/api", "link")
  @js.native
  def link(elem: CustomElement): js.Function1[/* e */ ComposedCustomEvent, Unit] = js.native
  @JSImport("skatejs/api", "link")
  @js.native
  def link(elem: CustomElement, target: String): js.Function1[/* e */ ComposedCustomEvent, Unit] = js.native
  
  @JSImport("skatejs/api", "name")
  @js.native
  def name(): String = js.native
  @JSImport("skatejs/api", "name")
  @js.native
  def name(componentName: String): String = js.native
  
  @JSImport("skatejs/api", "prop")
  @js.native
  def prop(): PropertyDecorator with PropOptions[_] = js.native
  @JSImport("skatejs/api", "prop")
  @js.native
  def prop(ops: PropOptions[_]): PropertyDecorator with PropOptions[_] = js.native
  
  /* Inlined std.Readonly<{  any :skatejs.skatejs/types.PropOptions<any> & std.PropertyDecorator,   array :skatejs.skatejs/types.PropOptions<std.Array<any>> & std.PropertyDecorator,   boolean :skatejs.skatejs/types.PropOptions<boolean> & std.PropertyDecorator,   number :skatejs.skatejs/types.PropOptions<number> & std.PropertyDecorator,   object :skatejs.skatejs/types.PropOptions<object> & std.PropertyDecorator,   string :skatejs.skatejs/types.PropOptions<string> & std.PropertyDecorator}> */
  object props {
    
    @JSImport("skatejs/api", "props.any")
    @js.native
    def any(target: js.Object, propertyKey: String): Unit = js.native
    @JSImport("skatejs/api", "props.any")
    @js.native
    def any(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    
    @JSImport("skatejs/api", "props.array")
    @js.native
    def array(target: js.Object, propertyKey: String): Unit = js.native
    @JSImport("skatejs/api", "props.array")
    @js.native
    def array(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    
    @JSImport("skatejs/api", "props.boolean")
    @js.native
    def boolean(target: js.Object, propertyKey: String): Unit = js.native
    @JSImport("skatejs/api", "props.boolean")
    @js.native
    def boolean(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    
    @JSImport("skatejs/api", "props.number")
    @js.native
    def number(target: js.Object, propertyKey: String): Unit = js.native
    @JSImport("skatejs/api", "props.number")
    @js.native
    def number(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    
    @JSImport("skatejs/api", "props.string")
    @js.native
    def string(target: js.Object, propertyKey: String): Unit = js.native
    @JSImport("skatejs/api", "props.string")
    @js.native
    def string(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    
    @JSImport("skatejs/api", "props.object")
    @js.native
    def `object`(target: js.Object, propertyKey: String): Unit = js.native
    @JSImport("skatejs/api", "props.object")
    @js.native
    def `object`(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  }
  
  @JSImport("skatejs/api", "shadow")
  @js.native
  def shadow(elem: HTMLElement): ShadowRoot = js.native
  @JSImport("skatejs/api", "shadow")
  @js.native
  def shadow(elem: CustomElement): ShadowRoot = js.native
  
  @JSImport("skatejs/api", "withChildren")
  @js.native
  def withChildren[T /* <: Constructor[HTMLElement] */](): Constructor[WithChildren] with T = js.native
  @JSImport("skatejs/api", "withChildren")
  @js.native
  def withChildren[T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithChildren] with T = js.native
  
  @JSImport("skatejs/api", "withComponent")
  @js.native
  def withComponent[T /* <: Constructor[HTMLElement] */](): TypeofWithComponent = js.native
  @JSImport("skatejs/api", "withComponent")
  @js.native
  def withComponent[T /* <: Constructor[HTMLElement] */](Base: T): TypeofWithComponent = js.native
  @JSImport("skatejs/api", "withComponent")
  @js.native
  def withComponent_PSCT_ConstructorHTMLElement_Intersection[P, S, C, T /* <: Constructor[HTMLElement] */](): (Constructor[WithComponent[P, S, C]]) with T = js.native
  @JSImport("skatejs/api", "withComponent")
  @js.native
  def withComponent_PSCT_ConstructorHTMLElement_Intersection[P, S, C, T /* <: Constructor[HTMLElement] */](Base: T): (Constructor[WithComponent[P, S, C]]) with T = js.native
  
  @JSImport("skatejs/api", "withContext")
  @js.native
  def withContext[C, T /* <: Constructor[HTMLElement] */](): Constructor[WithContext[C]] with T = js.native
  @JSImport("skatejs/api", "withContext")
  @js.native
  def withContext[C, T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithContext[C]] with T = js.native
  
  @JSImport("skatejs/api", "withLifecycle")
  @js.native
  def withLifecycle[T /* <: Constructor[HTMLElement] */](): Constructor[WithLifecycle] with T = js.native
  @JSImport("skatejs/api", "withLifecycle")
  @js.native
  def withLifecycle[T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithLifecycle] with T = js.native
  
  @JSImport("skatejs/api", "withRenderer")
  @js.native
  def withRenderer[O, T /* <: Constructor[HTMLElement] */](): Constructor[WithRenderer[O]] with T = js.native
  @JSImport("skatejs/api", "withRenderer")
  @js.native
  def withRenderer[O, T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithRenderer[O]] with T = js.native
  
  @JSImport("skatejs/api", "withUpdate")
  @js.native
  def withUpdate[P, S, T /* <: Constructor[HTMLElement] */](): (Constructor[WithUpdate[P, S]]) with T = js.native
  @JSImport("skatejs/api", "withUpdate")
  @js.native
  def withUpdate[P, S, T /* <: Constructor[HTMLElement] */](Base: T): (Constructor[WithUpdate[P, S]]) with T = js.native
}

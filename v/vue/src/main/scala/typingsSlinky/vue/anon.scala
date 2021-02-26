package typingsSlinky.vue

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.vue.optionsMod.AsyncComponentPromise
import typingsSlinky.vue.optionsMod.DefaultComputed
import typingsSlinky.vue.optionsMod.DefaultData
import typingsSlinky.vue.optionsMod.DefaultMethods
import typingsSlinky.vue.optionsMod.DefaultProps
import typingsSlinky.vue.optionsMod.EsModuleComponent
import typingsSlinky.vue.optionsMod.InjectKey
import typingsSlinky.vue.optionsMod._Prop
import typingsSlinky.vue.vnodeMod.VNode
import typingsSlinky.vue.vueMod.CreateElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Component[Data, Methods, Computed, Props] extends StObject {
    
    def component(
      resolve: js.Function1[
          /* component */ typingsSlinky.vue.optionsMod.Component[Data, Methods, Computed, Props], 
          Unit
        ],
      reject: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
    ): (js.Promise[
        (typingsSlinky.vue.optionsMod.Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]) | EsModuleComponent
      ]) | Unit = js.native
    @JSName("component")
    var component_Original: AsyncComponentPromise[Data, Methods, Computed, Props] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var error: js.UndefOr[
        (typingsSlinky.vue.optionsMod.Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]) | EsModuleComponent
      ] = js.native
    
    var loading: js.UndefOr[
        (typingsSlinky.vue.optionsMod.Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]) | EsModuleComponent
      ] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  
  @js.native
  trait Default extends StObject {
    
    var default: js.UndefOr[js.Any] = js.native
    
    var from: js.UndefOr[InjectKey] = js.native
  }
  object Default {
    
    @scala.inline
    def apply(): Default = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setFrom(value: InjectKey): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    }
  }
  
  @js.native
  trait Event extends StObject {
    
    var event: js.UndefOr[String] = js.native
    
    var prop: js.UndefOr[String] = js.native
  }
  object Event {
    
    @scala.inline
    def apply(): Event = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](array: js.Array[T], key: Double, value: T): T = js.native
    def apply[T](`object`: js.Object, key: String, value: T): T = js.native
    def apply[T](`object`: js.Object, key: Double, value: T): T = js.native
  }
  
  @js.native
  trait FnCallObjectKey extends StObject {
    
    def apply(`object`: js.Object, key: String): Unit = js.native
    def apply(`object`: js.Object, key: Double): Unit = js.native
    def apply[T](array: js.Array[T], key: Double): Unit = js.native
  }
  
  @js.native
  trait Instantiable[T]
    extends _Prop[T]
       with Instantiable1[/* args (repeated) */ scala.Nothing, T with js.Object]
  
  @js.native
  trait InstantiableFunction
    extends _Prop[js.Any]
       with Instantiable1[/* args (repeated) */ String, js.Function]
  
  @js.native
  trait Render extends StObject {
    
    var render: js.Function = js.native
    
    var staticRenderFns: js.Array[js.Function] = js.native
  }
  object Render {
    
    @scala.inline
    def apply(render: js.Function, staticRenderFns: js.Array[js.Function]): Render = {
      val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any], staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
      __obj.asInstanceOf[Render]
    }
    
    @scala.inline
    implicit class RenderMutableBuilder[Self <: Render] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: js.Function): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticRenderFns(value: js.Array[js.Function]): Self = StObject.set(x, "staticRenderFns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticRenderFnsVarargs(value: js.Function*): Self = StObject.set(x, "staticRenderFns", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StaticRenderFns extends StObject {
    
    def render(createElement: CreateElement): VNode = js.native
    
    var staticRenderFns: js.Array[js.Function0[VNode]] = js.native
  }
  object StaticRenderFns {
    
    @scala.inline
    def apply(render: CreateElement => VNode, staticRenderFns: js.Array[js.Function0[VNode]]): StaticRenderFns = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticRenderFns]
    }
    
    @scala.inline
    implicit class StaticRenderFnsMutableBuilder[Self <: StaticRenderFns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: CreateElement => VNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStaticRenderFns(value: js.Array[js.Function0[VNode]]): Self = StObject.set(x, "staticRenderFns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticRenderFnsVarargs(value: js.Function0[VNode]*): Self = StObject.set(x, "staticRenderFns", js.Array(value :_*))
    }
  }
}

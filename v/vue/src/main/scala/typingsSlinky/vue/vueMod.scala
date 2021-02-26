package typingsSlinky.vue

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.std.Record
import typingsSlinky.vue.anon.FnCall
import typingsSlinky.vue.anon.FnCallObjectKey
import typingsSlinky.vue.anon.StaticRenderFns
import typingsSlinky.vue.optionsMod.AsyncComponent
import typingsSlinky.vue.optionsMod.Component
import typingsSlinky.vue.optionsMod.ComponentOptions
import typingsSlinky.vue.optionsMod.DefaultComputed
import typingsSlinky.vue.optionsMod.DefaultData
import typingsSlinky.vue.optionsMod.DefaultMethods
import typingsSlinky.vue.optionsMod.DefaultProps
import typingsSlinky.vue.optionsMod.DirectiveFunction
import typingsSlinky.vue.optionsMod.DirectiveOptions
import typingsSlinky.vue.optionsMod.FunctionalComponentOptions
import typingsSlinky.vue.optionsMod.PropsDefinition
import typingsSlinky.vue.optionsMod.RecordPropsDefinition
import typingsSlinky.vue.optionsMod.ThisTypedComponentOptionsWithArrayProps
import typingsSlinky.vue.optionsMod.ThisTypedComponentOptionsWithRecordProps
import typingsSlinky.vue.optionsMod.WatchOptions
import typingsSlinky.vue.pluginMod.PluginFunction
import typingsSlinky.vue.pluginMod.PluginObject
import typingsSlinky.vue.vnodeMod.NormalizedScopedSlot
import typingsSlinky.vue.vnodeMod.VNode
import typingsSlinky.vue.vnodeMod.VNodeChildren
import typingsSlinky.vue.vnodeMod.VNodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueMod {
  
  @js.native
  trait Vue extends StObject {
    
    @JSName("$attrs")
    val $attrs: Record[String, String] = js.native
    
    @JSName("$children")
    val $children: js.Array[typingsSlinky.vue.vueMod.Vue] = js.native
    
    @JSName("$createElement")
    def $createElement(): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: (AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: js.UndefOr[(AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])], children: VNodeChildren): VNode = js.native
    @JSName("$createElement")
    def $createElement(
      tag: js.UndefOr[(AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])],
      data: js.UndefOr[scala.Nothing],
      children: VNodeChildren
    ): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: js.UndefOr[(AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])], data: VNodeData): VNode = js.native
    @JSName("$createElement")
    def $createElement(
      tag: js.UndefOr[(AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])],
      data: VNodeData,
      children: VNodeChildren
    ): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: String): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: String, children: VNodeChildren): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: String, data: js.UndefOr[scala.Nothing], children: VNodeChildren): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: String, data: VNodeData): VNode = js.native
    @JSName("$createElement")
    def $createElement(tag: String, data: VNodeData, children: VNodeChildren): VNode = js.native
    @JSName("$createElement")
    def $createElement(
      tag: js.Function0[
          Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]
        ]
    ): VNode = js.native
    @JSName("$createElement")
    def $createElement(
      tag: js.Function0[
          Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]
        ],
      children: VNodeChildren
    ): VNode = js.native
    @JSName("$createElement")
    def $createElement(
      tag: js.Function0[
          Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]
        ],
      data: js.UndefOr[scala.Nothing],
      children: VNodeChildren
    ): VNode = js.native
    @JSName("$createElement")
    def $createElement(
      tag: js.Function0[
          Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]
        ],
      data: VNodeData
    ): VNode = js.native
    @JSName("$createElement")
    def $createElement(
      tag: js.Function0[
          Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]
        ],
      data: VNodeData,
      children: VNodeChildren
    ): VNode = js.native
    @JSName("$createElement")
    var $createElement_Original: CreateElement = js.native
    
    @JSName("$data")
    val $data: Record[String, _] = js.native
    
    @JSName("$delete")
    def $delete(`object`: js.Object, key: String): Unit = js.native
    @JSName("$delete")
    def $delete(`object`: js.Object, key: Double): Unit = js.native
    @JSName("$delete")
    def $delete[T](array: js.Array[T], key: Double): Unit = js.native
    @JSName("$delete")
    var $delete_Original: FnCallObjectKey = js.native
    
    @JSName("$destroy")
    def $destroy(): Unit = js.native
    
    @JSName("$el")
    val $el: Element = js.native
    
    @JSName("$emit")
    def $emit(event: String, args: js.Any*): this.type = js.native
    
    @JSName("$forceUpdate")
    def $forceUpdate(): Unit = js.native
    
    @JSName("$isServer")
    val $isServer: Boolean = js.native
    
    @JSName("$listeners")
    val $listeners: Record[String, js.Function | js.Array[js.Function]] = js.native
    
    @JSName("$mount")
    def $mount(): this.type = js.native
    @JSName("$mount")
    def $mount(elementOrSelector: js.UndefOr[scala.Nothing], hydrating: Boolean): this.type = js.native
    @JSName("$mount")
    def $mount(elementOrSelector: String): this.type = js.native
    @JSName("$mount")
    def $mount(elementOrSelector: String, hydrating: Boolean): this.type = js.native
    @JSName("$mount")
    def $mount(elementOrSelector: Element): this.type = js.native
    @JSName("$mount")
    def $mount(elementOrSelector: Element, hydrating: Boolean): this.type = js.native
    
    @JSName("$nextTick")
    def $nextTick(): js.Promise[Unit] = js.native
    @JSName("$nextTick")
    def $nextTick(callback: js.ThisFunction0[/* this */ this.type, Unit]): Unit = js.native
    
    @JSName("$off")
    def $off(): this.type = js.native
    @JSName("$off")
    def $off(event: js.UndefOr[scala.Nothing], callback: js.Function): this.type = js.native
    @JSName("$off")
    def $off(event: String): this.type = js.native
    @JSName("$off")
    def $off(event: String, callback: js.Function): this.type = js.native
    @JSName("$off")
    def $off(event: js.Array[String]): this.type = js.native
    @JSName("$off")
    def $off(event: js.Array[String], callback: js.Function): this.type = js.native
    
    @JSName("$on")
    def $on(event: String, callback: js.Function): this.type = js.native
    @JSName("$on")
    def $on(event: js.Array[String], callback: js.Function): this.type = js.native
    
    @JSName("$once")
    def $once(event: String, callback: js.Function): this.type = js.native
    @JSName("$once")
    def $once(event: js.Array[String], callback: js.Function): this.type = js.native
    
    @JSName("$options")
    val $options: ComponentOptions[
        typingsSlinky.vue.vueMod.Vue, 
        DefaultData[typingsSlinky.vue.vueMod.Vue], 
        DefaultMethods[typingsSlinky.vue.vueMod.Vue], 
        DefaultComputed, 
        PropsDefinition[DefaultProps], 
        DefaultProps
      ] = js.native
    
    @JSName("$parent")
    val $parent: typingsSlinky.vue.vueMod.Vue = js.native
    
    @JSName("$props")
    val $props: Record[String, _] = js.native
    
    @JSName("$refs")
    val $refs: StringDictionary[
        typingsSlinky.vue.vueMod.Vue | Element | (js.Array[Element | typingsSlinky.vue.vueMod.Vue])
      ] = js.native
    
    @JSName("$root")
    val $root: typingsSlinky.vue.vueMod.Vue = js.native
    
    @JSName("$scopedSlots")
    val $scopedSlots: StringDictionary[js.UndefOr[NormalizedScopedSlot]] = js.native
    
    @JSName("$set")
    def $set[T](array: js.Array[T], key: Double, value: T): T = js.native
    @JSName("$set")
    def $set[T](`object`: js.Object, key: String, value: T): T = js.native
    @JSName("$set")
    def $set[T](`object`: js.Object, key: Double, value: T): T = js.native
    @JSName("$set")
    var $set_Original: FnCall = js.native
    
    @JSName("$slots")
    val $slots: StringDictionary[js.UndefOr[js.Array[VNode]]] = js.native
    
    @JSName("$ssrContext")
    val $ssrContext: js.Any = js.native
    
    @JSName("$vnode")
    val $vnode: VNode = js.native
    
    @JSName("$watch")
    def $watch(
      expOrFn: String,
      callback: js.ThisFunction2[/* this */ this.type, /* n */ js.Any, /* o */ js.Any, Unit]
    ): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch(
      expOrFn: String,
      callback: js.ThisFunction2[/* this */ this.type, /* n */ js.Any, /* o */ js.Any, Unit],
      options: WatchOptions
    ): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch[T](
      expOrFn: js.ThisFunction0[/* this */ this.type, T],
      callback: js.ThisFunction2[/* this */ this.type, /* n */ T, /* o */ T, Unit]
    ): js.Function0[Unit] = js.native
    @JSName("$watch")
    def $watch[T](
      expOrFn: js.ThisFunction0[/* this */ this.type, T],
      callback: js.ThisFunction2[/* this */ this.type, /* n */ T, /* o */ T, Unit],
      options: WatchOptions
    ): js.Function0[Unit] = js.native
  }
  @JSImport("vue/types/vue", "Vue")
  @js.native
  val Vue: VueConstructor[typingsSlinky.vue.vueMod.Vue] = js.native
  
  type CombinedVueInstance[Instance /* <: typingsSlinky.vue.vueMod.Vue */, Data, Methods, Computed, Props] = Data with Methods with Computed with Props with Instance
  
  @js.native
  trait CreateElement extends StObject {
    
    def apply(): VNode = js.native
    def apply(tag: (AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])): VNode = js.native
    def apply(tag: js.UndefOr[(AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])], children: VNodeChildren): VNode = js.native
    def apply(
      tag: js.UndefOr[(AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])],
      data: js.UndefOr[scala.Nothing],
      children: VNodeChildren
    ): VNode = js.native
    def apply(tag: js.UndefOr[(AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])], data: VNodeData): VNode = js.native
    def apply(
      tag: js.UndefOr[(AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])],
      data: VNodeData,
      children: VNodeChildren
    ): VNode = js.native
    def apply(tag: String): VNode = js.native
    def apply(tag: String, children: VNodeChildren): VNode = js.native
    def apply(tag: String, data: js.UndefOr[scala.Nothing], children: VNodeChildren): VNode = js.native
    def apply(tag: String, data: VNodeData): VNode = js.native
    def apply(tag: String, data: VNodeData, children: VNodeChildren): VNode = js.native
    def apply(
      tag: js.Function0[
          Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]
        ]
    ): VNode = js.native
    def apply(
      tag: js.Function0[
          Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]
        ],
      children: VNodeChildren
    ): VNode = js.native
    def apply(
      tag: js.Function0[
          Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]
        ],
      data: js.UndefOr[scala.Nothing],
      children: VNodeChildren
    ): VNode = js.native
    def apply(
      tag: js.Function0[
          Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]
        ],
      data: VNodeData
    ): VNode = js.native
    def apply(
      tag: js.Function0[
          Component[
            DefaultData[scala.Nothing], 
            DefaultMethods[scala.Nothing], 
            DefaultComputed, 
            DefaultProps
          ]
        ],
      data: VNodeData,
      children: VNodeChildren
    ): VNode = js.native
  }
  
  type ExtendedVue[Instance /* <: typingsSlinky.vue.vueMod.Vue */, Data, Methods, Computed, Props] = VueConstructor[
    (CombinedVueInstance[Instance, Data, Methods, Computed, Props]) with typingsSlinky.vue.vueMod.Vue
  ]
  
  @js.native
  trait VueConfiguration extends StObject {
    
    var async: Boolean = js.native
    
    var devtools: Boolean = js.native
    
    def errorHandler(err: js.Error, vm: typingsSlinky.vue.vueMod.Vue, info: String): Unit = js.native
    
    var ignoredElements: js.Array[String | js.RegExp] = js.native
    
    var keyCodes: StringDictionary[Double | js.Array[Double]] = js.native
    
    var optionMergeStrategies: js.Any = js.native
    
    var performance: Boolean = js.native
    
    var productionTip: Boolean = js.native
    
    var silent: Boolean = js.native
    
    def warnHandler(msg: String, vm: typingsSlinky.vue.vueMod.Vue, trace: String): Unit = js.native
  }
  object VueConfiguration {
    
    @scala.inline
    def apply(
      async: Boolean,
      devtools: Boolean,
      errorHandler: (js.Error, typingsSlinky.vue.vueMod.Vue, String) => Unit,
      ignoredElements: js.Array[String | js.RegExp],
      keyCodes: StringDictionary[Double | js.Array[Double]],
      optionMergeStrategies: js.Any,
      performance: Boolean,
      productionTip: Boolean,
      silent: Boolean,
      warnHandler: (String, typingsSlinky.vue.vueMod.Vue, String) => Unit
    ): VueConfiguration = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], devtools = devtools.asInstanceOf[js.Any], errorHandler = js.Any.fromFunction3(errorHandler), ignoredElements = ignoredElements.asInstanceOf[js.Any], keyCodes = keyCodes.asInstanceOf[js.Any], optionMergeStrategies = optionMergeStrategies.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], productionTip = productionTip.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], warnHandler = js.Any.fromFunction3(warnHandler))
      __obj.asInstanceOf[VueConfiguration]
    }
    
    @scala.inline
    implicit class VueConfigurationMutableBuilder[Self <: VueConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorHandler(value: (js.Error, typingsSlinky.vue.vueMod.Vue, String) => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIgnoredElements(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ignoredElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredElementsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ignoredElements", js.Array(value :_*))
      
      @scala.inline
      def setKeyCodes(value: StringDictionary[Double | js.Array[Double]]): Self = StObject.set(x, "keyCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionMergeStrategies(value: js.Any): Self = StObject.set(x, "optionMergeStrategies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductionTip(value: Boolean): Self = StObject.set(x, "productionTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnHandler(value: (String, typingsSlinky.vue.vueMod.Vue, String) => Unit): Self = StObject.set(x, "warnHandler", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait VueConstructor[V /* <: typingsSlinky.vue.vueMod.Vue */]
    extends // ideally, the return type should just contain Props, not Record<keyof Props, any>. But TS requires to have Base constructors with the same return type.
  Instantiable0[
          CombinedVueInstance[V, js.Object, js.Object, js.Object, Record[/* keyof object */ String, js.Any]]
        ]
       with Instantiable1[
          (/* options */ ComponentOptions[
            V, 
            DefaultData[V], 
            DefaultMethods[V], 
            DefaultComputed, 
            PropsDefinition[DefaultProps], 
            DefaultProps
          ]) | (/* options */ ThisTypedComponentOptionsWithArrayProps[V, js.Object, js.Object, js.Object, String]) | (/* options */ ThisTypedComponentOptionsWithRecordProps[V, js.Object, js.Object, js.Object, js.Object]), 
          CombinedVueInstance[V, js.Object, js.Object, js.Object, Record[/* keyof object */ String, js.Any]]
        ] {
    
    def compile(template: String): StaticRenderFns = js.native
    
    def component(id: String): ExtendedVue[V, js.Object, js.Object, js.Object, js.Object] = js.native
    def component(
      id: String,
      definition: ComponentOptions[
          V, 
          DefaultData[V], 
          DefaultMethods[V], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]
    ): ExtendedVue[V, js.Object, js.Object, js.Object, js.Object] = js.native
    def component[VC /* <: VueConstructor[typingsSlinky.vue.vueMod.Vue] */](id: String, constructor: VC): VC = js.native
    def component[PropNames /* <: String */](id: String, definition: FunctionalComponentOptions[Record[PropNames, _], js.Array[PropNames]]): ExtendedVue[V, js.Object, js.Object, js.Object, Record[PropNames, _]] = js.native
    def component[Data, Methods, Computed, Props](id: String, definition: AsyncComponent[Data, Methods, Computed, Props]): ExtendedVue[V, Data, Methods, Computed, Props] = js.native
    @JSName("component")
    def component_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](id: String): ExtendedVue[V, Data, Methods, Computed, Record[PropNames, _]] = js.native
    @JSName("component")
    def component_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](
      id: String,
      definition: ThisTypedComponentOptionsWithArrayProps[V, Data, Methods, Computed, PropNames]
    ): ExtendedVue[V, Data, Methods, Computed, Record[PropNames, _]] = js.native
    @JSName("component")
    def component_DataMethodsComputedProps[Data, Methods, Computed, Props](id: String): ExtendedVue[V, Data, Methods, Computed, Props] = js.native
    @JSName("component")
    def component_DataMethodsComputedProps[Data, Methods, Computed, Props](
      id: String,
      definition: ThisTypedComponentOptionsWithRecordProps[V, Data, Methods, Computed, Props]
    ): ExtendedVue[V, Data, Methods, Computed, Props] = js.native
    @JSName("component")
    def component_Props[Props](id: String, definition: FunctionalComponentOptions[Props, RecordPropsDefinition[Props]]): ExtendedVue[V, js.Object, js.Object, js.Object, Props] = js.native
    @JSName("component")
    def component_VueConstructor(id: String): VueConstructor[typingsSlinky.vue.vueMod.Vue] = js.native
    
    var config: VueConfiguration = js.native
    
    def delete(`object`: js.Object, key: String): Unit = js.native
    def delete(`object`: js.Object, key: Double): Unit = js.native
    def delete[T](array: js.Array[T], key: Double): Unit = js.native
    
    def directive(id: String): DirectiveOptions = js.native
    def directive(id: String, definition: DirectiveFunction): DirectiveOptions = js.native
    def directive(id: String, definition: DirectiveOptions): DirectiveOptions = js.native
    
    def extend(): ExtendedVue[V, js.Object, js.Object, js.Object, js.Object] = js.native
    def extend(
      options: ComponentOptions[
          V, 
          DefaultData[V], 
          DefaultMethods[V], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]
    ): ExtendedVue[V, js.Object, js.Object, js.Object, js.Object] = js.native
    def extend[PropNames /* <: String */](definition: FunctionalComponentOptions[Record[PropNames, _], js.Array[PropNames]]): ExtendedVue[V, js.Object, js.Object, js.Object, Record[PropNames, _]] = js.native
    @JSName("extend")
    def extend_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](): ExtendedVue[V, Data, Methods, Computed, Record[PropNames, _]] = js.native
    @JSName("extend")
    def extend_DataMethodsComputedPropNames_String[Data, Methods, Computed, PropNames /* <: String */](options: ThisTypedComponentOptionsWithArrayProps[V, Data, Methods, Computed, PropNames]): ExtendedVue[V, Data, Methods, Computed, Record[PropNames, _]] = js.native
    @JSName("extend")
    def extend_DataMethodsComputedProps[Data, Methods, Computed, Props](): ExtendedVue[V, Data, Methods, Computed, Props] = js.native
    @JSName("extend")
    def extend_DataMethodsComputedProps[Data, Methods, Computed, Props](options: ThisTypedComponentOptionsWithRecordProps[V, Data, Methods, Computed, Props]): ExtendedVue[V, Data, Methods, Computed, Props] = js.native
    @JSName("extend")
    def extend_Props[Props](definition: FunctionalComponentOptions[Props, RecordPropsDefinition[Props]]): ExtendedVue[V, js.Object, js.Object, js.Object, Props] = js.native
    
    def filter(id: String): js.Function = js.native
    def filter(id: String, definition: js.Function): js.Function = js.native
    
    def mixin(
      mixin: ComponentOptions[
          typingsSlinky.vue.vueMod.Vue, 
          DefaultData[typingsSlinky.vue.vueMod.Vue], 
          DefaultMethods[typingsSlinky.vue.vueMod.Vue], 
          DefaultComputed, 
          PropsDefinition[DefaultProps], 
          DefaultProps
        ]
    ): VueConstructor[V] = js.native
    def mixin(mixin: VueConstructor[typingsSlinky.vue.vueMod.Vue]): VueConstructor[V] = js.native
    
    def nextTick(): js.Promise[Unit] = js.native
    def nextTick[T](callback: js.ThisFunction0[/* this */ T, Unit]): Unit = js.native
    def nextTick[T](callback: js.ThisFunction0[/* this */ T, Unit], context: T): Unit = js.native
    
    def observable[T](obj: T): T = js.native
    
    def set[T](array: js.Array[T], key: Double, value: T): T = js.native
    def set[T](`object`: js.Object, key: String, value: T): T = js.native
    def set[T](`object`: js.Object, key: Double, value: T): T = js.native
    
    def use(plugin: PluginFunction[_], options: js.Any*): VueConstructor[V] = js.native
    def use(plugin: PluginObject[_], options: js.Any*): VueConstructor[V] = js.native
    def use[T](plugin: PluginFunction[T]): VueConstructor[V] = js.native
    def use[T](plugin: PluginFunction[T], options: T): VueConstructor[V] = js.native
    def use[T](plugin: PluginObject[T]): VueConstructor[V] = js.native
    def use[T](plugin: PluginObject[T], options: T): VueConstructor[V] = js.native
    
    var version: String = js.native
  }
}

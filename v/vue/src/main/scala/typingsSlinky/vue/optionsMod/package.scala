package typingsSlinky.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object optionsMod {
  type Accessors[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: (): T[K] | vue.vue/types/options.ComputedOptions<T[K]>}
    */ typingsSlinky.vue.vueStrings.Accessors with org.scalablytyped.runtime.TopLevel[js.Any]
  type ArrayPropsDefinition[T] = js.Array[/* keyof T */ java.lang.String]
  type AsyncComponent[Data, Methods, Computed, Props] = (typingsSlinky.vue.optionsMod.AsyncComponentPromise[Data, Methods, Computed, Props]) | (typingsSlinky.vue.optionsMod.AsyncComponentFactory[Data, Methods, Computed, Props])
  type AsyncComponentFactory[Data, Methods, Computed, Props] = js.Function0[typingsSlinky.vue.anon.Component[Data, Methods, Computed, Props]]
  type AsyncComponentPromise[Data, Methods, Computed, Props] = js.Function2[
    /* resolve */ js.Function1[
      /* component */ typingsSlinky.vue.optionsMod.Component[Data, Methods, Computed, Props], 
      scala.Unit
    ], 
    /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
    (js.Promise[
      (typingsSlinky.vue.optionsMod.Component[
        typingsSlinky.vue.optionsMod.DefaultData[scala.Nothing], 
        typingsSlinky.vue.optionsMod.DefaultMethods[scala.Nothing], 
        typingsSlinky.vue.optionsMod.DefaultComputed, 
        typingsSlinky.vue.optionsMod.DefaultProps
      ]) | typingsSlinky.vue.optionsMod.EsModuleComponent
    ]) | scala.Unit
  ]
  type Component[Data, Methods, Computed, Props] = typingsSlinky.vue.vueMod.VueConstructor[typingsSlinky.vue.vueMod.Vue] | (typingsSlinky.vue.optionsMod.FunctionalComponentOptions[Props, typingsSlinky.vue.optionsMod.PropsDefinition[Props]]) | (typingsSlinky.vue.optionsMod.ComponentOptions[scala.Nothing, Data, Methods, Computed, Props, typingsSlinky.vue.optionsMod.DefaultProps])
  type DataDef[Data, Props, V] = Data | (js.ThisFunction0[/* this */ Props with V, Data])
  type DefaultComputed = org.scalablytyped.runtime.StringDictionary[js.Any]
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  type DefaultMethods[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type DefaultProps = typingsSlinky.std.Record[java.lang.String, js.Any]
  type DirectiveFunction = js.Function4[
    /* el */ org.scalajs.dom.raw.HTMLElement, 
    /* binding */ typingsSlinky.vue.optionsMod.DirectiveBinding, 
    /* vnode */ typingsSlinky.vue.vnodeMod.VNode, 
    /* oldVnode */ typingsSlinky.vue.vnodeMod.VNode, 
    scala.Unit
  ]
  type InjectKey = java.lang.String | js.Symbol
  type InjectOptions = (org.scalablytyped.runtime.StringDictionary[typingsSlinky.vue.optionsMod.InjectKey | typingsSlinky.vue.anon.Default]) | js.Array[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - js.Function0[T]
    - typingsSlinky.vue.anon.Instantiable[T]
    - typingsSlinky.vue.anon.InstantiableFunction
  */
  type Prop[T] = typingsSlinky.vue.optionsMod._Prop[T] | js.Function0[T]
  type PropType[T] = typingsSlinky.vue.optionsMod.Prop[T] | js.Array[typingsSlinky.vue.optionsMod.Prop[T]]
  type PropValidator[T] = typingsSlinky.vue.optionsMod.PropOptions[T] | typingsSlinky.vue.optionsMod.PropType[T]
  type PropsDefinition[T] = typingsSlinky.vue.optionsMod.ArrayPropsDefinition[T] | typingsSlinky.vue.optionsMod.RecordPropsDefinition[T]
  type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: vue.vue/types/options.PropValidator<T[K]>}
    */ typingsSlinky.vue.vueStrings.RecordPropsDefinition with org.scalablytyped.runtime.TopLevel[T]
  type ThisTypedComponentOptionsWithArrayProps[V /* <: typingsSlinky.vue.vueMod.Vue */, Data, Methods, Computed, PropNames /* <: java.lang.String */] = js.Object with (typingsSlinky.vue.optionsMod.ComponentOptions[
    V, 
    typingsSlinky.vue.optionsMod.DataDef[Data, typingsSlinky.std.Record[PropNames, _], V], 
    Methods, 
    Computed, 
    js.Array[PropNames], 
    typingsSlinky.std.Record[PropNames, _]
  ]) with (typingsSlinky.std.ThisType[
    typingsSlinky.vue.vueMod.CombinedVueInstance[V, Data, Methods, Computed, typingsSlinky.std.Record[PropNames, _]]
  ])
  type ThisTypedComponentOptionsWithRecordProps[V /* <: typingsSlinky.vue.vueMod.Vue */, Data, Methods, Computed, Props] = js.Object with (typingsSlinky.vue.optionsMod.ComponentOptions[
    V, 
    typingsSlinky.vue.optionsMod.DataDef[Data, Props, V], 
    Methods, 
    Computed, 
    typingsSlinky.vue.optionsMod.RecordPropsDefinition[Props], 
    Props
  ]) with (typingsSlinky.std.ThisType[typingsSlinky.vue.vueMod.CombinedVueInstance[V, Data, Methods, Computed, Props]])
  type WatchHandler[T] = js.Function2[/* val */ T, /* oldVal */ T, scala.Unit]
}

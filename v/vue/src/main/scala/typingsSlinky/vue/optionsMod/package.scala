package typingsSlinky.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object optionsMod {
  type Accessors[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: (): T[K] | vue.vue/types/options.ComputedOptions<T[K]>}
    */ typingsSlinky.vue.vueStrings.Accessors with org.scalablytyped.runtime.TopLevel[js.Any]
  type ArrayPropsDefinition[T] = js.Array[/* keyof T */ java.lang.String]
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
  type DefaultComputed = org.scalablytyped.runtime.StringDictionary[js.Any]
  type DefaultMethods[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type DefaultProps = typingsSlinky.std.Record[java.lang.String, js.Any]
  type DirectiveFunction = js.Function4[
    /* el */ org.scalajs.dom.raw.HTMLElement, 
    /* binding */ typingsSlinky.vue.optionsMod.DirectiveBinding, 
    /* vnode */ typingsSlinky.vue.vnodeMod.VNode, 
    /* oldVnode */ typingsSlinky.vue.vnodeMod.VNode, 
    scala.Unit
  ]
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

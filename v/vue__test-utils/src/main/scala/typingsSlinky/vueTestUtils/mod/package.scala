package typingsSlinky.vueTestUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Utility type for a selector
    */
  type Selector = java.lang.String | (typingsSlinky.vue.optionsMod.Component[
    typingsSlinky.vue.optionsMod.DefaultData[scala.Nothing], 
    typingsSlinky.vue.optionsMod.DefaultMethods[scala.Nothing], 
    typingsSlinky.vue.optionsMod.DefaultComputed, 
    typingsSlinky.vue.optionsMod.DefaultProps
  ])
  
  type ShallowMountOptions[V /* <: typingsSlinky.vue.vueMod.Vue */] = typingsSlinky.vueTestUtils.mod.MountOptions[V]
  
  /**
    * Utility type for slots
    */
  type Slots = org.scalablytyped.runtime.StringDictionary[
    (js.Array[
      (typingsSlinky.vue.optionsMod.Component[
        typingsSlinky.vue.optionsMod.DefaultData[scala.Nothing], 
        typingsSlinky.vue.optionsMod.DefaultMethods[scala.Nothing], 
        typingsSlinky.vue.optionsMod.DefaultComputed, 
        typingsSlinky.vue.optionsMod.DefaultProps
      ]) | java.lang.String
    ]) | (typingsSlinky.vue.optionsMod.Component[
      typingsSlinky.vue.optionsMod.DefaultData[scala.Nothing], 
      typingsSlinky.vue.optionsMod.DefaultMethods[scala.Nothing], 
      typingsSlinky.vue.optionsMod.DefaultComputed, 
      typingsSlinky.vue.optionsMod.DefaultProps
    ]) | java.lang.String
  ]
  
  /**
    * Utility type for stubs which can be a string of template as a shorthand
    * If it is an array of string, the specified children are replaced by blank components
    */
  type Stubs = (org.scalablytyped.runtime.StringDictionary[
    (typingsSlinky.vue.optionsMod.Component[
      typingsSlinky.vue.optionsMod.DefaultData[scala.Nothing], 
      typingsSlinky.vue.optionsMod.DefaultMethods[scala.Nothing], 
      typingsSlinky.vue.optionsMod.DefaultComputed, 
      typingsSlinky.vue.optionsMod.DefaultProps
    ]) | java.lang.String | scala.Boolean
  ]) | js.Array[java.lang.String]
  
  type ThisTypedMountOptions[V /* <: typingsSlinky.vue.vueMod.Vue */] = typingsSlinky.vueTestUtils.mod.MountOptions[V] with typingsSlinky.std.ThisType[V]
  
  type ThisTypedShallowMountOptions[V /* <: typingsSlinky.vue.vueMod.Vue */] = typingsSlinky.vueTestUtils.mod.ShallowMountOptions[V] with typingsSlinky.std.ThisType[V]
  
  /**
    * Utility type to declare an extended Vue constructor
    */
  type VueClass[V /* <: typingsSlinky.vue.vueMod.Vue */] = (org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, V]) with typingsSlinky.vue.vueMod.VueConstructor[typingsSlinky.vue.vueMod.Vue]
}

package typingsSlinky.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object vnodeMod {
  
  type NormalizedScopedSlot = js.Function1[/* props */ js.Any, typingsSlinky.vue.vnodeMod.ScopedSlotChildren]
  
  type ScopedSlot = js.Function1[/* props */ js.Any, typingsSlinky.vue.vnodeMod.ScopedSlotReturnValue]
  
  type ScopedSlotChildren = js.UndefOr[js.Array[typingsSlinky.vue.vnodeMod.VNode]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vue.vnodeMod.VNode
    - java.lang.String
    - scala.Boolean
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - typingsSlinky.vue.vnodeMod.ScopedSlotReturnArray
  */
  type ScopedSlotReturnValue = js.UndefOr[
    typingsSlinky.vue.vnodeMod._ScopedSlotReturnValue | java.lang.String | scala.Boolean | scala.Null
  ]
  
  type VNodeChildren = js.UndefOr[
    typingsSlinky.vue.vnodeMod.VNodeChildrenArrayContents | js.Array[typingsSlinky.vue.vnodeMod.ScopedSlot] | java.lang.String | scala.Boolean | scala.Null
  ]
}

package typingsSlinky.uifabricMergeStyles

import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/merge-styles/lib/IStyle", JSImport.Namespace)
@js.native
object istyleMod extends js.Object {
  
  @js.native
  trait IStyleBaseArray
    extends Array[IStyle]
       with _IStyle
  
  trait _IStyle extends js.Object
  
  trait _IStyleBase extends _IStyle
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.uifabricMergeStyles.istyleMod.IStyleBase
    - typingsSlinky.uifabricMergeStyles.istyleMod.IStyleBaseArray
  */
  type IStyle = js.UndefOr[_IStyle | String | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.uifabricMergeStyles.irawstyleMod.IRawStyle
    - java.lang.String
    - typingsSlinky.uifabricMergeStyles.uifabricMergeStylesBooleans.`false`
    - scala.Null
    - js.UndefOr[scala.Nothing]
  */
  type IStyleBase = js.UndefOr[_IStyleBase | String | Null]
}

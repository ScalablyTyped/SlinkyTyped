package typingsSlinky.uifabricUtilities

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/createMergedRef", JSImport.Namespace)
@js.native
object createMergedRefMod extends js.Object {
  
  def createMergedRef[TType, TValue](): js.Function1[
    /* repeated */ js.UndefOr[
      (js.Function1[/* instance */ TType | TValue | Null, Unit]) | (ReactRef[TType | TValue | Null]) | Null
    ], 
    js.Function1[/* newValue */ TType | TValue | Null, Unit]
  ] = js.native
  def createMergedRef[TType, TValue](value: TValue): js.Function1[
    /* repeated */ js.UndefOr[
      (js.Function1[/* instance */ TType | TValue | Null, Unit]) | (ReactRef[TType | TValue | Null]) | Null
    ], 
    js.Function1[/* newValue */ TType | TValue | Null, Unit]
  ] = js.native
}

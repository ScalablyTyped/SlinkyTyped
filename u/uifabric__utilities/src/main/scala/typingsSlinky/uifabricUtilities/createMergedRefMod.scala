package typingsSlinky.uifabricUtilities

import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMergedRefMod {
  
  @JSImport("@uifabric/utilities/lib/createMergedRef", "createMergedRef")
  @js.native
  def createMergedRef[TType, TValue](): js.Function1[
    /* repeated */ js.UndefOr[
      (js.Function1[/* instance */ TType | TValue | Null, Unit]) | (ReactRef[TType | TValue | Null]) | Null
    ], 
    js.Function1[/* newValue */ TType | TValue | Null, Unit]
  ] = js.native
  @JSImport("@uifabric/utilities/lib/createMergedRef", "createMergedRef")
  @js.native
  def createMergedRef[TType, TValue](value: TValue): js.Function1[
    /* repeated */ js.UndefOr[
      (js.Function1[/* instance */ TType | TValue | Null, Unit]) | (ReactRef[TType | TValue | Null]) | Null
    ], 
    js.Function1[/* newValue */ TType | TValue | Null, Unit]
  ] = js.native
}

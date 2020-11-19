package typingsSlinky.uifabricUtilities

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/createRef", JSImport.Namespace)
@js.native
object createRefMod extends js.Object {
  
  @js.native
  trait RefObject[T] extends js.Object {
    
    def apply(): Unit = js.native
    def apply(component: T): Unit = js.native
    
    var current: T | Null = js.native
  }
  
  type IRefObject[T] = ReactRef[T] | RefObject[T] | (js.Function1[/* ref */ T | Null, Unit])
}

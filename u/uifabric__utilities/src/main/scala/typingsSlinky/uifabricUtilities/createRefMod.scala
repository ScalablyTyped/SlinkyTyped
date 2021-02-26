package typingsSlinky.uifabricUtilities

import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createRefMod {
  
  type IRefObject[T] = ReactRef[T] | RefObject[T] | (js.Function1[/* ref */ T | Null, Unit])
  
  @js.native
  trait RefObject[T] extends StObject {
    
    def apply(): Unit = js.native
    def apply(component: T): Unit = js.native
    
    var current: T | Null = js.native
  }
}

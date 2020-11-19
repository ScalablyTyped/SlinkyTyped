package typingsSlinky.useCallbackRef

import typingsSlinky.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-callback-ref/dist/es5/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  
  type ReactRef[T] = RefCallback[T] | RefObject[T] | Null
  
  type RefCallback[T] = js.Function1[/* newValue */ T | Null, Unit]
  
  type RefObject[T] = MutableRefObject[T | Null]
}

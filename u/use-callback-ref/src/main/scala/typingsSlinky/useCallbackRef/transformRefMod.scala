package typingsSlinky.useCallbackRef

import typingsSlinky.useCallbackRef.typesMod.ReactRef
import typingsSlinky.useCallbackRef.typesMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-callback-ref/dist/es5/transformRef", JSImport.Namespace)
@js.native
object transformRefMod extends js.Object {
  
  def transformRef[T, K](ref: ReactRef[K], transformer: js.Function1[/* original */ T, K]): RefObject[T] = js.native
}

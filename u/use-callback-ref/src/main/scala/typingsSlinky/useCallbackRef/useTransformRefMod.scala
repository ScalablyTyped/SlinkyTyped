package typingsSlinky.useCallbackRef

import typingsSlinky.useCallbackRef.typesMod.ReactRef
import typingsSlinky.useCallbackRef.typesMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-callback-ref/dist/es5/useTransformRef", JSImport.Namespace)
@js.native
object useTransformRefMod extends js.Object {
  def useTransformRef[T, K](ref: ReactRef[K], transformer: js.Function1[/* original */ T, K]): RefObject[T] = js.native
}


package typingsSlinky.useDashCallbackDashRef

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-callback-ref/dist/es5/createRef", JSImport.Namespace)
@js.native
object distEs5CreateRefMod extends js.Object {
  def createCallbackRef[T](callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, _]): ReactRef[T] = js.native
}


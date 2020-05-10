package typingsSlinky.tstl.ipointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPointer[T] extends js.Object {
  /**
    * Reference of the value.
    */
  var value: T = js.native
}

@JSImport("tstl/functional/IPointer", "IPointer")
@js.native
object IPointer extends js.Object {
  /**
    * Inference of Value Type.
    */
  type ValueType[Pointer /* <: IPointer[_] */] = js.Any
}


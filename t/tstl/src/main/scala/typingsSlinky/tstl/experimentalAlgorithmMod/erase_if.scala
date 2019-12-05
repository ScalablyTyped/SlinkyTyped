package typingsSlinky.tstl.experimentalAlgorithmMod

import typingsSlinky.std.Pick
import typingsSlinky.tstl.baseDisposableIListAlgorithmMod._IListAlgorithm
import typingsSlinky.tstl.baseDisposableIListAlgorithmMod._IListAlgorithm.ValueType
import typingsSlinky.tstl.tstlStrings.remove_if
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/algorithm", "erase_if")
@js.native
object erase_if extends js.Object {
  def apply[Container /* <: Pick[_IListAlgorithm[ValueType[Container], Container], remove_if] */](contaier: Container, predicator: js.Function1[/* val */ ValueType[Container], Boolean]): Unit = js.native
}


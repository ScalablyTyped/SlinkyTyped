package typingsSlinky.tstl.tstlMod

import typingsSlinky.tstl.iteratorIFakeMod.General
import typingsSlinky.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typingsSlinky.tstl.numericOperationsMod.BinaryOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "transform_exclusive_scan")
@js.native
object transform_exclusive_scan extends js.Object {
  def apply[T, Ret, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: General[IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: T,
    binary: BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
}


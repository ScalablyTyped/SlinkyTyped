package typingsSlinky.tstl.tstlMod

import typingsSlinky.tstl.iteratorIFakeMod.Writeonly
import typingsSlinky.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typingsSlinky.tstl.numericOperationsMod.BinaryOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "transform_inclusive_scan")
@js.native
object transform_inclusive_scan extends js.Object {
  def apply[T, Ret, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def apply[T, Ret, InputIterator /* <: IForwardIterator[T, InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: BinaryOperator[Ret, Ret],
    unary: js.Function1[/* val */ T, Ret],
    init: T
  ): OutputIterator = js.native
}


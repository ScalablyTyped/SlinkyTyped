package typingsSlinky.tstl.tstlMod

import typingsSlinky.tstl.iteratorIFakeMod.General
import typingsSlinky.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typingsSlinky.tstl.numericOperationsMod.BinaryOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "inner_product")
@js.native
object inner_product extends js.Object {
  def apply[X, Y, InputIterator1 /* <: General[IForwardIterator[X, InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[Y, InputIterator2]] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2, value: X): X = js.native
  def apply[X, Y, InputIterator1 /* <: General[IForwardIterator[X, InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[Y, InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: X,
    op1: BinaryOperator[X, X]
  ): X = js.native
  def apply[X, Y, InputIterator1 /* <: General[IForwardIterator[X, InputIterator1]] */, InputIterator2 /* <: General[IForwardIterator[Y, InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: X,
    op1: BinaryOperator[X, X],
    op2: BinaryOperator[X, Y]
  ): X = js.native
}


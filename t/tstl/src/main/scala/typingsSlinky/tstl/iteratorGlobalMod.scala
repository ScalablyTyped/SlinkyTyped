package typingsSlinky.tstl

import typingsSlinky.tstl.baseDisposableIPartialContainersMod._IEmpty
import typingsSlinky.tstl.baseDisposableIPartialContainersMod._ISize
import typingsSlinky.tstl.functionalIPointerMod.IPointer.ValueType
import typingsSlinky.tstl.iteratorIBidirectionalIteratorMod.IBidirectionalIterator
import typingsSlinky.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/global", JSImport.Namespace)
@js.native
object iteratorGlobalMod extends js.Object {
  def advance[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](it: InputIterator, n: Double): InputIterator = js.native
  def distance[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): Double = js.native
  def empty(source: _IEmpty): Boolean = js.native
  def empty[T](source: js.Array[T]): Boolean = js.native
  def next[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](it: ForwardIterator): ForwardIterator = js.native
  def next[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](it: ForwardIterator, n: Double): ForwardIterator = js.native
  def prev[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */](it: BidirectionalIterator): BidirectionalIterator = js.native
  def prev[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */](it: BidirectionalIterator, n: Double): BidirectionalIterator = js.native
  def size(source: _ISize): Double = js.native
  def size[T](source: js.Array[T]): Double = js.native
}


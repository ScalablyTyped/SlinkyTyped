package typingsSlinky.tstl

import typingsSlinky.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typingsSlinky.tstl.iemptyMod.IEmpty
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.isizeMod.ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/global", JSImport.Namespace)
@js.native
object iteratorGlobalMod extends js.Object {
  def advance[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](it: InputIterator, n: Double): InputIterator = js.native
  def distance[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): Double = js.native
  def empty(source: js.Array[_]): Boolean = js.native
  def empty(source: IEmpty): Boolean = js.native
  def next[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](it: ForwardIterator): ForwardIterator = js.native
  def next[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](it: ForwardIterator, n: Double): ForwardIterator = js.native
  def prev[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */](it: BidirectionalIterator): BidirectionalIterator = js.native
  def prev[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */](it: BidirectionalIterator, n: Double): BidirectionalIterator = js.native
  def size(source: js.Array[_]): Double = js.native
  def size(source: ISize): Double = js.native
}


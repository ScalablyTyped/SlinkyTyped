package typingsSlinky.tstl.icontainerMod

import typingsSlinky.std.Iterable
import typingsSlinky.std.IterableIterator
import typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer
import typingsSlinky.tstl.icontainerMod.IContainer.Iterator
import typingsSlinky.tstl.icontainerMod.IContainer.ReverseIterator
import typingsSlinky.tstl.iemptyMod.IEmpty
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipushMod.IPush
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContainer_[T /* <: PElem */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, PElem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, PElem] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, PElem] */, PElem]
  extends IBidirectionalContainer[Iterator[T, SourceT, IteratorT, ReverseT, PElem], ReverseT]
     with Iterable[T]
     with IEmpty
     with IPush[PElem] {
  /**
    * @inheritDoc
    */
  @JSName(js.Symbol.iterator)
  var iterator_IContainer_ : js.Function0[IterableIterator[T]] = js.native
  /**
    * Range Assigner.
    *
    * @param first Input iteartor of the first position.
    * @param last Input iterator of the last position.
    */
  def assign[InputIterator /* <: IForwardIterator[PElem, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  /* InferMemberOverrides */
  override def begin(): Iterator[T, SourceT, IteratorT, ReverseT, PElem] = js.native
  /**
    * @inheritDoc
    */
  def clear(): Unit = js.native
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  /* InferMemberOverrides */
  override def end(): Iterator[T, SourceT, IteratorT, ReverseT, PElem] = js.native
  /**
    * Erase elements in range.
    *
    * @param first Range of the first position to erase.
    * @param last Rangee of the last position to erase.
    * @return Iterator following the last removed element, strained by the erasing.
    */
  def erase(first: IteratorT, last: IteratorT): IteratorT = js.native
  /**
    * Erase an element.
    *
    * @param pos Position to erase.
    * @return Iterator following the *pos*, strained by the erasing.
    */
  def erase(pos: IteratorT): IteratorT = js.native
  /**
    * Reverse iterator to the first element in reverse.
    *
    * @return Reverse iterator to the first.
    */
  /* InferMemberOverrides */
  override def rbegin(): ReverseT = js.native
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
  /* InferMemberOverrides */
  override def rend(): ReverseT = js.native
  /**
    * Swap elements.
    *
    * @param obj Target container to swap.
    */
  def swap(obj: SourceT): Unit = js.native
  /**
    * Native function for `JSON.stringify()`.
    *
    * @return An array containing children elements.
    */
  def toJSON(): js.Array[T] = js.native
}


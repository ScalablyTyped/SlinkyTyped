package typingsSlinky.tstl.idequecontainerMod

import typingsSlinky.tstl.icontainerMod.IContainer.Iterator
import typingsSlinky.tstl.icontainerMod.IContainer.ReverseIterator
import typingsSlinky.tstl.idequeMod.IDeque
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ilinearcontainerMod.ILinearContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDequeContainer_[T /* <: PElem */, SourceT /* <: IDequeContainer[T, SourceT, IteratorT, ReverseT, PElem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, PElem] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, PElem] */, PElem]
  extends ILinearContainer[T, SourceT, IteratorT, ReverseT, PElem]
     with IDeque[T] {
  
  /**
    * Range Assigner.
    *
    * @param first Input iteartor of the first position.
    * @param last Input iterator of the last position.
    */
  /* InferMemberOverrides */
  override def assign[InputIterator /* <: IForwardIterator[PElem, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
  
  /**
    * @inheritDoc
    */
  /* InferMemberOverrides */
  override def clear(): Unit = js.native
  
  /**
    * Erase elements in range.
    *
    * @param first Range of the first position to erase.
    * @param last Rangee of the last position to erase.
    * @return Iterator following the last removed element, strained by the erasing.
    */
  /* InferMemberOverrides */
  override def erase(first: IteratorT, last: IteratorT): IteratorT = js.native
  /**
    * Erase an element.
    *
    * @param pos Position to erase.
    * @return Iterator following the *pos*, strained by the erasing.
    */
  /* InferMemberOverrides */
  override def erase(pos: IteratorT): IteratorT = js.native
  
  /**
    * Swap elements.
    *
    * @param obj Target container to swap.
    */
  /* InferMemberOverrides */
  override def swap(obj: SourceT): Unit = js.native
  
  /**
    * Native function for `JSON.stringify()`.
    *
    * @return An array containing children elements.
    */
  /* InferMemberOverrides */
  override def toJSON(): js.Array[T] = js.native
}

package typingsSlinky.tstl

import typingsSlinky.tstl.backInsertIteratorMod.BackInsertIterator.SourceType
import typingsSlinky.tstl.backInsertIteratorMod.BackInsertIterator.ValueType
import typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer
import typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.ReverseIteratorType
import typingsSlinky.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typingsSlinky.tstl.iemptyMod.IEmpty
import typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer
import typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer.IteratorType
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.iinsertMod.IInsert
import typingsSlinky.tstl.ipushbackMod.IPushBack
import typingsSlinky.tstl.ipushfrontMod.IPushFront
import typingsSlinky.tstl.ireversableiteratorMod.IReversableIterator
import typingsSlinky.tstl.ireverseiteratorMod.IReverseIterator
import typingsSlinky.tstl.isizeMod.ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator", JSImport.Namespace)
@js.native
object iteratorMod extends js.Object {
  @js.native
  class BackInsertIterator[Source /* <: IPushBack[ValueType[Source]] */] protected ()
    extends typingsSlinky.tstl.backInsertIteratorMod.BackInsertIterator[Source] {
    /**
      * Initializer Constructor.
      *
      * @param source The source container.
      */
    def this(source: Source) = this()
  }
  
  @js.native
  class FrontInsertIterator[Source /* <: IPushFront[typingsSlinky.tstl.frontInsertIteratorMod.FrontInsertIterator.ValueType[Source]] */] protected ()
    extends typingsSlinky.tstl.frontInsertIteratorMod.FrontInsertIterator[Source] {
    /**
      * Initializer Constructor.
      *
      * @param source The source container.
      */
    def this(source: Source) = this()
  }
  
  @js.native
  class InsertIterator[Container /* <: IInsert[Iterator] */, Iterator /* <: IForwardIterator[typingsSlinky.tstl.ipointerMod.IPointer.ValueType[Iterator], Iterator] */] protected ()
    extends typingsSlinky.tstl.insertIteratorMod.InsertIterator[Container, Iterator] {
    /**
      * Initializer Constructor.
      *
      * @param container Target container to insert.
      * @param it Iterator to the position to insert.
      */
    def this(container: Container, it: Iterator) = this()
  }
  
  def advance[InputIterator /* <: IForwardIterator[typingsSlinky.tstl.ipointerMod.IPointer.ValueType[InputIterator], InputIterator] */](it: InputIterator, n: Double): InputIterator = js.native
  @JSName("back_inserter")
  def backInserter[Source /* <: js.Array[_] | IPushBack[_] */](source: Source): typingsSlinky.tstl.backInsertIteratorMod.BackInsertIterator[SourceType[Source]] = js.native
  def begin[Container /* <: js.Array[_] | IForwardContainer[_] */](container: Container): IteratorType[Container] = js.native
  def distance[InputIterator /* <: IForwardIterator[typingsSlinky.tstl.ipointerMod.IPointer.ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): Double = js.native
  def empty(source: js.Array[_]): Boolean = js.native
  def empty(source: IEmpty): Boolean = js.native
  def end[Container /* <: js.Array[_] | IForwardContainer[_] */](container: Container): IteratorType[Container] = js.native
  @JSName("front_inserter")
  def frontInserter[Source /* <: IPushFront[typingsSlinky.tstl.frontInsertIteratorMod.FrontInsertIterator.ValueType[Source]] */](source: Source): typingsSlinky.tstl.frontInsertIteratorMod.FrontInsertIterator[Source] = js.native
  def inserter[Container /* <: IInsert[Iterator] */, Iterator /* <: IForwardIterator[typingsSlinky.tstl.ipointerMod.IPointer.ValueType[Iterator], Iterator] */](container: Container, it: Iterator): typingsSlinky.tstl.insertIteratorMod.InsertIterator[Container, Iterator] = js.native
  @JSName("make_reverse_iterator")
  def makeReverseIterator[IteratorT /* <: IReversableIterator[typingsSlinky.tstl.ipointerMod.IPointer.ValueType[IteratorT], IteratorT, ReverseT] */, ReverseT /* <: IReverseIterator[typingsSlinky.tstl.ipointerMod.IPointer.ValueType[IteratorT], IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
  def next[ForwardIterator /* <: IForwardIterator[
    typingsSlinky.tstl.ipointerMod.IPointer.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](it: ForwardIterator): ForwardIterator = js.native
  def next[ForwardIterator /* <: IForwardIterator[
    typingsSlinky.tstl.ipointerMod.IPointer.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](it: ForwardIterator, n: Double): ForwardIterator = js.native
  def prev[BidirectionalIterator /* <: IBidirectionalIterator[
    typingsSlinky.tstl.ipointerMod.IPointer.ValueType[BidirectionalIterator], 
    BidirectionalIterator
  ] */](it: BidirectionalIterator): BidirectionalIterator = js.native
  def prev[BidirectionalIterator /* <: IBidirectionalIterator[
    typingsSlinky.tstl.ipointerMod.IPointer.ValueType[BidirectionalIterator], 
    BidirectionalIterator
  ] */](it: BidirectionalIterator, n: Double): BidirectionalIterator = js.native
  def rbegin[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](container: Container): ReverseIteratorType[Container] = js.native
  def rend[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](container: Container): ReverseIteratorType[Container] = js.native
  def size(source: js.Array[_]): Double = js.native
  def size(source: ISize): Double = js.native
}


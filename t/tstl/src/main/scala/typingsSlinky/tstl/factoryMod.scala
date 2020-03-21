package typingsSlinky.tstl

import typingsSlinky.tstl.backInsertIteratorMod.BackInsertIterator
import typingsSlinky.tstl.backInsertIteratorMod.BackInsertIterator.SourceType
import typingsSlinky.tstl.frontInsertIteratorMod.FrontInsertIterator
import typingsSlinky.tstl.frontInsertIteratorMod.FrontInsertIterator.ValueType
import typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer
import typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.ReverseIteratorType
import typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer
import typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer.IteratorType
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.iinsertMod.IInsert
import typingsSlinky.tstl.insertIteratorMod.InsertIterator
import typingsSlinky.tstl.ipushbackMod.IPushBack
import typingsSlinky.tstl.ipushfrontMod.IPushFront
import typingsSlinky.tstl.ireversableiteratorMod.IReversableIterator
import typingsSlinky.tstl.ireverseiteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  @JSName("back_inserter")
  def backInserter[Source /* <: js.Array[_] | IPushBack[_] */](source: Source): BackInsertIterator[SourceType[Source]] = js.native
  def begin[Container /* <: js.Array[_] | IForwardContainer[_] */](container: Container): IteratorType[Container] = js.native
  def end[Container /* <: js.Array[_] | IForwardContainer[_] */](container: Container): IteratorType[Container] = js.native
  @JSName("front_inserter")
  def frontInserter[Source /* <: IPushFront[ValueType[Source]] */](source: Source): FrontInsertIterator[Source] = js.native
  def inserter[Container /* <: IInsert[Iterator] */, Iterator /* <: IForwardIterator[typingsSlinky.tstl.ipointerMod.IPointer.ValueType[Iterator], Iterator] */](container: Container, it: Iterator): InsertIterator[Container, Iterator] = js.native
  @JSName("make_reverse_iterator")
  def makeReverseIterator[IteratorT /* <: IReversableIterator[typingsSlinky.tstl.ipointerMod.IPointer.ValueType[IteratorT], IteratorT, ReverseT] */, ReverseT /* <: IReverseIterator[typingsSlinky.tstl.ipointerMod.IPointer.ValueType[IteratorT], IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
  def rbegin[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](container: Container): ReverseIteratorType[Container] = js.native
  def rend[Container /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](container: Container): ReverseIteratorType[Container] = js.native
}


package typingsSlinky.tstl

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.irandomaccesscontainerMod.IRandomAccessContainer
import typingsSlinky.tstl.irandomaccesscontainerMod.IRandomAccessContainer.IteratorType
import typingsSlinky.tstl.irandomaccesscontainerMod.IRandomAccessContainer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/heap", JSImport.Namespace)
@js.native
object algorithmHeapMod extends js.Object {
  @JSName("is_heap")
  def isHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Boolean = js.native
  @JSName("is_heap")
  def isHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  @JSName("is_heap_until")
  def isHeapUntil[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): IteratorType[Range] = js.native
  @JSName("is_heap_until")
  def isHeapUntil[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  @JSName("make_heap")
  def makeHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  @JSName("make_heap")
  def makeHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
  @JSName("pop_heap")
  def popHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  @JSName("pop_heap")
  def popHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
  @JSName("push_heap")
  def pushHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  @JSName("push_heap")
  def pushHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
  @JSName("sort_heap")
  def sortHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range): Unit = js.native
  @JSName("sort_heap")
  def sortHeap[Range /* <: js.Array[_] | IRandomAccessContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Unit = js.native
}


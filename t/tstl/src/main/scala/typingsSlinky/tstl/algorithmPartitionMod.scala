package typingsSlinky.tstl

import typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer
import typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer.IteratorType
import typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer
import typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer.ValueType
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.pairMod.Pair
import typingsSlinky.tstl.unaryPredicatorMod.UnaryPredicator
import typingsSlinky.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/ranges/algorithm/partition", JSImport.Namespace)
@js.native
object algorithmPartitionMod extends js.Object {
  
  @JSName("is_partitioned")
  def isPartitioned[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): Boolean = js.native
  
  def partition[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
  
  @JSName("partition_copy")
  def partitionCopy[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator1 /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator1]] */, OutputIterator2 /* <: Writeonly[IForwardIterator[ValueType[Range], OutputIterator2]] */](
    range: Range,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: UnaryPredicator[ValueType[Range]]
  ): Pair[OutputIterator1, OutputIterator2] = js.native
  
  @JSName("partition_point")
  def partitionPoint[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, pred: UnaryPredicator[ValueType[Range]]): typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer.IteratorType[Range] = js.native
  
  @JSName("stable_partition")
  def stablePartition[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, pred: UnaryPredicator[ValueType[Range]]): IteratorType[Range] = js.native
}

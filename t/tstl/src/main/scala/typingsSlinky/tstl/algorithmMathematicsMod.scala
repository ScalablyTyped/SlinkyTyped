package typingsSlinky.tstl

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.ibidirectionalcontainerMod.IBidirectionalContainer
import typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer
import typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer.IteratorType
import typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer.ValueType
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.pairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/ranges/algorithm/mathematics", JSImport.Namespace)
@js.native
object algorithmMathematicsMod extends js.Object {
  
  @JSName("is_permutation")
  def isPermutation[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: js.Array[ValueType[Range1]]): Boolean = js.native
  @JSName("is_permutation")
  def isPermutation[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: js.Array[ValueType[Range1]],
    pred: Comparator[ValueType[Range1], ValueType[Range1]]
  ): Boolean = js.native
  @JSName("is_permutation")
  def isPermutation[Range1 /* <: js.Array[_] | IForwardContainer[_] */](range1: Range1, range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]]): Boolean = js.native
  @JSName("is_permutation")
  def isPermutation[Range1 /* <: js.Array[_] | IForwardContainer[_] */](
    range1: Range1,
    range2: IForwardContainer[IForwardIterator[ValueType[Range1], _]],
    pred: Comparator[ValueType[Range1], ValueType[Range1]]
  ): Boolean = js.native
  
  @JSName("max_element")
  def maxElement[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  @JSName("max_element")
  def maxElement[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  
  @JSName("min_element")
  def minElement[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): IteratorType[Range] = js.native
  @JSName("min_element")
  def minElement[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): IteratorType[Range] = js.native
  
  @JSName("minmax_element")
  def minmaxElement[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  @JSName("minmax_element")
  def minmaxElement[Range /* <: js.Array[_] | IForwardContainer[_] */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Pair[IteratorType[Range], IteratorType[Range]] = js.native
  
  @JSName("next_permutation")
  def nextPermutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range): Boolean = js.native
  @JSName("next_permutation")
  def nextPermutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
  
  @JSName("prev_permutation")
  def prevPermutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range): Boolean = js.native
  @JSName("prev_permutation")
  def prevPermutation[Range /* <: js.Array[_] | (IBidirectionalContainer[_, _]) */](range: Range, comp: Comparator[ValueType[Range], ValueType[Range]]): Boolean = js.native
}

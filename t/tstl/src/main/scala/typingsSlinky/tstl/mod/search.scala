package typingsSlinky.tstl.mod

import typingsSlinky.tstl.binaryPredicatorMod.BinaryPredicator
import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "search")
@js.native
object search extends js.Object {
  
  def apply[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    last2: ForwardIterator2
  ): ForwardIterator1 = js.native
  def apply[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator2], ForwardIterator2] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    last2: ForwardIterator2,
    pred: BinaryPredicator[ValueType[ForwardIterator1], ValueType[ForwardIterator2]]
  ): ForwardIterator1 = js.native
}

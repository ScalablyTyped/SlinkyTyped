package typingsSlinky.tstl.mod.default

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.irandomaccessiteratorMod.IRandomAccessIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "is_heap")
@js.native
object isHeap extends js.Object {
  
  def apply[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](first: RandomAccessIterator, last: RandomAccessIterator): Boolean = js.native
  def apply[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: Comparator[ValueType[RandomAccessIterator], ValueType[RandomAccessIterator]]
  ): Boolean = js.native
}

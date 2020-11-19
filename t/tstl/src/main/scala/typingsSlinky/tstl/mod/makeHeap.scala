package typingsSlinky.tstl.mod

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.generalMod.General
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.irandomaccessiteratorMod.IRandomAccessIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "make_heap")
@js.native
object makeHeap extends js.Object {
  
  def apply[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def apply[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: Comparator[ValueType[RandomAccessIterator], ValueType[RandomAccessIterator]]
  ): Unit = js.native
}

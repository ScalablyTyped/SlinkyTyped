package typingsSlinky.tstl.mod

import typingsSlinky.tstl.comparatorMod.Comparator
import typingsSlinky.tstl.generalMod.General
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.irandomaccessiteratorMod.IRandomAccessIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "partial_sort")
@js.native
object partialSort extends js.Object {
  def apply[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, middle: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def apply[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    middle: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: Comparator[ValueType[RandomAccessIterator], ValueType[RandomAccessIterator]]
  ): Unit = js.native
}


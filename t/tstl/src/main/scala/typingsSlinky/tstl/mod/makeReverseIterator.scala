package typingsSlinky.tstl.mod

import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.ireversableiteratorMod.IReversableIterator
import typingsSlinky.tstl.ireverseiteratorMod.IReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "make_reverse_iterator")
@js.native
object makeReverseIterator extends js.Object {
  
  def apply[IteratorT /* <: IReversableIterator[ValueType[IteratorT], IteratorT, ReverseT] */, ReverseT /* <: IReverseIterator[ValueType[IteratorT], IteratorT, ReverseT] */](it: IteratorT): ReverseT = js.native
}

package typingsSlinky.tstl.mod

import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.iinsertMod.IInsert
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "inserter")
@js.native
object inserter extends js.Object {
  
  def apply[Container /* <: IInsert[Iterator] */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](container: Container, it: Iterator): typingsSlinky.tstl.insertIteratorMod.InsertIterator[Container, Iterator] = js.native
}

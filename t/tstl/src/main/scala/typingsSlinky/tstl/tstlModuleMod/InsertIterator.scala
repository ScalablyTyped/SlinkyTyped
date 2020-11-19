package typingsSlinky.tstl.tstlModuleMod

import typingsSlinky.tstl.iforwarditeratorMod.IForwardIterator
import typingsSlinky.tstl.iinsertMod.IInsert
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/module", "InsertIterator")
@js.native
class InsertIterator[Container /* <: IInsert[Iterator] */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] protected ()
  extends typingsSlinky.tstl.iteratorMod.InsertIterator[Container, Iterator] {
  /**
    * Initializer Constructor.
    *
    * @param container Target container to insert.
    * @param it Iterator to the position to insert.
    */
  def this(container: Container, it: Iterator) = this()
}

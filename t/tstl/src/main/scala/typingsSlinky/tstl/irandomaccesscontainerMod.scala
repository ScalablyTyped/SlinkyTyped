package typingsSlinky.tstl

import typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer
import typingsSlinky.tstl.ipointerMod.IPointer.ValueType
import typingsSlinky.tstl.irandomaccessiteratorMod.IRandomAccessIterator
import typingsSlinky.tstl.vectorMod.Vector.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/container/IRandomAccessContainer", JSImport.Namespace)
@js.native
object irandomaccesscontainerMod extends js.Object {
  @js.native
  object IRandomAccessContainer extends js.Object {
    type IteratorType[Container /* <: js.Array[_] | IRandomAccessContainer[_] */] = js.Any | Iterator[js.Any]
    type ValueType[Container /* <: js.Array[_] | IRandomAccessContainer[_] */] = typingsSlinky.tstl.iforwardcontainerMod.IForwardContainer.ValueType[IteratorType[Container]]
  }
  
  type IRandomAccessContainer[IteratorT /* <: IRandomAccessIterator[ValueType[IteratorT], IteratorT] */] = IForwardContainer[IteratorT]
}


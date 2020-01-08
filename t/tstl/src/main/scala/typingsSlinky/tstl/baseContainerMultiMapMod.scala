package typingsSlinky.tstl

import typingsSlinky.tstl.baseContainerMapContainerMod.MapContainer
import typingsSlinky.tstl.baseIteratorIMapIteratorMod.IMapIterator
import typingsSlinky.tstl.baseIteratorIMapIteratorMod.IMapReverseIterator
import typingsSlinky.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MultiMap", JSImport.Namespace)
@js.native
object baseContainerMultiMapMod extends js.Object {
  @js.native
  abstract class MultiMap[Key, T, Source /* <: MultiMap[Key, T, Source, Iterator, Reverse] */, Iterator /* <: IMapIterator[Key, T, `false`, Source, Iterator, Reverse] */, Reverse /* <: IMapReverseIterator[Key, T, `false`, Source, Iterator, Reverse] */] () extends MapContainer[Key, T, `false`, Source, Iterator, Reverse] {
    /**
      * @hidden
      */
    /* protected */ def _Key_eq(x: Key, y: Key): Boolean = js.native
  }
  
}


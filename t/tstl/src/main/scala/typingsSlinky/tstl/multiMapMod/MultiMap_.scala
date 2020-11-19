package typingsSlinky.tstl.multiMapMod

import typingsSlinky.tstl.mapContainerMod.MapContainer
import typingsSlinky.tstl.multiMapMod.MultiMap.Iterator
import typingsSlinky.tstl.multiMapMod.MultiMap.ReverseIterator
import typingsSlinky.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/base/container/MultiMap", "MultiMap")
@js.native
abstract class MultiMap_[Key, T, Source /* <: MultiMap[Key, T, Source, Iterator, Reverse] */, Iterator /* <: Iterator[Key, T, Source, Iterator, Reverse] */, Reverse /* <: ReverseIterator[Key, T, Source, Iterator, Reverse] */] () extends MapContainer[Key, T, `false`, Source, Iterator, Reverse] {
  
  /* protected */ def _Key_eq(x: Key, y: Key): Boolean = js.native
}

package typingsSlinky.tstl.baseMod

import typingsSlinky.tstl.entryMod.Entry
import typingsSlinky.tstl.ilinearcontainerbaseMod.ILinearContainerBase
import typingsSlinky.tstl.mapContainerMod.MapContainer.Iterator
import typingsSlinky.tstl.mapContainerMod.MapContainer.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/base", "MapContainer")
@js.native
abstract class MapContainer[Key, T, Unique /* <: Boolean */, Source /* <: typingsSlinky.tstl.mapContainerMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] protected ()
  extends typingsSlinky.tstl.moduleMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] {
  /**
    * Default Constructor.
    */
  protected def this(factory: js.Function1[
        /* thisArg */ Source, 
        ILinearContainerBase[Entry[Key, T], Source, IteratorT, ReverseT, Entry[Key, T]]
      ]) = this()
}

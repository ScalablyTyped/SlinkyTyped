package typingsSlinky.tstl.mapContainerMod.MapContainer

import typingsSlinky.tstl.pairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - IteratorT
  - typingsSlinky.tstl.pairMod.Pair[IteratorT, scala.Boolean]
*/
trait InsertRet[Key, T, Unique /* <: Boolean */, SourceT /* <: typingsSlinky.tstl.mapContainerMod.MapContainer[Key, T, Unique, SourceT, IteratorT, Reverse] */, IteratorT /* <: Iterator[Key, T, Unique, SourceT, IteratorT, Reverse] */, Reverse /* <: ReverseIterator[Key, T, Unique, SourceT, IteratorT, Reverse] */] extends js.Object

object InsertRet {
  @scala.inline
  implicit def apply[Key, T, Unique, SourceT, IteratorT, Reverse](value: IteratorT): InsertRet[Key, T, Unique, SourceT, IteratorT, Reverse] = value.asInstanceOf[InsertRet[Key, T, Unique, SourceT, IteratorT, Reverse]]
  @scala.inline
  implicit def apply[Key, T, Unique, SourceT, IteratorT, Reverse](value: Pair[IteratorT, Boolean]): InsertRet[Key, T, Unique, SourceT, IteratorT, Reverse] = value.asInstanceOf[InsertRet[Key, T, Unique, SourceT, IteratorT, Reverse]]
}


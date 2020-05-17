package typingsSlinky.tstl.setContainerMod.SetContainer

import typingsSlinky.tstl.pairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Return type of {@link SetContainer.insert}
  */
/* Rewritten from type alias, can be one of: 
  - IteratorT
  - typingsSlinky.tstl.pairMod.Pair[IteratorT, scala.Boolean]
*/
trait InsertRet[Key, Unique /* <: Boolean */, Source /* <: typingsSlinky.tstl.setContainerMod.SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, Source, IteratorT, ReverseT] */] extends js.Object

object InsertRet {
  @scala.inline
  implicit def apply[Key, Unique, Source, IteratorT, ReverseT](value: IteratorT): InsertRet[Key, Unique, Source, IteratorT, ReverseT] = value.asInstanceOf[InsertRet[Key, Unique, Source, IteratorT, ReverseT]]
  @scala.inline
  implicit def apply[Key, Unique, Source, IteratorT, ReverseT](value: Pair[IteratorT, Boolean]): InsertRet[Key, Unique, Source, IteratorT, ReverseT] = value.asInstanceOf[InsertRet[Key, Unique, Source, IteratorT, ReverseT]]
}


package typingsSlinky.tstl.backInsertIteratorMod.BackInsertIterator

import typingsSlinky.tstl.ipushbackMod.IPushBack
import typingsSlinky.tstl.vectorMod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - Source
  - typingsSlinky.tstl.vectorMod.Vector[js.Any]
*/
trait SourceType[Source /* <: js.Array[_] | IPushBack[_] */] extends js.Object

object SourceType {
  @scala.inline
  implicit def apply[Source](value: Source): SourceType[Source] = value.asInstanceOf[SourceType[Source]]
  @scala.inline
  implicit def apply[Source](value: Vector[js.Any]): SourceType[Source] = value.asInstanceOf[SourceType[Source]]
}


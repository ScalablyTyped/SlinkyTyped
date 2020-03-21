package typingsSlinky.tstl.mod

import typingsSlinky.tstl.backInsertIteratorMod.BackInsertIterator.SourceType
import typingsSlinky.tstl.ipushbackMod.IPushBack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "back_inserter")
@js.native
object backInserter extends js.Object {
  def apply[Source /* <: js.Array[_] | IPushBack[_] */](source: Source): typingsSlinky.tstl.backInsertIteratorMod.BackInsertIterator[SourceType[Source]] = js.native
}


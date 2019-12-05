package typingsSlinky.tstl.tstlMod

import typingsSlinky.tstl.baseDisposableIPartialContainersMod._IPushBack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "back_inserter")
@js.native
object back_inserter extends js.Object {
  def apply[T](source: js.Array[T]): typingsSlinky.tstl.iteratorBackInsertIteratorMod.BackInsertIterator[T, typingsSlinky.tstl.containerVectorMod.Vector[T]] = js.native
  def apply[T, Source /* <: _IPushBack[T] */](source: Source): typingsSlinky.tstl.iteratorBackInsertIteratorMod.BackInsertIterator[T, Source] = js.native
}


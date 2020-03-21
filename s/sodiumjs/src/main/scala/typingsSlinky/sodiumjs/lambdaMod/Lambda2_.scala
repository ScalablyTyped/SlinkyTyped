package typingsSlinky.sodiumjs.lambdaMod

import typingsSlinky.sodiumjs.cellMod.Cell
import typingsSlinky.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda2")
@js.native
class Lambda2_[A, B, C] protected () extends js.Object {
  def this(f: js.Function2[/* a */ A, /* b */ B, C], deps: js.Array[Stream[_] | Cell[_]]) = this()
  var deps: js.Array[Stream[_] | Cell[_]] = js.native
  def f(a: A, b: B): C = js.native
}


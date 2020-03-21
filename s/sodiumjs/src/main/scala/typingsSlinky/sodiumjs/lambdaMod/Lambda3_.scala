package typingsSlinky.sodiumjs.lambdaMod

import typingsSlinky.sodiumjs.cellMod.Cell
import typingsSlinky.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda3")
@js.native
class Lambda3_[A, B, C, D] protected () extends js.Object {
  def this(f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D], deps: js.Array[Stream[_] | Cell[_]]) = this()
  var deps: js.Array[Stream[_] | Cell[_]] = js.native
  def f(a: A, b: B, c: C): D = js.native
}


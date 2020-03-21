package typingsSlinky.sodiumjs.mod

import typingsSlinky.sodiumjs.lambdaMod.Lambda3_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "lambda3")
@js.native
object lambda3 extends js.Object {
  def apply[A, B, C, D](
    f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D],
    deps: js.Array[
      typingsSlinky.sodiumjs.streamMod.Stream[_] | typingsSlinky.sodiumjs.cellMod.Cell[_]
    ]
  ): Lambda3_[A, B, C, D] = js.native
}


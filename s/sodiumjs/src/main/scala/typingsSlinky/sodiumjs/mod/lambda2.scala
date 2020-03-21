package typingsSlinky.sodiumjs.mod

import typingsSlinky.sodiumjs.lambdaMod.Lambda2_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "lambda2")
@js.native
object lambda2 extends js.Object {
  def apply[A, B, C](
    f: js.Function2[/* a */ A, /* b */ B, C],
    deps: js.Array[
      typingsSlinky.sodiumjs.streamMod.Stream[_] | typingsSlinky.sodiumjs.cellMod.Cell[_]
    ]
  ): Lambda2_[A, B, C] = js.native
}


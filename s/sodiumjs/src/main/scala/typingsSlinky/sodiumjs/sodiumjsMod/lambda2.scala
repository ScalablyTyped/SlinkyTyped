package typingsSlinky.sodiumjs.sodiumjsMod

import typingsSlinky.sodiumjs.distTypingsSodiumLambdaMod.Lambda2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "lambda2")
@js.native
object lambda2 extends js.Object {
  def apply[A, B, C](
    f: js.Function2[/* a */ A, /* b */ B, C],
    deps: js.Array[
      typingsSlinky.sodiumjs.distTypingsSodiumStreamMod.Stream[_] | typingsSlinky.sodiumjs.distTypingsSodiumCellMod.Cell[_]
    ]
  ): Lambda2[A, B, C] = js.native
}


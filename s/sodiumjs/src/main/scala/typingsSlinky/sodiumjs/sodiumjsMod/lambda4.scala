package typingsSlinky.sodiumjs.sodiumjsMod

import typingsSlinky.sodiumjs.distTypingsSodiumLambdaMod.Lambda4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "lambda4")
@js.native
object lambda4 extends js.Object {
  def apply[A, B, C, D, E](
    f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E],
    deps: js.Array[
      typingsSlinky.sodiumjs.distTypingsSodiumStreamMod.Stream[_] | typingsSlinky.sodiumjs.distTypingsSodiumCellMod.Cell[_]
    ]
  ): Lambda4[A, B, C, D, E] = js.native
}


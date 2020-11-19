package typingsSlinky.sodiumjs.mod

import typingsSlinky.sodiumjs.lambdaMod.Lambda1_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs", "lambda1")
@js.native
object lambda1 extends js.Object {
  
  def apply[A, B](
    f: js.Function1[/* a */ A, B],
    deps: js.Array[
      typingsSlinky.sodiumjs.streamMod.Stream[_] | typingsSlinky.sodiumjs.cellMod.Cell[_]
    ]
  ): Lambda1_[A, B] = js.native
}

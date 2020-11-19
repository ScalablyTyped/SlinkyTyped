package typingsSlinky.sodiumjs.lambdaMod

import typingsSlinky.sodiumjs.cellMod.Cell
import typingsSlinky.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "lambda2")
@js.native
object lambda2 extends js.Object {
  
  def apply[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C], deps: js.Array[Stream[_] | Cell[_]]): Lambda2_[A, B, C] = js.native
}

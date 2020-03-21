package typingsSlinky.sodiumjs.lambdaMod

import typingsSlinky.sodiumjs.cellMod.Cell
import typingsSlinky.sodiumjs.streamMod.Stream
import typingsSlinky.sodiumjs.vertexMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "toSources")
@js.native
object toSources extends js.Object {
  def apply(deps: js.Array[Stream[_] | Cell[_]]): js.Array[Source] = js.native
}


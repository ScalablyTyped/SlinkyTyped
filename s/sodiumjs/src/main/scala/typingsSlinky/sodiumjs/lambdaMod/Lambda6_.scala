package typingsSlinky.sodiumjs.lambdaMod

import typingsSlinky.sodiumjs.cellMod.Cell
import typingsSlinky.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda6")
@js.native
class Lambda6_[A, B, C, D, E, F, G] protected () extends js.Object {
  def this(
    f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G],
    deps: js.Array[Stream[_] | Cell[_]]
  ) = this()
  
  var deps: js.Array[Stream[_] | Cell[_]] = js.native
  
  def f(a: A, b: B, c: C, d: D, e: E, f: F): G = js.native
}

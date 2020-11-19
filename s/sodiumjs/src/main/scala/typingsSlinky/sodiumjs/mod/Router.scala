package typingsSlinky.sodiumjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs", "Router")
@js.native
class Router[A, K] protected ()
  extends typingsSlinky.sodiumjs.routerMod.Router[A, K] {
  def this(
    inStream: typingsSlinky.sodiumjs.streamMod.Stream[A],
    selector: js.Function1[/* a */ A, js.Array[K]]
  ) = this()
  def this(
    inStream: typingsSlinky.sodiumjs.streamMod.Stream[A],
    selector: js.Function1[/* a */ A, js.Array[K]],
    keyToStr: js.Function1[/* k */ K, String]
  ) = this()
}

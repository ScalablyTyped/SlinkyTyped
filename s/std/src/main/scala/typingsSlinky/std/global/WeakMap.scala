package typingsSlinky.std.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.WeakMapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WeakMap")
@js.native
class WeakMap[K /* <: js.Object */, V] ()
  extends typingsSlinky.std.WeakMap[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
}
@JSGlobal("WeakMap")
@js.native
object WeakMap extends TopLevel[WeakMapConstructor]

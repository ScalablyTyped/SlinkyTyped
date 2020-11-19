package typingsSlinky.superstruct.structMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/struct", "StructError")
@js.native
class StructError protected ()
  extends Error
     with /* key */ StringDictionary[js.Any] {
  def this(failure: StructFailure, iterable: js.Iterable[StructFailure]) = this()
  
  var branch: js.Array[_] = js.native
  
  def failures(): js.Iterable[StructFailure] = js.native
  
  var path: js.Array[Double | String] = js.native
  
  var `type`: String = js.native
  
  var value: js.Any = js.native
}

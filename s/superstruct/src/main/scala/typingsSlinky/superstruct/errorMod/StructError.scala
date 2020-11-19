package typingsSlinky.superstruct.errorMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Error
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/error", "StructError")
@js.native
class StructError protected ()
  extends Error
     with /* key */ StringDictionary[js.Any] {
  def this(failure: Failure, iterable: js.Iterable[Failure]) = this()
  
  var branch: js.Array[_] = js.native
  
  def failures(): IterableIterator[Failure] = js.native
  
  var key: js.UndefOr[String | Double] = js.native
  
  var path: js.Array[Double | String] = js.native
  
  var refinement: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
  
  var value: js.Any = js.native
}

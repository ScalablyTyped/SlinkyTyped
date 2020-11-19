package typingsSlinky.simmerjs.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queryable extends Scope {
  
  def querySelectorAll(selector: String, onError: js.Function1[/* error */ js.Any, Unit]): ArrayLike[Element] = js.native
  @JSName("querySelectorAll")
  var querySelectorAll_Original: QueryEngine = js.native
}

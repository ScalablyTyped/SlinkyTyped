package typingsSlinky.simmerjs.simmerjsMod

import org.scalajs.dom.raw.Element
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queryable extends Scope {
  @JSName("querySelectorAll")
  var querySelectorAll_Original: QueryEngine = js.native
  def querySelectorAll(selector: String, onError: js.Function1[/* error */ js.Any, Unit]): ArrayLike[Element] = js.native
}


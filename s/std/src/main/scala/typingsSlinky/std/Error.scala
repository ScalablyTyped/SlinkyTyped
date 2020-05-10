package typingsSlinky.std

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends js.Object {
  var message: java.lang.String = js.native
  var name: java.lang.String = js.native
  var stack: js.UndefOr[java.lang.String] = js.native
}

@JSGlobal("Error")
@js.native
object Error extends TopLevel[ErrorConstructor]


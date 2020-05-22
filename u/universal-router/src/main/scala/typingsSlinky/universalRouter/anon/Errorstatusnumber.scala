package typingsSlinky.universalRouter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  status ? :number} */
trait Errorstatusnumber extends js.Object {
  var message: String
  var name: String
  var stack: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
}

object Errorstatusnumber {
  @scala.inline
  def apply(message: String, name: String, stack: String = null, status: js.UndefOr[Double] = js.undefined): Errorstatusnumber = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errorstatusnumber]
  }
}


package typingsSlinky.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: String | (js.Array[String | js.RegExp]) | js.RegExp
  var msg: String
}

object Args {
  @scala.inline
  def apply(args: String | (js.Array[String | js.RegExp]) | js.RegExp, msg: String): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}


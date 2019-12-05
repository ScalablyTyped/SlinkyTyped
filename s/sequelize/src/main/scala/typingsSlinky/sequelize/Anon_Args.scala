package typingsSlinky.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: String | (js.Array[String | js.RegExp]) | js.RegExp
  var msg: String
}

object Anon_Args {
  @scala.inline
  def apply(args: String | (js.Array[String | js.RegExp]) | js.RegExp, msg: String): Anon_Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Args]
  }
}


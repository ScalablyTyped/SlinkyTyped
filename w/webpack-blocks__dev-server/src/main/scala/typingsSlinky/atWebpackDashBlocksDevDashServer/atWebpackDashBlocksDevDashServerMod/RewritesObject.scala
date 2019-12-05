package typingsSlinky.atWebpackDashBlocksDevDashServer.atWebpackDashBlocksDevDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RewritesObject extends js.Object {
  var from: js.RegExp
  var to: String | RewritesToFunction
}

object RewritesObject {
  @scala.inline
  def apply(from: js.RegExp, to: String | RewritesToFunction): RewritesObject = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RewritesObject]
  }
}


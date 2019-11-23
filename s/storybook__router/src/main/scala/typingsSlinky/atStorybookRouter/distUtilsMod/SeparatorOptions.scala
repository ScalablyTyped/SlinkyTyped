package typingsSlinky.atStorybookRouter.distUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeparatorOptions extends js.Object {
  var groupSeparator: String | js.RegExp
  var rootSeparator: String | js.RegExp
}

object SeparatorOptions {
  @scala.inline
  def apply(groupSeparator: String | js.RegExp, rootSeparator: String | js.RegExp): SeparatorOptions = {
    val __obj = js.Dynamic.literal(groupSeparator = groupSeparator.asInstanceOf[js.Any], rootSeparator = rootSeparator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SeparatorOptions]
  }
}


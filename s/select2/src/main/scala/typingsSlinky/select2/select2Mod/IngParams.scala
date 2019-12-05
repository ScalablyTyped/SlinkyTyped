package typingsSlinky.select2.select2Mod

import typingsSlinky.select2.select2Strings.close
import typingsSlinky.select2.select2Strings.open
import typingsSlinky.select2.select2Strings.select
import typingsSlinky.select2.select2Strings.unselect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IngParams extends js.Object {
  var name: select | open | close | unselect
  var prevented: Boolean
}

object IngParams {
  @scala.inline
  def apply(name: select | open | close | unselect, prevented: Boolean): IngParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prevented = prevented.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IngParams]
  }
}


package typingsSlinky.selectize.Selectize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchToken extends js.Object {
  var regex: js.RegExp
  var string: String
}

object ISearchToken {
  @scala.inline
  def apply(regex: js.RegExp, string: String): ISearchToken = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchToken]
  }
}


package typingsSlinky.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Multiline extends js.Object {
  var multiline: String
  var singleline: String
}

object Multiline {
  @scala.inline
  def apply(multiline: String, singleline: String): Multiline = {
    val __obj = js.Dynamic.literal(multiline = multiline.asInstanceOf[js.Any], singleline = singleline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multiline]
  }
}


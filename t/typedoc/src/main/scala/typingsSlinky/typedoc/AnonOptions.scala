package typingsSlinky.typedoc

import typingsSlinky.typedoc.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: Options
}

object AnonOptions {
  @scala.inline
  def apply(options: Options): AnonOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOptions]
  }
}


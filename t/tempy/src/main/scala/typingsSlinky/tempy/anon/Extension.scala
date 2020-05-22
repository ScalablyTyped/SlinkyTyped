package typingsSlinky.tempy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  /**
  			_You usually won't need this option. Specify it only when actually needed._
  			File extension. Mutually exclusive with the `name` option.
  			*/
  val extension: js.UndefOr[String] = js.undefined
}

object Extension {
  @scala.inline
  def apply(extension: String = null): Extension = {
    val __obj = js.Dynamic.literal()
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
}


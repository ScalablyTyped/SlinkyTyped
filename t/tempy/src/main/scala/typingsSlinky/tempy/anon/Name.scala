package typingsSlinky.tempy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  /**
  			_You usually won't need this option. Specify it only when actually needed._
  			Filename. Mutually exclusive with the `extension` option.
  			*/
  val name: js.UndefOr[String] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: String = null): Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}


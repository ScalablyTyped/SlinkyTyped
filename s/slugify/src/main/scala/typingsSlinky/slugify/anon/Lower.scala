package typingsSlinky.slugify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lower extends js.Object {
  var lower: js.UndefOr[Boolean] = js.undefined
  var remove: js.UndefOr[js.RegExp] = js.undefined
  var replacement: js.UndefOr[String] = js.undefined
}

object Lower {
  @scala.inline
  def apply(lower: js.UndefOr[Boolean] = js.undefined, remove: js.RegExp = null, replacement: String = null): Lower = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lower)) __obj.updateDynamic("lower")(lower.get.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (replacement != null) __obj.updateDynamic("replacement")(replacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lower]
  }
}


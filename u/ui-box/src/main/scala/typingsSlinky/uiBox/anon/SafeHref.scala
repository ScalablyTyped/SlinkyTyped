package typingsSlinky.uiBox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeHref extends js.Object {
  var safeHref: js.UndefOr[String] = js.undefined
  var safeRel: String
}

object SafeHref {
  @scala.inline
  def apply(safeRel: String, safeHref: String = null): SafeHref = {
    val __obj = js.Dynamic.literal(safeRel = safeRel.asInstanceOf[js.Any])
    if (safeHref != null) __obj.updateDynamic("safeHref")(safeHref.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeHref]
  }
}


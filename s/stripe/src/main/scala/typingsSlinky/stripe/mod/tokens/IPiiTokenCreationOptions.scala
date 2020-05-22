package typingsSlinky.stripe.mod.tokens

import typingsSlinky.stripe.anon.Personalidnumber
import typingsSlinky.stripe.mod.IDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPiiTokenCreationOptions extends IDataOptions {
  var pii: Personalidnumber
}

object IPiiTokenCreationOptions {
  @scala.inline
  def apply(pii: Personalidnumber, expand: js.Array[String] = null, include: js.Array[String] = null): IPiiTokenCreationOptions = {
    val __obj = js.Dynamic.literal(pii = pii.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPiiTokenCreationOptions]
  }
}


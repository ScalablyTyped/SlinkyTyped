package typingsSlinky.swaggerSchemaOfficial.anon

import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialBooleans.`true`
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait In extends js.Object {
  var in: path
  var required: `true`
}

object In {
  @scala.inline
  def apply(in: path, required: `true`): In = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[In]
  }
}


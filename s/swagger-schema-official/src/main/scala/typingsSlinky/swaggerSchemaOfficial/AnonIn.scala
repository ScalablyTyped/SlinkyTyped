package typingsSlinky.swaggerSchemaOfficial

import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialBooleans.`true`
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIn extends js.Object {
  var in: path
  var required: `true`
}

object AnonIn {
  @scala.inline
  def apply(in: path, required: `true`): AnonIn = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIn]
  }
}


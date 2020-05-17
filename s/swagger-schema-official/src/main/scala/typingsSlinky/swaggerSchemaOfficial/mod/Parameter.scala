package typingsSlinky.swaggerSchemaOfficial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.swaggerSchemaOfficial.mod.BodyParameter
  - typingsSlinky.swaggerSchemaOfficial.mod.FormDataParameter
  - typingsSlinky.swaggerSchemaOfficial.mod.QueryParameter
  - typingsSlinky.swaggerSchemaOfficial.mod.PathParameter
  - typingsSlinky.swaggerSchemaOfficial.mod.HeaderParameter
*/
trait Parameter extends js.Object

object Parameter {
  @scala.inline
  implicit def apply(value: FormDataParameter | HeaderParameter | PathParameter | QueryParameter): Parameter = value.asInstanceOf[Parameter]
  @scala.inline
  implicit def apply(value: BodyParameter): Parameter = value.asInstanceOf[Parameter]
}


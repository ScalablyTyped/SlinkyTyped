package typingsSlinky.swaggerSchemaOfficial.mod

import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.body
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.formData
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.header
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.path
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined swagger-schema-official.swagger-schema-official.BaseParameter & {  in  :'body',   schema ? :swagger-schema-official.swagger-schema-official.Schema} */
trait BodyParameter extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var in: (body | query | path | header | formData) with body
  var name: String
  var required: js.UndefOr[Boolean] = js.undefined
  var schema: js.UndefOr[Schema] = js.undefined
}

object BodyParameter {
  @scala.inline
  def apply(
    in: (body | query | path | header | formData) with body,
    name: String,
    description: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    schema: Schema = null
  ): BodyParameter = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyParameter]
  }
}


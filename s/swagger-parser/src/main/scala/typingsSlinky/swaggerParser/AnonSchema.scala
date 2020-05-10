package typingsSlinky.swaggerParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSchema extends js.Object {
  /**
    * If set to `false`, then validating against the Swagger 2.0 Schema or OpenAPI 3.0 Schema is disabled.
    */
  var schema: js.UndefOr[Boolean] = js.native
  /**
    * If set to `false`, then validating against the Swagger 2.0 Specification is disabled.
    */
  var spec: js.UndefOr[Boolean] = js.native
}

object AnonSchema {
  @scala.inline
  def apply(): AnonSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSchema]
  }
  @scala.inline
  implicit class AnonSchemaOps[Self <: AnonSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchema(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSpec(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(js.undefined)
        ret
    }
  }
  
}


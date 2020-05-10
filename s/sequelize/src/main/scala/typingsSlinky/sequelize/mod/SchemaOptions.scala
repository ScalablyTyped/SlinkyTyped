package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Schema Options provided for applying a schema to a model
  */
@js.native
trait SchemaOptions extends LoggingOptions {
  /**
    * The character(s) that separates the schema name from the table name
    */
  var schemaDelimeter: js.UndefOr[String] = js.native
}

object SchemaOptions {
  @scala.inline
  def apply(): SchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptions]
  }
  @scala.inline
  implicit class SchemaOptionsOps[Self <: SchemaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchemaDelimeter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDelimeter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaDelimeter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDelimeter")(js.undefined)
        ret
    }
  }
  
}


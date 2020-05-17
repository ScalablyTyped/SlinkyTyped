package typingsSlinky.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logging extends js.Object {
  var logging: js.UndefOr[Boolean | js.Function] = js.native
  var schema: js.UndefOr[String] = js.native
  var schemaDelimeter: js.UndefOr[String] = js.native
}

object Logging {
  @scala.inline
  def apply(): Logging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logging]
  }
  @scala.inline
  implicit class LoggingOps[Self <: Logging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogging(value: Boolean | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: String): Self = {
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


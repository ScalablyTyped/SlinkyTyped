package typingsSlinky.swaggerTools.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwaggerUiOptions extends js.Object {
  var apiDocs: js.UndefOr[String] = js.native
  var apiDocsPrefix: js.UndefOr[String] = js.native
  var swaggerUi: js.UndefOr[String] = js.native
  var swaggerUiDir: js.UndefOr[String] = js.native
  var swaggerUiPrefix: js.UndefOr[String] = js.native
}

object SwaggerUiOptions {
  @scala.inline
  def apply(): SwaggerUiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwaggerUiOptions]
  }
  @scala.inline
  implicit class SwaggerUiOptionsOps[Self <: SwaggerUiOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiDocs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiDocs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiDocs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiDocs")(js.undefined)
        ret
    }
    @scala.inline
    def withApiDocsPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiDocsPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiDocsPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiDocsPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSwaggerUi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerUi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwaggerUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerUi")(js.undefined)
        ret
    }
    @scala.inline
    def withSwaggerUiDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerUiDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwaggerUiDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerUiDir")(js.undefined)
        ret
    }
    @scala.inline
    def withSwaggerUiPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerUiPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwaggerUiPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerUiPrefix")(js.undefined)
        ret
    }
  }
  
}


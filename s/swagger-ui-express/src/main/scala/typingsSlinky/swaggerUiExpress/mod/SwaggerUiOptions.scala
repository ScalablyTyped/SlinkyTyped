package typingsSlinky.swaggerUiExpress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwaggerUiOptions extends js.Object {
  var customCss: js.UndefOr[String] = js.native
  var customCssUrl: js.UndefOr[String] = js.native
  var customJs: js.UndefOr[String] = js.native
  var customSiteTitle: js.UndefOr[String] = js.native
  var customfavIcon: js.UndefOr[String] = js.native
  var explorer: js.UndefOr[Boolean] = js.native
  var isExplorer: js.UndefOr[Boolean] = js.native
  var swaggerOptions: js.UndefOr[SwaggerOptions] = js.native
  var swaggerUrl: js.UndefOr[String] = js.native
  var swaggerUrls: js.UndefOr[js.Array[String]] = js.native
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
    def withCustomCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCss")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomCssUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCssUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomCssUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customCssUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomJs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customJs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomJs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customJs")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSiteTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSiteTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSiteTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSiteTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomfavIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customfavIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomfavIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customfavIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withExplorer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explorer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplorer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explorer")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExplorer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExplorer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExplorer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExplorer")(js.undefined)
        ret
    }
    @scala.inline
    def withSwaggerOptions(value: SwaggerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwaggerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSwaggerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwaggerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSwaggerUrls(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwaggerUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swaggerUrls")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration
  */
@js.native
trait IConfiguration extends js.Object {
  var dimensions: IDimension = js.native
  var maxImageSize: Double = js.native
  var stylesheets: js.Array[String] = js.native
  var toolbar: js.Array[String] = js.native
}

object IConfiguration {
  @scala.inline
  def apply(
    dimensions: IDimension,
    maxImageSize: Double,
    stylesheets: js.Array[String],
    toolbar: js.Array[String]
  ): IConfiguration = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], maxImageSize = maxImageSize.asInstanceOf[js.Any], stylesheets = stylesheets.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfiguration]
  }
  @scala.inline
  implicit class IConfigurationOps[Self <: IConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: IDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxImageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxImageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStylesheets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbar(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


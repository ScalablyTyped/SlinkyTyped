package typingsSlinky.uifabricStyling.ifabricconfigMod

import typingsSlinky.uifabricMergeStyles.stylesheetMod.IStyleSheetConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFabricConfig extends js.Object {
  /**
    * An override for where the fonts should be downloaded from.
    */
  var fontBaseUrl: js.UndefOr[String] = js.native
  /**
    * The mergeStyles stylesheet config.
    */
  var mergeStyles: js.UndefOr[IStyleSheetConfig] = js.native
}

object IFabricConfig {
  @scala.inline
  def apply(): IFabricConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFabricConfig]
  }
  @scala.inline
  implicit class IFabricConfigOps[Self <: IFabricConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontBaseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeStyles(value: IStyleSheetConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStyles")(js.undefined)
        ret
    }
  }
  
}


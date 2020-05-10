package typingsSlinky.slickgrid.Slick.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupItemMetadataProviderOptions extends js.Object {
  var enableExpandCollapse: js.UndefOr[Boolean] = js.native
  var groupCssClass: js.UndefOr[String] = js.native
  var groupFocusable: js.UndefOr[Boolean] = js.native
  var groupTitleCssClass: js.UndefOr[String] = js.native
  var toggleCollapsedCssClass: js.UndefOr[String] = js.native
  var toggleCssClass: js.UndefOr[String] = js.native
  var toggleExpandedCssCass: js.UndefOr[String] = js.native
  var totalsCssClass: js.UndefOr[String] = js.native
  var totalsFocusable: js.UndefOr[Boolean] = js.native
}

object GroupItemMetadataProviderOptions {
  @scala.inline
  def apply(): GroupItemMetadataProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupItemMetadataProviderOptions]
  }
  @scala.inline
  implicit class GroupItemMetadataProviderOptionsOps[Self <: GroupItemMetadataProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableExpandCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExpandCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableExpandCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExpandCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupFocusable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupFocusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupFocusable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupFocusable")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupTitleCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTitleCssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupTitleCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTitleCssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleCollapsedCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCollapsedCssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleCollapsedCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCollapsedCssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleExpandedCssCass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleExpandedCssCass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleExpandedCssCass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleExpandedCssCass")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalsCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsCssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalsCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsCssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalsFocusable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsFocusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalsFocusable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsFocusable")(js.undefined)
        ret
    }
  }
  
}


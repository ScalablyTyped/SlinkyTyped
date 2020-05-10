package typingsSlinky.uiGrid.mod.expandable

import typingsSlinky.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions extends js.Object {
  /**
    * Whether or not to use expandable feature.  Allows you to turn off expandable on specific grids within
    * your application, or in specific modes on this grid.
    * Defaults to true.
    */
  var enableExpandable: js.UndefOr[Boolean] = js.native
  /**
    * Show a rowHeader to provide the expandable buttons. If set to false then implies you're going to use a
    * custom method for expanding and collapsing the subgrids.
    * Defaults to true.
    */
  var enableExpandableRowHeader: js.UndefOr[Boolean] = js.native
  /**
    * Width in pixels of the expandable column. Defaults to 40
    */
  var expandableRowHeaderWidth: js.UndefOr[Double] = js.native
  /**
    * Height in pixels of the expanded subgrid.
    * Defaults to 150
    */
  var expandableRowHeight: js.UndefOr[Double] = js.native
  /**
    * reference to the parent grid scope (the parent scope of the sub-grid element)
    */
  var expandableRowScope: js.UndefOr[IScope | js.Object] = js.native
  /**
    * Mandatory. The template for your expanded row
    */
  var expandableRowTemplate: js.UndefOr[String] = js.native
}

object IGridOptions {
  @scala.inline
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableExpandable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExpandable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableExpandable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExpandable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableExpandableRowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExpandableRowHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableExpandableRowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableExpandableRowHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandableRowHeaderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRowHeaderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandableRowHeaderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRowHeaderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandableRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandableRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandableRowScope(value: IScope | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRowScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandableRowScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRowScope")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandableRowTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRowTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandableRowTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandableRowTemplate")(js.undefined)
        ret
    }
  }
  
}


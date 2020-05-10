package typingsSlinky.uiGrid.mod.pagination

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions extends js.Object {
  /**
    * Enables pagination, defaults to true
    * @default true
    */
  var enablePagination: js.UndefOr[Boolean] = js.native
  /**
    * Enables the paginator at the bottom of the grid. Turn this off, if you want to implement your own
    * controls outside the grid
    */
  var enablePaginationControls: js.UndefOr[Boolean] = js.native
  /**
    * Current page number, defaults to 1
    * @default 1
    */
  var paginationCurrentPage: js.UndefOr[Double] = js.native
  /**
    * Page size, defaults to the first item in paginationPageSizes, or 0 if paginationPageSizes is empty
    */
  var paginationPageSize: js.UndefOr[Double] = js.native
  /**
    * Array of page sizes, defaults to [250, 500, 1000]
    * @default [250, 500, 1000]
    */
  var paginationPageSizes: js.UndefOr[js.Array[Double]] = js.native
  /**
    * A custom template for the pager, defaults to ui-grid/pagination
    * @default 'ui-grid/pagination'
    */
  var paginationTemplate: js.UndefOr[String] = js.native
  /**
    * Total number of items, set automatically when client side pagination,
    * needs set by user for server side pagination
    */
  var totalItems: js.UndefOr[Double] = js.native
  /**
    * Disables client side pagination. When true, handle the paginationChanged event and set data and
    * totalItems, defaults to false
    * @default false
    */
  var useExternalPagination: js.UndefOr[Boolean] = js.native
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
    def withEnablePagination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePagination")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePaginationControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePaginationControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePaginationControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePaginationControls")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationCurrentPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationCurrentPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationCurrentPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationCurrentPage")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationPageSizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationPageSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationPageSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationPageSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(js.undefined)
        ret
    }
    @scala.inline
    def withUseExternalPagination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExternalPagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseExternalPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useExternalPagination")(js.undefined)
        ret
    }
  }
  
}


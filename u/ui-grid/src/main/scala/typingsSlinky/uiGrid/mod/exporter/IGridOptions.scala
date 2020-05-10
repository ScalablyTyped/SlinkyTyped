package typingsSlinky.uiGrid.mod.exporter

import typingsSlinky.angular.mod.IPromise
import typingsSlinky.uiGrid.mod.IGridColumnOf
import typingsSlinky.uiGrid.mod.IGridInstanceOf
import typingsSlinky.uiGrid.mod.IGridRowOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions[TEntity] extends js.Object {
  /**
    * This promise is needed when exporting all rows, and the data need to be provided by server side.
    * Default is null
    * @default null
    * @returns {ng.IPromise<Array<TEntity>>} A promise to load all data from server
    */
  var exporterAllDataFn: js.UndefOr[js.Function0[IPromise[js.Array[TEntity]]]] = js.native
  /**
    * @deprecated
    * DEPRECATED - exporterAllDataFn used to be called this, but it wasn't a promise,
    * it was a function that returned a promise. Deprecated, but supported for backward compatibility,
    * use exporterAllDataFn instead.
    * @returns {ng.IPromise<Array<TEntity>>} A promise to load all data from server
    */
  var exporterAllDataPromise: js.UndefOr[js.Function0[IPromise[js.Array[TEntity]]]] = js.native
  /**
    * The character to use as column separator link
    * Defaults to ','
    * @default ','
    */
  var exporterCsvColumnSeparator: js.UndefOr[String] = js.native
  /**
    * The default filename to use when saving the downloaded csv. This will only work in some browsers.
    * Defaults to 'download.csv'
    * @default 'download.csv'
    */
  var exporterCsvFilename: js.UndefOr[String] = js.native
  /**
    * A function to call for each field before exporting it.
    * Allows massaging of raw data into a display format, for example if you have applied filters to convert
    * codes into decodes, or you require a specific date format in the exported content.
    * The method is called once for each field exported, and provides the grid,
    * the gridCol, and the GridRow for you to use as context in massaging the data.
    *
    * @param {IGridInstance} grid The grid
    * @param {IGridRow} row Current row
    * @param {IGridColumn} col Current column
    * @param {any} value The cell value
    * @returns {any} Formatted value
    */
  var exporterFieldCallback: js.UndefOr[
    js.Function4[
      /* grid */ IGridInstanceOf[TEntity], 
      /* row */ IGridRowOf[TEntity], 
      /* col */ IGridColumnOf[TEntity], 
      /* value */ js.Any, 
      _
    ]
  ] = js.native
  /**
    * A function to apply to the header displayNames before exporting. Useful for internationalisation,
    * for example if you were using angular-translate you'd set this to $translate.instant.
    * Note that this call must be synchronous, it cannot be a call that returns a promise.
    *
    * Behaviour can be changed to pass in name instead of displayName through use
    * of exporterHeaderFilterUseName: true.
    * @param {string} displayName
    * @returns {string} The filtered header
    */
  var exporterHeaderFilter: js.UndefOr[js.Function1[/* displayName */ String, String]] = js.native
  /**
    * Defaults to false, which leads to displayName being passed into the headerFilter.
    * If set to true, then will pass name instead.
    * @default false
    */
  var exporterHeaderFilterUseName: js.UndefOr[Boolean] = js.native
  /**
    * Add csv export menu items to the ui-grid grid menu, if it's present. Defaults to true.
    * @default true
    */
  var exporterMenuCsv: js.UndefOr[Boolean] = js.native
  /**
    * Add excel export menu items to the ui-grid grid menu, if it's present. Defaults to true.
    * @default true
    */
  var exporterMenuExcel: js.UndefOr[Boolean] = js.native
  /**
    * An option to determine the starting point for the menu items created by the exporter
    * @default 200
    */
  var exporterMenuItemOrder: js.UndefOr[Double] = js.native
  /**
    * The text to show on the exporter menu button link
    * Defaults to 'Export'
    * @default 'Export'
    */
  var exporterMenuLabel: js.UndefOr[String] = js.native
  /**
    * Add pdf export menu items to the ui-grid grid menu, if it's present.
    * Defaults to true.
    * @default true
    */
  var exporterMenuPdf: js.UndefOr[Boolean] = js.native
  /**
    * Some versions of excel don't like the utf-16 BOM on the front,
    * and it comes through as ï»¿ in the first column header.
    * Setting this option to false will suppress this,
    * at the expense of proper utf-16 handling in applications that do recognise the BOM
    * Defaults to false
    * @default false
    */
  var exporterOlderExcelCompatibility: js.UndefOr[Boolean] = js.native
  /**
    * A custom callback routine that changes the pdf document,
    * adding any custom styling or content that is supported by pdfMake.
    * Takes in the complete docDefinition, and must return an updated docDefinition ready for pdfMake.
    * Example
    * In this example we add a style to the style array, so that we can use it in our footer definition.
    * @param {any} docDefinition Document definition in pdfMake format
    */
  var exporterPdfCustomFormatter: js.UndefOr[js.Function1[/* docDefinition */ js.Any, _]] = js.native
  /**
    * The default style in pdfMake format
    * @todo replace with pdfmake format
    */
  var exporterPdfDefaultStyle: js.UndefOr[js.Any] = js.native
  /**
    * The default filename to use when saving the downloaded pdf,
    * only used in IE (other browsers open pdfs in a new window)
    * Defaults to 'download.pdf'
    * @default 'download.pdf'
    */
  var exporterPdfFilename: js.UndefOr[String] = js.native
  /**
    * The footer section for pdf exports. Can be simple text, a more complex object in pdfMake format, or it
    * can be a function, allowing page numbers and the like
    * @todo replace any with pdfmake format
    */
  var exporterPdfFooter: js.UndefOr[
    String | js.Any | (js.Function2[/* currentPage */ Double, /* pageCount */ Double, String])
  ] = js.native
  /**
    * The header section for pdf exports. Can be simple text, a more complex object in pdfMake format, or it
    * can be a function, allowing page numbers and the like
    * @todo replace any with pdfmake format
    */
  var exporterPdfHeader: js.UndefOr[
    String | js.Any | (js.Function2[/* currentPage */ Double, /* pageCount */ Double, String])
  ] = js.native
  /**
    * The maxium grid width - the current grid width will be scaled to match this,
    * with any fixed width columns being adjusted accordingly.
    * Defaults to 720 (for A4 landscape), use 670 for LETTER
    * @default 720
    */
  var exporterPdfMaxGridWidth: js.UndefOr[Double] = js.native
  /**
    * The orientation, should be a valid pdfMake value, 'landscape' or 'portrait'
    * Defaults to landscape
    * @default 'landscape'
    */
  var exporterPdfOrientation: js.UndefOr[String] = js.native
  /**
    * The orientation, should be a valid pdfMake paper size, usually 'A4' or 'LETTER' pdfMake page sizes
    * Defaults to A4
    * @default 'A4'
    */
  var exporterPdfPageSize: js.UndefOr[String] = js.native
  /**
    * exporterPdfTableHeaderStyle
    * @todo replace any with pdfmake format
    */
  var exporterPdfTableHeaderStyle: js.UndefOr[js.Any] = js.native
  /**
    * A tableLayout in pdfMake format, controls gridlines and the like. We use the default layout usually.
    * Defaults to null, which means no layout
    * @default null
    * @todo replace any with pdfmake format
    */
  var exporterPdfTableLayout: js.UndefOr[js.Any] = js.native
  /**
    * The tableStyle in pdfMake format
    * Defaults to ```{ margin: [0, 5, 0, 15] }```
    * @default { margin: [0, 5, 0, 15] }
    * @todo replace any with pdfmake format
    */
  var exporterPdfTableStyle: js.UndefOr[js.Any] = js.native
  /**
    * Columns that should not be exported.
    *
    * The selectionRowHeader is already automatically suppressed,
    * but if you had a button column or some other "system" column that shouldn't be shown in the output,
    * then add it in this list.
    *
    * You should provide an array of column names.
    * Defaults to: []
    * @default []
    */
  var exporterSuppressColumns: js.UndefOr[js.Array[String]] = js.native
  /**
    * Don't show the export menu button, implying the user will roll their own UI for calling the exporter
    * Defaults to false
    * @default false
    */
  var exporterSuppressMenu: js.UndefOr[Boolean] = js.native
}

object IGridOptions {
  @scala.inline
  def apply[TEntity](): IGridOptions[TEntity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions[TEntity]]
  }
  @scala.inline
  implicit class IGridOptionsOps[Self[tentity] <: IGridOptions[tentity], TEntity] (val x: Self[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntity] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntity]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntity] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntity] with Other]
    @scala.inline
    def withExporterAllDataFn(value: () => IPromise[js.Array[TEntity]]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterAllDataFn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExporterAllDataFn: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterAllDataFn")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterAllDataPromise(value: () => IPromise[js.Array[TEntity]]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterAllDataPromise")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExporterAllDataPromise: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterAllDataPromise")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterCsvColumnSeparator(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterCsvColumnSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterCsvColumnSeparator: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterCsvColumnSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterCsvFilename(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterCsvFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterCsvFilename: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterCsvFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterFieldCallback(
      value: (/* grid */ IGridInstanceOf[TEntity], /* row */ IGridRowOf[TEntity], /* col */ IGridColumnOf[TEntity], /* value */ js.Any) => _
    ): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterFieldCallback")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutExporterFieldCallback: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterFieldCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterHeaderFilter(value: /* displayName */ String => String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterHeaderFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExporterHeaderFilter: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterHeaderFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterHeaderFilterUseName(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterHeaderFilterUseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterHeaderFilterUseName: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterHeaderFilterUseName")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterMenuCsv(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterMenuCsv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterMenuCsv: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterMenuCsv")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterMenuExcel(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterMenuExcel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterMenuExcel: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterMenuExcel")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterMenuItemOrder(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterMenuItemOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterMenuItemOrder: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterMenuItemOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterMenuLabel(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterMenuLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterMenuLabel: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterMenuLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterMenuPdf(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterMenuPdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterMenuPdf: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterMenuPdf")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterOlderExcelCompatibility(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterOlderExcelCompatibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterOlderExcelCompatibility: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterOlderExcelCompatibility")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterPdfCustomFormatter(value: /* docDefinition */ js.Any => _): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfCustomFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExporterPdfCustomFormatter: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfCustomFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterPdfDefaultStyle(value: js.Any): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfDefaultStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterPdfDefaultStyle: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfDefaultStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterPdfFilename(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterPdfFilename: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterPdfFooterFunction2(value: (/* currentPage */ Double, /* pageCount */ Double) => String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfFooter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExporterPdfFooter(value: String | js.Any | (js.Function2[/* currentPage */ Double, /* pageCount */ Double, String])): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterPdfFooter: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterPdfHeaderFunction2(value: (/* currentPage */ Double, /* pageCount */ Double) => String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfHeader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExporterPdfHeader(value: String | js.Any | (js.Function2[/* currentPage */ Double, /* pageCount */ Double, String])): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterPdfHeader: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterPdfMaxGridWidth(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfMaxGridWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterPdfMaxGridWidth: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfMaxGridWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterPdfOrientation(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterPdfOrientation: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterPdfPageSize(value: String): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfPageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterPdfPageSize: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterPdfTableHeaderStyle(value: js.Any): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfTableHeaderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterPdfTableHeaderStyle: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfTableHeaderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterPdfTableLayout(value: js.Any): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfTableLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterPdfTableLayout: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfTableLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterPdfTableStyle(value: js.Any): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfTableStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterPdfTableStyle: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterPdfTableStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterSuppressColumns(value: js.Array[String]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterSuppressColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterSuppressColumns: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterSuppressColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withExporterSuppressMenu(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterSuppressMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExporterSuppressMenu: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exporterSuppressMenu")(js.undefined)
        ret
    }
  }
  
}


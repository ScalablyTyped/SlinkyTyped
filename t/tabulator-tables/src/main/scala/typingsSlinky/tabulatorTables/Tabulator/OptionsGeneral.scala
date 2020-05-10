package typingsSlinky.tabulatorTables.Tabulator

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`false`
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.hover
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.load
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsGeneral extends js.Object {
  // Not listed in options--------------------
  /** Tabulator will automatically attempt to redraw the data contained in the table if the containing element for the table is resized. To disable this functionality, set the autoResize property to false */
  var autoResize: js.UndefOr[Boolean] = js.native
  /** The dataEdited callback is triggered whenever the table data is changed by the user. Triggers for this include editing any cell in the table, adding a row and deleting a row. */
  var dataEdited: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  /** The dataLoaded callback is triggered when a new set of data is loaded into the table. */
  var dataLoaded: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  /** The dataLoading callback is triggered whenever new data is loaded into the table. */
  var dataLoading: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  /** The dataSorted callback is triggered after the table dataset is sorted. */
  var dataSorted: js.UndefOr[
    js.Function2[/* sorters */ js.Array[Sorter], /* rows */ js.Array[RowComponent], Unit]
  ] = js.native
  /** The dataSorting callback is triggered whenever a sort event occurs, before sorting happens. */
  var dataSorting: js.UndefOr[js.Function1[/* sorters */ js.Array[Sorter], Unit]] = js.native
  /** Footer  element to display for the table	 */
  var footerElement: js.UndefOr[String | HTMLElement] = js.native
  /** Sets the height of the containing element, can be set to any valid height css value. If set to false (the default), the height of the table will resize to fit the table data.	 */
  var height: js.UndefOr[String | Double | `false`] = js.native
  /** The htmlImported callback is triggered when Tabulator finishes importing data from an HTML table. */
  var htmlImported: js.UndefOr[EmptyCallback] = js.native
  /** The htmlImporting callback is triggered when Tabulator starts importing data from an HTML table. */
  var htmlImporting: js.UndefOr[EmptyCallback] = js.native
  /** Setting the invalidOptionWarnings option to false will disable console warning messages for invalid properties in the table constructor and column definition object */
  var invalidOptionWarnings: js.UndefOr[Boolean] = js.native
  /** Keybinding configuration object	 */
  var keybindings: js.UndefOr[`false` | KeyBinding] = js.native
  /** Can be set to any valid CSS value. By setting this you can allow your table to expand to fit the data, but not overflow its parent element. Whene there are too many rows to fit in the available space, the vertical scroll bar will be shown. This has the added benefit of improving load times on larger tables */
  var maxHeight: js.UndefOr[String | Double] = js.native
  /** With a variable table height you can set the minimum height of the table either defined in the min-height CSS property for the element or set it using the minHeight option in the table constructor, this can be set to any valid CSS value  */
  var minHeight: js.UndefOr[String | Double] = js.native
  /** Whenever a page has been loaded, the pageLoaded callback is called, passing the current page number as an argument. */
  var pageLoaded: js.UndefOr[js.Function1[/* pageno */ Double, Unit]] = js.native
  /** placeholder element to display on empty table	 */
  var placeholder: js.UndefOr[String | HTMLElement] = js.native
  /** * The reactivity systems allow Tabulator to watch arrays and objects passed into the table for changes and then automatically update the table.
    This approach means you no longer need to worry about calling a number of different functions on the table to make changes, you simply update the array or object you originally passed into the table and Tabulator will take care of the rest.
    You can enable reactive data by setting the reactiveData option to true in the table constructor, and then passing your data array to the data option.
    Once the table is built any changes to the array will automatically be replicated to the table without needing to call any functions on the table itself*/
  var reactiveData: js.UndefOr[Boolean] = js.native
  /** The renderComplete callback is triggered after the table has been rendered */
  var renderComplete: js.UndefOr[js.Function0[Unit]] = js.native
  /** The renderStarted callback is triggered whenever all the rows in the table are about to be rendered. This can include:
    Data is loaded into the table when setData is called
    A page is loaded through any form of pagination
    Rows are added to the table during progressive rendering
    Columns are changed by setColumns
    The data is filtered
    The data is sorted
    The redraw function is called */
  var renderStarted: js.UndefOr[js.Function0[Unit]] = js.native
  /** Callback is triggered when the table is horizontally scrolled. */
  var scrollHorizontal: js.UndefOr[js.Function1[/* left */ js.Any, Unit]] = js.native
  /** Callback is triggered when the table is vertically scrolled. */
  var scrollVertical: js.UndefOr[js.Function1[/* top */ js.Any, Unit]] = js.native
  /** When a the tabulator constructor is called, the tableBuilding callback will triggered */
  var tableBuilding: js.UndefOr[js.Function0[Unit]] = js.native
  /** When a the tabulator constructor is called and the table has finished being rendered, the tableBuilt callback will triggered: */
  var tableBuilt: js.UndefOr[js.Function0[Unit]] = js.native
  /** When to regenerate cell tooltip value	 */
  var tooltipGenerationMode: js.UndefOr[load | hover] = js.native
  /** Function to generate tooltips for cells	 */
  var tooltips: js.UndefOr[GlobalTooltipOption] = js.native
  /** Enable rendering using the Virtual DOM engine	 */
  var virtualDom: js.UndefOr[Boolean] = js.native
  /** Manually set the size of the virtual DOM buffer	 */
  var virtualDomBuffer: js.UndefOr[Boolean | Double] = js.native
}

object OptionsGeneral {
  @scala.inline
  def apply(): OptionsGeneral = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsGeneral]
  }
  @scala.inline
  implicit class OptionsGeneralOps[Self <: OptionsGeneral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(js.undefined)
        ret
    }
    @scala.inline
    def withDataEdited(value: /* data */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEdited")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataEdited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEdited")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLoaded(value: /* data */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLoading(value: /* data */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSorted(value: (/* sorters */ js.Array[Sorter], /* rows */ js.Array[RowComponent]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSorted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSorted")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSorting(value: /* sorters */ js.Array[Sorter] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSorting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterElementHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterElement(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerElement")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlImported(value: /* callback */ js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlImported")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHtmlImported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlImported")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlImporting(value: /* callback */ js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlImporting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHtmlImporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlImporting")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidOptionWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidOptionWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidOptionWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidOptionWarnings")(js.undefined)
        ret
    }
    @scala.inline
    def withKeybindings(value: `false` | KeyBinding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keybindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeybindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keybindings")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLoaded(value: /* pageno */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPageLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withReactiveData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactiveData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReactiveData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reactiveData")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderStarted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderStarted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollHorizontal(value: /* left */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHorizontal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollVertical(value: /* top */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollVertical")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBuilding(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBuilding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTableBuilding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBuilding")(js.undefined)
        ret
    }
    @scala.inline
    def withTableBuilt(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBuilt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTableBuilt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBuilt")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipGenerationMode(value: load | hover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipGenerationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipGenerationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipGenerationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipsFunction1(value: /* cell */ CellComponent => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTooltips(value: GlobalTooltipOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltips")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualDom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualDom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualDom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualDom")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualDomBuffer(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualDomBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualDomBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualDomBuffer")(js.undefined)
        ret
    }
  }
  
}


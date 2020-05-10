package typingsSlinky.tabulatorTables.Tabulator

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsDataTree extends js.Object {
  /** To enable data trees in your table, set the dataTree property to true in your table constructor: */
  var dataTree: js.UndefOr[Boolean] = js.native
  /** Show tree branch icon	 */
  var dataTreeBranchElement: js.UndefOr[Boolean | String] = js.native
  /** By default Tabulator will look for child rows in the _children field of a row data object. You can change this to look in a different field using the dataTreeChildField property in your table constructor: */
  var dataTreeChildField: js.UndefOr[String] = js.native
  /** Tree level indent in pixels	 */
  var dataTreeChildIndent: js.UndefOr[Double] = js.native
  /** The toggle button that allows users to collapse and expand the column can be customised to meet your needs. There are two options, dataTreeExpandElement and dataTreeCollapseElement, that can be set to replace the default toggle elements with your own.
    Both options can take either an html string representing the contents of the toggle element */
  var dataTreeCollapseElement: js.UndefOr[String | HTMLElement | Boolean] = js.native
  /**  By default the toggle element will be inserted into the first column on the table. If you want the toggle element to be inserted in a different column you can pass the feild name of the column to the dataTreeElementColumn setup option*/
  var dataTreeElementColumn: js.UndefOr[Boolean | String] = js.native
  /** The toggle button that allows users to expand the column */
  var dataTreeExpandElement: js.UndefOr[String | HTMLElement | Boolean] = js.native
  /**Propagte selection events from parent rows to children */
  var dataTreeSelectPropagate: js.UndefOr[Boolean] = js.native
  /**  By default all nodes on the tree will start collapsed, you can customize the initial expansion state of the tree using the dataTreeStartExpanded option.*
    This option can take one of three possible value types, either a boolean to indicate whether all nodes should start expanded or collapsed: */
  var dataTreeStartExpanded: js.UndefOr[
    Boolean | js.Array[Boolean] | (js.Function2[/* row */ RowComponent, /* level */ Double, Boolean])
  ] = js.native
}

object OptionsDataTree {
  @scala.inline
  def apply(): OptionsDataTree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsDataTree]
  }
  @scala.inline
  implicit class OptionsDataTreeOps[Self <: OptionsDataTree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataTree(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTree")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTreeBranchElement(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeBranchElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTreeBranchElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeBranchElement")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTreeChildField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeChildField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTreeChildField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeChildField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTreeChildIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeChildIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTreeChildIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeChildIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTreeCollapseElementHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeCollapseElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataTreeCollapseElement(value: String | HTMLElement | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeCollapseElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTreeCollapseElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeCollapseElement")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTreeElementColumn(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeElementColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTreeElementColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeElementColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTreeExpandElementHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeExpandElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataTreeExpandElement(value: String | HTMLElement | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeExpandElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTreeExpandElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeExpandElement")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTreeSelectPropagate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeSelectPropagate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTreeSelectPropagate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeSelectPropagate")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTreeStartExpandedFunction2(value: (/* row */ RowComponent, /* level */ Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeStartExpanded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDataTreeStartExpanded(
      value: Boolean | js.Array[Boolean] | (js.Function2[/* row */ RowComponent, /* level */ Double, Boolean])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeStartExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTreeStartExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTreeStartExpanded")(js.undefined)
        ret
    }
  }
  
}


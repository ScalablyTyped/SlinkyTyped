package typingsSlinky.uiGrid.mod.treeBase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions[TEntity] extends js.Object {
  /**
    * If set to true, show the expand/collapse button even if there are no children of a node.
    * You'd use this if you're planning to dynamically load the children
    * Defaults to true, grouping overrides to false
    * @default true
    */
  var showTreeExpandNoChildren: js.UndefOr[Boolean] = js.native
  /**
    * If set to false, don't create the row header. Youll need to programatically control the expand states
    * Defaults to true
    * @default true
    */
  var showTreeRowHeader: js.UndefOr[Boolean] = js.native
  /**
    * Define custom aggregation functions.
    * The properties of this object will be aggregation types available for use on columnDef
    * with treeAggregationType or through the column menu.
    *
    * If a function defined here uses the same name as one of the native aggregations,
    * this one will take precedence
    *
    * The finalizerFn may be used to manipulate the value before rendering, or to apply a custom rendered
    * value. If aggregation.rendered is left undefined, the value will be rendered. Note that the native
    * aggregation functions use an finalizerFn to concatenate the label and the value.
    *
    * Defaults to {}
    * @default {}
    */
  var treeCustomAggregations: js.UndefOr[StringDictionary[IGridTreeBaseCustomAggregation[TEntity]]] = js.native
  /**
    * Number of pixels of indent for the icon at each tree level, wider indents are visually more pleasing,
    * but will make the tree row header wider
    * Defaults to 10
    *
    * @default 10
    */
  var treeIndent: js.UndefOr[Double] = js.native
  /**
    * If set to true, row header even if there are no tree nodes
    */
  var treeRowHeaderAlwaysVisible: js.UndefOr[Boolean] = js.native
  /**
    * Base width of the tree header, provides for a single level of tree.
    * This is incremented by treeIndent for each extra level
    * Defaults to 30
    *
    * @default 30
    */
  var treeRowHeaderBaseWidth: js.UndefOr[Double] = js.native
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
    def withShowTreeExpandNoChildren(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTreeExpandNoChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTreeExpandNoChildren: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTreeExpandNoChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTreeRowHeader(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTreeRowHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTreeRowHeader: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTreeRowHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeCustomAggregations(value: StringDictionary[IGridTreeBaseCustomAggregation[TEntity]]): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeCustomAggregations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeCustomAggregations: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeCustomAggregations")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeIndent(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeIndent: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeRowHeaderAlwaysVisible(value: Boolean): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeRowHeaderAlwaysVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeRowHeaderAlwaysVisible: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeRowHeaderAlwaysVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeRowHeaderBaseWidth(value: Double): Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeRowHeaderBaseWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeRowHeaderBaseWidth: Self[TEntity] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeRowHeaderBaseWidth")(js.undefined)
        ret
    }
  }
  
}


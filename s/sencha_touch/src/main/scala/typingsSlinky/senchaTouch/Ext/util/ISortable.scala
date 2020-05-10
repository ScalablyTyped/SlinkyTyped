package typingsSlinky.senchaTouch.Ext.util

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISortable extends IBase {
  /** [Property] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.native
  /** [Method] Performs initialization of this mixin  */
  var initSortable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var isSortable: js.UndefOr[Boolean] = js.native
  /** [Method] Sorts the data in the Store by one or more of its properties
  		* @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
  		* @param direction String The overall direction to sort the data by.
  		* @param where String
  		* @param doSort Boolean
  		* @returns Ext.util.Sorter[]
  		*/
  var sort: js.UndefOr[
    js.Function4[
      /* sorters */ js.UndefOr[js.Any], 
      /* direction */ js.UndefOr[String], 
      /* where */ js.UndefOr[String], 
      /* doSort */ js.UndefOr[Boolean], 
      Array
    ]
  ] = js.native
  /** [Property] (String) */
  var sortRoot: js.UndefOr[String] = js.native
  /** [Property] (Ext.util.MixedCollection) */
  var sorters: js.UndefOr[IMixedCollection] = js.native
}

object ISortable {
  @scala.inline
  def apply(): ISortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISortable]
  }
  @scala.inline
  implicit class ISortableOps[Self <: ISortable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultSortDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSortDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withInitSortable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSortable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSortable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(
      value: (/* sorters */ js.UndefOr[js.Any], /* direction */ js.UndefOr[String], /* where */ js.UndefOr[String], /* doSort */ js.UndefOr[Boolean]) => Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSorters(value: IMixedCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorters")(js.undefined)
        ret
    }
  }
  
}


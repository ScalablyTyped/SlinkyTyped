package typingsSlinky.senchaTouch.Ext.util

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.senchaTouch.Ext.IClass because Already inherited
- typingsSlinky.senchaTouch.Ext.IBase because Already inherited
- typingsSlinky.senchaTouch.Ext.util.ISortable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined defaultSortDirection, isSortable, sortRoot, sorters, initSortable, sort */ @js.native
trait IMixedCollection extends IAbstractMixedCollection {
  /** [Property] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.native
  /** [Method] Performs initialization of this mixin  */
  var initSortable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var isSortable: js.UndefOr[Boolean] = js.native
  /** [Method] Reorders each of the items based on a mapping from old index to new index
  		* @param mapping Object Mapping from old item index to new item index.
  		*/
  var reorder: js.UndefOr[js.Function1[/* mapping */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sorts the data in the Store by one or more of its properties
  		* @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
  		* @param direction String The overall direction to sort the data by.
  		* @param where String
  		* @param doSort Boolean
  		* @returns Ext.util.Sorter[]
  		*/
  var sort: js.UndefOr[
    js.Function4[js.UndefOr[js.Any], js.UndefOr[String], js.UndefOr[String], js.UndefOr[Boolean], Array]
  ] = js.native
  /** [Method] Sorts the collection by a single sorter function
  		* @param sorterFn Function The function to sort by.
  		*/
  var sortBy: js.UndefOr[js.Function1[/* sorterFn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sorts this collection by keys
  		* @param dir String Sorting direction: 'ASC' or 'DESC'.
  		* @param fn Function Comparison function that defines the sort order. Defaults to sorting by case insensitive string.
  		*/
  var sortByKey: js.UndefOr[js.Function2[/* dir */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Property] (String) */
  var sortRoot: js.UndefOr[String] = js.native
  /** [Property] (Ext.util.MixedCollection) */
  var sorters: js.UndefOr[IMixedCollection] = js.native
}

object IMixedCollection {
  @scala.inline
  def apply(): IMixedCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMixedCollection]
  }
  @scala.inline
  implicit class IMixedCollectionOps[Self <: IMixedCollection] (val x: Self) extends AnyVal {
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
    def withReorder(value: /* mapping */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorder")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: (js.UndefOr[js.Any], js.UndefOr[String], js.UndefOr[String], js.UndefOr[Boolean]) => Array): Self = {
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
    def withSortBy(value: /* sorterFn */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSortBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSortByKey(value: (/* dir */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSortByKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByKey")(js.undefined)
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


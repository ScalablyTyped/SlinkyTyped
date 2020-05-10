package typingsSlinky.senchaTouch.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INodeStore extends IStore {
  /** [Config Option] (Boolean) */
  var folderSort: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of filters
  		* @returns Object
  		*/
  var getFilters: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of folderSort
  		* @returns Boolean
  		*/
  var getFolderSort: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of node
  		* @returns Ext.data.Model
  		*/
  var getNode: js.UndefOr[js.Function0[IModel]] = js.native
  /** [Method] Returns the value of recursive
  		* @returns Boolean
  		*/
  var getRecursive: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of rootVisible
  		* @returns Boolean
  		*/
  var getRootVisible: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of sorters
  		* @returns Object
  		*/
  var getSorters: js.UndefOr[js.Function0[_]] = js.native
  /** [Method]
  		* @param node Object
  		* @returns Boolean
  		*/
  var isVisible: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Config Option] (Ext.data.Model) */
  var node: js.UndefOr[IModel] = js.native
  /** [Config Option] (Boolean) */
  var recursive: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of filters
  		* @param filters Object The new value.
  		*/
  @JSName("setFilters")
  var setFilters_INodeStore: js.UndefOr[js.Function1[/* filters */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of folderSort
  		* @param folderSort Boolean The new value.
  		*/
  var setFolderSort: js.UndefOr[js.Function1[/* folderSort */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of node
  		* @param node Ext.data.Model The new value.
  		*/
  var setNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[IModel], Unit]] = js.native
  /** [Method] Sets the value of recursive
  		* @param recursive Boolean The new value.
  		*/
  var setRecursive: js.UndefOr[js.Function1[/* recursive */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of rootVisible
  		* @param rootVisible Boolean The new value.
  		*/
  var setRootVisible: js.UndefOr[js.Function1[/* rootVisible */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of sorters
  		* @param sorters Object The new value.
  		*/
  @JSName("setSorters")
  var setSorters_INodeStore: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[js.Any], Unit]] = js.native
}

object INodeStore {
  @scala.inline
  def apply(): INodeStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeStore]
  }
  @scala.inline
  implicit class INodeStoreOps[Self <: INodeStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFolderSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolderSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderSort")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFilters(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFolderSort(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFolderSort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFolderSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFolderSort")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNode(value: () => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRecursive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecursive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecursive")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRootVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRootVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSorters(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSorters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSorters")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVisible(value: /* node */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withNode(value: IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursive")(js.undefined)
        ret
    }
    @scala.inline
    def withRootVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFilters(value: /* filters */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFolderSort(value: /* folderSort */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFolderSort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFolderSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFolderSort")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNode(value: /* node */ js.UndefOr[IModel] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRecursive(value: /* recursive */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecursive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecursive")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRootVisible(value: /* rootVisible */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRootVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRootVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRootVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSorters(value: /* sorters */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSorters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSorters")(js.undefined)
        ret
    }
  }
  
}


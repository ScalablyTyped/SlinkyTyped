package typingsSlinky.senchaTouch.Ext

import typingsSlinky.senchaTouch.Ext.data.INodeInterface
import typingsSlinky.senchaTouch.Ext.data.IRecord
import typingsSlinky.senchaTouch.Ext.event.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INestedList extends IContainer {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var backButton: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var backText: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Number) */
  var clearSelectionDelay: js.UndefOr[Double] = js.native
  /** [Config Option] (Ext.Component) */
  var detailCard: js.UndefOr[IComponent] = js.native
  /** [Config Option] (Ext.Container) */
  var detailContainer: js.UndefOr[IContainer] = js.native
  /** [Config Option] (String) */
  var displayField: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns the value of allowDeselect
  		* @returns Boolean
  		*/
  var getAllowDeselect: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of backButton
  		* @returns Object
  		*/
  var getBackButton: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of backText
  		* @returns String
  		*/
  var getBackText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of clearSelectionOnListChange
  		* @returns Boolean
  		*/
  var getClearSelectionOnListChange: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of detailCard
  		* @returns Ext.Component
  		*/
  var getDetailCard: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Returns the value of detailContainer
  		* @returns Ext.Container
  		*/
  var getDetailContainer: js.UndefOr[js.Function0[IContainer]] = js.native
  /** [Method] Returns the value of displayField
  		* @returns String
  		*/
  var getDisplayField: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of emptyText
  		* @returns String
  		*/
  var getEmptyText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of itemHeight
  		* @returns Number
  		*/
  var getItemHeight: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Override this method to provide custom template rendering of individual nodes
  		* @param node Ext.data.Record
  		* @returns String
  		*/
  var getItemTextTpl: js.UndefOr[js.Function1[/* node */ js.UndefOr[IRecord], java.lang.String]] = js.native
  /** [Method] Returns the value of listConfig
  		* @returns Object
  		*/
  var getListConfig: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of loadingText
  		* @returns String
  		*/
  var getLoadingText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of onItemDisclosure
  		* @returns Boolean/Function
  		*/
  var getOnItemDisclosure: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of store
  		* @returns Ext.data.TreeStore/String
  		*/
  var getStore: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the subList for a specified node  */
  var getSubList: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Override this method to provide custom template rendering of titles back buttons when useTitleAsBackText is enabled
  		* @param node Ext.data.Record
  		* @returns String
  		*/
  var getTitleTextTpl: js.UndefOr[js.Function1[/* node */ js.UndefOr[IRecord], java.lang.String]] = js.native
  /** [Method] Returns the value of toolbar
  		* @returns Ext.Toolbar/Object/Boolean
  		*/
  var getToolbar: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of updateTitleText
  		* @returns Boolean
  		*/
  var getUpdateTitleText: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of useSimpleItems
  		* @returns Boolean
  		*/
  var getUseSimpleItems: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of useTitleAsBackText
  		* @returns Boolean
  		*/
  var getUseTitleAsBackText: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of useToolbar
  		* @returns Boolean
  		*/
  var getUseToolbar: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of variableHeights
  		* @returns Boolean
  		*/
  var getVariableHeights: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] The leaf you want to navigate to
  		* @param node Ext.data.NodeInterface The specified node to navigate to.
  		*/
  var goToLeaf: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], Unit]] = js.native
  /** [Method] Method to handle going to a specific node within this nested list
  		* @param node Ext.data.NodeInterface The specified node to navigate to.
  		*/
  var goToNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], Unit]] = js.native
  /** [Config Option] (Number) */
  var itemHeight: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var listConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var loadingText: js.UndefOr[java.lang.String] = js.native
  /** [Method] Called when the backButton has been tapped  */
  var onBackTap: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean/Function) */
  var onItemDisclosure: js.UndefOr[js.Any] = js.native
  /** [Method] Called when an list item has been tapped
  		* @param list Ext.List The subList the item is on.
  		* @param index Number The id of the item tapped.
  		* @param target Ext.Element The list item tapped.
  		* @param record Ext.data.Record The record which as tapped.
  		* @param e Ext.event.Event The event.
  		*/
  var onItemTap: js.UndefOr[
    js.Function5[
      /* list */ js.UndefOr[IList], 
      /* index */ js.UndefOr[Double], 
      /* target */ js.UndefOr[IElement], 
      /* record */ js.UndefOr[IRecord], 
      /* e */ js.UndefOr[IEvent], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the value of allowDeselect
  		* @param allowDeselect Boolean The new value.
  		*/
  var setAllowDeselect: js.UndefOr[js.Function1[/* allowDeselect */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of backButton
  		* @param backButton Object The new value.
  		*/
  var setBackButton: js.UndefOr[js.Function1[/* backButton */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of backText
  		* @param backText String The new value.
  		*/
  var setBackText: js.UndefOr[js.Function1[/* backText */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of clearSelectionOnListChange
  		* @param clearSelectionOnListChange Boolean The new value.
  		*/
  var setClearSelectionOnListChange: js.UndefOr[js.Function1[/* clearSelectionOnListChange */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of detailCard
  		* @param detailCard Ext.Component The new value.
  		*/
  var setDetailCard: js.UndefOr[js.Function1[/* detailCard */ js.UndefOr[IComponent], Unit]] = js.native
  /** [Method] Sets the value of detailContainer
  		* @param detailContainer Ext.Container The new value.
  		*/
  var setDetailContainer: js.UndefOr[js.Function1[/* detailContainer */ js.UndefOr[IContainer], Unit]] = js.native
  /** [Method] Sets the value of displayField
  		* @param displayField String The new value.
  		*/
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of emptyText
  		* @param emptyText String The new value.
  		*/
  var setEmptyText: js.UndefOr[js.Function1[/* emptyText */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of itemHeight
  		* @param itemHeight Number The new value.
  		*/
  var setItemHeight: js.UndefOr[js.Function1[/* itemHeight */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of listConfig
  		* @param listConfig Object The new value.
  		*/
  var setListConfig: js.UndefOr[js.Function1[/* listConfig */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of loadingText
  		* @param loadingText String The new value.
  		*/
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of onItemDisclosure
  		* @param onItemDisclosure Boolean/Function The new value.
  		*/
  var setOnItemDisclosure: js.UndefOr[js.Function1[/* onItemDisclosure */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of store
  		* @param store Ext.data.TreeStore/String The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of toolbar
  		* @param toolbar Ext.Toolbar/Object/Boolean The new value.
  		*/
  var setToolbar: js.UndefOr[js.Function1[/* toolbar */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of ui
  		* @param ui Object The new value.
  		*/
  @JSName("setUi")
  var setUi_INestedList: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of updateTitleText
  		* @param updateTitleText Boolean The new value.
  		*/
  var setUpdateTitleText: js.UndefOr[js.Function1[/* updateTitleText */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of useSimpleItems
  		* @param useSimpleItems Boolean The new value.
  		*/
  var setUseSimpleItems: js.UndefOr[js.Function1[/* useSimpleItems */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of useTitleAsBackText
  		* @param useTitleAsBackText Boolean The new value.
  		*/
  var setUseTitleAsBackText: js.UndefOr[js.Function1[/* useTitleAsBackText */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of useToolbar
  		* @param useToolbar Boolean The new value.
  		*/
  var setUseToolbar: js.UndefOr[js.Function1[/* useToolbar */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of variableHeights
  		* @param variableHeights Boolean The new value.
  		*/
  var setVariableHeights: js.UndefOr[js.Function1[/* variableHeights */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Ext.data.TreeStore/String) */
  var store: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Ext.Toolbar/Object/Boolean) */
  var toolbar: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var updateTitleText: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var useSimpleItems: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var useTitleAsBackText: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var useToolbar: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var variableHeights: js.UndefOr[Boolean] = js.native
}

object INestedList {
  @scala.inline
  def apply(): INestedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INestedList]
  }
  @scala.inline
  implicit class INestedListOps[Self <: INestedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDeselect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withBackButton(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backButton")(js.undefined)
        ret
    }
    @scala.inline
    def withBackText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backText")(js.undefined)
        ret
    }
    @scala.inline
    def withClearSelectionDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelectionDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearSelectionDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelectionDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailCard(value: IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailCard")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailContainer(value: IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayField(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAllowDeselect(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowDeselect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAllowDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBackButton(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBackButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackButton")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBackText(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBackText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetClearSelectionOnListChange(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClearSelectionOnListChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetClearSelectionOnListChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClearSelectionOnListChange")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDetailCard(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDetailCard")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDetailCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDetailCard")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDetailContainer(value: () => IContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDetailContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDetailContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDetailContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDisplayField(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDisplayField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisplayField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEmptyText(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmptyText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEmptyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemTextTpl(value: /* node */ js.UndefOr[IRecord] => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemTextTpl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetItemTextTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemTextTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetListConfig(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetListConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLoadingText(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoadingText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOnItemDisclosure(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnItemDisclosure")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOnItemDisclosure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnItemDisclosure")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStore(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSubList(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSubList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubList")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTitle(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTitleTextTpl(value: /* node */ js.UndefOr[IRecord] => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitleTextTpl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetTitleTextTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitleTextTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetToolbar(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToolbar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUpdateTitleText(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUpdateTitleText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUpdateTitleText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUpdateTitleText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUseSimpleItems(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseSimpleItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseSimpleItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseSimpleItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUseTitleAsBackText(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseTitleAsBackText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseTitleAsBackText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseTitleAsBackText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUseToolbar(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseToolbar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withGetVariableHeights(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVariableHeights")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetVariableHeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVariableHeights")(js.undefined)
        ret
    }
    @scala.inline
    def withGoToLeaf(value: /* node */ js.UndefOr[INodeInterface] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToLeaf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGoToLeaf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToLeaf")(js.undefined)
        ret
    }
    @scala.inline
    def withGoToNode(value: /* node */ js.UndefOr[INodeInterface] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGoToNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goToNode")(js.undefined)
        ret
    }
    @scala.inline
    def withItemHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withListConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBackTap(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackTap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBackTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemDisclosure(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDisclosure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnItemDisclosure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDisclosure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemTap(
      value: (/* list */ js.UndefOr[IList], /* index */ js.UndefOr[Double], /* target */ js.UndefOr[IElement], /* record */ js.UndefOr[IRecord], /* e */ js.UndefOr[IEvent]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemTap")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnItemTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemTap")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAllowDeselect(value: /* allowDeselect */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowDeselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAllowDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBackButton(value: /* backButton */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBackButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBackText(value: /* backText */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBackText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetClearSelectionOnListChange(value: /* clearSelectionOnListChange */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClearSelectionOnListChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetClearSelectionOnListChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClearSelectionOnListChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDetailCard(value: /* detailCard */ js.UndefOr[IComponent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDetailCard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDetailCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDetailCard")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDetailContainer(value: /* detailContainer */ js.UndefOr[IContainer] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDetailContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDetailContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDetailContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDisplayField(value: /* displayField */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisplayField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisplayField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisplayField")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEmptyText(value: /* emptyText */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEmptyText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEmptyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEmptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItemHeight(value: /* itemHeight */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetListConfig(value: /* listConfig */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setListConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetListConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setListConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLoadingText(value: /* loadingText */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoadingText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOnItemDisclosure(value: /* onItemDisclosure */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnItemDisclosure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOnItemDisclosure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnItemDisclosure")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStore")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetToolbar(value: /* toolbar */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToolbar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUi(value: /* ui */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUi")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUi")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUpdateTitleText(value: /* updateTitleText */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUpdateTitleText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUpdateTitleText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUpdateTitleText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUseSimpleItems(value: /* useSimpleItems */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseSimpleItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseSimpleItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseSimpleItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUseTitleAsBackText(value: /* useTitleAsBackText */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseTitleAsBackText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseTitleAsBackText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseTitleAsBackText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUseToolbar(value: /* useToolbar */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseToolbar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withSetVariableHeights(value: /* variableHeights */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVariableHeights")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetVariableHeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVariableHeights")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTitleText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTitleText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTitleText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTitleText")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSimpleItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSimpleItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSimpleItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSimpleItems")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTitleAsBackText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTitleAsBackText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTitleAsBackText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTitleAsBackText")(js.undefined)
        ret
    }
    @scala.inline
    def withUseToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableHeights(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableHeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableHeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableHeights")(js.undefined)
        ret
    }
  }
  
}


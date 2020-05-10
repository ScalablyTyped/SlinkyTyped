package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IList
  extends typingsSlinky.senchaTouch.Ext.dataview.IDataView {
  /** [Property] (Number) */
  var bufferSize: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var disclosureProperty: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns the value of disclosureProperty
  		* @returns String
  		*/
  var getDisclosureProperty: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of grouped
  		* @returns Boolean
  		*/
  var getGrouped: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of icon
  		* @returns Object
  		*/
  var getIcon: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of indexBar
  		* @returns Boolean/Object
  		*/
  var getIndexBar: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of infinite
  		* @returns Boolean
  		*/
  var getInfinite: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of itemHeight
  		* @returns Number
  		*/
  var getItemHeight: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minimumBufferDistance
  		* @returns Number
  		*/
  var getMinimumBufferDistance: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of onItemDisclosure
  		* @returns Boolean/Function/Object
  		*/
  var getOnItemDisclosure: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of pinHeaders
  		* @returns Boolean
  		*/
  var getPinHeaders: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of preventSelectionOnDisclose
  		* @returns Boolean
  		*/
  var getPreventSelectionOnDisclose: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of refreshHeightOnUpdate
  		* @returns Boolean
  		*/
  var getRefreshHeightOnUpdate: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns all the items that are docked in the scroller in this list
  		* @returns Array An array of the scrollDock items
  		*/
  var getScrollDockedItems: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of striped
  		* @returns Boolean
  		*/
  var getStriped: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of useHeaders
  		* @returns Boolean
  		*/
  var getUseHeaders: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of useSimpleItems
  		* @returns Boolean
  		*/
  var getUseSimpleItems: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of variableHeights
  		* @returns Boolean
  		*/
  var getVariableHeights: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var grouped: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean/Object) */
  var indexBar: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var infinite: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var itemHeight: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean/Function/Object) */
  var onItemDisclosure: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var pinHeaders: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var preventSelectionOnDisclose: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var refreshHeightOnUpdate: js.UndefOr[Boolean] = js.native
  /** [Method] Scrolls the list so that the specified record is at the top
  		* @param record Object {Ext.data.Model} Record in the lists store to scroll to
  		* @param animate Object {Boolean} Determines if scrolling is animated to a cut
  		* @param overscroll Object {Boolean} Determines if list can be overscrolled
  		*/
  var scrollToRecord: js.UndefOr[
    js.Function3[
      /* record */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      /* overscroll */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the value of disclosureProperty
  		* @param disclosureProperty String The new value.
  		*/
  var setDisclosureProperty: js.UndefOr[js.Function1[/* disclosureProperty */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of grouped
  		* @param grouped Boolean The new value.
  		*/
  var setGrouped: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of icon
  		* @param icon Object The new value.
  		*/
  var setIcon: js.UndefOr[js.Function1[/* icon */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of indexBar
  		* @param indexBar Boolean/Object The new value.
  		*/
  var setIndexBar: js.UndefOr[js.Function1[/* indexBar */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of infinite
  		* @param infinite Boolean The new value.
  		*/
  var setInfinite: js.UndefOr[js.Function1[/* infinite */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of itemHeight
  		* @param itemHeight Number The new value.
  		*/
  var setItemHeight: js.UndefOr[js.Function1[/* itemHeight */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minimumBufferDistance
  		* @param minimumBufferDistance Number The new value.
  		*/
  var setMinimumBufferDistance: js.UndefOr[js.Function1[/* minimumBufferDistance */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of onItemDisclosure
  		* @param onItemDisclosure Boolean/Function/Object The new value.
  		*/
  var setOnItemDisclosure: js.UndefOr[js.Function1[/* onItemDisclosure */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of pinHeaders
  		* @param pinHeaders Boolean The new value.
  		*/
  var setPinHeaders: js.UndefOr[js.Function1[/* pinHeaders */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of preventSelectionOnDisclose
  		* @param preventSelectionOnDisclose Boolean The new value.
  		*/
  var setPreventSelectionOnDisclose: js.UndefOr[js.Function1[/* preventSelectionOnDisclose */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of refreshHeightOnUpdate
  		* @param refreshHeightOnUpdate Boolean The new value.
  		*/
  var setRefreshHeightOnUpdate: js.UndefOr[js.Function1[/* refreshHeightOnUpdate */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of striped
  		* @param striped Boolean The new value.
  		*/
  var setStriped: js.UndefOr[js.Function1[/* striped */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of useHeaders
  		* @param useHeaders Boolean The new value.
  		*/
  var setUseHeaders: js.UndefOr[js.Function1[/* useHeaders */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of useSimpleItems
  		* @param useSimpleItems Boolean The new value.
  		*/
  var setUseSimpleItems: js.UndefOr[js.Function1[/* useSimpleItems */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of variableHeights
  		* @param variableHeights Boolean The new value.
  		*/
  var setVariableHeights: js.UndefOr[js.Function1[/* variableHeights */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var striped: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var useSimpleItems: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var variableHeights: js.UndefOr[Boolean] = js.native
}

object IList {
  @scala.inline
  def apply(): IList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IList]
  }
  @scala.inline
  implicit class IListOps[Self <: IList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDisclosureProperty(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disclosureProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisclosureProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disclosureProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDisclosureProperty(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisclosureProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDisclosureProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisclosureProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGrouped(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrouped")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGrouped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrouped")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIcon(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIcon")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIndexBar(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexBar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIndexBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexBar")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInfinite(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInfinite")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInfinite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInfinite")(js.undefined)
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
    def withGetMinimumBufferDistance(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinimumBufferDistance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinimumBufferDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinimumBufferDistance")(js.undefined)
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
    def withGetPinHeaders(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPinHeaders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPinHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPinHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPreventSelectionOnDisclose(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreventSelectionOnDisclose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPreventSelectionOnDisclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreventSelectionOnDisclose")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRefreshHeightOnUpdate(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRefreshHeightOnUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRefreshHeightOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRefreshHeightOnUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScrollDockedItems(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollDockedItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScrollDockedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollDockedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStriped(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStriped")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStriped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStriped")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUseHeaders(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseHeaders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseHeaders")(js.undefined)
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
    def withGrouped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouped")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexBar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexBar")(js.undefined)
        ret
    }
    @scala.inline
    def withInfinite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfinite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(js.undefined)
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
    def withPinHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventSelectionOnDisclose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSelectionOnDisclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventSelectionOnDisclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSelectionOnDisclose")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshHeightOnUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshHeightOnUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshHeightOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshHeightOnUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToRecord(
      value: (/* record */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], /* overscroll */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToRecord")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutScrollToRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDisclosureProperty(value: /* disclosureProperty */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisclosureProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDisclosureProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDisclosureProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGrouped(value: /* grouped */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGrouped")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGrouped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGrouped")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIcon(value: /* icon */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIndexBar(value: /* indexBar */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndexBar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIndexBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndexBar")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInfinite(value: /* infinite */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInfinite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInfinite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInfinite")(js.undefined)
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
    def withSetMinimumBufferDistance(value: /* minimumBufferDistance */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinimumBufferDistance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinimumBufferDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinimumBufferDistance")(js.undefined)
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
    def withSetPinHeaders(value: /* pinHeaders */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPinHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPinHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPinHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPreventSelectionOnDisclose(value: /* preventSelectionOnDisclose */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreventSelectionOnDisclose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPreventSelectionOnDisclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreventSelectionOnDisclose")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRefreshHeightOnUpdate(value: /* refreshHeightOnUpdate */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRefreshHeightOnUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRefreshHeightOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRefreshHeightOnUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStriped(value: /* striped */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStriped")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStriped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStriped")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUseHeaders(value: /* useHeaders */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseHeaders")(js.undefined)
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
    def withStriped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("striped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStriped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("striped")(js.undefined)
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


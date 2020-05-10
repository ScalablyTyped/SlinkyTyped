package typingsSlinky.senchaTouch.Ext.chart.series

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISeries extends IObservable {
  /** [Config Option] (Object) */
  var animate: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Array) */
  var colors: js.UndefOr[Array] = js.native
  /** [Method] Returns the value of animate
  		* @returns Object
  		*/
  var getAnimate: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of background
  		* @returns Object
  		*/
  var getBackground: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of colors
  		* @returns Array
  		*/
  var getColors: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of hidden
  		* @returns Boolean|Array
  		*/
  var getHidden: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of highlightCfg
  		* @returns Object
  		*/
  var getHighlightCfg: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of highlightItem
  		* @returns Object
  		*/
  var getHighlightItem: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
  		* @param x Number
  		* @param y Number
  		* @param target Object optional target to receive the result
  		* @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
  		*/
  var getItemForPoint: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* target */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] Returns the value of itemInstancing
  		* @returns Object
  		*/
  var getItemInstancing: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of label
  		* @returns Object
  		*/
  var getLabel: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of labelField
  		* @returns String/String[]
  		*/
  var getLabelField: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of labelOverflowPadding
  		* @returns Number
  		*/
  var getLabelOverflowPadding: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of marker
  		* @returns Object
  		*/
  var getMarker: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of markerSubStyle
  		* @returns Object
  		*/
  var getMarkerSubStyle: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of overlaySurface
  		* @returns Object
  		*/
  var getOverlaySurface: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of renderer
  		* @returns Function
  		*/
  var getRenderer: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of showInLegend
  		* @returns Boolean
  		*/
  var getShowInLegend: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Performs drawing of this series  */
  var getSprites: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of style
  		* @returns Object
  		*/
  var getStyle: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of subStyle
  		* @returns Object
  		*/
  var getSubStyle: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of surface
  		* @returns Object
  		*/
  var getSurface: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Boolean|Array) */
  var hidden: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var highlightCfg: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var highlightItem: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var itemInstancing: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/String[]) */
  var labelField: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var labelOverflowPadding: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var marker: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var markerSubStyle: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var overlaySurface: js.UndefOr[js.Any] = js.native
  /** [Method] Provide legend information to target array
  		* @param target Array The information consists:
  		*/
  var provideLegendInfo: js.UndefOr[js.Function1[/* target */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_ISeries: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.native
  /** [Property] (String) */
  var seriesType: js.UndefOr[String] = js.native
  /** [Method] Sets the value of animate
  		* @param animate Object The new value.
  		*/
  var setAnimate: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of background
  		* @param background Object The new value.
  		*/
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of colors
  		* @param colors Array The new value.
  		*/
  var setColors: js.UndefOr[js.Function1[/* colors */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of hidden
  		* @param hidden Boolean|Array The new value.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method]
  		* @param index Number
  		* @param value Boolean
  		*/
  var setHiddenByIndex: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* value */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Sets the value of highlightCfg
  		* @param highlightCfg Object The new value.
  		*/
  var setHighlightCfg: js.UndefOr[js.Function1[/* highlightCfg */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of highlightItem
  		* @param highlightItem Object The new value.
  		*/
  var setHighlightItem: js.UndefOr[js.Function1[/* highlightItem */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of itemInstancing
  		* @param itemInstancing Object The new value.
  		*/
  var setItemInstancing: js.UndefOr[js.Function1[/* itemInstancing */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of label
  		* @param label Object The new value.
  		* @returns Object/String The attributes that have been changed or added, or the text for the label. Example to enclose every other label in parentheses: renderer: function (text) { if (index % 2 == 0) { return '(' + text + ')' } } Default value: null.
  		*/
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Sets the value of labelField
  		* @param labelField String/String[] The new value.
  		*/
  var setLabelField: js.UndefOr[js.Function1[/* labelField */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of labelOverflowPadding
  		* @param labelOverflowPadding Number The new value.
  		*/
  var setLabelOverflowPadding: js.UndefOr[js.Function1[/* labelOverflowPadding */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of marker
  		* @param marker Object The new value.
  		*/
  var setMarker: js.UndefOr[js.Function1[/* marker */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of markerSubStyle
  		* @param markerSubStyle Object The new value.
  		*/
  var setMarkerSubStyle: js.UndefOr[js.Function1[/* markerSubStyle */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of overlaySurface
  		* @param overlaySurface Object The new value.
  		*/
  var setOverlaySurface: js.UndefOr[js.Function1[/* overlaySurface */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of renderer
  		* @param renderer Function The new value.
  		* @returns Object The attributes that have been changed or added. Note: it is usually possible to add or modify the attributes directly into the config parameter and not return anything, but returning an object with only those attributes that have been changed may allow for optimizations in the rendering of some series. Example to draw every other item in red: renderer: function (sprite, config, rendererData, index) { if (index % 2 == 0) { return { strokeStyle: 'red' }; } }
  		*/
  var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Sets the value of showInLegend
  		* @param showInLegend Boolean The new value.
  		*/
  var setShowInLegend: js.UndefOr[js.Function1[/* showInLegend */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of store
  		* @param store Object The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of style
  		* @param style Object The new value.
  		*/
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of subStyle
  		* @param subStyle Object The new value.
  		*/
  var setSubStyle: js.UndefOr[js.Function1[/* subStyle */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of surface
  		* @param surface Object The new value.
  		*/
  var setSurface: js.UndefOr[js.Function1[/* surface */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var store: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var subStyle: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var surface: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var `type`: js.UndefOr[String] = js.native
}

object ISeries {
  @scala.inline
  def apply(): ISeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISeries]
  }
  @scala.inline
  implicit class ISeriesOps[Self <: ISeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAnimate(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimate")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBackground(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackground")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withGetColors(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColors")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHidden(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHidden")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHighlightCfg(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHighlightCfg")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHighlightCfg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHighlightCfg")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHighlightItem(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHighlightItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHighlightItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHighlightItem")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemForPoint(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* target */ js.UndefOr[js.Any]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemForPoint")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetItemForPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemForPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemInstancing(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemInstancing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItemInstancing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemInstancing")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLabel(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLabelField(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLabelField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLabelOverflowPadding(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelOverflowPadding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLabelOverflowPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelOverflowPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMarker(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarker")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMarkerSubStyle(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarkerSubStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMarkerSubStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarkerSubStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOverlaySurface(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOverlaySurface")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOverlaySurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOverlaySurface")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRenderer(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withGetShowInLegend(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShowInLegend")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetShowInLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShowInLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSprites(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSprites")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSprites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSprites")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStyle(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSubStyle(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSubStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSurface(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSurface")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSurface")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
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
    def withHidden(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightCfg(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCfg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightCfg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCfg")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightItem")(js.undefined)
        ret
    }
    @scala.inline
    def withItemInstancing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemInstancing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemInstancing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemInstancing")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelField(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelField")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOverflowPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOverflowPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOverflowPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOverflowPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerSubStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSubStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerSubStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSubStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlaySurface(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlaySurface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlaySurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlaySurface")(js.undefined)
        ret
    }
    @scala.inline
    def withProvideLegendInfo(value: /* target */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideLegendInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProvideLegendInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provideLegendInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRelayEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesType")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAnimate(value: /* animate */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnimate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnimate")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBackground(value: /* background */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackground")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withSetColors(value: /* colors */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColors")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHidden(value: /* hidden */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHiddenByIndex(value: (/* index */ js.UndefOr[Double], /* value */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHiddenByIndex")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetHiddenByIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHiddenByIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHighlightCfg(value: /* highlightCfg */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHighlightCfg")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHighlightCfg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHighlightCfg")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHighlightItem(value: /* highlightItem */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHighlightItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHighlightItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHighlightItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSetItemInstancing(value: /* itemInstancing */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemInstancing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetItemInstancing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItemInstancing")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLabel(value: /* label */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLabelField(value: /* labelField */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLabelField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelField")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLabelOverflowPadding(value: /* labelOverflowPadding */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelOverflowPadding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLabelOverflowPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelOverflowPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMarker(value: /* marker */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMarker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMarkerSubStyle(value: /* markerSubStyle */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMarkerSubStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMarkerSubStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMarkerSubStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOverlaySurface(value: /* overlaySurface */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOverlaySurface")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOverlaySurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOverlaySurface")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRenderer(value: /* renderer */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withSetShowInLegend(value: /* showInLegend */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShowInLegend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetShowInLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShowInLegend")(js.undefined)
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
    def withSetStyle(value: /* style */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSubStyle(value: /* subStyle */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSubStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSurface(value: /* surface */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSurface")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSurface")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = {
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
    def withShowInLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInLegend")(js.undefined)
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
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSubStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSurface(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surface")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}


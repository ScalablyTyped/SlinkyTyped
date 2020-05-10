package typingsSlinky.senchaTouch.Ext.chart

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.data.IStore
import typingsSlinky.senchaTouch.Ext.draw.IComponent
import typingsSlinky.senchaTouch.Ext.draw.ISurface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstractChart extends IComponent {
  /** [Config Option] (Boolean/Object) */
  var animate: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.chart.axis.Axis/Array/Object) */
  var axes: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.native
  /** [Method] Changes the data store bound to this chart and refreshes it
  		* @param store Ext.data.Store The store to bind to this chart.
  		*/
  var bindStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  /** [Method] Cancel a scheduled layout  */
  var cancelLayout: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean/Array) */
  var colors: js.UndefOr[js.Any] = js.native
  /** [Method] Flattens the given chart surfaces into a single image
  		* @param surfaces Array A list of chart's surfaces to flatten.
  		* @param format String If set to 'image', the method will return an Image object. Otherwise, the dataURL  of the flattened image will be returned.
  		* @returns String|Image An Image DOM element containing the flattened image or its dataURL.
  		*/
  var flatten: js.UndefOr[
    js.Function2[/* surfaces */ js.UndefOr[Array], /* format */ js.UndefOr[String], _]
  ] = js.native
  /** [Method] Returns the value of axes
  		* @returns Ext.chart.axis.Axis/Array/Object
  		*/
  var getAxes: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of colors
  		* @returns Boolean/Array
  		*/
  var getColors: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of highlightItem
  		* @returns Object
  		*/
  var getHighlightItem: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of innerPadding
  		* @returns Object
  		*/
  var getInnerPadding: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of insetPadding
  		* @returns Object|Number
  		*/
  var getInsetPadding: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of interactions
  		* @returns Array
  		*/
  var getInteractions: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Given an x y point relative to the chart find and return the first series item that matches that point
  		* @param x Number
  		* @param y Number
  		* @returns Object An object with series and item properties, or false if no item found.
  		*/
  var getItemForPoint: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], _]] = js.native
  /** [Method] Given an x y point relative to the chart find and return all series items that match that point
  		* @param x Number
  		* @param y Number
  		* @returns Array An array of objects with series and item properties.
  		*/
  var getItemsForPoint: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Array]] = js.native
  /** [Method] Returns the value of legend
  		* @returns Ext.chart.Legend/Object
  		*/
  var getLegend: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Return the legend store that contains all the legend information
  		* @returns Ext.data.Store
  		*/
  var getLegendStore: js.UndefOr[js.Function0[IStore]] = js.native
  /** [Method] Returns the value of series
  		* @returns Ext.chart.series.Series/Array
  		*/
  var getSeries: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of shadow
  		* @returns Boolean/Object
  		*/
  var getShadow: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of store
  		* @returns Ext.data.Store
  		*/
  var getStore: js.UndefOr[js.Function0[IStore]] = js.native
  /** [Method] Get a surface by the given id or create one if it doesn t exist
  		* @param name Object
  		* @param type Object
  		* @returns Ext.draw.Surface
  		*/
  @JSName("getSurface")
  var getSurface_IAbstractChart: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[js.Any], /* type */ js.UndefOr[js.Any], ISurface]
  ] = js.native
  /** [Config Option] (Object) */
  var highlightItem: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var innerPadding: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object|Number) */
  var insetPadding: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Array) */
  var interactions: js.UndefOr[Array] = js.native
  /** [Config Option] (Ext.chart.Legend/Object) */
  var legend: js.UndefOr[js.Any] = js.native
  /** [Method] Redraw the chart  */
  var redraw: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Resume the layout initialized by thickness change */
  var resumeThicknessChanged: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Schedule a layout at next frame  */
  var scheduleLayout: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Ext.chart.series.Series/Array) */
  var series: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of animate
  		* @param animate Boolean/Object The new value.
  		*/
  var setAnimate: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of axes
  		* @param axes Ext.chart.axis.Axis/Array/Object The new value.
  		*/
  var setAxes: js.UndefOr[js.Function1[/* axes */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of colors
  		* @param colors Boolean/Array The new value.
  		*/
  var setColors: js.UndefOr[js.Function1[/* colors */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of highlightItem
  		* @param highlightItem Object The new value.
  		*/
  var setHighlightItem: js.UndefOr[js.Function1[/* highlightItem */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of innerPadding
  		* @param innerPadding Object The new value.
  		*/
  var setInnerPadding: js.UndefOr[js.Function1[/* innerPadding */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of insetPadding
  		* @param insetPadding Object|Number The new value.
  		*/
  var setInsetPadding: js.UndefOr[js.Function1[/* insetPadding */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of interactions
  		* @param interactions Array The new value.
  		*/
  var setInteractions: js.UndefOr[js.Function1[/* interactions */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of legend
  		* @param legend Ext.chart.Legend/Object The new value.
  		*/
  var setLegend: js.UndefOr[js.Function1[/* legend */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of series
  		* @param series Ext.chart.series.Series/Array The new value.
  		*/
  var setSeries: js.UndefOr[js.Function1[/* series */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of shadow
  		* @param shadow Boolean/Object The new value.
  		*/
  var setShadow: js.UndefOr[js.Function1[/* shadow */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of store
  		* @param store Ext.data.Store The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], Unit]] = js.native
  /** [Config Option] (Boolean/Object) */
  var shadow: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.native
  /** [Method] Suspend the layout initialized by thickness change */
  var suspendThicknessChanged: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (String) */
  var version: js.UndefOr[String] = js.native
}

object IAbstractChart {
  @scala.inline
  def apply(): IAbstractChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractChart]
  }
  @scala.inline
  implicit class IAbstractChartOps[Self <: IAbstractChart] (val x: Self) extends AnyVal {
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
    def withAxes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.undefined)
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
    def withBindStore(value: /* store */ js.UndefOr[IStore] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBindStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStore")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCancelLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: js.Any): Self = {
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
    def withFlatten(value: (/* surfaces */ js.UndefOr[Array], /* format */ js.UndefOr[String]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFlatten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAxes(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAxes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAxes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetColors(value: () => _): Self = {
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
    def withGetInnerPadding(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInnerPadding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInnerPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInnerPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInsetPadding(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInsetPadding")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInsetPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInsetPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withGetInteractions(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInteractions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetInteractions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInteractions")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemForPoint(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemForPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetItemForPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemForPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemsForPoint(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemsForPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetItemsForPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemsForPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLegend(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLegend")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLegendStore(value: () => IStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLegendStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLegendStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLegendStore")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSeries(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSeries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withGetShadow(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShadow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStore(value: () => IStore): Self = {
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
    def withGetSurface(value: (/* name */ js.UndefOr[js.Any], /* type */ js.UndefOr[js.Any]) => ISurface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSurface")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetSurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSurface")(js.undefined)
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
    def withInnerPadding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withInsetPadding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insetPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsetPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insetPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractions(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactions")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withRedraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redraw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRedraw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redraw")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeThicknessChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeThicknessChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutResumeThicknessChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeThicknessChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutScheduleLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
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
    def withSetAxes(value: /* axes */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAxes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAxes")(js.undefined)
        ret
    }
    @scala.inline
    def withSetColors(value: /* colors */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withSetInnerPadding(value: /* innerPadding */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInnerPadding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInnerPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInnerPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInsetPadding(value: /* insetPadding */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInsetPadding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInsetPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInsetPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withSetInteractions(value: /* interactions */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInteractions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetInteractions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInteractions")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLegend(value: /* legend */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLegend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSeries(value: /* series */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSeries")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withSetShadow(value: /* shadow */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShadow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStore(value: /* store */ js.UndefOr[IStore] => Unit): Self = {
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
    def withShadow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: IStore): Self = {
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
    def withSuspendThicknessChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendThicknessChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSuspendThicknessChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendThicknessChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.senchaTouch.Ext.chart.axis

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.chart.IAbstractChart
import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import typingsSlinky.senchaTouch.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAxis extends IObservable {
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.chart.AbstractChart) */
  var chart: js.UndefOr[IAbstractChart] = js.native
  /** [Config Option] (Array) */
  var fields: js.UndefOr[Array] = js.native
  /** [Method] Returns the value of background
  		* @returns Object
  		*/
  var getBackground: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of chart
  		* @returns Ext.chart.AbstractChart
  		*/
  var getChart: js.UndefOr[js.Function0[IAbstractChart]] = js.native
  /** [Method] Mapping data value into coordinate
  		* @param value *
  		* @param field String
  		* @param idx Number
  		* @param items Ext.util.MixedCollection
  		* @returns Number
  		*/
  var getCoordFor: js.UndefOr[
    js.Function4[
      /* value */ js.UndefOr[js.Any], 
      /* field */ js.UndefOr[String], 
      /* idx */ js.UndefOr[Double], 
      /* items */ js.UndefOr[IMixedCollection], 
      Double
    ]
  ] = js.native
  /** [Method] Returns the value of fields
  		* @returns Array
  		*/
  var getFields: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of grid
  		* @returns Object
  		*/
  var getGrid: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of hidden
  		* @returns Boolean
  		*/
  var getHidden: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of increment
  		* @returns Number
  		*/
  var getIncrement: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of label
  		* @returns Object
  		*/
  var getLabel: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of labelInSpan
  		* @returns Boolean
  		*/
  var getLabelInSpan: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of layout
  		* @returns Object|Ext.chart.axis.layout.Layout
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of majorTickSteps
  		* @returns Number
  		*/
  var getMajorTickSteps: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maxZoom
  		* @returns Number
  		*/
  var getMaxZoom: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maximum
  		* @returns Number
  		*/
  var getMaximum: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minZoom
  		* @returns Number
  		*/
  var getMinZoom: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minimum
  		* @returns Number
  		*/
  var getMinimum: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of minorTickSteps
  		* @returns Number
  		*/
  var getMinorTickSteps: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of needHighPrecision
  		* @returns Boolean
  		*/
  var getNeedHighPrecision: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of position
  		* @returns String
  		*/
  var getPosition: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Get the range derived from all the bound series
  		* @returns Array
  		*/
  var getRange: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of renderer
  		* @returns Function
  		*/
  var getRenderer: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of segmenter
  		* @returns Object|Ext.chart.axis.segmenter.Segmenter
  		*/
  var getSegmenter: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of style
  		* @returns Object
  		*/
  var getStyle: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of title
  		* @returns String|Object
  		*/
  var getTitle: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of titleMargin
  		* @returns Number
  		*/
  var getTitleMargin: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of visibleRange
  		* @returns Array
  		*/
  var getVisibleRange: js.UndefOr[js.Function0[Array]] = js.native
  /** [Config Option] (Object) */
  var grid: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var labelInSpan: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object|Ext.chart.axis.layout.Layout) */
  var layout: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var majorTickSteps: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxZoom: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maximum: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minZoom: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minimum: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minorTickSteps: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var needHighPrecision: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.native
  /** [Method] Invoked when data has changed  */
  var processData: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IAxis: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Invokes renderFrame on this axis s surface s  */
  var renderFrame: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object|Ext.chart.axis.segmenter.Segmenter) */
  var segmenter: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of background
  		* @param background Object The new value.
  		*/
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of chart
  		* @param chart Ext.chart.AbstractChart The new value.
  		*/
  var setChart: js.UndefOr[js.Function1[/* chart */ js.UndefOr[IAbstractChart], Unit]] = js.native
  /** [Method] Sets the value of fields
  		* @param fields Array The new value.
  		*/
  var setFields: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of grid
  		* @param grid Object The new value.
  		*/
  var setGrid: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of hidden
  		* @param hidden Boolean The new value.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of increment
  		* @param increment Number The new value.
  		*/
  var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of label
  		* @param label Object The new value.
  		*/
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of labelInSpan
  		* @param labelInSpan Boolean The new value.
  		*/
  var setLabelInSpan: js.UndefOr[js.Function1[/* labelInSpan */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of layout
  		* @param layout Object|Ext.chart.axis.layout.Layout The new value.
  		*/
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of majorTickSteps
  		* @param majorTickSteps Number The new value.
  		*/
  var setMajorTickSteps: js.UndefOr[js.Function1[/* majorTickSteps */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maxZoom
  		* @param maxZoom Number The new value.
  		*/
  var setMaxZoom: js.UndefOr[js.Function1[/* maxZoom */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maximum
  		* @param maximum Number The new value.
  		*/
  var setMaximum: js.UndefOr[js.Function1[/* maximum */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minZoom
  		* @param minZoom Number The new value.
  		*/
  var setMinZoom: js.UndefOr[js.Function1[/* minZoom */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minimum
  		* @param minimum Number The new value.
  		*/
  var setMinimum: js.UndefOr[js.Function1[/* minimum */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minorTickSteps
  		* @param minorTickSteps Number The new value.
  		*/
  var setMinorTickSteps: js.UndefOr[js.Function1[/* minorTickSteps */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of needHighPrecision
  		* @param needHighPrecision Boolean The new value.
  		*/
  var setNeedHighPrecision: js.UndefOr[js.Function1[/* needHighPrecision */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of position
  		* @param position String The new value.
  		*/
  var setPosition: js.UndefOr[js.Function1[/* position */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of renderer
  		* @param renderer Function The new value.
  		* @returns String The label to display.
  		*/
  var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], String]] = js.native
  /** [Method] Sets the value of segmenter
  		* @param segmenter Object|Ext.chart.axis.segmenter.Segmenter The new value.
  		*/
  var setSegmenter: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of style
  		* @param style Object The new value.
  		*/
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of title
  		* @param title String|Object The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of titleMargin
  		* @param titleMargin Number The new value.
  		*/
  var setTitleMargin: js.UndefOr[js.Function1[/* titleMargin */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of visibleRange
  		* @param visibleRange Array The new value.
  		*/
  var setVisibleRange: js.UndefOr[js.Function1[/* visibleRange */ js.UndefOr[Array], Unit]] = js.native
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String|Object) */
  var title: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var titleMargin: js.UndefOr[Double] = js.native
  /** [Config Option] (Array) */
  var visibleRange: js.UndefOr[Array] = js.native
}

object IAxis {
  @scala.inline
  def apply(): IAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAxis]
  }
  @scala.inline
  implicit class IAxisOps[Self <: IAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withChart(value: IAbstractChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
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
    def withGetChart(value: () => IAbstractChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChart")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCoordFor(
      value: (/* value */ js.UndefOr[js.Any], /* field */ js.UndefOr[String], /* idx */ js.UndefOr[Double], /* items */ js.UndefOr[IMixedCollection]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCoordFor")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutGetCoordFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCoordFor")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFields(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFields")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGrid(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHidden(value: () => Boolean): Self = {
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
    def withGetIncrement(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIncrement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIncrement")(js.undefined)
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
    def withGetLabelInSpan(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelInSpan")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLabelInSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelInSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLayout(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMajorTickSteps(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMajorTickSteps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMajorTickSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMajorTickSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaxZoom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxZoom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaximum(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaximum")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaximum")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinZoom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinZoom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinimum(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinimum")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinimum")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMinorTickSteps(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinorTickSteps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMinorTickSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinorTickSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNeedHighPrecision(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNeedHighPrecision")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNeedHighPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNeedHighPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPosition(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRange(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRange")(js.undefined)
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
    def withGetSegmenter(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSegmenter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSegmenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSegmenter")(js.undefined)
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
    def withGetTitle(value: () => _): Self = {
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
    def withGetTitleMargin(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitleMargin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTitleMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitleMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withGetVisibleRange(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetVisibleRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleRange")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
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
    def withIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(js.undefined)
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
    def withLabelInSpan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelInSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTickSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTickSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTickSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTickSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedHighPrecision(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needHighPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedHighPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needHighPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessData(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutProcessData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processData")(js.undefined)
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
    def withRenderFrame(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFrame")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFrame")(js.undefined)
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
    def withSegmenter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmenter")(js.undefined)
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
    def withSetChart(value: /* chart */ js.UndefOr[IAbstractChart] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setChart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setChart")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFields(value: /* fields */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFields")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGrid(value: /* grid */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGrid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHidden(value: /* hidden */ js.UndefOr[Boolean] => Unit): Self = {
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
    def withSetIncrement(value: /* increment */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIncrement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLabel(value: /* label */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withSetLabelInSpan(value: /* labelInSpan */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelInSpan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLabelInSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabelInSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLayout(value: /* layout */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMajorTickSteps(value: /* majorTickSteps */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMajorTickSteps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMajorTickSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMajorTickSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaxZoom(value: /* maxZoom */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxZoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaximum(value: /* maximum */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaximum")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaximum")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinZoom(value: /* minZoom */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinZoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinimum(value: /* minimum */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinimum")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinimum")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinorTickSteps(value: /* minorTickSteps */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinorTickSteps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinorTickSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinorTickSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNeedHighPrecision(value: /* needHighPrecision */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNeedHighPrecision")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNeedHighPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNeedHighPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPosition(value: /* position */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRenderer(value: /* renderer */ js.UndefOr[js.Any] => String): Self = {
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
    def withSetSegmenter(value: /* segmenter */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSegmenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSegmenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSegmenter")(js.undefined)
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
    def withSetTitle(value: /* title */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withSetTitleMargin(value: /* titleMargin */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitleMargin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTitleMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitleMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withSetVisibleRange(value: /* visibleRange */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisibleRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetVisibleRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisibleRange")(js.undefined)
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
    def withTitle(value: js.Any): Self = {
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
    def withTitleMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleRange(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRange")(js.undefined)
        ret
    }
  }
  
}


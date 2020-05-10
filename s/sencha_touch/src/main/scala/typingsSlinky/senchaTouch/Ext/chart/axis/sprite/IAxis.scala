package typingsSlinky.senchaTouch.Ext.chart.axis.sprite

import typingsSlinky.senchaTouch.Ext.chart.IMarkers
import typingsSlinky.senchaTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.senchaTouch.Ext.IClass because Already inherited
- typingsSlinky.senchaTouch.Ext.IBase because Already inherited
- typingsSlinky.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ @js.native
trait IAxis extends ISprite {
  /** [Config Option] (Number) */
  var The: js.UndefOr[Double] = js.native
  /** [Config Option] (Ext.chart.axis.Axis) */
  var axis: js.UndefOr[typingsSlinky.senchaTouch.Ext.chart.axis.IAxis] = js.native
  /** [Config Option] (Boolean) */
  var axisLine: js.UndefOr[Boolean] = js.native
  /** [Method]
  		* @param name String
  		* @param marker Ext.chart.Markers
  		*/
  var bindMarker: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[IMarkers], Unit]] = js.native
  /** [Config Option] (Number) */
  var centerX: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var centerY: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var dataMax: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var dataMin: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var enlargeEstStepSizeByText: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of axis
  		* @returns Ext.chart.axis.Axis
  		*/
  var getAxis: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Returns the bounding box for the given Sprite as calculated with the Canvas engine  */
  @JSName("getBBox")
  var getBBox_IAxis: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of label
  		* @returns Object
  		*/
  var getLabel: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of layout
  		* @returns Object|Ext.chart.axis.layout.Layout
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of renderer
  		* @returns Function
  		*/
  var getRenderer: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of segmenter
  		* @returns Object|Ext.chart.axis.segmenter.Segmenter
  		*/
  var getSegmenter: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Boolean) */
  var grid: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object|Ext.chart.axis.layout.Layout) */
  var layout: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var length: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var majorTickSize: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var majorTicks: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var max: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var min: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minStepSize: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minorTickSize: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var minorTricks: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.native
  /** [Method] Render method
  		* @param surface Object
  		* @param ctx Object
  		* @param clipRegion Object
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_IAxis: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object|Ext.chart.axis.segmenter.Segmenter) */
  var segmenter: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of axis
  		* @param axis Ext.chart.axis.Axis The new value.
  		*/
  var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[this.type], Unit]] = js.native
  /** [Method] Sets the value of label
  		* @param label Object The new value.
  		*/
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of layout
  		* @param layout Object|Ext.chart.axis.layout.Layout The new value.
  		*/
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of renderer
  		* @param renderer Function The new value.
  		*/
  var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of segmenter
  		* @param segmenter Object|Ext.chart.axis.segmenter.Segmenter The new value.
  		*/
  var setSegmenter: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var textPadding: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var visibleMax: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var visibleMin: js.UndefOr[Double] = js.native
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
    def withThe(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("The")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("The")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: typingsSlinky.senchaTouch.Ext.chart.axis.IAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLine")(js.undefined)
        ret
    }
    @scala.inline
    def withBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindMarker")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBindMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerX")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerY")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMax")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMin")(js.undefined)
        ret
    }
    @scala.inline
    def withEnlargeEstStepSizeByText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargeEstStepSizeByText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnlargeEstStepSizeByText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enlargeEstStepSizeByText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAxis(value: () => IAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAxis")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBBox(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBox")(js.undefined)
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
    def withGrid(value: Boolean): Self = {
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
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTickSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTickSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTickSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTickSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorTicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMinStepSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minStepSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinStepSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minStepSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTricks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTricks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTricks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTricks")(js.undefined)
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
    def withRender(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
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
    def withSetAxis(value: /* axis */ js.UndefOr[IAxis] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAxis")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAxis")(js.undefined)
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
    def withSetRenderer(value: /* renderer */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withTextPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleMax")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleMin")(js.undefined)
        ret
    }
  }
  
}


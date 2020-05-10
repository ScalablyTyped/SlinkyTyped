package typingsSlinky.senchaTouch.Ext.chart.series.sprite

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.chart.IMarkers
import typingsSlinky.senchaTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.senchaTouch.Ext.IClass because Already inherited
- typingsSlinky.senchaTouch.Ext.IBase because Already inherited
- typingsSlinky.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ @js.native
trait IPolar extends ISprite {
  /** [Config Option] (Array) */
  var Data: js.UndefOr[Array] = js.native
  /** [Config Option] (Number) */
  var baseRotation: js.UndefOr[Double] = js.native
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
  var dataMaxX: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var dataMaxY: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var dataMinX: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var dataMinY: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var dataX: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var dataY: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var endAngle: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var endRho: js.UndefOr[Double] = js.native
  /** [Method] Returns the value of field
  		* @returns Object
  		*/
  var getField: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Number) */
  var labelOverflowPadding: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var labels: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of field
  		* @param field Object The new value.
  		*/
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var startAngle: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var startRho: js.UndefOr[Double] = js.native
}

object IPolar {
  @scala.inline
  def apply(): IPolar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolar]
  }
  @scala.inline
  implicit class IPolarOps[Self <: IPolar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseRotation")(js.undefined)
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
    def withDataMaxX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMaxX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMaxX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMaxX")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMaxY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMaxY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMaxY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMaxY")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMinX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMinX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMinX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMinX")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMinY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMinY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMinY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMinY")(js.undefined)
        ret
    }
    @scala.inline
    def withDataX(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataX")(js.undefined)
        ret
    }
    @scala.inline
    def withDataY(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataY")(js.undefined)
        ret
    }
    @scala.inline
    def withEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withEndRho(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRho")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndRho: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRho")(js.undefined)
        ret
    }
    @scala.inline
    def withGetField(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getField")(js.undefined)
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
    def withLabels(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withSetField(value: /* field */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setField")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRho(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRho")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRho: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRho")(js.undefined)
        ret
    }
  }
  
}


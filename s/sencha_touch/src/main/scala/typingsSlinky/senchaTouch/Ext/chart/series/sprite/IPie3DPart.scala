package typingsSlinky.senchaTouch.Ext.chart.series.sprite

import typingsSlinky.senchaTouch.Ext.chart.IMarkers
import typingsSlinky.senchaTouch.Ext.draw.sprite.IPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.senchaTouch.Ext.IClass because Already inherited
- typingsSlinky.senchaTouch.Ext.IBase because Already inherited
- typingsSlinky.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ @js.native
trait IPie3DPart extends IPath {
  /** [Config Option] (Object) */
  var baseColor: js.UndefOr[js.Any] = js.native
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
  var distortion: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var endAngle: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var endRho: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var margin: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var part: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var startAngle: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var startRho: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var thickness: js.UndefOr[Double] = js.native
  /** [Method] Update the path
  		* @param path Object
  		*/
  @JSName("updatePath")
  var updatePath_IPie3DPart: js.UndefOr[js.Function1[/* path */ js.UndefOr[js.Any], Unit]] = js.native
}

object IPie3DPart {
  @scala.inline
  def apply(): IPie3DPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPie3DPart]
  }
  @scala.inline
  implicit class IPie3DPartOps[Self <: IPie3DPart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseColor")(js.undefined)
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
    def withDistortion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distortion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistortion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distortion")(js.undefined)
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
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withPart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part")(js.undefined)
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
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatePath(value: /* path */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdatePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePath")(js.undefined)
        ret
    }
  }
  
}


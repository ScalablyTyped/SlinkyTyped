package typingsSlinky.vegaTypings.configMod

import typingsSlinky.vegaTypings.projectionMod.Fit
import typingsSlinky.vegaTypings.projectionMod.ProjectionType
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.utilMod.Vector2
import typingsSlinky.vegaTypings.utilMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/projection.BaseProjection> */
@js.native
trait ProjectionConfig extends js.Object {
  var center: ExcludeValueRefKeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]] = js.native
  var clipAngle: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = js.native
  var clipExtent: ExcludeValueRefKeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]] = js.native
  var coefficient: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = js.native
  var distance: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = js.native
  var extent: ExcludeValueRefKeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]] = js.native
  var fit: ExcludeValueRefKeepSignal[js.UndefOr[Fit | js.Array[Fit] | SignalRef]] = js.native
  var fraction: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = js.native
  var lobes: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = js.native
  var parallel: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = js.native
  var parallels: ExcludeValueRefKeepSignal[js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef]] = js.native
  var pointRadius: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = js.native
  var precision: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = js.native
  var radius: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = js.native
  var ratio: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = js.native
  var reflectX: ExcludeValueRefKeepSignal[js.UndefOr[Boolean | SignalRef]] = js.native
  var reflectY: ExcludeValueRefKeepSignal[js.UndefOr[Boolean | SignalRef]] = js.native
  var rotate: ExcludeValueRefKeepSignal[
    js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef]
  ] = js.native
  var scale: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = js.native
  var size: ExcludeValueRefKeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]] = js.native
  var spacing: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = js.native
  var tilt: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]] = js.native
  var translate: ExcludeValueRefKeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]] = js.native
  var `type`: ExcludeValueRefKeepSignal[js.UndefOr[ProjectionType | SignalRef]] = js.native
}

object ProjectionConfig {
  @scala.inline
  def apply(): ProjectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectionConfig]
  }
  @scala.inline
  implicit class ProjectionConfigOps[Self <: ProjectionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: ExcludeValueRefKeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withClipAngle(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withClipExtent(value: ExcludeValueRefKeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withCoefficient(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coefficient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoefficient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coefficient")(js.undefined)
        ret
    }
    @scala.inline
    def withDistance(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withExtent(value: ExcludeValueRefKeepSignal[js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.undefined)
        ret
    }
    @scala.inline
    def withFit(value: ExcludeValueRefKeepSignal[js.UndefOr[Fit | js.Array[Fit] | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(js.undefined)
        ret
    }
    @scala.inline
    def withFraction(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fraction")(js.undefined)
        ret
    }
    @scala.inline
    def withLobes(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lobes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLobes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lobes")(js.undefined)
        ret
    }
    @scala.inline
    def withParallel(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(js.undefined)
        ret
    }
    @scala.inline
    def withParallels(value: ExcludeValueRefKeepSignal[js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallels")(js.undefined)
        ret
    }
    @scala.inline
    def withPointRadius(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRatio(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(js.undefined)
        ret
    }
    @scala.inline
    def withReflectX(value: ExcludeValueRefKeepSignal[js.UndefOr[Boolean | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflectX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReflectX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflectX")(js.undefined)
        ret
    }
    @scala.inline
    def withReflectY(value: ExcludeValueRefKeepSignal[js.UndefOr[Boolean | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflectY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReflectY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflectY")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(
      value: ExcludeValueRefKeepSignal[
          js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: ExcludeValueRefKeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
    @scala.inline
    def withTilt(value: ExcludeValueRefKeepSignal[js.UndefOr[Double | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTilt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilt")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslate(value: ExcludeValueRefKeepSignal[js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ExcludeValueRefKeepSignal[js.UndefOr[ProjectionType | SignalRef]]): Self = {
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


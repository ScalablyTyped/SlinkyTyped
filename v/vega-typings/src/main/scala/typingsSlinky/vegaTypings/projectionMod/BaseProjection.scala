package typingsSlinky.vegaTypings.projectionMod

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.utilMod.Vector2
import typingsSlinky.vegaTypings.utilMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseProjection extends js.Object {
  /**
    * The projection's center, a two-element array of longitude and latitude in degrees.
    *
    * __Default value:__ `[0, 0]`
    */
  var center: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  /**
    * The projection's clipping circle radius to the specified angle in degrees. If `null`, switches to [antimeridian](http://bl.ocks.org/mbostock/3788999) cutting rather than small-circle clipping.
    */
  var clipAngle: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The projection's viewport clip extent to the specified bounds in pixels. The extent bounds are specified as an array `[[x0, y0], [x1, y1]]`, where `x0` is the left-side of the viewport, `y0` is the top, `x1` is the right and `y1` is the bottom. If `null`, no viewport clipping is performed.
    */
  var clipExtent: js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef] = js.native
  // TODO: use a union tagged by the projection type to determine which of the following is applicable
  /* The following properties are all supported for specific types of projections. Consult the d3-geo-projection library for more information: https://github.com/d3/d3-geo-projection */
  var coefficient: js.UndefOr[Double | SignalRef] = js.native
  var distance: js.UndefOr[Double | SignalRef] = js.native
  /*
    * Used in conjunction with fit, provides the pixel area to which the projection should be automatically fit.
    */
  var extent: js.UndefOr[(Vector2[Vector2[Double | SignalRef]]) | SignalRef] = js.native
  /*
    * GeoJSON data to which the projection should attempt to automatically fit the `translate` and `scale` parameters. If object-valued, this parameter should be a GeoJSON Feature or FeatureCollection. If array-valued, each array member may be a GeoJSON Feature, FeatureCollection, or a sub-array of GeoJSON Features.
    */
  var fit: js.UndefOr[Fit | js.Array[Fit] | SignalRef] = js.native
  var fraction: js.UndefOr[Double | SignalRef] = js.native
  var lobes: js.UndefOr[Double | SignalRef] = js.native
  var parallel: js.UndefOr[Double | SignalRef] = js.native
  /**
    * For conic projections, the [two standard parallels](https://en.wikipedia.org/wiki/Map_projection#Conic) that define the map layout. The default depends on the specific conic projection used.
    */
  var parallels: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
  /**
    * The default radius (in pixels) to use when drawing GeoJSON `Point` and `MultiPoint` geometries. This parameter sets a constant default value. To modify the point radius in response to data, see the corresponding parameter of the GeoPath and GeoShape transforms.
    *
    * __Default value:__ `4.5`
    */
  var pointRadius: js.UndefOr[Double | SignalRef] = js.native
  /**
    * The threshold for the projection's [adaptive resampling](http://bl.ocks.org/mbostock/3795544) to the specified value in pixels. This value corresponds to the [Douglas–Peucker distance](http://en.wikipedia.org/wiki/Ramer%E2%80%93Douglas%E2%80%93Peucker_algorithm). If precision is not specified, returns the projection's current resampling precision which defaults to `√0.5 ≅ 0.70710…`.
    */
  var precision: js.UndefOr[Double | SignalRef] = js.native
  var radius: js.UndefOr[Double | SignalRef] = js.native
  var ratio: js.UndefOr[Double | SignalRef] = js.native
  /*
    * Sets whether or not the x-dimension is reflected (negated) in the output.
    */
  var reflectX: js.UndefOr[Boolean | SignalRef] = js.native
  /*
    * Sets whether or not the y-dimension is reflected (negated) in the output.
    */
  var reflectY: js.UndefOr[Boolean | SignalRef] = js.native
  /**
    * The projection's three-axis rotation to the specified angles, which must be a two- or three-element array of numbers [`lambda`, `phi`, `gamma`] specifying the rotation angles in degrees about each spherical axis. (These correspond to yaw, pitch and roll.)
    *
    * __Default value:__ `[0, 0, 0]`
    */
  var rotate: js.UndefOr[(Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef] = js.native
  /**
    * The projection’s scale factor. The default scale is projection-specific. The scale factor corresponds linearly to the distance between projected points; however, scale factor values are not equivalent across projections.
    */
  var scale: js.UndefOr[Double | SignalRef] = js.native
  /*
    * Used in conjunction with fit, provides the width and height in pixels of the area to which the projection should be automatically fit.
    */
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  var spacing: js.UndefOr[Double | SignalRef] = js.native
  var tilt: js.UndefOr[Double | SignalRef] = js.native
  /*
    * The projection's translation offset as a two-element array `[tx, ty]`, defaults to `[480, 250]`. The translation offset determines the pixel coordinates of the projection's center. The default translation offset places (0°,0°) at the center of a 960×500 area.
    */
  var translate: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  /*
    * The cartographic projection to use. This value is case-insensitive, for example `"albers"` and `"Albers"` indicate the same projection type.
    *
    * __Default value:__ `mercator`
    */
  var `type`: js.UndefOr[ProjectionType | SignalRef] = js.native
}

object BaseProjection {
  @scala.inline
  def apply(): BaseProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseProjection]
  }
  @scala.inline
  implicit class BaseProjectionOps[Self <: BaseProjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: (Vector2[Double | SignalRef]) | SignalRef): Self = {
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
    def withClipAngle(value: Double | SignalRef): Self = {
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
    def withClipExtent(value: (Vector2[Vector2[Double | SignalRef]]) | SignalRef): Self = {
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
    def withCoefficient(value: Double | SignalRef): Self = {
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
    def withDistance(value: Double | SignalRef): Self = {
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
    def withExtent(value: (Vector2[Vector2[Double | SignalRef]]) | SignalRef): Self = {
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
    def withFit(value: Fit | js.Array[Fit] | SignalRef): Self = {
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
    def withFraction(value: Double | SignalRef): Self = {
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
    def withLobes(value: Double | SignalRef): Self = {
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
    def withParallel(value: Double | SignalRef): Self = {
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
    def withParallels(value: (js.Array[Double | SignalRef]) | SignalRef): Self = {
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
    def withPointRadius(value: Double | SignalRef): Self = {
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
    def withPrecision(value: Double | SignalRef): Self = {
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
    def withRadius(value: Double | SignalRef): Self = {
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
    def withRatio(value: Double | SignalRef): Self = {
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
    def withReflectX(value: Boolean | SignalRef): Self = {
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
    def withReflectY(value: Boolean | SignalRef): Self = {
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
    def withRotate(value: (Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef): Self = {
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
    def withScale(value: Double | SignalRef): Self = {
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
    def withSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = {
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
    def withSpacing(value: Double | SignalRef): Self = {
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
    def withTilt(value: Double | SignalRef): Self = {
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
    def withTranslate(value: (Vector2[Double | SignalRef]) | SignalRef): Self = {
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
    def withType(value: ProjectionType | SignalRef): Self = {
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


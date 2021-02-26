package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.utilMod.Vector2
import typingsSlinky.vegaTypings.utilMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectionMod {
  
  @js.native
  trait BaseProjection extends StObject {
    
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
    implicit class BaseProjectionMutableBuilder[Self <: BaseProjection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setClipAngle(value: Double | SignalRef): Self = StObject.set(x, "clipAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipAngleUndefined: Self = StObject.set(x, "clipAngle", js.undefined)
      
      @scala.inline
      def setClipExtent(value: (Vector2[Vector2[Double | SignalRef]]) | SignalRef): Self = StObject.set(x, "clipExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipExtentUndefined: Self = StObject.set(x, "clipExtent", js.undefined)
      
      @scala.inline
      def setCoefficient(value: Double | SignalRef): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoefficientUndefined: Self = StObject.set(x, "coefficient", js.undefined)
      
      @scala.inline
      def setDistance(value: Double | SignalRef): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setExtent(value: (Vector2[Vector2[Double | SignalRef]]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setFit(value: Fit | js.Array[Fit] | SignalRef): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      @scala.inline
      def setFitVarargs(value: (Fit | GeoJsonFeature)*): Self = StObject.set(x, "fit", js.Array(value :_*))
      
      @scala.inline
      def setFraction(value: Double | SignalRef): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFractionUndefined: Self = StObject.set(x, "fraction", js.undefined)
      
      @scala.inline
      def setLobes(value: Double | SignalRef): Self = StObject.set(x, "lobes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLobesUndefined: Self = StObject.set(x, "lobes", js.undefined)
      
      @scala.inline
      def setParallel(value: Double | SignalRef): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      @scala.inline
      def setParallels(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "parallels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelsUndefined: Self = StObject.set(x, "parallels", js.undefined)
      
      @scala.inline
      def setParallelsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "parallels", js.Array(value :_*))
      
      @scala.inline
      def setPointRadius(value: Double | SignalRef): Self = StObject.set(x, "pointRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointRadiusUndefined: Self = StObject.set(x, "pointRadius", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double | SignalRef): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setRadius(value: Double | SignalRef): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRatio(value: Double | SignalRef): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      @scala.inline
      def setReflectX(value: Boolean | SignalRef): Self = StObject.set(x, "reflectX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReflectXUndefined: Self = StObject.set(x, "reflectX", js.undefined)
      
      @scala.inline
      def setReflectY(value: Boolean | SignalRef): Self = StObject.set(x, "reflectY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReflectYUndefined: Self = StObject.set(x, "reflectY", js.undefined)
      
      @scala.inline
      def setRotate(value: (Vector2[Double | SignalRef]) | (Vector3[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setScale(value: Double | SignalRef): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSpacing(value: Double | SignalRef): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setTilt(value: Double | SignalRef): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
      
      @scala.inline
      def setTranslate(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setType(value: ProjectionType | SignalRef): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type Fit = GeoJsonFeature | GeoJsonFeatureCollection | js.Array[GeoJsonFeature]
  
  type GeoJsonFeature = js.Any
  
  type GeoJsonFeatureCollection = js.Any
  
  @js.native
  trait Projection extends BaseProjection {
    
    /*
      * The name of the projection.
      */
    var name: String = js.native
  }
  object Projection {
    
    @scala.inline
    def apply(name: String): Projection = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Projection]
    }
    
    @scala.inline
    implicit class ProjectionMutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.vegaTypingsStrings.albers
    - typingsSlinky.vegaTypings.vegaTypingsStrings.albersUsa
    - typingsSlinky.vegaTypings.vegaTypingsStrings.azimuthalEqualArea
    - typingsSlinky.vegaTypings.vegaTypingsStrings.azimuthalEquidistant
    - typingsSlinky.vegaTypings.vegaTypingsStrings.conicConformal
    - typingsSlinky.vegaTypings.vegaTypingsStrings.conicEqualArea
    - typingsSlinky.vegaTypings.vegaTypingsStrings.conicEquidistant
    - typingsSlinky.vegaTypings.vegaTypingsStrings.equalEarth
    - typingsSlinky.vegaTypings.vegaTypingsStrings.equirectangular
    - typingsSlinky.vegaTypings.vegaTypingsStrings.gnomonic
    - typingsSlinky.vegaTypings.vegaTypingsStrings.identity
    - typingsSlinky.vegaTypings.vegaTypingsStrings.mercator
    - typingsSlinky.vegaTypings.vegaTypingsStrings.naturalEarth1
    - typingsSlinky.vegaTypings.vegaTypingsStrings.orthographic
    - typingsSlinky.vegaTypings.vegaTypingsStrings.stereographic
    - typingsSlinky.vegaTypings.vegaTypingsStrings.transverseMercator
  */
  trait ProjectionType extends StObject
  object ProjectionType {
    
    @scala.inline
    def albers: typingsSlinky.vegaTypings.vegaTypingsStrings.albers = "albers".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.albers]
    
    @scala.inline
    def albersUsa: typingsSlinky.vegaTypings.vegaTypingsStrings.albersUsa = "albersUsa".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.albersUsa]
    
    @scala.inline
    def azimuthalEqualArea: typingsSlinky.vegaTypings.vegaTypingsStrings.azimuthalEqualArea = "azimuthalEqualArea".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.azimuthalEqualArea]
    
    @scala.inline
    def azimuthalEquidistant: typingsSlinky.vegaTypings.vegaTypingsStrings.azimuthalEquidistant = "azimuthalEquidistant".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.azimuthalEquidistant]
    
    @scala.inline
    def conicConformal: typingsSlinky.vegaTypings.vegaTypingsStrings.conicConformal = "conicConformal".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.conicConformal]
    
    @scala.inline
    def conicEqualArea: typingsSlinky.vegaTypings.vegaTypingsStrings.conicEqualArea = "conicEqualArea".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.conicEqualArea]
    
    @scala.inline
    def conicEquidistant: typingsSlinky.vegaTypings.vegaTypingsStrings.conicEquidistant = "conicEquidistant".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.conicEquidistant]
    
    @scala.inline
    def equalEarth: typingsSlinky.vegaTypings.vegaTypingsStrings.equalEarth = "equalEarth".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.equalEarth]
    
    @scala.inline
    def equirectangular: typingsSlinky.vegaTypings.vegaTypingsStrings.equirectangular = "equirectangular".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.equirectangular]
    
    @scala.inline
    def gnomonic: typingsSlinky.vegaTypings.vegaTypingsStrings.gnomonic = "gnomonic".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.gnomonic]
    
    @scala.inline
    def identity: typingsSlinky.vegaTypings.vegaTypingsStrings.identity = "identity".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.identity]
    
    @scala.inline
    def mercator: typingsSlinky.vegaTypings.vegaTypingsStrings.mercator = "mercator".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.mercator]
    
    @scala.inline
    def naturalEarth1: typingsSlinky.vegaTypings.vegaTypingsStrings.naturalEarth1 = "naturalEarth1".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.naturalEarth1]
    
    @scala.inline
    def orthographic: typingsSlinky.vegaTypings.vegaTypingsStrings.orthographic = "orthographic".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.orthographic]
    
    @scala.inline
    def stereographic: typingsSlinky.vegaTypings.vegaTypingsStrings.stereographic = "stereographic".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.stereographic]
    
    @scala.inline
    def transverseMercator: typingsSlinky.vegaTypings.vegaTypingsStrings.transverseMercator = "transverseMercator".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.transverseMercator]
  }
}

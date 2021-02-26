package typingsSlinky.supercluster

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.geojson.mod.BBox
import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.Point
import typingsSlinky.supercluster.superclusterBooleans.`true`
import typingsSlinky.supercluster.superclusterNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A very fast geospatial point clustering library for browsers and Node.
    */
  @JSImport("supercluster", JSImport.Namespace)
  @js.native
  class ^[P /* <: GeoJsonProperties */, C /* <: GeoJsonProperties */] () extends Supercluster[P, C] {
    def this(options: Options[P, C]) = this()
  }
  
  /**
    * Default properties type, allowing any properties.
    * Try to avoid this for better typesafety by using proper types.
    */
  type AnyProps = StringDictionary[js.Any]
  
  type ClusterFeature[C] = PointFeature[ClusterProperties with C]
  
  @js.native
  trait ClusterProperties extends StObject {
    
    /**
      * Always `true` to indicate that the Feature is a Cluster and not
      * an individual point.
      */
    var cluster: `true` = js.native
    
    /** Cluster ID */
    var cluster_id: Double = js.native
    
    /** Number of points in the cluster. */
    var point_count: Double = js.native
    
    /**
      * Abbreviated number of points in the cluster as string if the number
      * is 1000 or greater (e.g. `1.3k` if the number is 1298).
      *
      * For less than 1000 points it is the same value as `point_count`.
      */
    var point_count_abbreviated: String | Double = js.native
  }
  object ClusterProperties {
    
    @scala.inline
    def apply(cluster: `true`, cluster_id: Double, point_count: Double, point_count_abbreviated: String | Double): ClusterProperties = {
      val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], cluster_id = cluster_id.asInstanceOf[js.Any], point_count = point_count.asInstanceOf[js.Any], point_count_abbreviated = point_count_abbreviated.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterProperties]
    }
    
    @scala.inline
    implicit class ClusterPropertiesMutableBuilder[Self <: ClusterProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCluster(value: `true`): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCluster_id(value: Double): Self = StObject.set(x, "cluster_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoint_count(value: Double): Self = StObject.set(x, "point_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoint_count_abbreviated(value: String | Double): Self = StObject.set(x, "point_count_abbreviated", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options[P, C] extends StObject {
    
    /**
      * (Tiles) Tile extent. Radius is calculated relative to this value.
      *
      * @default 512
      */
    var extent: js.UndefOr[Double] = js.native
    
    /**
      * Whether timing info should be logged.
      *
      * @default false
      */
    var log: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that returns cluster properties corresponding to a single point.
      *
      * @example
      * (props) => ({sum: props.myValue})
      */
    var map: js.UndefOr[js.Function1[/* props */ P, C]] = js.native
    
    /**
      * Maximum zoom level at which clusters are generated.
      *
      * @default 16
      */
    var maxZoom: js.UndefOr[Double] = js.native
    
    /**
      * Minimum zoom level at which clusters are generated.
      *
      * @default 0
      */
    var minZoom: js.UndefOr[Double] = js.native
    
    /**
      * Size of the KD-tree leaf node. Affects performance.
      *
      * @default 64
      */
    var nodeSize: js.UndefOr[Double] = js.native
    
    /**
      * Cluster radius, in pixels.
      *
      * @default 40
      */
    var radius: js.UndefOr[Double] = js.native
    
    /**
      * A reduce function that merges properties of two clusters into one.
      *
      * @example
      * (accumulated, props) => { accumulated.sum += props.sum; }
      */
    var reduce: js.UndefOr[js.Function2[/* accumulated */ C, /* props */ C, Unit]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[P, C](): Options[P, C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[P, C]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_, _], P, C] (val x: Self with (Options[P, C])) extends AnyVal {
      
      @scala.inline
      def setExtent(value: Double): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setMap(value: /* props */ P => C): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      @scala.inline
      def setNodeSize(value: Double): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeSizeUndefined: Self = StObject.set(x, "nodeSize", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setReduce(value: (/* accumulated */ C, /* props */ C) => Unit): Self = StObject.set(x, "reduce", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
    }
  }
  
  /**
    * [GeoJSON Feature](https://tools.ietf.org/html/rfc7946#section-3.2),
    * with the geometry being a
    * [GeoJSON Point](https://tools.ietf.org/html/rfc7946#section-3.1.2).
    */
  type PointFeature[P] = Feature[Point, P]
  
  /**
    * A very fast geospatial point clustering library for browsers and Node.
    */
  @js.native
  trait Supercluster[P /* <: GeoJsonProperties */, C /* <: GeoJsonProperties */] extends StObject {
    
    /**
      * Returns the children of a cluster (on the next zoom level).
      *
      * @param clusterId Cluster ID (`cluster_id` value from feature properties).
      * @throws {Error} If `clusterId` does not exist.
      */
    def getChildren(clusterId: Double): js.Array[ClusterFeature[C] | PointFeature[P]] = js.native
    
    /**
      * Returns the zoom level on which the cluster expands into several
      * children (useful for "click to zoom" feature).
      *
      * @param clusterId Cluster ID (`cluster_id` value from feature properties).
      */
    def getClusterExpansionZoom(clusterId: Double): Double = js.native
    
    /**
      * Returns an array of clusters and points as `GeoJSON.Feature` objects
      * for the given bounding box (`bbox`) and zoom level (`zoom`).
      *
      * @param bbox Bounding box (`[westLng, southLat, eastLng, northLat]`).
      * @param zoom Zoom level.
      */
    def getClusters(bbox: BBox, zoom: Double): js.Array[ClusterFeature[C] | PointFeature[P]] = js.native
    
    /**
      * Returns all the points of a cluster (with pagination support).
      *
      * @param clusterId Cluster ID (`cluster_id` value from feature properties).
      * @param limit The number of points to return (set to `Infinity` for all points).
      * @param offset The amount of points to skip (for pagination).
      */
    def getLeaves(clusterId: Double): js.Array[PointFeature[P]] = js.native
    def getLeaves(clusterId: Double, limit: js.UndefOr[scala.Nothing], offset: Double): js.Array[PointFeature[P]] = js.native
    def getLeaves(clusterId: Double, limit: Double): js.Array[PointFeature[P]] = js.native
    def getLeaves(clusterId: Double, limit: Double, offset: Double): js.Array[PointFeature[P]] = js.native
    
    /**
      * For a given zoom and x/y coordinates, returns a
      * [geojson-vt](https://github.com/mapbox/geojson-vt)-compatible JSON
      * tile object with cluster any point features.
      */
    def getTile(zoom: Double, x: Double, y: Double): (Tile[C, P]) | Null = js.native
    
    /**
      * Loads an array of GeoJSON Feature objects. Each feature's geometry
      * must be a GeoJSON Point. Once loaded, index is immutable.
      *
      * @param points Array of GeoJSON Features, the geometries being GeoJSON Points.
      */
    def load(points: js.Array[PointFeature[P]]): Supercluster[P, C] = js.native
  }
  
  @js.native
  trait Tile[C, P] extends StObject {
    
    var features: js.Array[TileFeature[C, P]] = js.native
  }
  object Tile {
    
    @scala.inline
    def apply[C, P](features: js.Array[TileFeature[C, P]]): Tile[C, P] = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tile[C, P]]
    }
    
    @scala.inline
    implicit class TileMutableBuilder[Self <: Tile[_, _], C, P] (val x: Self with (Tile[C, P])) extends AnyVal {
      
      @scala.inline
      def setFeatures(value: js.Array[TileFeature[C, P]]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesVarargs(value: (TileFeature[C, P])*): Self = StObject.set(x, "features", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TileFeature[C, P] extends StObject {
    
    var geometry: js.Array[js.Tuple2[Double, Double]] = js.native
    
    var tags: (ClusterProperties with C) | P = js.native
    
    var `type`: `1` = js.native
  }
  object TileFeature {
    
    @scala.inline
    def apply[C, P](geometry: js.Array[js.Tuple2[Double, Double]], tags: (ClusterProperties with C) | P, `type`: `1`): TileFeature[C, P] = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileFeature[C, P]]
    }
    
    @scala.inline
    implicit class TileFeatureMutableBuilder[Self <: TileFeature[_, _], C, P] (val x: Self with (TileFeature[C, P])) extends AnyVal {
      
      @scala.inline
      def setGeometry(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometryVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "geometry", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: (ClusterProperties with C) | P): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

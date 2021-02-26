package typingsSlinky.topojsonSpecification

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.geojson.mod.BBox
import typingsSlinky.geojson.mod.GeoJsonGeometryTypes
import typingsSlinky.geojson.mod.GeoJsonProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Arc = js.Array[Positions]
  
  type ArcIndexes = js.Array[Double]
  
  @js.native
  trait GeometryCollection[P /* <: Properties */]
    extends GeometryObjectA[P]
       with GeometryObject[P] {
    
    var geometries: js.Array[GeometryObject[P]] = js.native
    
    @JSName("type")
    var type_GeometryCollection: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection = js.native
  }
  object GeometryCollection {
    
    @scala.inline
    def apply[P /* <: Properties */](
      geometries: js.Array[GeometryObject[P]],
      `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection
    ): GeometryCollection[P] = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeometryCollection[P]]
    }
    
    @scala.inline
    implicit class GeometryCollectionMutableBuilder[Self <: GeometryCollection[_], P /* <: Properties */] (val x: Self with GeometryCollection[P]) extends AnyVal {
      
      @scala.inline
      def setGeometries(value: js.Array[GeometryObject[P]]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometriesVarargs(value: GeometryObject[P]*): Self = StObject.set(x, "geometries", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.topojsonSpecification.mod.Point[P]
    - typingsSlinky.topojsonSpecification.mod.MultiPoint[P]
    - typingsSlinky.topojsonSpecification.mod.LineString[P]
    - typingsSlinky.topojsonSpecification.mod.MultiLineString[P]
    - typingsSlinky.topojsonSpecification.mod.Polygon[P]
    - typingsSlinky.topojsonSpecification.mod.MultiPolygon[P]
    - typingsSlinky.topojsonSpecification.mod.GeometryCollection[P]
    - typingsSlinky.topojsonSpecification.mod.NullObject
  */
  trait GeometryObject[P /* <: Properties */] extends StObject
  object GeometryObject {
    
    @scala.inline
    def GeometryCollection[P /* <: Properties */](
      geometries: js.Array[GeometryObject[P]],
      `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.GeometryCollection
    ): typingsSlinky.topojsonSpecification.mod.GeometryCollection[P] = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.topojsonSpecification.mod.GeometryCollection[P]]
    }
    
    @scala.inline
    def LineString[P /* <: Properties */](
      arcs: ArcIndexes,
      `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.LineString
    ): typingsSlinky.topojsonSpecification.mod.LineString[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.topojsonSpecification.mod.LineString[P]]
    }
    
    @scala.inline
    def MultiLineString[P /* <: Properties */](
      arcs: js.Array[ArcIndexes],
      `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiLineString
    ): typingsSlinky.topojsonSpecification.mod.MultiLineString[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.topojsonSpecification.mod.MultiLineString[P]]
    }
    
    @scala.inline
    def MultiPoint[P /* <: Properties */](
      coordinates: js.Array[Positions],
      `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPoint
    ): typingsSlinky.topojsonSpecification.mod.MultiPoint[P] = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.topojsonSpecification.mod.MultiPoint[P]]
    }
    
    @scala.inline
    def MultiPolygon[P /* <: Properties */](
      arcs: js.Array[js.Array[ArcIndexes]],
      `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon
    ): typingsSlinky.topojsonSpecification.mod.MultiPolygon[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.topojsonSpecification.mod.MultiPolygon[P]]
    }
    
    @scala.inline
    def NullObject(`type`: Null): typingsSlinky.topojsonSpecification.mod.NullObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.topojsonSpecification.mod.NullObject]
    }
    
    @scala.inline
    def Point[P /* <: Properties */](
      coordinates: Positions,
      `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Point
    ): typingsSlinky.topojsonSpecification.mod.Point[P] = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.topojsonSpecification.mod.Point[P]]
    }
    
    @scala.inline
    def Polygon[P /* <: Properties */](
      arcs: js.Array[ArcIndexes],
      `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Polygon
    ): typingsSlinky.topojsonSpecification.mod.Polygon[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.topojsonSpecification.mod.Polygon[P]]
    }
  }
  
  @js.native
  trait GeometryObjectA[P /* <: Properties */] extends TopoJSON {
    
    var id: js.UndefOr[Double | String] = js.native
    
    var properties: js.UndefOr[P] = js.native
    
    @JSName("type")
    var type_GeometryObjectA: GeoJsonGeometryTypes | Null = js.native
  }
  object GeometryObjectA {
    
    @scala.inline
    def apply[P /* <: Properties */](): GeometryObjectA[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeometryObjectA[P]]
    }
    
    @scala.inline
    implicit class GeometryObjectAMutableBuilder[Self <: GeometryObjectA[_], P /* <: Properties */] (val x: Self with GeometryObjectA[P]) extends AnyVal {
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setProperties(value: P): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setType(value: GeoJsonGeometryTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
    }
  }
  
  @js.native
  trait LineString[P /* <: Properties */]
    extends GeometryObjectA[P]
       with GeometryObject[P] {
    
    var arcs: ArcIndexes = js.native
    
    @JSName("type")
    var type_LineString: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.LineString = js.native
  }
  object LineString {
    
    @scala.inline
    def apply[P /* <: Properties */](
      arcs: ArcIndexes,
      `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.LineString
    ): LineString[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineString[P]]
    }
    
    @scala.inline
    implicit class LineStringMutableBuilder[Self <: LineString[_], P /* <: Properties */] (val x: Self with LineString[P]) extends AnyVal {
      
      @scala.inline
      def setArcs(value: ArcIndexes): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArcsVarargs(value: Double*): Self = StObject.set(x, "arcs", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.LineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultiLineString[P /* <: Properties */]
    extends GeometryObjectA[P]
       with GeometryObject[P] {
    
    var arcs: js.Array[ArcIndexes] = js.native
    
    @JSName("type")
    var type_MultiLineString: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiLineString = js.native
  }
  object MultiLineString {
    
    @scala.inline
    def apply[P /* <: Properties */](
      arcs: js.Array[ArcIndexes],
      `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiLineString
    ): MultiLineString[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiLineString[P]]
    }
    
    @scala.inline
    implicit class MultiLineStringMutableBuilder[Self <: MultiLineString[_], P /* <: Properties */] (val x: Self with MultiLineString[P]) extends AnyVal {
      
      @scala.inline
      def setArcs(value: js.Array[ArcIndexes]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArcsVarargs(value: ArcIndexes*): Self = StObject.set(x, "arcs", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiLineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultiPoint[P /* <: Properties */]
    extends GeometryObjectA[P]
       with GeometryObject[P] {
    
    var coordinates: js.Array[Positions] = js.native
    
    @JSName("type")
    var type_MultiPoint: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPoint = js.native
  }
  object MultiPoint {
    
    @scala.inline
    def apply[P /* <: Properties */](
      coordinates: js.Array[Positions],
      `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPoint
    ): MultiPoint[P] = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiPoint[P]]
    }
    
    @scala.inline
    implicit class MultiPointMutableBuilder[Self <: MultiPoint[_], P /* <: Properties */] (val x: Self with MultiPoint[P]) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[Positions]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: Positions*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPoint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultiPolygon[P /* <: Properties */]
    extends GeometryObjectA[P]
       with GeometryObject[P] {
    
    var arcs: js.Array[js.Array[ArcIndexes]] = js.native
    
    @JSName("type")
    var type_MultiPolygon: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon = js.native
  }
  object MultiPolygon {
    
    @scala.inline
    def apply[P /* <: Properties */](
      arcs: js.Array[js.Array[ArcIndexes]],
      `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon
    ): MultiPolygon[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiPolygon[P]]
    }
    
    @scala.inline
    implicit class MultiPolygonMutableBuilder[Self <: MultiPolygon[_], P /* <: Properties */] (val x: Self with MultiPolygon[P]) extends AnyVal {
      
      @scala.inline
      def setArcs(value: js.Array[js.Array[ArcIndexes]]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArcsVarargs(value: js.Array[ArcIndexes]*): Self = StObject.set(x, "arcs", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.MultiPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NullObject
    extends GeometryObjectA[js.Object]
       with GeometryObject[js.Any] {
    
    @JSName("type")
    var type_NullObject: Null = js.native
  }
  object NullObject {
    
    @scala.inline
    def apply(`type`: Null): NullObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NullObject]
    }
    
    @scala.inline
    implicit class NullObjectMutableBuilder[Self <: NullObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: Null): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Objects[P /* <: Properties */] = StringDictionary[GeometryObject[P]]
  
  type OrNull[T /* <: Objects[js.Object] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | topojson-specification.topojson-specification.NullObject}
    */ typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.OrNull with TopLevel[T]
  
  @js.native
  trait Point[P /* <: Properties */]
    extends GeometryObjectA[P]
       with GeometryObject[P] {
    
    var coordinates: Positions = js.native
    
    @JSName("type")
    var type_Point: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Point = js.native
  }
  object Point {
    
    @scala.inline
    def apply[P /* <: Properties */](
      coordinates: Positions,
      `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Point
    ): Point[P] = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point[P]]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point[_], P /* <: Properties */] (val x: Self with Point[P]) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: Positions): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Polygon[P /* <: Properties */]
    extends GeometryObjectA[P]
       with GeometryObject[P] {
    
    var arcs: js.Array[ArcIndexes] = js.native
    
    @JSName("type")
    var type_Polygon: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Polygon = js.native
  }
  object Polygon {
    
    @scala.inline
    def apply[P /* <: Properties */](
      arcs: js.Array[ArcIndexes],
      `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Polygon
    ): Polygon[P] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Polygon[P]]
    }
    
    @scala.inline
    implicit class PolygonMutableBuilder[Self <: Polygon[_], P /* <: Properties */] (val x: Self with Polygon[P]) extends AnyVal {
      
      @scala.inline
      def setArcs(value: js.Array[ArcIndexes]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArcsVarargs(value: ArcIndexes*): Self = StObject.set(x, "arcs", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Positions = js.Array[Double]
  
  type Properties = GeoJsonProperties
  
  @js.native
  trait TopoJSON extends StObject {
    
    var bbox: js.UndefOr[BBox] = js.native
    
    var `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Topology | GeoJsonGeometryTypes | Null = js.native
  }
  object TopoJSON {
    
    @scala.inline
    def apply(): TopoJSON = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TopoJSON]
    }
    
    @scala.inline
    implicit class TopoJSONMutableBuilder[Self <: TopoJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      @scala.inline
      def setType(
        value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Topology | GeoJsonGeometryTypes
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
    }
  }
  
  @js.native
  trait Topology[T /* <: Objects[Properties] */] extends TopoJSON {
    
    var arcs: js.Array[Arc] = js.native
    
    var objects: T = js.native
    
    var transform: js.UndefOr[Transform] = js.native
    
    @JSName("type")
    var type_Topology: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Topology = js.native
  }
  object Topology {
    
    @scala.inline
    def apply[T /* <: Objects[Properties] */](
      arcs: js.Array[Arc],
      objects: T,
      `type`: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Topology
    ): Topology[T] = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Topology[T]]
    }
    
    @scala.inline
    implicit class TopologyMutableBuilder[Self <: Topology[_], T /* <: Objects[Properties] */] (val x: Self with Topology[T]) extends AnyVal {
      
      @scala.inline
      def setArcs(value: js.Array[Arc]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArcsVarargs(value: Arc*): Self = StObject.set(x, "arcs", js.Array(value :_*))
      
      @scala.inline
      def setObjects(value: T): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setType(value: typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.Topology): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Transform extends StObject {
    
    var scale: js.Tuple2[Double, Double] = js.native
    
    var translate: js.Tuple2[Double, Double] = js.native
  }
  object Transform {
    
    @scala.inline
    def apply(scale: js.Tuple2[Double, Double], translate: js.Tuple2[Double, Double]): Transform = {
      val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transform]
    }
    
    @scala.inline
    implicit class TransformMutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScale(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslate(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    }
  }
}

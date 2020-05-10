package typingsSlinky.topojsonSpecification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Arc = js.Array[typingsSlinky.topojsonSpecification.mod.Positions]
  type ArcIndexes = js.Array[scala.Double]
  type Objects[P /* <: typingsSlinky.topojsonSpecification.mod.Properties */] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.topojsonSpecification.mod.GeometryObject[P]]
  type OrNull[T /* <: typingsSlinky.topojsonSpecification.mod.Objects[js.Object] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | topojson-specification.topojson-specification.NullObject}
    */ typingsSlinky.topojsonSpecification.topojsonSpecificationStrings.OrNull with org.scalablytyped.runtime.TopLevel[T]
  type Positions = js.Array[scala.Double]
  type Properties = typingsSlinky.geojson.mod.GeoJsonProperties
}

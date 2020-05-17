package typingsSlinky.vegaTypings.projectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.projectionMod.GeoJsonFeature
  - typingsSlinky.vegaTypings.projectionMod.GeoJsonFeatureCollection
  - js.Array[typingsSlinky.vegaTypings.projectionMod.GeoJsonFeature]
*/
trait Fit extends js.Object

object Fit {
  @scala.inline
  implicit def apply(value: GeoJsonFeature | GeoJsonFeatureCollection): Fit = value.asInstanceOf[Fit]
  @scala.inline
  implicit def apply(value: js.Array[GeoJsonFeature]): Fit = value.asInstanceOf[Fit]
}


package typingsSlinky.supercluster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Default properties type, allowing any properties.
    * Try to avoid this for better typesafety by using proper types.
    */
  type AnyProps = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ClusterFeature[C] = typingsSlinky.supercluster.mod.PointFeature[typingsSlinky.supercluster.mod.ClusterProperties with C]
  
  /**
    * [GeoJSON Feature](https://tools.ietf.org/html/rfc7946#section-3.2),
    * with the geometry being a
    * [GeoJSON Point](https://tools.ietf.org/html/rfc7946#section-3.1.2).
    */
  type PointFeature[P] = typingsSlinky.geojson.mod.Feature[typingsSlinky.geojson.mod.Point, P]
}

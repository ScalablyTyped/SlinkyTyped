package typingsSlinky.viewportMercatorProject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Bounds = js.Tuple2[
    typingsSlinky.viewportMercatorProject.mod.Coordinates, 
    typingsSlinky.viewportMercatorProject.mod.Coordinates
  ]
  type Coordinates = js.Tuple2[scala.Double, scala.Double]
  type CoordinatesZ = js.Tuple3[scala.Double, scala.Double, scala.Double]
  type ViewMatrix = js.Array[scala.Double]
}

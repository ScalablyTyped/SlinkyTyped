package typingsSlinky.viewportMercatorProject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Bounds = js.Tuple2[
    typingsSlinky.viewportMercatorProject.mod.Coordinates, 
    typingsSlinky.viewportMercatorProject.mod.Coordinates
  ]
  
  type Coordinates = js.Tuple2[scala.Double, scala.Double]
  
  type CoordinatesZ = js.Tuple3[scala.Double, scala.Double, scala.Double]
  
  type Padding = scala.Double | typingsSlinky.viewportMercatorProject.anon.Bottom
  
  type ViewMatrix = js.Array[scala.Double]
}

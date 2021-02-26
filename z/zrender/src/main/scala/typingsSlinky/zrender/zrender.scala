package typingsSlinky.zrender

import org.scalablytyped.runtime.Instantiable6
import typingsSlinky.zrender.anon.AddColorStop
import typingsSlinky.zrender.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zrender {
  
  type ColorStops = js.Array[Color]
  
  type GlobalCoords = Boolean
  
  /**
    * x, y, x2, y2 are all percent from 0 to 1
    */
  @js.native
  trait LinearGradient
    extends Instantiable6[
          /* x */ js.UndefOr[X], 
          /* y */ js.UndefOr[Y], 
          /* x2 */ js.UndefOr[X2], 
          /* y2 */ js.UndefOr[Y2], 
          /* colorStops */ js.UndefOr[ColorStops], 
          /* globalCoord */ js.UndefOr[GlobalCoords], 
          AddColorStop
        ]
  
  type X = Double
  
  type X2 = Double
  
  type Y = Double
  
  type Y2 = Double
}

package typingsSlinky.three

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.lineSegmentsMod.LineSegments
import typingsSlinky.three.materialMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridHelperMod {
  
  @JSImport("three/src/helpers/GridHelper", "GridHelper")
  @js.native
  class GridHelper protected ()
    extends LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] {
    /**
    	 * @param [size=10]
    	 * @param [divisions=10]
    	 * @param [color1=0x444444]
    	 * @param [color2=0x888888]
    	 */
    def this(
      size: js.UndefOr[Double],
      divisions: js.UndefOr[Double],
      color1: js.UndefOr[Color | String | Double],
      color2: js.UndefOr[Color | String | Double]
    ) = this()
    
    /**
    	 * @deprecated Colors should be specified in the constructor.
    	 */
    def setColors(): Unit = js.native
    def setColors(color1: js.UndefOr[scala.Nothing], color2: String): Unit = js.native
    def setColors(color1: js.UndefOr[scala.Nothing], color2: Double): Unit = js.native
    def setColors(color1: js.UndefOr[scala.Nothing], color2: Color): Unit = js.native
    def setColors(color1: String): Unit = js.native
    def setColors(color1: String, color2: String): Unit = js.native
    def setColors(color1: String, color2: Double): Unit = js.native
    def setColors(color1: String, color2: Color): Unit = js.native
    def setColors(color1: Double): Unit = js.native
    def setColors(color1: Double, color2: String): Unit = js.native
    def setColors(color1: Double, color2: Double): Unit = js.native
    def setColors(color1: Double, color2: Color): Unit = js.native
    def setColors(color1: Color): Unit = js.native
    def setColors(color1: Color, color2: String): Unit = js.native
    def setColors(color1: Color, color2: Double): Unit = js.native
    def setColors(color1: Color, color2: Color): Unit = js.native
  }
}

package typingsSlinky.three

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.lineMod.Line
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/objects/LineSegments", JSImport.Namespace)
@js.native
object lineSegmentsMod extends js.Object {
  
  val LinePieces: Double = js.native
  
  val LineStrip: Double = js.native
  
  @js.native
  class LineSegments[TGeometry /* <: Geometry | BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] () extends Line[TGeometry, TMaterial] {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: js.UndefOr[scala.Nothing], material: TMaterial) = this()
    
    val isLineSegments: `true` = js.native
    
    /**
    	 * @default 'LineSegments'
    	 */
    @JSName("type")
    var type_LineSegments: typingsSlinky.three.threeStrings.LineSegments | String = js.native
  }
}

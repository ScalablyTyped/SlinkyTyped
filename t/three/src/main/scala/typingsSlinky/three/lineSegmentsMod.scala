package typingsSlinky.three

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.lineMod.Line
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineSegmentsMod {
  
  @JSImport("three/src/objects/LineSegments", "LinePieces")
  @js.native
  val LinePieces: Double = js.native
  
  @JSImport("three/src/objects/LineSegments", "LineSegments")
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
  
  @JSImport("three/src/objects/LineSegments", "LineStrip")
  @js.native
  val LineStrip: Double = js.native
}

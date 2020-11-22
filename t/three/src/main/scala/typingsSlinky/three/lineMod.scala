package typingsSlinky.three

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.threeBooleans.`true`
import typingsSlinky.three.threeStrings.LineLoop
import typingsSlinky.three.threeStrings.LineSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/objects/Line", JSImport.Namespace)
@js.native
object lineMod extends js.Object {
  
  @js.native
  class Line[TGeometry /* <: Geometry | BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] () extends Object3D {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: js.UndefOr[scala.Nothing], material: TMaterial) = this()
    def this(geometry: TGeometry, material: TMaterial, mode: Double) = this()
    def this(geometry: TGeometry, material: js.UndefOr[scala.Nothing], mode: Double) = this()
    def this(geometry: js.UndefOr[scala.Nothing], material: TMaterial, mode: Double) = this()
    def this(geometry: js.UndefOr[scala.Nothing], material: js.UndefOr[scala.Nothing], mode: Double) = this()
    
    def computeLineDistances(): this.type = js.native
    
    var geometry: TGeometry = js.native
    
    val isLine: `true` = js.native
    
    var material: TMaterial = js.native
    
    var morphTargetDictionary: js.UndefOr[StringDictionary[Double]] = js.native
    
    var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native
    
    @JSName("type")
    var type_Line: typingsSlinky.three.threeStrings.Line | LineLoop | LineSegments | String = js.native
    
    def updateMorphTargets(): Unit = js.native
  }
}

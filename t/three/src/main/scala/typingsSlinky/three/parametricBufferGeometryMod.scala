package typingsSlinky.three

import typingsSlinky.three.anon.Func
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parametricBufferGeometryMod {
  
  @JSImport("three/src/geometries/ParametricBufferGeometry", "ParametricBufferGeometry")
  @js.native
  class ParametricBufferGeometry protected () extends BufferGeometry {
    def this(
      func: js.Function3[/* u */ Double, /* v */ Double, /* dest */ Vector3, Unit],
      slices: Double,
      stacks: Double
    ) = this()
    
    var parameters: Func = js.native
  }
}

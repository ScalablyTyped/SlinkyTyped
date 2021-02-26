package typingsSlinky.three

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.curveMod.Curve
import typingsSlinky.three.shapeMod.Shape
import typingsSlinky.three.vector2Mod.Vector2
import typingsSlinky.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extrudeBufferGeometryMod {
  
  @JSImport("three/src/geometries/ExtrudeBufferGeometry", "ExtrudeBufferGeometry")
  @js.native
  class ExtrudeBufferGeometry protected () extends BufferGeometry {
    def this(shapes: js.Array[Shape]) = this()
    def this(shapes: Shape) = this()
    def this(shapes: js.Array[Shape], options: ExtrudeGeometryOptions) = this()
    def this(shapes: Shape, options: ExtrudeGeometryOptions) = this()
    
    def addShape(shape: Shape): Unit = js.native
    def addShape(shape: Shape, options: js.Any): Unit = js.native
    
    def addShapeList(shapes: js.Array[Shape]): Unit = js.native
    def addShapeList(shapes: js.Array[Shape], options: js.Any): Unit = js.native
  }
  
  @js.native
  trait ExtrudeGeometryOptions extends StObject {
    
    var UVGenerator: js.UndefOr[typingsSlinky.three.extrudeBufferGeometryMod.UVGenerator] = js.native
    
    /**
    	 * @default true
    	 */
    var bevelEnabled: js.UndefOr[Boolean] = js.native
    
    /**
    	 * @default 0
    	 */
    var bevelOffset: js.UndefOr[Double] = js.native
    
    /**
    	 * @default 3
    	 */
    var bevelSegments: js.UndefOr[Double] = js.native
    
    var bevelSize: js.UndefOr[Double] = js.native
    
    /**
    	 * @default 6
    	 */
    var bevelThickness: js.UndefOr[Double] = js.native
    
    /**
    	 * @default 12
    	 */
    var curveSegments: js.UndefOr[Double] = js.native
    
    /**
    	 * @default 100
    	 */
    var depth: js.UndefOr[Double] = js.native
    
    var extrudePath: js.UndefOr[Curve[Vector3]] = js.native
    
    /**
    	 * @default 1
    	 */
    var steps: js.UndefOr[Double] = js.native
  }
  object ExtrudeGeometryOptions {
    
    @scala.inline
    def apply(): ExtrudeGeometryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtrudeGeometryOptions]
    }
    
    @scala.inline
    implicit class ExtrudeGeometryOptionsMutableBuilder[Self <: ExtrudeGeometryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBevelEnabled(value: Boolean): Self = StObject.set(x, "bevelEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBevelEnabledUndefined: Self = StObject.set(x, "bevelEnabled", js.undefined)
      
      @scala.inline
      def setBevelOffset(value: Double): Self = StObject.set(x, "bevelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBevelOffsetUndefined: Self = StObject.set(x, "bevelOffset", js.undefined)
      
      @scala.inline
      def setBevelSegments(value: Double): Self = StObject.set(x, "bevelSegments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBevelSegmentsUndefined: Self = StObject.set(x, "bevelSegments", js.undefined)
      
      @scala.inline
      def setBevelSize(value: Double): Self = StObject.set(x, "bevelSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBevelSizeUndefined: Self = StObject.set(x, "bevelSize", js.undefined)
      
      @scala.inline
      def setBevelThickness(value: Double): Self = StObject.set(x, "bevelThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBevelThicknessUndefined: Self = StObject.set(x, "bevelThickness", js.undefined)
      
      @scala.inline
      def setCurveSegments(value: Double): Self = StObject.set(x, "curveSegments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurveSegmentsUndefined: Self = StObject.set(x, "curveSegments", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setExtrudePath(value: Curve[Vector3]): Self = StObject.set(x, "extrudePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtrudePathUndefined: Self = StObject.set(x, "extrudePath", js.undefined)
      
      @scala.inline
      def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setUVGenerator(value: UVGenerator): Self = StObject.set(x, "UVGenerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUVGeneratorUndefined: Self = StObject.set(x, "UVGenerator", js.undefined)
    }
  }
  
  @js.native
  trait UVGenerator extends StObject {
    
    def generateSideWallUV(
      geometry: ExtrudeBufferGeometry,
      vertices: js.Array[Double],
      indexA: Double,
      indexB: Double,
      indexC: Double,
      indexD: Double
    ): js.Array[Vector2] = js.native
    
    def generateTopUV(
      geometry: ExtrudeBufferGeometry,
      vertices: js.Array[Double],
      indexA: Double,
      indexB: Double,
      indexC: Double
    ): js.Array[Vector2] = js.native
  }
  object UVGenerator {
    
    @scala.inline
    def apply(
      generateSideWallUV: (ExtrudeBufferGeometry, js.Array[Double], Double, Double, Double, Double) => js.Array[Vector2],
      generateTopUV: (ExtrudeBufferGeometry, js.Array[Double], Double, Double, Double) => js.Array[Vector2]
    ): UVGenerator = {
      val __obj = js.Dynamic.literal(generateSideWallUV = js.Any.fromFunction6(generateSideWallUV), generateTopUV = js.Any.fromFunction5(generateTopUV))
      __obj.asInstanceOf[UVGenerator]
    }
    
    @scala.inline
    implicit class UVGeneratorMutableBuilder[Self <: UVGenerator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGenerateSideWallUV(
        value: (ExtrudeBufferGeometry, js.Array[Double], Double, Double, Double, Double) => js.Array[Vector2]
      ): Self = StObject.set(x, "generateSideWallUV", js.Any.fromFunction6(value))
      
      @scala.inline
      def setGenerateTopUV(value: (ExtrudeBufferGeometry, js.Array[Double], Double, Double, Double) => js.Array[Vector2]): Self = StObject.set(x, "generateTopUV", js.Any.fromFunction5(value))
    }
  }
}

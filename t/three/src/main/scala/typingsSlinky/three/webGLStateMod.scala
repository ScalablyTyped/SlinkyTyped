package typingsSlinky.three

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.three.anon.Stencil
import typingsSlinky.three.constantsMod.Blending
import typingsSlinky.three.constantsMod.BlendingDstFactor
import typingsSlinky.three.constantsMod.BlendingEquation
import typingsSlinky.three.constantsMod.BlendingSrcFactor
import typingsSlinky.three.constantsMod.CullFace
import typingsSlinky.three.constantsMod.DepthModes
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.vector4Mod.Vector4
import typingsSlinky.three.webGLCapabilitiesMod.WebGLCapabilities
import typingsSlinky.three.webGLExtensionsMod.WebGLExtensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLStateMod {
  
  @JSImport("three/src/renderers/webgl/WebGLState", "WebGLColorBuffer")
  @js.native
  class WebGLColorBuffer () extends StObject {
    
    def reset(): Unit = js.native
    
    def setClear(r: Double, g: Double, b: Double, a: Double, premultipliedAlpha: Boolean): Unit = js.native
    
    def setLocked(lock: Boolean): Unit = js.native
    
    def setMask(colorMask: Boolean): Unit = js.native
  }
  
  @JSImport("three/src/renderers/webgl/WebGLState", "WebGLDepthBuffer")
  @js.native
  class WebGLDepthBuffer () extends StObject {
    
    def reset(): Unit = js.native
    
    def setClear(depth: Double): Unit = js.native
    
    def setFunc(depthFunc: DepthModes): Unit = js.native
    
    def setLocked(lock: Boolean): Unit = js.native
    
    def setMask(depthMask: Boolean): Unit = js.native
    
    def setTest(depthTest: Boolean): Unit = js.native
  }
  
  @JSImport("three/src/renderers/webgl/WebGLState", "WebGLState")
  @js.native
  class WebGLState protected () extends StObject {
    def this(gl: WebGLRenderingContext, extensions: WebGLExtensions, capabilities: WebGLCapabilities) = this()
    
    def activeTexture(webglSlot: Double): Unit = js.native
    
    def bindTexture(webglType: Double, webglTexture: js.Any): Unit = js.native
    
    var buffers: Stencil = js.native
    
    // Same interface as https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/compressedTexImage2D
    def compressedTexImage2D(
      target: Double,
      level: Double,
      internalformat: Double,
      width: Double,
      height: Double,
      border: Double,
      data: js.typedarray.ArrayBufferView
    ): Unit = js.native
    
    def disable(id: Double): Unit = js.native
    
    def disableUnusedAttributes(): Unit = js.native
    
    def enable(id: Double): Unit = js.native
    
    def enableAttribute(attribute: Double): Unit = js.native
    
    def enableAttributeAndDivisor(attribute: Double, meshPerAttribute: Double): Unit = js.native
    
    def initAttributes(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def scissor(scissor: Vector4): Unit = js.native
    
    def setBlending(
      blending: Blending,
      blendEquation: js.UndefOr[BlendingEquation],
      blendSrc: js.UndefOr[BlendingSrcFactor],
      blendDst: js.UndefOr[BlendingDstFactor],
      blendEquationAlpha: js.UndefOr[BlendingEquation],
      blendSrcAlpha: js.UndefOr[BlendingSrcFactor],
      blendDstAlpha: js.UndefOr[BlendingDstFactor],
      premultiplyAlpha: js.UndefOr[Boolean]
    ): Unit = js.native
    
    def setCullFace(cullFace: CullFace): Unit = js.native
    
    def setFlipSided(flipSided: Boolean): Unit = js.native
    
    def setLineWidth(width: Double): Unit = js.native
    
    def setMaterial(material: Material, frontFaceCW: Boolean): Unit = js.native
    
    def setPolygonOffset(polygonoffset: Boolean): Unit = js.native
    def setPolygonOffset(polygonoffset: Boolean, factor: js.UndefOr[scala.Nothing], units: Double): Unit = js.native
    def setPolygonOffset(polygonoffset: Boolean, factor: Double): Unit = js.native
    def setPolygonOffset(polygonoffset: Boolean, factor: Double, units: Double): Unit = js.native
    
    def setScissorTest(scissorTest: Boolean): Unit = js.native
    
    def texImage2D(
      target: Double,
      level: Double,
      internalformat: Double,
      format: Double,
      `type`: Double,
      source: js.Any
    ): Unit = js.native
    // Same interface as https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/texImage2D
    def texImage2D(
      target: Double,
      level: Double,
      internalformat: Double,
      width: Double,
      height: Double,
      border: Double,
      format: Double,
      `type`: Double
    ): Unit = js.native
    def texImage2D(
      target: Double,
      level: Double,
      internalformat: Double,
      width: Double,
      height: Double,
      border: Double,
      format: Double,
      `type`: Double,
      pixels: js.typedarray.ArrayBufferView
    ): Unit = js.native
    
    def texImage3D(
      target: Double,
      level: Double,
      internalformat: Double,
      width: Double,
      height: Double,
      depth: Double,
      border: Double,
      format: Double,
      `type`: Double,
      pixels: js.Any
    ): Unit = js.native
    
    def unbindTexture(): Unit = js.native
    
    def useProgram(program: js.Any): Boolean = js.native
    
    def vertexAttribPointer(index: Double, size: Double, `type`: Double, normalized: Boolean, stride: Double, offset: Double): Unit = js.native
    
    def viewport(viewport: Vector4): Unit = js.native
  }
  
  @JSImport("three/src/renderers/webgl/WebGLState", "WebGLStencilBuffer")
  @js.native
  class WebGLStencilBuffer () extends StObject {
    
    def reset(): Unit = js.native
    
    def setClear(stencil: Double): Unit = js.native
    
    def setFunc(stencilFunc: Double, stencilRef: Double, stencilMask: Double): Unit = js.native
    
    def setLocked(lock: Boolean): Unit = js.native
    
    def setMask(stencilMask: Double): Unit = js.native
    
    def setOp(stencilFail: Double, stencilZFail: Double, stencilZPass: Double): Unit = js.native
    
    def setTest(stencilTest: Boolean): Unit = js.native
  }
}

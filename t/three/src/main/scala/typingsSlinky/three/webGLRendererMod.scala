package typingsSlinky.three

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.WebGLFramebuffer
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.std.OffscreenCanvas
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.colorMod.Color
import typingsSlinky.three.constantsMod.CullFace
import typingsSlinky.three.constantsMod.ShadowMapType
import typingsSlinky.three.constantsMod.TextureEncoding
import typingsSlinky.three.constantsMod.ToneMapping
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.sceneMod.Scene
import typingsSlinky.three.textureMod.Texture
import typingsSlinky.three.vector2Mod.Vector2
import typingsSlinky.three.vector4Mod.Vector4
import typingsSlinky.three.webGLCapabilitiesMod.WebGLCapabilities
import typingsSlinky.three.webGLExtensionsMod.WebGLExtensions
import typingsSlinky.three.webGLInfoMod.WebGLInfo
import typingsSlinky.three.webGLProgramMod.WebGLProgram
import typingsSlinky.three.webGLPropertiesMod.WebGLProperties
import typingsSlinky.three.webGLRenderListsMod.RenderTarget
import typingsSlinky.three.webGLRenderListsMod.WebGLRenderLists
import typingsSlinky.three.webGLRenderTargetMod.WebGLRenderTarget
import typingsSlinky.three.webGLShadowMapMod.WebGLShadowMap
import typingsSlinky.three.webGLStateMod.WebGLState
import typingsSlinky.three.webXRManagerMod.WebXRManager
import typingsSlinky.three.webXRMod.XRAnimationLoopCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLRendererMod {
  
  @JSImport("three/src/renderers/WebGLRenderer", "WebGLRenderer")
  @js.native
  /**
  	 * parameters is an optional object with properties defining the renderer's behaviour. The constructor also accepts no parameters at all. In all cases, it will assume sane defaults when parameters are missing.
  	 */
  class WebGLRenderer () extends Renderer {
    def this(parameters: WebGLRendererParameters) = this()
    
    /**
    	 * @deprecated Use {@link WebGLRenderer#setAnimationLoop .setAnimationLoop()} instead.
    	 */
    def animate(callback: js.Function): Unit = js.native
    
    /**
    	 * Defines whether the renderer should automatically clear its output before rendering.
    	 * @default true
    	 */
    var autoClear: Boolean = js.native
    
    /**
    	 * If autoClear is true, defines whether the renderer should clear the color buffer. Default is true.
    	 * @default true
    	 */
    var autoClearColor: Boolean = js.native
    
    /**
    	 * If autoClear is true, defines whether the renderer should clear the depth buffer. Default is true.
    	 * @default true
    	 */
    var autoClearDepth: Boolean = js.native
    
    /**
    	 * If autoClear is true, defines whether the renderer should clear the stencil buffer. Default is true.
    	 * @default true
    	 */
    var autoClearStencil: Boolean = js.native
    
    var capabilities: WebGLCapabilities = js.native
    
    /**
    	 * Tells the renderer to clear its color, depth or stencil drawing buffer(s).
    	 * Arguments default to true
    	 */
    def clear(): Unit = js.native
    def clear(color: js.UndefOr[scala.Nothing], depth: js.UndefOr[scala.Nothing], stencil: Boolean): Unit = js.native
    def clear(color: js.UndefOr[scala.Nothing], depth: Boolean): Unit = js.native
    def clear(color: js.UndefOr[scala.Nothing], depth: Boolean, stencil: Boolean): Unit = js.native
    def clear(color: Boolean): Unit = js.native
    def clear(color: Boolean, depth: js.UndefOr[scala.Nothing], stencil: Boolean): Unit = js.native
    def clear(color: Boolean, depth: Boolean): Unit = js.native
    def clear(color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
    
    def clearColor(): Unit = js.native
    
    def clearDepth(): Unit = js.native
    
    def clearStencil(): Unit = js.native
    
    def clearTarget(renderTarget: WebGLRenderTarget, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
    
    /**
    	 * @default []
    	 */
    var clippingPlanes: js.Array[_] = js.native
    
    /**
    	 * Compiles all materials in the scene with the camera. This is useful to precompile shaders before the first rendering.
    	 */
    def compile(scene: Object3D, camera: Camera): Unit = js.native
    
    /**
    	 * The HTML5 Canvas's 'webgl' context obtained from the canvas where the renderer will draw.
    	 */
    var context: WebGLRenderingContext = js.native
    
    /**
    	 * Copies a region of the currently bound framebuffer into the selected mipmap level of the selected texture.
    	 * This region is defined by the size of the destination texture's mip level, offset by the input position.
    	 *
    	 * @param position Specifies the pixel offset from which to copy out of the framebuffer.
    	 * @param texture Specifies the destination texture.
    	 * @param level Specifies the destination mipmap level of the texture.
    	 */
    def copyFramebufferToTexture(position: Vector2, texture: Texture): Unit = js.native
    def copyFramebufferToTexture(position: Vector2, texture: Texture, level: Double): Unit = js.native
    
    /**
    	 * Copies srcTexture to the specified level of dstTexture, offset by the input position.
    	 *
    	 * @param position Specifies the pixel offset into the dstTexture where the copy will occur.
    	 * @param srcTexture Specifies the source texture.
    	 * @param dstTexture Specifies the destination texture.
    	 * @param level Specifies the destination mipmap level of the texture.
    	 */
    def copyTextureToTexture(position: Vector2, srcTexture: Texture, dstTexture: Texture): Unit = js.native
    def copyTextureToTexture(position: Vector2, srcTexture: Texture, dstTexture: Texture, level: Double): Unit = js.native
    
    /**
    	 * Debug configurations.
    	 * @default { checkShaderErrors: true }
    	 */
    var debug: WebGLDebug = js.native
    
    def dispose(): Unit = js.native
    
    /**
    	 * @deprecated Use {@link WebGLRenderer#setScissorTest .setScissorTest()} instead.
    	 */
    def enableScissorTest(boolean: js.Any): js.Any = js.native
    
    var extensions: WebGLExtensions = js.native
    
    def forceContextLoss(): Unit = js.native
    
    /**
    	 * @deprecated
    	 */
    var gammaFactor: Double = js.native
    
    /**
    	 * Returns the current active cube face.
    	 */
    def getActiveCubeFace(): Double = js.native
    
    /**
    	 * Returns the current active mipmap level.
    	 */
    def getActiveMipmapLevel(): Double = js.native
    
    /**
    	 * Returns a float with the current clear alpha. Ranges from 0 to 1.
    	 */
    def getClearAlpha(): Double = js.native
    
    /**
    	 * Returns a THREE.Color instance with the current clear color.
    	 */
    def getClearColor(): Color = js.native
    
    /**
    	 * Return the WebGL context.
    	 */
    def getContext(): WebGLRenderingContext = js.native
    
    def getContextAttributes(): js.Any = js.native
    
    /**
    	 * @deprecated Use {@link WebGLRenderer#getRenderTarget .getRenderTarget()} instead.
    	 */
    def getCurrentRenderTarget(): RenderTarget | Null = js.native
    
    def getCurrentViewport(target: Vector4): Vector4 = js.native
    
    def getDrawingBufferSize(target: Vector2): Vector2 = js.native
    
    /**
    	 * @deprecated Use {@link WebGLCapabilities#getMaxAnisotropy .capabilities.getMaxAnisotropy()} instead.
    	 */
    def getMaxAnisotropy(): Double = js.native
    
    def getPixelRatio(): Double = js.native
    
    /**
    	 * @deprecated Use {@link WebGLCapabilities#precision .capabilities.precision} instead.
    	 */
    def getPrecision(): String = js.native
    
    /**
    	 * Returns the current render target. If no render target is set, null is returned.
    	 */
    def getRenderTarget(): RenderTarget | Null = js.native
    
    /**
    	 * Copies the scissor area into target.
    	 */
    def getScissor(target: Vector4): Vector4 = js.native
    
    /**
    	 * Returns true if scissor test is enabled; returns false otherwise.
    	 */
    def getScissorTest(): Boolean = js.native
    
    def getSize(target: Vector2): Vector2 = js.native
    
    /**
    	 * Copies the viewport into target.
    	 */
    def getViewport(target: Vector4): Vector4 = js.native
    
    var info: WebGLInfo = js.native
    
    /**
    	 * Initializes the given texture. Can be used to preload a texture rather than waiting until first render (which can cause noticeable lags due to decode and GPU upload overhead).
    	 *
    	 * @param texture The texture to Initialize.
    	 */
    def initTexture(texture: Texture): Unit = js.native
    
    /**
    	 * @default false
    	 */
    var localClippingEnabled: Boolean = js.native
    
    /**
    	 * @default 4
    	 */
    var maxMorphNormals: Double = js.native
    
    /**
    	 * @default 8
    	 */
    var maxMorphTargets: Double = js.native
    
    /**
    	 * Default is LinearEncoding.
    	 * @default THREE.LinearEncoding
    	 */
    var outputEncoding: TextureEncoding = js.native
    
    /**
    	 * @default false
    	 */
    var physicallyCorrectLights: Boolean = js.native
    
    var pixelRatio: Double = js.native
    
    var properties: WebGLProperties = js.native
    
    def readRenderTargetPixels(renderTarget: RenderTarget, x: Double, y: Double, width: Double, height: Double, buffer: js.Any): Unit = js.native
    def readRenderTargetPixels(
      renderTarget: RenderTarget,
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      buffer: js.Any,
      activeCubeFaceIndex: Double
    ): Unit = js.native
    
    def renderBufferDirect(
      camera: Camera,
      scene: Scene,
      geometry: BufferGeometry,
      material: Material,
      `object`: Object3D,
      geometryGroup: js.Any
    ): Unit = js.native
    def renderBufferDirect(
      camera: Camera,
      scene: Scene,
      geometry: Geometry,
      material: Material,
      `object`: Object3D,
      geometryGroup: js.Any
    ): Unit = js.native
    
    def renderBufferImmediate(`object`: Object3D, program: WebGLProgram): Unit = js.native
    
    var renderLists: WebGLRenderLists = js.native
    
    /**
    	 * @deprecated Use {@link WebGLState#reset .state.reset()} instead.
    	 */
    def resetGLState(): Unit = js.native
    
    /**
    	 * A build in function that can be used instead of requestAnimationFrame. For WebXR projects this function must be used.
    	 * @param callback The function will be called every available frame. If `null` is passed it will stop any already ongoing animation.
    	 */
    def setAnimationLoop(): Unit = js.native
    def setAnimationLoop(callback: XRAnimationLoopCallback): Unit = js.native
    
    def setClearAlpha(alpha: Double): Unit = js.native
    
    def setClearColor(color: String): Unit = js.native
    def setClearColor(color: String, alpha: Double): Unit = js.native
    def setClearColor(color: Double): Unit = js.native
    def setClearColor(color: Double, alpha: Double): Unit = js.native
    /**
    	 * Sets the clear color, using color for the color and alpha for the opacity.
    	 */
    def setClearColor(color: Color): Unit = js.native
    def setClearColor(color: Color, alpha: Double): Unit = js.native
    
    def setDrawingBufferSize(width: Double, height: Double, pixelRatio: Double): Unit = js.native
    
    /**
    	 * Sets the given WebGLFramebuffer. This method can only be used if no render target is set via
    	 * {@link WebGLRenderer#setRenderTarget .setRenderTarget}.
    	 *
    	 * @param value The WebGLFramebuffer.
    	 */
    def setFramebuffer(value: WebGLFramebuffer): Unit = js.native
    
    /**
    	 * Sets the custom opaque sort function for the WebGLRenderLists. Pass null to use the default painterSortStable function.
    	 */
    def setOpaqueSort(method: js.Function): Unit = js.native
    
    def setPixelRatio(value: Double): Unit = js.native
    
    /**
    	 * Sets the active render target.
    	 *
    	 * @param renderTarget The {@link WebGLRenderTarget renderTarget} that needs to be activated. When `null` is given, the canvas is set as the active render target instead.
    	 * @param activeCubeFace Specifies the active cube side (PX 0, NX 1, PY 2, NY 3, PZ 4, NZ 5) of {@link WebGLCubeRenderTarget}.
    	 * @param activeMipmapLevel Specifies the active mipmap level.
    	 */
    def setRenderTarget(): Unit = js.native
    def setRenderTarget(renderTarget: Null, activeCubeFace: js.UndefOr[scala.Nothing], activeMipmapLevel: Double): Unit = js.native
    def setRenderTarget(renderTarget: Null, activeCubeFace: Double): Unit = js.native
    def setRenderTarget(renderTarget: Null, activeCubeFace: Double, activeMipmapLevel: Double): Unit = js.native
    def setRenderTarget(renderTarget: RenderTarget): Unit = js.native
    def setRenderTarget(renderTarget: RenderTarget, activeCubeFace: js.UndefOr[scala.Nothing], activeMipmapLevel: Double): Unit = js.native
    def setRenderTarget(renderTarget: RenderTarget, activeCubeFace: Double): Unit = js.native
    def setRenderTarget(renderTarget: RenderTarget, activeCubeFace: Double, activeMipmapLevel: Double): Unit = js.native
    
    def setScissor(x: Double): Unit = js.native
    def setScissor(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
    def setScissor(x: Double, y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
    def setScissor(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
    def setScissor(x: Double, y: Double): Unit = js.native
    def setScissor(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
    def setScissor(x: Double, y: Double, width: Double): Unit = js.native
    def setScissor(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    /**
    	 * Sets the scissor area from (x, y) to (x + width, y + height).
    	 */
    def setScissor(x: Vector4): Unit = js.native
    def setScissor(x: Vector4, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
    def setScissor(x: Vector4, y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
    def setScissor(x: Vector4, y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
    def setScissor(x: Vector4, y: Double): Unit = js.native
    def setScissor(x: Vector4, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
    def setScissor(x: Vector4, y: Double, width: Double): Unit = js.native
    def setScissor(x: Vector4, y: Double, width: Double, height: Double): Unit = js.native
    
    /**
    	 * Enable the scissor test. When this is enabled, only the pixels within the defined scissor area will be affected by further renderer actions.
    	 */
    def setScissorTest(enable: Boolean): Unit = js.native
    
    /**
    	 * Sets the custom transparent sort function for the WebGLRenderLists. Pass null to use the default reversePainterSortStable function.
    	 */
    def setTransparentSort(method: js.Function): Unit = js.native
    
    def setViewport(x: Double): Unit = js.native
    def setViewport(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
    def setViewport(x: Double, y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
    def setViewport(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
    def setViewport(x: Double, y: Double): Unit = js.native
    def setViewport(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
    def setViewport(x: Double, y: Double, width: Double): Unit = js.native
    def setViewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    /**
    	 * Sets the viewport to render from (x, y) to (x + width, y + height).
    	 * (x, y) is the lower-left corner of the region.
    	 */
    def setViewport(x: Vector4): Unit = js.native
    def setViewport(x: Vector4, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
    def setViewport(x: Vector4, y: js.UndefOr[scala.Nothing], width: Double): Unit = js.native
    def setViewport(x: Vector4, y: js.UndefOr[scala.Nothing], width: Double, height: Double): Unit = js.native
    def setViewport(x: Vector4, y: Double): Unit = js.native
    def setViewport(x: Vector4, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
    def setViewport(x: Vector4, y: Double, width: Double): Unit = js.native
    def setViewport(x: Vector4, y: Double, width: Double, height: Double): Unit = js.native
    
    var shadowMap: WebGLShadowMap = js.native
    
    /**
    	 * @deprecated Use {@link WebGLShadowMap#cullFace .shadowMap.cullFace} instead.
    	 */
    var shadowMapCullFace: CullFace = js.native
    
    /**
    	 * @default false
    	 */
    var shadowMapDebug: Boolean = js.native
    
    /**
    	 * @deprecated Use {@link WebGLShadowMap#enabled .shadowMap.enabled} instead.
    	 */
    var shadowMapEnabled: Boolean = js.native
    
    /**
    	 * @deprecated Use {@link WebGLShadowMap#type .shadowMap.type} instead.
    	 */
    var shadowMapType: ShadowMapType = js.native
    
    /**
    	 * Defines whether the renderer should sort objects. Default is true.
    	 * @default true
    	 */
    var sortObjects: Boolean = js.native
    
    var state: WebGLState = js.native
    
    /**
    	 * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'EXT_blend_minmax' )} instead.
    	 */
    def supportsBlendMinMax(): js.Any = js.native
    
    /**
    	 * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'WEBGL_compressed_texture_pvrtc' )} instead.
    	 */
    def supportsCompressedTexturePVRTC(): js.Any = js.native
    
    /**
    	 * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'WEBGL_compressed_texture_s3tc' )} instead.
    	 */
    def supportsCompressedTextureS3TC(): js.Any = js.native
    
    /**
    	 * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'OES_texture_float' )} instead.
    	 */
    def supportsFloatTextures(): js.Any = js.native
    
    /**
    	 * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'OES_texture_half_float' )} instead.
    	 */
    def supportsHalfFloatTextures(): js.Any = js.native
    
    /**
    	 * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'ANGLE_instanced_arrays' )} instead.
    	 */
    def supportsInstancedArrays(): js.Any = js.native
    
    /**
    	 * @deprecated Use {@link WebGLExtensions#get .extensions.get( 'OES_standard_derivatives' )} instead.
    	 */
    def supportsStandardDerivatives(): js.Any = js.native
    
    /**
    	 * @deprecated Use {@link WebGLCapabilities#vertexTextures .capabilities.vertexTextures} instead.
    	 */
    def supportsVertexTextures(): js.Any = js.native
    
    /**
    	 * @default THREE.NoToneMapping
    	 */
    var toneMapping: ToneMapping = js.native
    
    /**
    	 * @default 1
    	 */
    var toneMappingExposure: Double = js.native
    
    /**
    	 * @deprecated Use {@link WebGLRenderer#xr .xr} instead.
    	 */
    var vr: Boolean = js.native
    
    var xr: WebXRManager = js.native
  }
  
  @js.native
  trait Renderer extends StObject {
    
    var domElement: HTMLCanvasElement = js.native
    
    def render(scene: Object3D, camera: Camera): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
    def setSize(width: Double, height: Double, updateStyle: Boolean): Unit = js.native
  }
  
  @js.native
  trait WebGLDebug extends StObject {
    
    /**
    	 * Enables error checking and reporting when shader programs are being compiled.
    	 */
    var checkShaderErrors: Boolean = js.native
  }
  object WebGLDebug {
    
    @scala.inline
    def apply(checkShaderErrors: Boolean): WebGLDebug = {
      val __obj = js.Dynamic.literal(checkShaderErrors = checkShaderErrors.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGLDebug]
    }
    
    @scala.inline
    implicit class WebGLDebugMutableBuilder[Self <: WebGLDebug] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckShaderErrors(value: Boolean): Self = StObject.set(x, "checkShaderErrors", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebGLRendererParameters extends StObject {
    
    /**
    	 * default is false.
    	 */
    var alpha: js.UndefOr[Boolean] = js.native
    
    /**
    	 * default is false.
    	 */
    var antialias: js.UndefOr[Boolean] = js.native
    
    /**
    	 * A Canvas where the renderer draws its output.
    	 */
    var canvas: js.UndefOr[HTMLCanvasElement | OffscreenCanvas] = js.native
    
    /**
    	 * A WebGL Rendering Context.
    	 * (https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext)
    	 *	Default is null
    	 */
    var context: js.UndefOr[WebGLRenderingContext] = js.native
    
    /**
    	 * default is true.
    	 */
    var depth: js.UndefOr[Boolean] = js.native
    
    /**
    	 * default is false.
    	 */
    var logarithmicDepthBuffer: js.UndefOr[Boolean] = js.native
    
    /**
    	 *	Can be "high-performance", "low-power" or "default"
    	 */
    var powerPreference: js.UndefOr[String] = js.native
    
    /**
    	 *	shader precision. Can be "highp", "mediump" or "lowp".
    	 */
    var precision: js.UndefOr[String] = js.native
    
    /**
    	 * default is true.
    	 */
    var premultipliedAlpha: js.UndefOr[Boolean] = js.native
    
    /**
    	 * default is false.
    	 */
    var preserveDrawingBuffer: js.UndefOr[Boolean] = js.native
    
    /**
    	 * default is true.
    	 */
    var stencil: js.UndefOr[Boolean] = js.native
  }
  object WebGLRendererParameters {
    
    @scala.inline
    def apply(): WebGLRendererParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebGLRendererParameters]
    }
    
    @scala.inline
    implicit class WebGLRendererParametersMutableBuilder[Self <: WebGLRendererParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
      
      @scala.inline
      def setCanvas(value: HTMLCanvasElement | OffscreenCanvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvasHTMLCanvasElement(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      @scala.inline
      def setContext(value: WebGLRenderingContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setLogarithmicDepthBuffer(value: Boolean): Self = StObject.set(x, "logarithmicDepthBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogarithmicDepthBufferUndefined: Self = StObject.set(x, "logarithmicDepthBuffer", js.undefined)
      
      @scala.inline
      def setPowerPreference(value: String): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
      
      @scala.inline
      def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
      
      @scala.inline
      def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
      
      @scala.inline
      def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
    }
  }
}

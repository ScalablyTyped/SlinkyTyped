package typingsSlinky.winrtUwp.global.Windows.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies pixel formats for use with Winrt Direct3D 11 interop surfaces. */
@JSGlobal("Windows.Graphics.DirectX")
@js.native
object DirectX extends js.Object {
  
  /** Provides Windows Runtime projections of Microsoft Direct3D APIs to enable Windows Runtime components to exchange Direct3D surfaces and devices. */
  @js.native
  object Direct3D11 extends js.Object {
    
    /** A Windows Runtime projection of the D3D11_BIND_FLAG enumeration. Identifies the ways in which a resource may be bound to the graphics pipeline. */
    @js.native
    object Direct3DBindings extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings with Double
          ] = js.native
      
      /* 2 */ val constantBuffer: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.constantBuffer with Double = js.native
      
      /* 8 */ val decoder: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.decoder with Double = js.native
      
      /* 6 */ val depthStencil: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.depthStencil with Double = js.native
      
      /* 1 */ val indexBuffer: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.indexBuffer with Double = js.native
      
      /* 5 */ val renderTarget: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.renderTarget with Double = js.native
      
      /* 3 */ val shaderResource: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.shaderResource with Double = js.native
      
      /* 4 */ val streamOutput: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.streamOutput with Double = js.native
      
      /* 7 */ val unorderedAccess: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.unorderedAccess with Double = js.native
      
      /* 0 */ val vertexBuffer: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.vertexBuffer with Double = js.native
      
      /* 9 */ val videoEncoder: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.videoEncoder with Double = js.native
    }
    
    /** A Windows Runtime projection of the D3D11_USAGE enumeration. Identifies expected resource use during rendering. The usage directly reflects whether a resource is accessible by the CPU and/or the graphics processing unit (GPU). */
    @js.native
    object Direct3DUsage extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DUsage with Double
          ] = js.native
      
      /* 0 */ val default: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DUsage.default with Double = js.native
      
      /* 2 */ val dynamic: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DUsage.dynamic with Double = js.native
      
      /* 1 */ val immutable: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DUsage.immutable with Double = js.native
      
      /* 3 */ val staging: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DUsage.staging with Double = js.native
    }
  }
  
  /** Identifies the alpha value, transparency behavior, of a surface. This is a managed version of the DXGI_APLAHA_MODE enumeration. */
  @js.native
  object DirectXAlphaMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXAlphaMode with Double] = js.native
    
    /* 3 */ val ignore: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXAlphaMode.ignore with Double = js.native
    
    /* 1 */ val premultiplied: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXAlphaMode.premultiplied with Double = js.native
    
    /* 2 */ val straight: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXAlphaMode.straight with Double = js.native
    
    /* 0 */ val unspecified: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXAlphaMode.unspecified with Double = js.native
  }
  
  /** Specifies pixel formats, which includes fully-typed and type-less formats. This is a managed version of the DXGI_FORMAT enumeration. */
  @js.native
  object DirectXPixelFormat extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat with Double] = js.native
    
    /* 114 */ val a8P8: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.a8P8 with Double = js.native
    
    /* 65 */ val a8UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.a8UIntNormalized with Double = js.native
    
    /* 111 */ val ai44: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.ai44 with Double = js.native
    
    /* 100 */ val ayuv: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.ayuv with Double = js.native
    
    /* 115 */ val b4G4R4A4UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b4G4R4A4UIntNormalized with Double = js.native
    
    /* 86 */ val b5G5R5A1UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b5G5R5A1UIntNormalized with Double = js.native
    
    /* 85 */ val b5G6R5UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b5G6R5UIntNormalized with Double = js.native
    
    /* 90 */ val b8G8R8A8Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b8G8R8A8Typeless with Double = js.native
    
    /* 87 */ val b8G8R8A8UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b8G8R8A8UIntNormalized with Double = js.native
    
    /* 91 */ val b8G8R8A8UIntNormalizedSrgb: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b8G8R8A8UIntNormalizedSrgb with Double = js.native
    
    /* 92 */ val b8G8R8X8Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b8G8R8X8Typeless with Double = js.native
    
    /* 88 */ val b8G8R8X8UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b8G8R8X8UIntNormalized with Double = js.native
    
    /* 93 */ val b8G8R8X8UIntNormalizedSrgb: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b8G8R8X8UIntNormalizedSrgb with Double = js.native
    
    /* 70 */ val bc1Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc1Typeless with Double = js.native
    
    /* 71 */ val bc1UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc1UIntNormalized with Double = js.native
    
    /* 72 */ val bc1UIntNormalizedSrgb: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc1UIntNormalizedSrgb with Double = js.native
    
    /* 73 */ val bc2Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc2Typeless with Double = js.native
    
    /* 74 */ val bc2UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc2UIntNormalized with Double = js.native
    
    /* 75 */ val bc2UIntNormalizedSrgb: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc2UIntNormalizedSrgb with Double = js.native
    
    /* 76 */ val bc3Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc3Typeless with Double = js.native
    
    /* 77 */ val bc3UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc3UIntNormalized with Double = js.native
    
    /* 78 */ val bc3UIntNormalizedSrgb: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc3UIntNormalizedSrgb with Double = js.native
    
    /* 81 */ val bc4IntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc4IntNormalized with Double = js.native
    
    /* 79 */ val bc4Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc4Typeless with Double = js.native
    
    /* 80 */ val bc4UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc4UIntNormalized with Double = js.native
    
    /* 84 */ val bc5IntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc5IntNormalized with Double = js.native
    
    /* 82 */ val bc5Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc5Typeless with Double = js.native
    
    /* 83 */ val bc5UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc5UIntNormalized with Double = js.native
    
    /* 96 */ val bc6H16Float: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc6H16Float with Double = js.native
    
    /* 95 */ val bc6H16UnsignedFloat: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc6H16UnsignedFloat with Double = js.native
    
    /* 94 */ val bc6HTypeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc6HTypeless with Double = js.native
    
    /* 97 */ val bc7Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc7Typeless with Double = js.native
    
    /* 98 */ val bc7UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc7UIntNormalized with Double = js.native
    
    /* 99 */ val bc7UIntNormalizedSrgb: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc7UIntNormalizedSrgb with Double = js.native
    
    /* 55 */ val d16UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.d16UIntNormalized with Double = js.native
    
    /* 45 */ val d24UIntNormalizedS8UInt: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.d24UIntNormalizedS8UInt with Double = js.native
    
    /* 40 */ val d32Float: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.d32Float with Double = js.native
    
    /* 20 */ val d32FloatS8X24UInt: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.d32FloatS8X24UInt with Double = js.native
    
    /* 69 */ val g8R8G8B8UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.g8R8G8B8UIntNormalized with Double = js.native
    
    /* 112 */ val ia44: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.ia44 with Double = js.native
    
    /* 110 */ val nv11: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.nv11 with Double = js.native
    
    /* 103 */ val nv12: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.nv12 with Double = js.native
    
    /* 106 */ val opaque420: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.opaque420 with Double = js.native
    
    /* 104 */ val p010: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.p010 with Double = js.native
    
    /* 105 */ val p016: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.p016 with Double = js.native
    
    /* 116 */ val p208: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.p208 with Double = js.native
    
    /* 113 */ val p8: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.p8 with Double = js.native
    
    /* 23 */ val r10G10B10A2Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r10G10B10A2Typeless with Double = js.native
    
    /* 25 */ val r10G10B10A2UInt: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r10G10B10A2UInt with Double = js.native
    
    /* 24 */ val r10G10B10A2UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r10G10B10A2UIntNormalized with Double = js.native
    
    /* 89 */ val r10G10B10XRBiasA2UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r10G10B10XRBiasA2UIntNormalized with Double = js.native
    
    /* 26 */ val r11G11B10Float: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r11G11B10Float with Double = js.native
    
    /* 54 */ val r16Float: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16Float with Double = js.native
    
    /* 10 */ val r16G16B16A16Float: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16B16A16Float with Double = js.native
    
    /* 14 */ val r16G16B16A16Int: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16B16A16Int with Double = js.native
    
    /* 13 */ val r16G16B16A16IntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16B16A16IntNormalized with Double = js.native
    
    /* 9 */ val r16G16B16A16Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16B16A16Typeless with Double = js.native
    
    /* 12 */ val r16G16B16A16UInt: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16B16A16UInt with Double = js.native
    
    /* 11 */ val r16G16B16A16UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16B16A16UIntNormalized with Double = js.native
    
    /* 34 */ val r16G16Float: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16Float with Double = js.native
    
    /* 38 */ val r16G16Int: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16Int with Double = js.native
    
    /* 37 */ val r16G16IntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16IntNormalized with Double = js.native
    
    /* 33 */ val r16G16Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16Typeless with Double = js.native
    
    /* 36 */ val r16G16UInt: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16UInt with Double = js.native
    
    /* 35 */ val r16G16UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16UIntNormalized with Double = js.native
    
    /* 59 */ val r16Int: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16Int with Double = js.native
    
    /* 58 */ val r16IntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16IntNormalized with Double = js.native
    
    /* 53 */ val r16Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16Typeless with Double = js.native
    
    /* 57 */ val r16UInt: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16UInt with Double = js.native
    
    /* 56 */ val r16UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16UIntNormalized with Double = js.native
    
    /* 66 */ val r1UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r1UIntNormalized with Double = js.native
    
    /* 44 */ val r24G8Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r24G8Typeless with Double = js.native
    
    /* 46 */ val r24UIntNormalizedX8Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r24UIntNormalizedX8Typeless with Double = js.native
    
    /* 41 */ val r32Float: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32Float with Double = js.native
    
    /* 21 */ val r32FloatX8X24Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32FloatX8X24Typeless with Double = js.native
    
    /* 2 */ val r32G32B32A32Float: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32A32Float with Double = js.native
    
    /* 4 */ val r32G32B32A32Int: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32A32Int with Double = js.native
    
    /* 1 */ val r32G32B32A32Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32A32Typeless with Double = js.native
    
    /* 3 */ val r32G32B32A32UInt: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32A32UInt with Double = js.native
    
    /* 6 */ val r32G32B32Float: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32Float with Double = js.native
    
    /* 8 */ val r32G32B32Int: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32Int with Double = js.native
    
    /* 5 */ val r32G32B32Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32Typeless with Double = js.native
    
    /* 7 */ val r32G32B32UInt: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32UInt with Double = js.native
    
    /* 16 */ val r32G32Float: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32Float with Double = js.native
    
    /* 18 */ val r32G32Int: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32Int with Double = js.native
    
    /* 15 */ val r32G32Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32Typeless with Double = js.native
    
    /* 17 */ val r32G32UInt: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32UInt with Double = js.native
    
    /* 19 */ val r32G8X24Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G8X24Typeless with Double = js.native
    
    /* 43 */ val r32Int: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32Int with Double = js.native
    
    /* 39 */ val r32Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32Typeless with Double = js.native
    
    /* 42 */ val r32UInt: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32UInt with Double = js.native
    
    /* 32 */ val r8G8B8A8Int: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8B8A8Int with Double = js.native
    
    /* 31 */ val r8G8B8A8IntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8B8A8IntNormalized with Double = js.native
    
    /* 27 */ val r8G8B8A8Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8B8A8Typeless with Double = js.native
    
    /* 30 */ val r8G8B8A8UInt: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8B8A8UInt with Double = js.native
    
    /* 28 */ val r8G8B8A8UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8B8A8UIntNormalized with Double = js.native
    
    /* 29 */ val r8G8B8A8UIntNormalizedSrgb: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8B8A8UIntNormalizedSrgb with Double = js.native
    
    /* 68 */ val r8G8B8G8UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8B8G8UIntNormalized with Double = js.native
    
    /* 52 */ val r8G8Int: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8Int with Double = js.native
    
    /* 51 */ val r8G8IntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8IntNormalized with Double = js.native
    
    /* 48 */ val r8G8Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8Typeless with Double = js.native
    
    /* 50 */ val r8G8UInt: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8UInt with Double = js.native
    
    /* 49 */ val r8G8UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8UIntNormalized with Double = js.native
    
    /* 64 */ val r8Int: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8Int with Double = js.native
    
    /* 63 */ val r8IntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8IntNormalized with Double = js.native
    
    /* 60 */ val r8Typeless: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8Typeless with Double = js.native
    
    /* 62 */ val r8UInt: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8UInt with Double = js.native
    
    /* 61 */ val r8UIntNormalized: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8UIntNormalized with Double = js.native
    
    /* 67 */ val r9G9B9E5SharedExponent: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r9G9B9E5SharedExponent with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.unknown with Double = js.native
    
    /* 117 */ val v208: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.v208 with Double = js.native
    
    /* 118 */ val v408: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.v408 with Double = js.native
    
    /* 47 */ val x24TypelessG8UInt: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.x24TypelessG8UInt with Double = js.native
    
    /* 22 */ val x32TypelessG8X24UInt: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.x32TypelessG8X24UInt with Double = js.native
    
    /* 108 */ val y210: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.y210 with Double = js.native
    
    /* 109 */ val y216: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.y216 with Double = js.native
    
    /* 101 */ val y410: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.y410 with Double = js.native
    
    /* 102 */ val y416: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.y416 with Double = js.native
    
    /* 107 */ val yuy2: typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.yuy2 with Double = js.native
  }
}

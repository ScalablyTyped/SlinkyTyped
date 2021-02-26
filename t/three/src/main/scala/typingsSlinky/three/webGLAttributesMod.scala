package typingsSlinky.three

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.std.WebGL2RenderingContext
import typingsSlinky.three.anon.BytesPerElement
import typingsSlinky.three.bufferAttributeMod.BufferAttribute
import typingsSlinky.three.interleavedBufferAttributeMod.InterleavedBufferAttribute
import typingsSlinky.three.webGLCapabilitiesMod.WebGLCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLAttributesMod {
  
  @JSImport("three/src/renderers/webgl/WebGLAttributes", "WebGLAttributes")
  @js.native
  class WebGLAttributes protected () extends StObject {
    def this(gl: WebGLRenderingContext, capabilities: WebGLCapabilities) = this()
    def this(gl: WebGL2RenderingContext, capabilities: WebGLCapabilities) = this()
    
    def get(attribute: BufferAttribute): BytesPerElement = js.native
    def get(attribute: InterleavedBufferAttribute): BytesPerElement = js.native
    
    def remove(attribute: BufferAttribute): Unit = js.native
    def remove(attribute: InterleavedBufferAttribute): Unit = js.native
    
    def update(attribute: BufferAttribute, bufferType: Double): Unit = js.native
    def update(attribute: InterleavedBufferAttribute, bufferType: Double): Unit = js.native
  }
}

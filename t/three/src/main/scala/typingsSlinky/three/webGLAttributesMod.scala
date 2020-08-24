package typingsSlinky.three

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.std.GLenum
import typingsSlinky.std.WebGL2RenderingContext
import typingsSlinky.three.anon.BytesPerElement
import typingsSlinky.three.bufferAttributeMod.BufferAttribute
import typingsSlinky.three.interleavedBufferAttributeMod.InterleavedBufferAttribute
import typingsSlinky.three.webGLCapabilitiesMod.WebGLCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLAttributes", JSImport.Namespace)
@js.native
object webGLAttributesMod extends js.Object {
  @js.native
  class WebGLAttributes protected () extends js.Object {
    def this(gl: WebGL2RenderingContext, capabilities: WebGLCapabilities) = this()
    def this(gl: WebGLRenderingContext, capabilities: WebGLCapabilities) = this()
    def get(attribute: BufferAttribute): BytesPerElement = js.native
    def get(attribute: InterleavedBufferAttribute): BytesPerElement = js.native
    def remove(attribute: BufferAttribute): Unit = js.native
    def remove(attribute: InterleavedBufferAttribute): Unit = js.native
    def update(attribute: BufferAttribute, bufferType: GLenum): Unit = js.native
    def update(attribute: InterleavedBufferAttribute, bufferType: GLenum): Unit = js.native
  }
  
}


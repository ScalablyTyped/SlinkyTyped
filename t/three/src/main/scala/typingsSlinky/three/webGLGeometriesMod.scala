package typingsSlinky.three

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.three.bufferAttributeMod.BufferAttribute
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.geometryMod.Geometry
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.webGLAttributesMod.WebGLAttributes
import typingsSlinky.three.webGLInfoMod.WebGLInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLGeometriesMod {
  
  @JSImport("three/src/renderers/webgl/WebGLGeometries", "WebGLGeometries")
  @js.native
  class WebGLGeometries protected () extends StObject {
    def this(gl: WebGLRenderingContext, attributes: WebGLAttributes, info: WebGLInfo) = this()
    
    def get(`object`: Object3D, geometry: BufferGeometry): BufferGeometry = js.native
    def get(`object`: Object3D, geometry: Geometry): BufferGeometry = js.native
    
    def getWireframeAttribute(geometry: BufferGeometry): BufferAttribute = js.native
    def getWireframeAttribute(geometry: Geometry): BufferAttribute = js.native
    
    def update(geometry: BufferGeometry): Unit = js.native
    def update(geometry: Geometry): Unit = js.native
  }
}

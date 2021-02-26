package typingsSlinky.three

import typingsSlinky.three.anon.NeedsUpdate
import typingsSlinky.three.cameraMod.Camera
import typingsSlinky.three.materialMod.Material
import typingsSlinky.three.webGLPropertiesMod.WebGLProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLClippingMod {
  
  @JSImport("three/src/renderers/webgl/WebGLClipping", "WebGLClipping")
  @js.native
  class WebGLClipping protected () extends StObject {
    def this(properties: WebGLProperties) = this()
    
    def beginShadows(): Unit = js.native
    
    def endShadows(): Unit = js.native
    
    def init(planes: js.Array[_], enableLocalClipping: Boolean, camera: Camera): Boolean = js.native
    
    /**
    	 * @default 0
    	 */
    var numIntersection: Double = js.native
    
    /**
    	 * @default 0
    	 */
    var numPlanes: Double = js.native
    
    def setState(material: Material, camera: Camera, useCache: Boolean): Unit = js.native
    
    var uniform: NeedsUpdate = js.native
  }
}

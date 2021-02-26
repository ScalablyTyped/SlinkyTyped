package typingsSlinky.three

import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.materialsMod.SpriteMaterial
import typingsSlinky.three.object3DMod.Object3D
import typingsSlinky.three.threeBooleans.`true`
import typingsSlinky.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spriteMod {
  
  @JSImport("three/src/objects/Sprite", "Sprite")
  @js.native
  class Sprite () extends Object3D {
    def this(material: SpriteMaterial) = this()
    
    var center: Vector2 = js.native
    
    var geometry: BufferGeometry = js.native
    
    val isSprite: `true` = js.native
    
    var material: SpriteMaterial = js.native
    
    @JSName("type")
    var type_Sprite: typingsSlinky.three.threeStrings.Sprite = js.native
  }
}

package typingsSlinky.wonderJs

import typingsSlinky.wonderJs.entityObjectMod.EntityObject
import typingsSlinky.wonderJs.gameObjectMod.GameObject
import typingsSlinky.wonderJs.rendererMod.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/scene/gameObjectScene/GameObjectScene", JSImport.Namespace)
@js.native
object gameObjectSceneMod extends js.Object {
  @js.native
  class GameObjectScene () extends EntityObject {
    var currentCamera: js.Any = js.native
    def addChild(child: GameObject): GameObject = js.native
    def render(renderer: Renderer): Unit = js.native
  }
  
  /* static members */
  @js.native
  object GameObjectScene extends js.Object {
    def create(): GameObjectScene = js.native
  }
  
}


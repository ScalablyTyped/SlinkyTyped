package typingsSlinky.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "ComponentManager")
@js.native
class ComponentManager protected ()
  extends typingsSlinky.wonderJs.componentManagerMod.ComponentManager {
  def this(entityObject: typingsSlinky.wonderJs.entityObjectMod.EntityObject) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "ComponentManager")
@js.native
object ComponentManager extends js.Object {
  def create(entityObject: typingsSlinky.wonderJs.entityObjectMod.EntityObject): typingsSlinky.wonderJs.componentManagerMod.ComponentManager = js.native
}


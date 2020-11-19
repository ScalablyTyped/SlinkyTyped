package typingsSlinky.vegaTypings.runtimeMod

import typingsSlinky.vegaTypings.sceneMod.Scene
import typingsSlinky.vegaTypings.sceneMod.SceneGroup
import typingsSlinky.vegaTypings.sceneMod.SceneItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-typings/types/runtime", "sceneVisit")
@js.native
object sceneVisit extends js.Object {
  
  def apply(scene: SceneGroup, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
  def apply(scene: Scene, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
}

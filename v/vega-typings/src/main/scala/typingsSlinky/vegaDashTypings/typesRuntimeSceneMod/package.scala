package typingsSlinky.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesRuntimeSceneMod {
  import typingsSlinky.vegaDashTypings.Anon_Align
  import typingsSlinky.vegaDashTypings.Anon_Context
  import typingsSlinky.vegaDashTypings.Anon_FillHeight
  import typingsSlinky.vegaDashTypings.Anon_FillShape
  import typingsSlinky.vegaDashTypings.Anon_Opacity

  type SceneGroup = SceneItem with Anon_Context
  type SceneLine = SceneItem with Anon_Opacity
  type SceneRect = SceneItem with Anon_FillHeight
  type SceneSymbol = SceneItem with Anon_FillShape
  type SceneText = SceneItem with Anon_Align
}

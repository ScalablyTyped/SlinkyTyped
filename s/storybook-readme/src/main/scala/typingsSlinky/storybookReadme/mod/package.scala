package typingsSlinky.storybookReadme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DecoratorPattern = typingsSlinky.storybookAddons.typesMod.DecoratorFunction[slinky.core.facade.ReactElement]
  type HOCPattern = typingsSlinky.storybookAddons.typesMod.DecoratorFunction[slinky.core.facade.ReactElement]
  type MakeDecoratorResult = js.Function1[/* repeated */ js.Any, js.Any]
  type RenderFunction = typingsSlinky.storybookAddons.typesMod.StoryFn[slinky.core.facade.ReactElement]
}

package typingsSlinky.storybookDashReadme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storybookDashReadmeMod {
  import typingsSlinky.atStorybookAddons.distTypesMod.DecoratorFunction
  import typingsSlinky.atStorybookAddons.distTypesMod.StoryFn
  import typingsSlinky.atStorybookReact.distClientPreviewTypesMod.StoryFnReactReturnType

  type DecoratorPattern = DecoratorFunction[StoryFnReactReturnType]
  type HOCPattern = DecoratorFunction[StoryFnReactReturnType]
  type MakeDecoratorResult = js.Function1[/* repeated */ js.Any, js.Any]
  type Readme = String | js.Array[String]
  type RenderFunction = StoryFn[StoryFnReactReturnType]
}

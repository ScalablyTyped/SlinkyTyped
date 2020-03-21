package typingsSlinky.storybookReact.previewMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import typingsSlinky.storybookAddons.typesMod.StoryApi
import typingsSlinky.storybookReact.typesMod.StoryFnReactReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react/dist/client/preview", "addDecorator")
@js.native
object addDecorator
  extends TopLevel[
      js.Function1[
        /* decorator */ DecoratorFunction[StoryFnReactReturnType], 
        StoryApi[StoryFnReactReturnType]
      ]
    ]


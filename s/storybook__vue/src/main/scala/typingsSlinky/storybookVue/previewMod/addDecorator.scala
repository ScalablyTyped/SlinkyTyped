package typingsSlinky.storybookVue.previewMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.storybookAddons.typesMod.DecoratorFunction
import typingsSlinky.storybookAddons.typesMod.StoryApi
import typingsSlinky.storybookVue.typesMod.StoryFnVueReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/vue/dist/client/preview", "addDecorator")
@js.native
object addDecorator
  extends TopLevel[
      js.Function1[
        /* decorator */ DecoratorFunction[StoryFnVueReturnType], 
        StoryApi[StoryFnVueReturnType]
      ]
    ]


package typingsSlinky.storybookVue.previewMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.node.NodeModule
import typingsSlinky.storybookAddons.typesMod.StoryApi
import typingsSlinky.storybookAddons.typesMod.StoryKind
import typingsSlinky.storybookVue.typesMod.StoryFnVueReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/vue/dist/client/preview", "storiesOf")
@js.native
object storiesOf
  extends TopLevel[
      js.Function2[/* kind */ StoryKind, /* module */ NodeModule, StoryApi[StoryFnVueReturnType]]
    ]

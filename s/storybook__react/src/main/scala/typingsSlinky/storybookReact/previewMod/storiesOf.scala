package typingsSlinky.storybookReact.previewMod

import org.scalablytyped.runtime.TopLevel
import slinky.core.facade.ReactElement
import typingsSlinky.node.NodeModule
import typingsSlinky.storybookAddons.typesMod.StoryApi
import typingsSlinky.storybookAddons.typesMod.StoryKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/react/dist/client/preview", "storiesOf")
@js.native
object storiesOf
  extends TopLevel[
      js.Function2[/* kind */ StoryKind, /* module */ NodeModule, StoryApi[ReactElement]]
    ]

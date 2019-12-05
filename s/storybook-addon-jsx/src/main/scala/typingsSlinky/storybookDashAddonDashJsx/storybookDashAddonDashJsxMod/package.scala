package typingsSlinky.storybookDashAddonDashJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storybookDashAddonDashJsxMod {
  import slinky.core.TagMod
  import slinky.core.facade.ReactElement
  import typingsSlinky.atStorybookAddons.distTypesMod.StoryApi

  type AddWithJSXFunc[StoryFnReturnType] = js.Function3[
    /* kind */ String, 
    /* fn */ js.Function0[TagMod[Any]], 
    /* options */ js.UndefOr[AddonParameters], 
    StoryApi[StoryFnReturnType]
  ]
  type displayNameFunc = js.Function1[/* element */ ReactElement, String]
}

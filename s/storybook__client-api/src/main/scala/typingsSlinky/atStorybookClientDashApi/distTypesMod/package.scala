package typingsSlinky.atStorybookClientDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.atStorybookAddons.distTypesMod.StoryApi

  type ClientApiAddons[StoryFnReturnType] = StringDictionary[ClientApiAddon[StoryFnReturnType]]
  type ClientApiReturnFn[StoryFnReturnType] = js.Function1[/* repeated */ js.Any, StoryApi[StoryFnReturnType]]
  type LegacyData = StringDictionary[LegacyItem]
  type StoreData = StringDictionary[StoreItem]
}

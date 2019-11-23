package typingsSlinky.atStorybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookApiMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.atStorybookApi.Anon_Development
  import typingsSlinky.atStorybookApi.distModulesAddonsMod.SubAPI
  import typingsSlinky.atStorybookChannels.atStorybookChannelsMod.Listener
  import typingsSlinky.atStorybookRouter.distRouterMod.RenderData

  type API = SubAPI with typingsSlinky.atStorybookApi.distModulesChannelMod.SubAPI with typingsSlinky.atStorybookApi.distInitDashProviderDashApiMod.SubAPI with typingsSlinky.atStorybookApi.distModulesStoriesMod.SubAPI with typingsSlinky.atStorybookApi.distModulesLayoutMod.SubAPI with typingsSlinky.atStorybookApi.distModulesNotificationsMod.SubAPI with typingsSlinky.atStorybookApi.distModulesShortcutsMod.SubAPI with typingsSlinky.atStorybookApi.distModulesVersionsMod.SubAPI with typingsSlinky.atStorybookApi.distModulesUrlMod.SubAPI with OtherAPI
  type EventMap = StringDictionary[Listener]
  type Module = StoreData with RenderData with ProviderData with Anon_Development
  type OtherAPI = StringDictionary[js.Any]
  type Props = Children with RenderData with ProviderData with DocsModeData
  type State = Other with typingsSlinky.atStorybookApi.distModulesLayoutMod.SubState with typingsSlinky.atStorybookApi.distModulesStoriesMod.SubState with typingsSlinky.atStorybookApi.distModulesNotificationsMod.SubState with typingsSlinky.atStorybookApi.distModulesVersionsMod.SubState with RenderData with typingsSlinky.atStorybookApi.distModulesShortcutsMod.SubState
  type StateMerger[S] = js.Function1[/* input */ S, S]
  type SubState = StringDictionary[js.Any]
}

package typingsSlinky.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type API = typingsSlinky.storybookApi.addonsMod.SubAPI with typingsSlinky.storybookApi.channelMod.SubAPI with typingsSlinky.storybookApi.initProviderApiMod.SubAPI with typingsSlinky.storybookApi.storiesMod.SubAPI with typingsSlinky.storybookApi.layoutMod.SubAPI with typingsSlinky.storybookApi.notificationsMod.SubAPI with typingsSlinky.storybookApi.shortcutsMod.SubAPI with typingsSlinky.storybookApi.versionsMod.SubAPI with typingsSlinky.storybookApi.urlMod.SubAPI with typingsSlinky.storybookApi.mod.OtherAPI
  
  type EventMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.storybookChannels.mod.Listener]
  
  type OtherAPI = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Props = typingsSlinky.storybookApi.mod.Children with typingsSlinky.storybookRouter.routerMod.RenderData with typingsSlinky.storybookApi.mod.ProviderData with typingsSlinky.storybookApi.mod.DocsModeData
  
  type State = typingsSlinky.storybookApi.mod.Other with typingsSlinky.storybookApi.layoutMod.SubState with typingsSlinky.storybookApi.storiesMod.SubState with typingsSlinky.storybookApi.notificationsMod.SubState with typingsSlinky.storybookApi.versionsMod.SubState with typingsSlinky.storybookRouter.routerMod.RenderData with typingsSlinky.storybookApi.shortcutsMod.SubState
  
  type StateMerger[S] = js.Function1[/* input */ S, S]
  
  type SubState = org.scalablytyped.runtime.StringDictionary[js.Any]
}

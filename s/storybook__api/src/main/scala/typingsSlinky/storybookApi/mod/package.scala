package typingsSlinky.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type API = typingsSlinky.storybookApi.addonsMod.SubAPI with typingsSlinky.storybookApi.channelMod.SubAPI with typingsSlinky.storybookApi.providerMod.SubAPI with typingsSlinky.storybookApi.modulesStoriesMod.SubAPI with typingsSlinky.storybookApi.refsMod.SubAPI with typingsSlinky.storybookApi.globalsMod.SubAPI with typingsSlinky.storybookApi.layoutMod.SubAPI with typingsSlinky.storybookApi.notificationsMod.SubAPI with typingsSlinky.storybookApi.shortcutsMod.SubAPI with typingsSlinky.storybookApi.releaseNotesMod.SubAPI with typingsSlinky.storybookApi.settingsMod.SubAPI with typingsSlinky.storybookApi.versionsMod.SubAPI with typingsSlinky.storybookApi.urlMod.SubAPI with typingsSlinky.storybookApi.mod.Other
  
  type ArgTypes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.storybookApi.mod.ArgType]
  
  type Args = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type EventMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.storybookChannels.mod.Listener]
  
  type ModuleFn = js.Function1[
    /* m */ typingsSlinky.storybookApi.mod.ModuleArgs, 
    typingsSlinky.storybookApi.mod.Module
  ]
  
  type Other = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Parameters = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type State = typingsSlinky.storybookApi.layoutMod.SubState with typingsSlinky.storybookApi.modulesStoriesMod.SubState with typingsSlinky.storybookApi.refsMod.SubState with typingsSlinky.storybookApi.notificationsMod.SubState with typingsSlinky.storybookApi.versionsMod.SubState with typingsSlinky.storybookApi.urlMod.SubState with typingsSlinky.storybookApi.shortcutsMod.SubState with typingsSlinky.storybookApi.releaseNotesMod.SubState with typingsSlinky.storybookApi.settingsMod.SubState with typingsSlinky.storybookApi.globalsMod.SubState with typingsSlinky.storybookRouter.routerMod.RenderData with typingsSlinky.storybookApi.mod.Other
  
  type StateMerger[S] = js.Function1[/* input */ S, S]
  
  type StoryId = java.lang.String
  
  type StoryKind = java.lang.String
}

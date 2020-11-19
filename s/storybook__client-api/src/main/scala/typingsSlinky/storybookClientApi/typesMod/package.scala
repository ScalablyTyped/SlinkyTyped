package typingsSlinky.storybookClientApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ClientApiAddons[StoryFnReturnType] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.storybookClientApi.typesMod.ClientApiAddon[StoryFnReturnType]]
  
  type ClientApiReturnFn[StoryFnReturnType] = js.Function1[
    /* repeated */ js.Any, 
    typingsSlinky.storybookAddons.typesMod.StoryApi[StoryFnReturnType]
  ]
  
  type LegacyData = org.scalablytyped.runtime.StringDictionary[typingsSlinky.storybookClientApi.typesMod.LegacyItem]
  
  type StoreData = org.scalablytyped.runtime.StringDictionary[typingsSlinky.storybookClientApi.typesMod.StoreItem]
}

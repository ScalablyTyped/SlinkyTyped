package typingsSlinky.storybookClientApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ArgTypesEnhancer = js.Function1[
    /* context */ typingsSlinky.storybookAddons.typesMod.StoryContext, 
    typingsSlinky.storybookAddons.typesMod.ArgTypes
  ]
  
  type ClientApiAddons[StoryFnReturnType] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.storybookClientApi.typesMod.ClientApiAddon[StoryFnReturnType]]
  
  type ClientApiReturnFn[StoryFnReturnType] = js.Function1[
    /* repeated */ js.Any, 
    typingsSlinky.storybookAddons.typesMod.StoryApi[StoryFnReturnType]
  ]
  
  type StoreData = org.scalablytyped.runtime.StringDictionary[typingsSlinky.storybookClientApi.typesMod.StoreItem]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookAddons.typesMod.StoryId
    - typingsSlinky.storybookClientApi.anon.Kind
    - typingsSlinky.storybookClientApi.storybookClientApiStrings.Asterisk
  */
  type StorySpecifier = typingsSlinky.storybookClientApi.typesMod._StorySpecifier | typingsSlinky.storybookAddons.typesMod.StoryId
}

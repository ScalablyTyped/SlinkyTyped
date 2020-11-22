package typingsSlinky.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object addonsMod {
  
  type Collection[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type Panels = typingsSlinky.storybookApi.addonsMod.Collection[typingsSlinky.storybookApi.addonsMod.Addon]
  
  type StateMerger[S] = js.Function1[/* input */ S, S]
  
  type Types_ = typingsSlinky.storybookApi.addonsMod.types | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookApi.storybookApiStrings.story
    - typingsSlinky.storybookApi.storybookApiStrings.info
    - typingsSlinky.storybookApi.storybookApiStrings.settings
    - typingsSlinky.storybookApi.storybookApiStrings.page
    - js.UndefOr[scala.Nothing]
    - java.lang.String
  */
  type ViewMode = js.UndefOr[typingsSlinky.storybookApi.addonsMod._ViewMode | java.lang.String]
}

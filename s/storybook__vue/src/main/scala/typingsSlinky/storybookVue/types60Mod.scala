package typingsSlinky.storybookVue

import typingsSlinky.storybookAddons.typesMod.Annotations
import typingsSlinky.storybookAddons.typesMod.BaseMeta
import typingsSlinky.storybookAddons.typesMod.BaseStory
import typingsSlinky.storybookVue.typesMod.StoryFnVueReturnType
import typingsSlinky.vue.optionsMod.AsyncComponent
import typingsSlinky.vue.optionsMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object types60Mod {
  
  type Meta[Args] = BaseMeta[VueComponent] with (Annotations[Args, VueReturnType])
  
  type Story[Args] = (BaseStory[Args, VueReturnType]) with (Annotations[Args, VueReturnType])
  
  type VueComponent = (Component[js.Any, js.Any, js.Any, js.Any]) | (AsyncComponent[js.Any, js.Any, js.Any, js.Any])
  
  type VueReturnType = StoryFnVueReturnType
}

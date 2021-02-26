package typingsSlinky.storybookReact

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.storybookAddons.typesMod.Annotations
import typingsSlinky.storybookAddons.typesMod.BaseMeta
import typingsSlinky.storybookAddons.typesMod.BaseStory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object types60Mod {
  
  type Meta[Args] = BaseMeta[ReactComponent] with (Annotations[Args, ReactElement])
  
  type ReactComponent = ReactComponentClass[js.Any]
  
  type ReactReturnType = ReactElement
  
  type Story[Args] = (BaseStory[Args, ReactElement]) with (Annotations[Args, ReactElement])
}

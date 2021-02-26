package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import typingsSlinky.storybookComponents.controlsTypesMod.ObjectConfig
import typingsSlinky.storybookComponents.controlsTypesMod.ObjectValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
  @JSImport("@storybook/components/dist/controls/Object", "ObjectControl")
  @js.native
  val ObjectControl: ReactComponentClass[ObjectProps] = js.native
  
  type ObjectProps = ControlProps[ObjectValue] with ObjectConfig
}

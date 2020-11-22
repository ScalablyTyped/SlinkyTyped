package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import typingsSlinky.storybookComponents.controlsTypesMod.ObjectConfig
import typingsSlinky.storybookComponents.controlsTypesMod.ObjectValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/Object", JSImport.Namespace)
@js.native
object objectMod extends js.Object {
  
  val ObjectControl: ReactComponentClass[ObjectProps] = js.native
  
  type ObjectProps = ControlProps[ObjectValue] with ObjectConfig
}

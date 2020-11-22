package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.ArrayConfig
import typingsSlinky.storybookComponents.controlsTypesMod.ArrayValue
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/Array", JSImport.Namespace)
@js.native
object arrayMod extends js.Object {
  
  val ArrayControl: ReactComponentClass[ArrayProps] = js.native
  
  type ArrayProps = ControlProps[ArrayValue] with ArrayConfig
}

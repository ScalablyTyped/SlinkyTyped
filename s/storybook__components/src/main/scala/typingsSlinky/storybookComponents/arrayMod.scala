package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import typingsSlinky.storybookComponents.controlsTypesMod.ArrayConfig
import typingsSlinky.storybookComponents.controlsTypesMod.ArrayValue
import typingsSlinky.storybookComponents.controlsTypesMod.ControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("@storybook/components/dist/controls/Array", "ArrayControl")
  @js.native
  val ArrayControl: ReactComponentClass[ArrayProps] = js.native
  
  type ArrayProps = ControlProps[ArrayValue] with ArrayConfig
}

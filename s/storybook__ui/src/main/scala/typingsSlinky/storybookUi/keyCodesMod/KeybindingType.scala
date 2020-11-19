package typingsSlinky.storybookUi.keyCodesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeybindingType extends js.Object
@JSImport("@storybook/ui/dist/keyboard/keyCodes", "KeybindingType")
@js.native
object KeybindingType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeybindingType with Double] = js.native
  
  @js.native
  sealed trait Chord extends KeybindingType
  /* 2 */ @js.native
  object Chord extends TopLevel[Chord with Double]
  
  @js.native
  sealed trait Simple extends KeybindingType
  /* 1 */ @js.native
  object Simple extends TopLevel[Simple with Double]
}

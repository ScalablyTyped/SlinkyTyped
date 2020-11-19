package typingsSlinky.storybookAddonA11y.a11YPanelMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RuleType extends js.Object
@JSImport("@storybook/addon-a11y/dist/components/A11YPanel", "RuleType")
@js.native
object RuleType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuleType with Double] = js.native
  
  @js.native
  sealed trait INCOMPLETION extends RuleType
  /* 2 */ @js.native
  object INCOMPLETION extends TopLevel[INCOMPLETION with Double]
  
  @js.native
  sealed trait PASS extends RuleType
  /* 1 */ @js.native
  object PASS extends TopLevel[PASS with Double]
  
  @js.native
  sealed trait VIOLATION extends RuleType
  /* 0 */ @js.native
  object VIOLATION extends TopLevel[VIOLATION with Double]
}

package typingsSlinky.storybookAddonA11y.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.axeCore.mod.CheckResult
import typingsSlinky.storybookAddonA11y.rulesMod.RulesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rules {
  
  @scala.inline
  def apply(rules: js.Array[CheckResult]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[RulesProps]))
  }
  
  @JSImport("@storybook/addon-a11y/dist/components/Report/Rules", "Rules")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RulesProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

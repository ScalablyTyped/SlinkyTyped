package typingsSlinky.storybookAddonKnobs.optionsMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.storybookAddonKnobs.anon.FnCall
import typingsSlinky.storybookAddonKnobs.anon.PartialOptionsTypePropsan
import typingsSlinky.storybookAddonKnobs.anon.WeakValidationMapOptionsT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-knobs/dist/components/types/Options", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(props: PropsWithChildren[OptionsTypeProps[_]]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[OptionsTypeProps[_]], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialOptionsTypePropsan] = js.native
  
  var deserialize: FnCall = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapOptionsT] = js.native
  
  var serialize: FnCall = js.native
}

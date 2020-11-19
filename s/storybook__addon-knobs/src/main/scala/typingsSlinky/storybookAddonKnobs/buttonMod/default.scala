package typingsSlinky.storybookAddonKnobs.buttonMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.storybookAddonKnobs.anon.PartialButtonTypeProps
import typingsSlinky.storybookAddonKnobs.anon.WeakValidationMapButtonTy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-knobs/dist/components/types/Button", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(props: PropsWithChildren[ButtonTypeProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ButtonTypeProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialButtonTypeProps] = js.native
  
  var deserialize: js.Function0[js.UndefOr[scala.Nothing]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapButtonTy] = js.native
  
  var serialize: js.Function0[js.UndefOr[scala.Nothing]] = js.native
}

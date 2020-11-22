package typingsSlinky.storybookAddonKnobs.booleanMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.storybookAddonKnobs.anon.PartialBooleanTypeProps
import typingsSlinky.storybookAddonKnobs.anon.WeakValidationMapBooleanT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-knobs/dist/components/types/Boolean", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(props: PropsWithChildren[BooleanTypeProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[BooleanTypeProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialBooleanTypeProps] = js.native
  
  var deserialize: js.Function1[/* value */ String | Null, Boolean] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapBooleanT] = js.native
  
  var serialize: js.Function1[/* value */ BooleanTypeKnobValue, String | Null] = js.native
}

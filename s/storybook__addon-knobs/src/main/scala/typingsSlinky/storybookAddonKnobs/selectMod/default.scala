package typingsSlinky.storybookAddonKnobs.selectMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.storybookAddonKnobs.anon.PartialSelectTypePropsSel
import typingsSlinky.storybookAddonKnobs.anon.WeakValidationMapSelectTy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-knobs/dist/components/types/Select", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(props: PropsWithChildren[SelectTypeProps[SelectTypeKnobValue]]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[SelectTypeProps[SelectTypeKnobValue]], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialSelectTypePropsSel] = js.native
  
  var deserialize: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapSelectTy] = js.native
  
  var serialize: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue] = js.native
}

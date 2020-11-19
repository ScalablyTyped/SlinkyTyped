package typingsSlinky.storybookAddonKnobs.anon

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.storybookAddonKnobs.booleanMod.BooleanTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeProps> & {serialize (value : boolean): string | null, deserialize (value : string | null): boolean} */
@js.native
trait FunctionComponentBooleanT extends js.Object {
  
  def apply(props: PropsWithChildren[BooleanTypeProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[BooleanTypeProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialBooleanTypeProps] = js.native
  
  def deserialize(): Boolean = js.native
  def deserialize(value: String): Boolean = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapBooleanT] = js.native
  
  def serialize(value: Boolean): String | Null = js.native
}

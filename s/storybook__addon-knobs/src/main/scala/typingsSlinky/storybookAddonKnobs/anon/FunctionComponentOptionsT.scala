package typingsSlinky.storybookAddonKnobs.anon

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.storybookAddonKnobs.optionsMod.OptionsTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsTypeProps<any>> & {serialize <T>(value : T): T, deserialize <T_1>(value : T_1): T_1} */
@js.native
trait FunctionComponentOptionsT extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialOptionsTypePropsan] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapOptionsT] = js.native
  def apply(props: PropsWithChildren[OptionsTypeProps[_]]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[OptionsTypeProps[_]], context: js.Any): ReactElement | Null = js.native
  def deserialize[T_1](value: T_1): T_1 = js.native
  def serialize[T](value: T): T = js.native
}


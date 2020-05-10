package typingsSlinky.storybookUi

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.storybookComponents.AnonIsLink
import typingsSlinky.storybookComponents.PartialButtonPropsRefAttr
import typingsSlinky.storybookComponents.WeakValidationMapButtonPr
import typingsSlinky.storybookComponents.buttonButtonMod.ButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ForwardRefExoticComponent<@storybook/components.@storybook/components/dist/Button/Button.ButtonProps & react.react.RefAttributes<any>> & {  defaultProps  :{  isLink  :boolean}} */
@js.native
trait ForwardRefExoticComponent extends js.Object {
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  var defaultProps: js.UndefOr[PartialButtonPropsRefAttr with AnonIsLink] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapButtonPr] = js.native
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: ButtonProps with RefAttributes[_]): ReactElement | Null = js.native
}


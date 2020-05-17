package typingsSlinky.storybookComponents.buttonButtonMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.storybookComponents.anon.IsLink
import typingsSlinky.storybookComponents.anon.PartialButtonPropsRefAttr
import typingsSlinky.storybookComponents.anon.WeakValidationMapButtonPr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/Button/Button", "Button")
@js.native
object Button extends js.Object {
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  var defaultProps: js.UndefOr[IsLink | PartialButtonPropsRefAttr] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapButtonPr] = js.native
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: ButtonProps with RefAttributes[_]): ReactElement | Null = js.native
}


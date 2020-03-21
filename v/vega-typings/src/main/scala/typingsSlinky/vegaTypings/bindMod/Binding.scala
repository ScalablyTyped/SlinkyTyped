package typingsSlinky.vegaTypings.bindMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.checkbox
import typingsSlinky.vegaTypings.vegaTypingsStrings.radio
import typingsSlinky.vegaTypings.vegaTypingsStrings.range
import typingsSlinky.vegaTypings.vegaTypingsStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.bindMod.BindCheckbox
  - typingsSlinky.vegaTypings.bindMod.BindRadioSelect
  - typingsSlinky.vegaTypings.bindMod.BindRange
  - typingsSlinky.vegaTypings.bindMod.InputBinding
*/
trait Binding extends js.Object

object Binding {
  @scala.inline
  def BindCheckbox(
    input: checkbox,
    debounce: Int | Double = null,
    element: Element = null,
    name: String = null,
    `type`: String = null
  ): Binding = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
  @scala.inline
  def BindRadioSelect(
    input: radio | select,
    options: js.Array[_],
    debounce: Int | Double = null,
    element: Element = null,
    labels: js.Array[String] = null,
    name: String = null,
    `type`: String = null
  ): Binding = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
  @scala.inline
  def BindRange(
    input: range,
    debounce: Int | Double = null,
    element: Element = null,
    max: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    step: Int | Double = null,
    `type`: String = null
  ): Binding = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
  @scala.inline
  def InputBinding(
    autocomplete: String = null,
    debounce: Int | Double = null,
    element: Element = null,
    input: String = null,
    name: String = null,
    placeholder: String = null,
    `type`: String = null
  ): Binding = {
    val __obj = js.Dynamic.literal()
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
}


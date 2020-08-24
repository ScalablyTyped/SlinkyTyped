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
  def BindCheckbox(input: checkbox): Binding = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
  @scala.inline
  def BindRadioSelect(input: radio | select, options: js.Array[_]): Binding = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
  @scala.inline
  def BindRange(input: range): Binding = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
  @scala.inline
  def InputBinding(): Binding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Binding]
  }
}


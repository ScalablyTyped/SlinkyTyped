package typingsSlinky.vegaTypings.bindMod

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
  implicit def apply(value: BindCheckbox): Binding = value.asInstanceOf[Binding]
  @scala.inline
  implicit def apply(value: BindRadioSelect): Binding = value.asInstanceOf[Binding]
  @scala.inline
  implicit def apply(value: BindRange): Binding = value.asInstanceOf[Binding]
  @scala.inline
  implicit def apply(value: InputBinding): Binding = value.asInstanceOf[Binding]
}


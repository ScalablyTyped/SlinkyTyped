package typingsSlinky.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ytSearch.mod.OptionsWithQuery
  - typingsSlinky.ytSearch.mod.OptionsWithSearch
*/
trait Options extends js.Object

object Options {
  @scala.inline
  implicit def apply(value: OptionsWithQuery): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: OptionsWithSearch): Options = value.asInstanceOf[Options]
}


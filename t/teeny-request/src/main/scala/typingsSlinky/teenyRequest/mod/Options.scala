package typingsSlinky.teenyRequest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.teenyRequest.mod.OptionsWithUri
  - typingsSlinky.teenyRequest.mod.OptionsWithUrl
*/
trait Options extends js.Object

object Options {
  @scala.inline
  implicit def apply(value: OptionsWithUri): Options = value.asInstanceOf[Options]
  @scala.inline
  implicit def apply(value: OptionsWithUrl): Options = value.asInstanceOf[Options]
}


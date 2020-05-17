package typingsSlinky.stripe.mod

import typingsSlinky.stripe.anon.Gt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter on the list based on this object field. The value can
  * be a string with an integer Unix timestamp, or it can be a
  * dictionary with the following options:
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.stripe.anon.Gt
*/
trait IDateFilter extends js.Object

object IDateFilter {
  @scala.inline
  implicit def apply(value: Gt): IDateFilter = value.asInstanceOf[IDateFilter]
  @scala.inline
  implicit def apply(value: String): IDateFilter = value.asInstanceOf[IDateFilter]
}


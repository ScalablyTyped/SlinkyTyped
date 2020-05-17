package typingsSlinky.stripe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Header options can either be a Connect Account Secret Key,
  * or a hash with one or more of these keys: idempotency_key, stripe_account, api_key
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.mod.IHeaderOptions
  - java.lang.String
*/
trait HeaderOptions extends js.Object

object HeaderOptions {
  @scala.inline
  implicit def apply(value: IHeaderOptions): HeaderOptions = value.asInstanceOf[HeaderOptions]
  @scala.inline
  implicit def apply(value: String): HeaderOptions = value.asInstanceOf[HeaderOptions]
}


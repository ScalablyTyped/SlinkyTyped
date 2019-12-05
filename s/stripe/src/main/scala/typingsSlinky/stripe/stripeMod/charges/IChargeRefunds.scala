package typingsSlinky.stripe.stripeMod.charges

import typingsSlinky.stripe.stripeMod.IList
import typingsSlinky.stripe.stripeMod.refunds.IRefund
import typingsSlinky.stripe.stripeMod.resources.ChargeRefunds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChargeRefunds
  extends ChargeRefunds
     with IList[IRefund]


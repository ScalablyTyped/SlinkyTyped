package typingsSlinky.stripe.mod.charges

import typingsSlinky.stripe.mod.IList
import typingsSlinky.stripe.mod.refunds.IRefund
import typingsSlinky.stripe.mod.resources.ChargeRefunds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChargeRefunds
  extends ChargeRefunds
     with IList[IRefund]


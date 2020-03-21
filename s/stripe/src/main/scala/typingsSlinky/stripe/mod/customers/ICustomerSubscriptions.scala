package typingsSlinky.stripe.mod.customers

import typingsSlinky.stripe.mod.IList
import typingsSlinky.stripe.mod.resources.CustomerSubscriptions
import typingsSlinky.stripe.mod.subscriptions.ISubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomerSubscriptions
  extends CustomerSubscriptions
     with IList[ISubscription]


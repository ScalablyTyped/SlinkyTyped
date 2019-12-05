package typingsSlinky.stripe.stripeMod.resources

import typingsSlinky.stripe.stripeMod.HeaderOptions
import typingsSlinky.stripe.stripeMod.IResponseFn
import typingsSlinky.stripe.stripeMod.StripeResource
import typingsSlinky.stripe.stripeMod.usageRecords.IUsageRecord
import typingsSlinky.stripe.stripeMod.usageRecords.IUsageRecordCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.UsageRecords")
@js.native
class UsageRecords () extends StripeResource {
  def create(subscription: String, data: IUsageRecordCreationOptions): js.Promise[IUsageRecord] = js.native
  /**
    * Creates a usage record for a specified subscription item and date, and fills it with a quantity.
    */
  def create(subscription: String, data: IUsageRecordCreationOptions, options: HeaderOptions): js.Promise[IUsageRecord] = js.native
  def create(
    subscription: String,
    data: IUsageRecordCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[IUsageRecord]
  ): js.Promise[IUsageRecord] = js.native
  def create(subscription: String, data: IUsageRecordCreationOptions, response: IResponseFn[IUsageRecord]): js.Promise[IUsageRecord] = js.native
}


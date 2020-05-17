package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for linking individual (raw) contacts across services together into a single aggregate contact. */
@js.native
trait AggregateContactManager extends js.Object {
  /**
    * Returns the list of individual (raw) contacts from the specified aggregate contact.
    * @param contact The aggregate contact from which to extract the list of raw contacts.
    * @return The list of individual (raw) contacts from the specified aggregate contact.
    */
  def findRawContactsAsync(contact: Contact): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously attempts to link contacts together to make an aggregate contact.
    * @param primaryContact The first contact to link.
    * @param secondaryContact The second contact to link to the primaryContact.
    * @return The newly created aggregate contact.
    */
  def tryLinkContactsAsync(primaryContact: Contact, secondaryContact: Contact): IPromiseWithIAsyncOperation[Contact] = js.native
  /**
    * Chooses which of the raw contacts provides the main display picture for the aggregate.
    * @param aggregateContact The aggregate contact on which to set the picture.
    * @param rawContact The raw contact that provides the picture for the aggregate.
    * @return True if successful, otherwise false.
    */
  def trySetPreferredSourceForPictureAsync(aggregateContact: Contact, rawContact: Contact): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Asynchronously unlinks a raw contact from the parent aggregate contact.
    * @param contact The raw contact to remove from the aggregate.
    * @return An async action that indicates the operation is complete.
    */
  def unlinkRawContactAsync(contact: Contact): IPromiseWithIAsyncAction = js.native
}

object AggregateContactManager {
  @scala.inline
  def apply(
    findRawContactsAsync: Contact => IPromiseWithIAsyncOperation[IVectorView[_]],
    tryLinkContactsAsync: (Contact, Contact) => IPromiseWithIAsyncOperation[Contact],
    trySetPreferredSourceForPictureAsync: (Contact, Contact) => IPromiseWithIAsyncOperation[Boolean],
    unlinkRawContactAsync: Contact => IPromiseWithIAsyncAction
  ): AggregateContactManager = {
    val __obj = js.Dynamic.literal(findRawContactsAsync = js.Any.fromFunction1(findRawContactsAsync), tryLinkContactsAsync = js.Any.fromFunction2(tryLinkContactsAsync), trySetPreferredSourceForPictureAsync = js.Any.fromFunction2(trySetPreferredSourceForPictureAsync), unlinkRawContactAsync = js.Any.fromFunction1(unlinkRawContactAsync))
    __obj.asInstanceOf[AggregateContactManager]
  }
  @scala.inline
  implicit class AggregateContactManagerOps[Self <: AggregateContactManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindRawContactsAsync(value: Contact => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRawContactsAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTryLinkContactsAsync(value: (Contact, Contact) => IPromiseWithIAsyncOperation[Contact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryLinkContactsAsync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTrySetPreferredSourceForPictureAsync(value: (Contact, Contact) => IPromiseWithIAsyncOperation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trySetPreferredSourceForPictureAsync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnlinkRawContactAsync(value: Contact => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlinkRawContactAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


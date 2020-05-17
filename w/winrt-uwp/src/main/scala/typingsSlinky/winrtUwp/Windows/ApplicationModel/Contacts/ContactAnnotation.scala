package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way to tag existing user contacts with additional information, specifying that your app can perform some SupportedOperations for this particular contact. */
@js.native
trait ContactAnnotation extends js.Object {
  /** Gets the ID for the parent ContactAnnotationList that this ContactAnnotation is contained within. */
  var annotationListId: String = js.native
  /** Gets or set the ID for the Contact to which this ContactAnnotation applies. */
  var contactId: String = js.native
  /** Gets the ID for this ContactAnnotation . */
  var id: String = js.native
  /** Gets a Boolean value indicating if this ContactAnnotation has been disabled by the user. */
  var isDisabled: Boolean = js.native
  /** Provides a place to store data to be used by the app when interacting with a service provider. */
  var providerProperties: ValueSet = js.native
  /** Gets or sets an ID that can be used by a service provider to access the corresponding entity in their remote system. */
  var remoteId: String = js.native
  /** Gets or sets the group of ContactAnnotationOperations supported by this ContactAnnotation . */
  var supportedOperations: ContactAnnotationOperations = js.native
}

object ContactAnnotation {
  @scala.inline
  def apply(
    annotationListId: String,
    contactId: String,
    id: String,
    isDisabled: Boolean,
    providerProperties: ValueSet,
    remoteId: String,
    supportedOperations: ContactAnnotationOperations
  ): ContactAnnotation = {
    val __obj = js.Dynamic.literal(annotationListId = annotationListId.asInstanceOf[js.Any], contactId = contactId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], providerProperties = providerProperties.asInstanceOf[js.Any], remoteId = remoteId.asInstanceOf[js.Any], supportedOperations = supportedOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactAnnotation]
  }
  @scala.inline
  implicit class ContactAnnotationOps[Self <: ContactAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationListId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContactId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderProperties(value: ValueSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedOperations(value: ContactAnnotationOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOperations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data about how to display a mini contact card. */
@js.native
trait ContactCardOptions extends js.Object {
  /** Gets or sets a value that specifies the type of header to display on the contact card. */
  var headerKind: ContactCardHeaderKind = js.native
  /** Gets or sets a value that indicates which tab to display first on a mini contact card. */
  var initialTabKind: ContactCardTabKind = js.native
  /** Gets a list to which you can add ContactList.Id values to search for on the server. */
  var serverSearchContactListIds: IVector[String] = js.native
}

object ContactCardOptions {
  @scala.inline
  def apply(
    headerKind: ContactCardHeaderKind,
    initialTabKind: ContactCardTabKind,
    serverSearchContactListIds: IVector[String]
  ): ContactCardOptions = {
    val __obj = js.Dynamic.literal(headerKind = headerKind.asInstanceOf[js.Any], initialTabKind = initialTabKind.asInstanceOf[js.Any], serverSearchContactListIds = serverSearchContactListIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactCardOptions]
  }
  @scala.inline
  implicit class ContactCardOptionsOps[Self <: ContactCardOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaderKind(value: ContactCardHeaderKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialTabKind(value: ContactCardTabKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTabKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerSearchContactListIds(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSearchContactListIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.sparkpost.mod

import typingsSlinky.sparkpost.sparkpostStrings.Compliance
import typingsSlinky.sparkpost.sparkpostStrings.`Bounce Rule`
import typingsSlinky.sparkpost.sparkpostStrings.`List Unsubscribe`
import typingsSlinky.sparkpost.sparkpostStrings.`Manually Added`
import typingsSlinky.sparkpost.sparkpostStrings.`Spam Complaint`
import typingsSlinky.sparkpost.sparkpostStrings.`Unsubscribe Link`
import typingsSlinky.sparkpost.sparkpostStrings.non_transactional
import typingsSlinky.sparkpost.sparkpostStrings.transactional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSupressionListEntry extends js.Object {
  /** Short explanation of the suppression */
  var description: js.UndefOr[String] = js.native
  /**
    * Whether the recipient requested to not receive any non-transactional messages
    * Not required if a valid type is passed
    *
    * @deprecated Available, but deprecated in favor of type
    */
  var non_transactional: js.UndefOr[Boolean] = js.native
  /**
    * Email address to be suppressed
    *
    */
  var recipient: String = js.native
  /**
    * Source responsible for inserting the list entry
    * no - entries created by the user are marked as Manually Added
    *
    */
  val source: js.UndefOr[
    (`Spam Complaint`) | (`List Unsubscribe`) | (`Bounce Rule`) | (`Unsubscribe Link`) | (`Manually Added`) | Compliance
  ] = js.native
  /**
    * Whether the recipient requested to not receive any non-transactional messages
    * Not required if a valid type is passed
    *
    * @deprecated Available, but deprecated in favor of type
    */
  var transactional: js.UndefOr[Boolean] = js.native
  /**
    * Type of suppression record
    *
    */
  var `type`: js.UndefOr[transactional | non_transactional] = js.native
}

object CreateSupressionListEntry {
  @scala.inline
  def apply(recipient: String): CreateSupressionListEntry = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSupressionListEntry]
  }
  @scala.inline
  implicit class CreateSupressionListEntryOps[Self <: CreateSupressionListEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecipient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withNon_transactional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("non_transactional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNon_transactional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("non_transactional")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(
      value: (`Spam Complaint`) | (`List Unsubscribe`) | (`Bounce Rule`) | (`Unsubscribe Link`) | (`Manually Added`) | Compliance
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactional")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: transactional | non_transactional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}


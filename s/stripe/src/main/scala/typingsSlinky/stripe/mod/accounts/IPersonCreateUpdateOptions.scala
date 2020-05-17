package typingsSlinky.stripe.mod.accounts

import typingsSlinky.stripe.anon.Document
import typingsSlinky.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonCreateUpdateOptions extends IPersonShared {
  /**
    * The person’s ID number, as appropriate for their country. For example, a social security number
    * in the U.S., social insurance number in Canada, etc. Instead of the number itself,
    * you can also provide a PII token provided by Stripe.js.
    */
  var id_number: js.UndefOr[String] = js.native
  /**
    * Set of key-value pairs that you can attach to an object.
    * This can be useful for storing additional information about the object in a structured format.
    * Individual keys can be unset by posting an empty value to them.
    * All keys can be unset by posting an empty value to metadata.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  /**
    * A person token, used to securely provide details to the person.
    */
  var person_token: js.UndefOr[String] = js.native
  /**
    * The last four digits of the person’s Social Security Number (U.S. only).
    */
  var ssn_last_4: js.UndefOr[String] = js.native
  /**
    * The person’s verification document information.
    */
  var verification: js.UndefOr[Document] = js.native
}

object IPersonCreateUpdateOptions {
  @scala.inline
  def apply(): IPersonCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonCreateUpdateOptions]
  }
  @scala.inline
  implicit class IPersonCreateUpdateOptionsOps[Self <: IPersonCreateUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id_number")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: IOptionsMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPerson_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("person_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerson_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("person_token")(js.undefined)
        ret
    }
    @scala.inline
    def withSsn_last_4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssn_last_4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsn_last_4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssn_last_4")(js.undefined)
        ret
    }
    @scala.inline
    def withVerification(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(js.undefined)
        ret
    }
  }
  
}


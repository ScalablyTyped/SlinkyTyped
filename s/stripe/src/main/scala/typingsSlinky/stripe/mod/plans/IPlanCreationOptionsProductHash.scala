package typingsSlinky.stripe.mod.plans

import typingsSlinky.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlanCreationOptionsProductHash extends js.Object {
  /**
    * The identifier for the product. Must be unique. If not provided, an identifier will be randomly generated.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Set of key/value pairs that you can attach to an object. It can be useful for storing additional information about the object in a structured
    * format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to metadata.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  /**
    * The product’s name, meant to be displayable to the customer.
    */
  var name: String = js.native
  /**
    * An arbitrary string to be displayed on your customer’s credit card statement. This may be up to 22 characters. The statement description may not
    * include <>”’ characters, and will appear on your customer’s statement in capital letters. Non-ASCII characters are automatically stripped. While
    * most banks display this information consistently, some may display it incorrectly or not at all.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
}

object IPlanCreationOptionsProductHash {
  @scala.inline
  def apply(name: String): IPlanCreationOptionsProductHash = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlanCreationOptionsProductHash]
  }
  @scala.inline
  implicit class IPlanCreationOptionsProductHashOps[Self <: IPlanCreationOptionsProductHash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withStatement_descriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatement_descriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(js.undefined)
        ret
    }
  }
  
}


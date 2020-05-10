package typingsSlinky.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityDescriptor extends js.Object {
  /**
    * The unique identifier for this identity, not exceeding 256 chars, which will be persisted.
    */
  var identifier: String = js.native
  /**
    * Type of descriptor (for example, Windows, Passport, etc.).
    */
  var identityType: String = js.native
}

object IdentityDescriptor {
  @scala.inline
  def apply(identifier: String, identityType: String): IdentityDescriptor = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], identityType = identityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityDescriptor]
  }
  @scala.inline
  implicit class IdentityDescriptorOps[Self <: IdentityDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identityType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


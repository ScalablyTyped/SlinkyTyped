package typingsSlinky.stripe.mod.ephemeralKeys

import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.stripeStrings.ephemeral_key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEphemeralKey extends IResourceObject {
  var associated_objects: js.Array[IAssociatedObject] = js.native
  var created: Double = js.native
  var expires: Double = js.native
  var livemode: Boolean = js.native
  @JSName("object")
  var object_IEphemeralKey: ephemeral_key = js.native
  var secret: String = js.native
}

object IEphemeralKey {
  @scala.inline
  def apply(
    associated_objects: js.Array[IAssociatedObject],
    created: Double,
    expires: Double,
    id: String,
    livemode: Boolean,
    `object`: ephemeral_key,
    secret: String
  ): IEphemeralKey = {
    val __obj = js.Dynamic.literal(associated_objects = associated_objects.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEphemeralKey]
  }
  @scala.inline
  implicit class IEphemeralKeyOps[Self <: IEphemeralKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociated_objects(value: js.Array[IAssociatedObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associated_objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: ephemeral_key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


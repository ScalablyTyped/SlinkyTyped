package typingsSlinky.sharepoint.SP.Social

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identifies an actor to the server. An actor can be a user, document, site, or tag. */
@js.native
trait SocialActorInfo extends ClientValueObject {
  /** User account name.
    This property is only available for social actors of type "user". */
  def get_accountName(): String = js.native
  /** Identifies whether the actor is a user, document, site, or tag. */
  def get_actorType(): SocialActorType = js.native
  /** URI of the document or site content.
    This property is only available for social actors of type Document or Site. */
  def get_contentUri(): String = js.native
  /** Actor's unique identifier. */
  def get_id(): String = js.native
  /** GUID of the tag.
    Only available for social actors of type "tag" */
  def get_tagGuid(): String = js.native
  /** User account name.
    This property is only available for social actors of type "user". */
  def set_accountName(value: String): String = js.native
  /** Identifies whether the actor is a user, document, site, or tag. */
  def set_actorType(value: SocialActorType): SocialActorType = js.native
  /** URI of the document or site content.
    This property is only available for social actors of type Document or Site. */
  def set_contentUri(value: String): String = js.native
  /** Actor's unique identifier. */
  def set_id(value: String): String = js.native
  /** GUID of the tag.
    Only available for social actors of type "tag" */
  def set_tagGuid(value: String): String = js.native
}

object SocialActorInfo {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_accountName: () => String,
    get_actorType: () => SocialActorType,
    get_contentUri: () => String,
    get_id: () => String,
    get_tagGuid: () => String,
    get_typeId: () => String,
    set_accountName: String => String,
    set_actorType: SocialActorType => SocialActorType,
    set_contentUri: String => String,
    set_id: String => String,
    set_tagGuid: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialActorInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_accountName = js.Any.fromFunction0(get_accountName), get_actorType = js.Any.fromFunction0(get_actorType), get_contentUri = js.Any.fromFunction0(get_contentUri), get_id = js.Any.fromFunction0(get_id), get_tagGuid = js.Any.fromFunction0(get_tagGuid), get_typeId = js.Any.fromFunction0(get_typeId), set_accountName = js.Any.fromFunction1(set_accountName), set_actorType = js.Any.fromFunction1(set_actorType), set_contentUri = js.Any.fromFunction1(set_contentUri), set_id = js.Any.fromFunction1(set_id), set_tagGuid = js.Any.fromFunction1(set_tagGuid), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialActorInfo]
  }
  @scala.inline
  implicit class SocialActorInfoOps[Self <: SocialActorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_accountName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_accountName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_actorType(value: () => SocialActorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_actorType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_contentUri(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_contentUri")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_id(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_id")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_tagGuid(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_tagGuid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_accountName(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_accountName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_actorType(value: SocialActorType => SocialActorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_actorType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_contentUri(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_contentUri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_id(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_id")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_tagGuid(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_tagGuid")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.sharepoint.SP.Social

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an actor retrieved from server. An actor is a user, document, site, or tag. */
@js.native
trait SocialActor extends ClientValueObject {
  /** The AccountName property returns the user account name.
    This property is only available for social actors of type "user". */
  def get_accountName(): String = js.native
  /** Identifies whether the actor is a user, document, site, or tag. */
  def get_actorType(): SocialActorType = js.native
  /** Specifies whether the actor can be followed by the current user. */
  def get_canFollow(): Boolean = js.native
  /** Returns the URI of the document or site content.
    This property is only available for social actors of type Document or Site. */
  def get_contentUri(): String = js.native
  def get_emailAddress(): String = js.native
  /** Returns the URI of the user's followed content folder.
    This property is only available for social actors of type "user". */
  def get_followedContentUri(): String = js.native
  /** Returns the actor's unique identifier. */
  def get_id(): String = js.native
  /** Returns the URI of the image representing the actor.
    This property is only available if actor is User, Document, or Site. */
  def get_imageUri(): String = js.native
  /** Returns true if the current user is following the actor; otherwise, it returns false. */
  def get_isFollowed(): Boolean = js.native
  /** Returns the URI of the library containing the document.
    This property is only available for social actors of type "document". */
  def get_libraryUri(): String = js.native
  /** The Name property returns the actor's display name. */
  def get_name(): String = js.native
  /** Returns the URI of the user's personal site.
    This property is only available for social actors of type "user". */
  def get_personalSiteUri(): String = js.native
  /** Represents the status of retrieving the actor */
  def get_status(): SocialStatusCode = js.native
  /** The StatusText property returns the most recent post of the user.
    This property is only available for social actors of type "user". */
  def get_statusText(): String = js.native
  /** Returns the GUID of the tag.
    Only available for social actors of type "tag" */
  def get_tagGuid(): String = js.native
  /** Returns the user's title
    This property is only available for social actors of type "user". */
  def get_title(): String = js.native
  /** Returns the URI of the actor. */
  def get_uri(): String = js.native
}

object SocialActor {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_accountName: () => String,
    get_actorType: () => SocialActorType,
    get_canFollow: () => Boolean,
    get_contentUri: () => String,
    get_emailAddress: () => String,
    get_followedContentUri: () => String,
    get_id: () => String,
    get_imageUri: () => String,
    get_isFollowed: () => Boolean,
    get_libraryUri: () => String,
    get_name: () => String,
    get_personalSiteUri: () => String,
    get_status: () => SocialStatusCode,
    get_statusText: () => String,
    get_tagGuid: () => String,
    get_title: () => String,
    get_typeId: () => String,
    get_uri: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialActor = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_accountName = js.Any.fromFunction0(get_accountName), get_actorType = js.Any.fromFunction0(get_actorType), get_canFollow = js.Any.fromFunction0(get_canFollow), get_contentUri = js.Any.fromFunction0(get_contentUri), get_emailAddress = js.Any.fromFunction0(get_emailAddress), get_followedContentUri = js.Any.fromFunction0(get_followedContentUri), get_id = js.Any.fromFunction0(get_id), get_imageUri = js.Any.fromFunction0(get_imageUri), get_isFollowed = js.Any.fromFunction0(get_isFollowed), get_libraryUri = js.Any.fromFunction0(get_libraryUri), get_name = js.Any.fromFunction0(get_name), get_personalSiteUri = js.Any.fromFunction0(get_personalSiteUri), get_status = js.Any.fromFunction0(get_status), get_statusText = js.Any.fromFunction0(get_statusText), get_tagGuid = js.Any.fromFunction0(get_tagGuid), get_title = js.Any.fromFunction0(get_title), get_typeId = js.Any.fromFunction0(get_typeId), get_uri = js.Any.fromFunction0(get_uri), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialActor]
  }
  @scala.inline
  implicit class SocialActorOps[Self <: SocialActor] (val x: Self) extends AnyVal {
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
    def withGet_canFollow(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_canFollow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_contentUri(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_contentUri")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_emailAddress(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_emailAddress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_followedContentUri(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_followedContentUri")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_id(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_id")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_imageUri(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_imageUri")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_isFollowed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_isFollowed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_libraryUri(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_libraryUri")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_name(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_name")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_personalSiteUri(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_personalSiteUri")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_status(value: () => SocialStatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_status")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_statusText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_statusText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_tagGuid(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_tagGuid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_title(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_title")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_uri(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_uri")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


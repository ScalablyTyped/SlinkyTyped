package typingsSlinky.sharepoint.SP.Social

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an image, document preview, or video preview attachment.  */
@js.native
trait SocialAttachment extends ClientValueObject {
  /** Specifies the type of object that the attachment contains. */
  def get_attachmentKind(): SocialAttachmentKind = js.native
  /** Specifies the action to take when the user selects the attachment.
    This property is only present if the AttachmentKind is Video. */
  def get_clickAction(): SocialAttachmentAction = js.native
  /** Specifies the URI of the attachment content. */
  def get_contentUri(): String = js.native
  /** Provides a text description of the attachment. */
  def get_description(): String = js.native
  /** Specifies the height of the attachment or of the attachment preview. */
  def get_height(): Double = js.native
  /** Specifies the duration of the attachment in seconds. This property is only present if the AttachmentKind is Video. */
  def get_length(): Double = js.native
  /** Provides the attachment name. */
  def get_name(): String = js.native
  /** Specifies the URI of the attachment's preview thumbnail.
    This property is only present if the AttachmentKind is Document or Video. */
  def get_previewUri(): String = js.native
  /** Provides the attachment URI. */
  def get_uri(): String = js.native
  /** Specifies the width of the attachment or of the attachment preview. */
  def get_width(): Double = js.native
  /** Specifies the type of object that the attachment contains. */
  def set_attachmentKind(value: SocialAttachmentKind): SocialAttachmentKind = js.native
  /** Specifies the action to take when the user selects the attachment.
    This property is only present if the AttachmentKind is Video. */
  def set_clickAction(value: SocialAttachmentAction): SocialAttachmentAction = js.native
  /** Specifies the URI of the attachment content. */
  def set_contentUri(value: String): String = js.native
  /** Provides a text description of the attachment. */
  def set_description(value: String): String = js.native
  /** Specifies the height of the attachment or of the attachment preview. */
  def set_height(value: Double): Double = js.native
  /** Specifies the duration of the attachment in seconds. This property is only present if the AttachmentKind is Video. */
  def set_length(value: Double): Double = js.native
  /** Provides the attachment name. */
  def set_name(value: String): String = js.native
  /** Specifies the URI of the attachment's preview thumbnail.
    This property is only present if the AttachmentKind is Document or Video. */
  def set_previewUri(value: String): String = js.native
  /** Provides the attachment URI. */
  def set_uri(value: String): String = js.native
  /** Specifies the width of the attachment or of the attachment preview. */
  def set_width(value: Double): Double = js.native
}

object SocialAttachment {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_attachmentKind: () => SocialAttachmentKind,
    get_clickAction: () => SocialAttachmentAction,
    get_contentUri: () => String,
    get_description: () => String,
    get_height: () => Double,
    get_length: () => Double,
    get_name: () => String,
    get_previewUri: () => String,
    get_typeId: () => String,
    get_uri: () => String,
    get_width: () => Double,
    set_attachmentKind: SocialAttachmentKind => SocialAttachmentKind,
    set_clickAction: SocialAttachmentAction => SocialAttachmentAction,
    set_contentUri: String => String,
    set_description: String => String,
    set_height: Double => Double,
    set_length: Double => Double,
    set_name: String => String,
    set_previewUri: String => String,
    set_uri: String => String,
    set_width: Double => Double,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialAttachment = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_attachmentKind = js.Any.fromFunction0(get_attachmentKind), get_clickAction = js.Any.fromFunction0(get_clickAction), get_contentUri = js.Any.fromFunction0(get_contentUri), get_description = js.Any.fromFunction0(get_description), get_height = js.Any.fromFunction0(get_height), get_length = js.Any.fromFunction0(get_length), get_name = js.Any.fromFunction0(get_name), get_previewUri = js.Any.fromFunction0(get_previewUri), get_typeId = js.Any.fromFunction0(get_typeId), get_uri = js.Any.fromFunction0(get_uri), get_width = js.Any.fromFunction0(get_width), set_attachmentKind = js.Any.fromFunction1(set_attachmentKind), set_clickAction = js.Any.fromFunction1(set_clickAction), set_contentUri = js.Any.fromFunction1(set_contentUri), set_description = js.Any.fromFunction1(set_description), set_height = js.Any.fromFunction1(set_height), set_length = js.Any.fromFunction1(set_length), set_name = js.Any.fromFunction1(set_name), set_previewUri = js.Any.fromFunction1(set_previewUri), set_uri = js.Any.fromFunction1(set_uri), set_width = js.Any.fromFunction1(set_width), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialAttachment]
  }
  @scala.inline
  implicit class SocialAttachmentOps[Self <: SocialAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_attachmentKind(value: () => SocialAttachmentKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_attachmentKind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_clickAction(value: () => SocialAttachmentAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_clickAction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_contentUri(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_contentUri")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_description(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_description")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_height(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_height")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_length(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_length")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_name(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_name")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_previewUri(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_previewUri")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_uri(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_uri")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_width(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_width")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_attachmentKind(value: SocialAttachmentKind => SocialAttachmentKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_attachmentKind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_clickAction(value: SocialAttachmentAction => SocialAttachmentAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_clickAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_contentUri(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_contentUri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_description(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_description")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_height(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_height")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_length(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_length")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_name(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_name")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_previewUri(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_previewUri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_uri(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_uri")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_width(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_width")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.sharepoint.SP.Social

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet_attachmentKind(value: () => SocialAttachmentKind): Self = this.set("get_attachmentKind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_clickAction(value: () => SocialAttachmentAction): Self = this.set("get_clickAction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_contentUri(value: () => String): Self = this.set("get_contentUri", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_description(value: () => String): Self = this.set("get_description", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_height(value: () => Double): Self = this.set("get_height", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_length(value: () => Double): Self = this.set("get_length", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_name(value: () => String): Self = this.set("get_name", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_previewUri(value: () => String): Self = this.set("get_previewUri", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_uri(value: () => String): Self = this.set("get_uri", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_width(value: () => Double): Self = this.set("get_width", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_attachmentKind(value: SocialAttachmentKind => SocialAttachmentKind): Self = this.set("set_attachmentKind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_clickAction(value: SocialAttachmentAction => SocialAttachmentAction): Self = this.set("set_clickAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_contentUri(value: String => String): Self = this.set("set_contentUri", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_description(value: String => String): Self = this.set("set_description", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_height(value: Double => Double): Self = this.set("set_height", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_length(value: Double => Double): Self = this.set("set_length", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_name(value: String => String): Self = this.set("set_name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_previewUri(value: String => String): Self = this.set("set_previewUri", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_uri(value: String => String): Self = this.set("set_uri", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_width(value: Double => Double): Self = this.set("set_width", js.Any.fromFunction1(value))
  }
}

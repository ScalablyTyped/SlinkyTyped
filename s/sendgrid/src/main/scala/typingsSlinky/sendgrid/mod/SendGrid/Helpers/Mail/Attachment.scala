package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachment extends StObject {
  
  def getContent(): String = js.native
  
  def getContentId(): String = js.native
  
  def getDisposition(): String = js.native
  
  def getFilename(): String = js.native
  
  def getType(): String = js.native
  
  def setContent(content: String): Unit = js.native
  
  def setContentId(contentId: String): Unit = js.native
  
  def setDisposition(disposition: String): Unit = js.native
  
  def setFilename(filename: String): Unit = js.native
  
  def setType(`type`: String): Unit = js.native
  
  def toJSON(): typingsSlinky.sendgrid.anon.Content = js.native
}
object Attachment {
  
  @scala.inline
  def apply(
    getContent: () => String,
    getContentId: () => String,
    getDisposition: () => String,
    getFilename: () => String,
    getType: () => String,
    setContent: String => Unit,
    setContentId: String => Unit,
    setDisposition: String => Unit,
    setFilename: String => Unit,
    setType: String => Unit,
    toJSON: () => typingsSlinky.sendgrid.anon.Content
  ): Attachment = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent), getContentId = js.Any.fromFunction0(getContentId), getDisposition = js.Any.fromFunction0(getDisposition), getFilename = js.Any.fromFunction0(getFilename), getType = js.Any.fromFunction0(getType), setContent = js.Any.fromFunction1(setContent), setContentId = js.Any.fromFunction1(setContentId), setDisposition = js.Any.fromFunction1(setDisposition), setFilename = js.Any.fromFunction1(setFilename), setType = js.Any.fromFunction1(setType), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetContent(value: () => String): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContentId(value: () => String): Self = StObject.set(x, "getContentId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisposition(value: () => String): Self = StObject.set(x, "getDisposition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFilename(value: () => String): Self = StObject.set(x, "getFilename", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetContent(value: String => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetContentId(value: String => Unit): Self = StObject.set(x, "setContentId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDisposition(value: String => Unit): Self = StObject.set(x, "setDisposition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFilename(value: String => Unit): Self = StObject.set(x, "setFilename", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetType(value: String => Unit): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => typingsSlinky.sendgrid.anon.Content): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}

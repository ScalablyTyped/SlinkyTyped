package typingsSlinky.telebot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplyMarkup extends StObject {
  
  var duration: js.UndefOr[Double] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var notification: js.UndefOr[Boolean] = js.native
  
  var replyMarkup: js.UndefOr[js.Any] = js.native
  
  var replyToMessage: js.UndefOr[Double] = js.native
  
  var serverDownload: js.UndefOr[Boolean] = js.native
}
object ReplyMarkup {
  
  @scala.inline
  def apply(): ReplyMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplyMarkup]
  }
  
  @scala.inline
  implicit class ReplyMarkupMutableBuilder[Self <: ReplyMarkup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setNotification(value: Boolean): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    @scala.inline
    def setReplyMarkup(value: js.Any): Self = StObject.set(x, "replyMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyMarkupUndefined: Self = StObject.set(x, "replyMarkup", js.undefined)
    
    @scala.inline
    def setReplyToMessage(value: Double): Self = StObject.set(x, "replyToMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToMessageUndefined: Self = StObject.set(x, "replyToMessage", js.undefined)
    
    @scala.inline
    def setServerDownload(value: Boolean): Self = StObject.set(x, "serverDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerDownloadUndefined: Self = StObject.set(x, "serverDownload", js.undefined)
  }
}

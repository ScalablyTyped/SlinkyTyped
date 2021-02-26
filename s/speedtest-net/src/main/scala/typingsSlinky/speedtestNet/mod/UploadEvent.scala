package typingsSlinky.speedtestNet.mod

import typingsSlinky.speedtestNet.speedtestNetStrings.upload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Sent when the test is in the upload phase. */
@js.native
trait UploadEvent
  extends BaseEvent
     with SpeedTestEvent {
  
  /** Indicates the overall progress of the test as a fraction (0 to 1). */
  var progress: Double = js.native
  
  var timestamp: js.Date = js.native
  
  @JSName("type")
  var type_UploadEvent: upload = js.native
  
  var upload: DownloadUploadData = js.native
}
object UploadEvent {
  
  @scala.inline
  def apply(progress: Double, timestamp: js.Date, `type`: upload, upload: DownloadUploadData): UploadEvent = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadEvent]
  }
  
  @scala.inline
  implicit class UploadEventMutableBuilder[Self <: UploadEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: upload): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload(value: DownloadUploadData): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
  }
}

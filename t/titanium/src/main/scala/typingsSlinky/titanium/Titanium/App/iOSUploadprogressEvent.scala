package typingsSlinky.titanium.Titanium.App

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired periodically to inform the app about the upload's progress of a [urlSession](Modules.URLSession).
  * Available only on iOS 7 and later.
  */
@js.native
trait iOSUploadprogressEvent extends iOSBaseEvent {
  
  /**
    * The number of bytes transferred since the last time this event was fired.
    */
  var bytesSent: Double = js.native
  
  /**
    * The `urlSession` session identifier. If it does not exist, this property is not provided.
    * This property is available since Titanium Mobile 5.4.0.GA.
    */
  var sessionIdentifier: String = js.native
  
  /**
    * The `urlSession` upload task's identifier.
    */
  var taskIdentifier: Double = js.native
  
  /**
    * The expected length of the file, as provided by the Content-Length header. If this
    * header was not provided, the value is zero.
    */
  var totalBytesExpectedToSend: Double = js.native
  
  /**
    * The total number of bytes transferred so far.
    */
  var totalBytesSent: Double = js.native
}
object iOSUploadprogressEvent {
  
  @scala.inline
  def apply(
    bytesSent: Double,
    sessionIdentifier: String,
    source: iOS,
    taskIdentifier: Double,
    totalBytesExpectedToSend: Double,
    totalBytesSent: Double
  ): iOSUploadprogressEvent = {
    val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], sessionIdentifier = sessionIdentifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], taskIdentifier = taskIdentifier.asInstanceOf[js.Any], totalBytesExpectedToSend = totalBytesExpectedToSend.asInstanceOf[js.Any], totalBytesSent = totalBytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSUploadprogressEvent]
  }
  
  @scala.inline
  implicit class iOSUploadprogressEventMutableBuilder[Self <: iOSUploadprogressEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdentifier(value: String): Self = StObject.set(x, "sessionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdentifier(value: Double): Self = StObject.set(x, "taskIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesExpectedToSend(value: Double): Self = StObject.set(x, "totalBytesExpectedToSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesSent(value: Double): Self = StObject.set(x, "totalBytesSent", value.asInstanceOf[js.Any])
  }
}

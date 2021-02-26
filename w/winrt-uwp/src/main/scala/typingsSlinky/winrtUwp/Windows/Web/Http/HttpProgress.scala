package typingsSlinky.winrtUwp.Windows.Web.Http

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains status information on the progress of an HttpClient operation. */
@js.native
trait HttpProgress extends StObject {
  
  /** The total number of bytes received. */
  var bytesReceived: Double = js.native
  
  /** The total number of bytes sent. */
  var bytesSent: Double = js.native
  
  /** The number of retries. */
  var retries: Double = js.native
  
  /** The step in the progress of an HTTP connection. */
  var stage: HttpProgressStage = js.native
  
  /** The total number of data bytes to receive. */
  var totalBytesToReceive: Double = js.native
  
  /** The total number of data bytes to send. */
  var totalBytesToSend: Double = js.native
}
object HttpProgress {
  
  @scala.inline
  def apply(
    bytesReceived: Double,
    bytesSent: Double,
    retries: Double,
    stage: HttpProgressStage,
    totalBytesToReceive: Double,
    totalBytesToSend: Double
  ): HttpProgress = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], totalBytesToReceive = totalBytesToReceive.asInstanceOf[js.Any], totalBytesToSend = totalBytesToSend.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProgress]
  }
  
  @scala.inline
  implicit class HttpProgressMutableBuilder[Self <: HttpProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: HttpProgressStage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesToReceive(value: Double): Self = StObject.set(x, "totalBytesToReceive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesToSend(value: Double): Self = StObject.set(x, "totalBytesToSend", value.asInstanceOf[js.Any])
  }
}

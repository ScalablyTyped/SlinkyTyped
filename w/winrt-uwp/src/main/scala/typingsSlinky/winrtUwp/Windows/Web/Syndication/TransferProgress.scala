package typingsSlinky.winrtUwp.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains progress information for a data transfer operation. */
@js.native
trait TransferProgress extends StObject {
  
  /** The number of bytes received. */
  var bytesRetrieved: Double = js.native
  
  /** The number of bytes sent. */
  var bytesSent: Double = js.native
  
  /** The total number of bytes that will be received during the transfer operation. */
  var totalBytesToRetrieve: Double = js.native
  
  /** The total number of bytes that will be sent during the transfer operation. */
  var totalBytesToSend: Double = js.native
}
object TransferProgress {
  
  @scala.inline
  def apply(bytesRetrieved: Double, bytesSent: Double, totalBytesToRetrieve: Double, totalBytesToSend: Double): TransferProgress = {
    val __obj = js.Dynamic.literal(bytesRetrieved = bytesRetrieved.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any], totalBytesToRetrieve = totalBytesToRetrieve.asInstanceOf[js.Any], totalBytesToSend = totalBytesToSend.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferProgress]
  }
  
  @scala.inline
  implicit class TransferProgressMutableBuilder[Self <: TransferProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesRetrieved(value: Double): Self = StObject.set(x, "bytesRetrieved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesToRetrieve(value: Double): Self = StObject.set(x, "totalBytesToRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesToSend(value: Double): Self = StObject.set(x, "totalBytesToSend", value.asInstanceOf[js.Any])
  }
}

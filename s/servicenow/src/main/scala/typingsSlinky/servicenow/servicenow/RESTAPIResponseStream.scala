package typingsSlinky.servicenow.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RESTAPIResponseStream extends StObject {
  
  def writeStream(stream: js.Object): Unit = js.native
  
  def writeString(data: String): Unit = js.native
}
object RESTAPIResponseStream {
  
  @scala.inline
  def apply(writeStream: js.Object => Unit, writeString: String => Unit): RESTAPIResponseStream = {
    val __obj = js.Dynamic.literal(writeStream = js.Any.fromFunction1(writeStream), writeString = js.Any.fromFunction1(writeString))
    __obj.asInstanceOf[RESTAPIResponseStream]
  }
  
  @scala.inline
  implicit class RESTAPIResponseStreamMutableBuilder[Self <: RESTAPIResponseStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWriteStream(value: js.Object => Unit): Self = StObject.set(x, "writeStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteString(value: String => Unit): Self = StObject.set(x, "writeString", js.Any.fromFunction1(value))
  }
}

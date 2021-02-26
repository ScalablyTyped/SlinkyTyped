package typingsSlinky.servicenow.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RESTAPIRequestBody[T] extends StObject {
  
  val data: T = js.native
  
  val dataStream: js.Object = js.native
  
  val dataString: String = js.native
  
  def hasNext(): Boolean = js.native
  
  def nextEntry(): js.Any = js.native
}
object RESTAPIRequestBody {
  
  @scala.inline
  def apply[T](
    data: T,
    dataStream: js.Object,
    dataString: String,
    hasNext: () => Boolean,
    nextEntry: () => js.Any
  ): RESTAPIRequestBody[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataStream = dataStream.asInstanceOf[js.Any], dataString = dataString.asInstanceOf[js.Any], hasNext = js.Any.fromFunction0(hasNext), nextEntry = js.Any.fromFunction0(nextEntry))
    __obj.asInstanceOf[RESTAPIRequestBody[T]]
  }
  
  @scala.inline
  implicit class RESTAPIRequestBodyMutableBuilder[Self <: RESTAPIRequestBody[_], T] (val x: Self with RESTAPIRequestBody[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataStream(value: js.Object): Self = StObject.set(x, "dataStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataString(value: String): Self = StObject.set(x, "dataString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextEntry(value: () => js.Any): Self = StObject.set(x, "nextEntry", js.Any.fromFunction0(value))
  }
}

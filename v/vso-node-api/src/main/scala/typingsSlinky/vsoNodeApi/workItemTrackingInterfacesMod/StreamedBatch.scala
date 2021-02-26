package typingsSlinky.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamedBatch[T] extends StObject {
  
  var continuationToken: String = js.native
  
  var isLastBatch: Boolean = js.native
  
  var nextLink: String = js.native
  
  var values: js.Array[T] = js.native
}
object StreamedBatch {
  
  @scala.inline
  def apply[T](continuationToken: String, isLastBatch: Boolean, nextLink: String, values: js.Array[T]): StreamedBatch[T] = {
    val __obj = js.Dynamic.literal(continuationToken = continuationToken.asInstanceOf[js.Any], isLastBatch = isLastBatch.asInstanceOf[js.Any], nextLink = nextLink.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamedBatch[T]]
  }
  
  @scala.inline
  implicit class StreamedBatchMutableBuilder[Self <: StreamedBatch[_], T] (val x: Self with StreamedBatch[T]) extends AnyVal {
    
    @scala.inline
    def setContinuationToken(value: String): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLastBatch(value: Boolean): Self = StObject.set(x, "isLastBatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: T*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}

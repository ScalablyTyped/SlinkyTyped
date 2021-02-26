package typingsSlinky.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSetQueueOptions extends StObject {
  
  /**
    * Queue data changes ('add', 'update', 'remove') and flush them at once.
    * The queue can be flushed manually by calling DataSet.flush(),
    * or can be flushed after a configured delay or maximum number of entries.
    * When queue is true, a queue is created with default options.
    * Options can be specified by providing an object:
    * delay: number - The queue will be flushed automatically after an inactivity of this delay in milliseconds. Default value is null.
    * Default value is null.
    * max: number - When the queue exceeds the given maximum number of entries, the queue is flushed automatically. Default value is Infinity.
    * Default value is Infinity.
    */
  var queue: js.UndefOr[js.Any | Boolean] = js.native
}
object DataSetQueueOptions {
  
  @scala.inline
  def apply(): DataSetQueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetQueueOptions]
  }
  
  @scala.inline
  implicit class DataSetQueueOptionsMutableBuilder[Self <: DataSetQueueOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueue(value: js.Any | Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
  }
}

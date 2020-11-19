package typingsSlinky.sharedb.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sharedb", "PubSub")
@js.native
abstract class PubSub protected () extends js.Object {
  protected def this(options: PubSubOptions) = this()
  
  /* private */ def _createStream(channel: js.Any): Unit = js.native
  
  /* protected */ def _emit(channel: String, data: StringDictionary[js.Any]): Unit = js.native
  
  /* protected */ def _publish(channels: js.Array[String], data: js.Any, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  /* private */ def _removeStream(channel: js.Any, stream: js.Any): Unit = js.native
  
  /* protected */ def _subscribe(channel: String, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  /* protected */ def _unsubscribe(channel: String, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  def close(): Unit = js.native
  def close(callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  var nextStreamId: Double = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  def publish(
    channels: js.Array[String],
    data: StringDictionary[js.Any],
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  
  var streams: StringDictionary[Stream] = js.native
  
  var streamsCount: Double = js.native
  
  def subscribe(
    channel: String,
    callback: js.Function2[/* err */ Error | Null, /* stream */ js.UndefOr[Stream], Unit]
  ): Unit = js.native
  
  var subscribed: StringDictionary[Boolean] = js.native
}
/* static members */
@JSImport("sharedb", "PubSub")
@js.native
object PubSub extends js.Object {
  
  /* private */ def shallowCopy(obj: js.Any): js.Any = js.native
}

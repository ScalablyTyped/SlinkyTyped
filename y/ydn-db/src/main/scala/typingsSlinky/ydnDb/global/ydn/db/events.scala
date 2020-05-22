package typingsSlinky.ydnDb.global.ydn.db

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ydn.db.events")
@js.native
object events extends js.Object {
  @js.native
  class Event ()
    extends typingsSlinky.ydnDb.ydn.db.events.Event {
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var `type`: typingsSlinky.ydnDb.ydn.db.EventType = js.native
  }
  
  @js.native
  class RecordEvent ()
    extends typingsSlinky.ydnDb.ydn.db.events.RecordEvent {
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var `type`: typingsSlinky.ydnDb.ydn.db.EventType = js.native
    /* CompleteClass */
    override def getKey(): js.Any = js.native
    /* CompleteClass */
    override def getStoreName(): String = js.native
    /* CompleteClass */
    override def getValue(): js.Any = js.native
  }
  
  @js.native
  class StorageEvent ()
    extends typingsSlinky.ydnDb.ydn.db.events.StorageEvent {
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var `type`: typingsSlinky.ydnDb.ydn.db.EventType = js.native
    /* CompleteClass */
    override def getError(): js.Error = js.native
    /* CompleteClass */
    override def getOldVersion(): Double = js.native
    /* CompleteClass */
    override def getVersion(): Double = js.native
  }
  
  @js.native
  class StoreEvent ()
    extends typingsSlinky.ydnDb.ydn.db.events.StoreEvent {
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var `type`: typingsSlinky.ydnDb.ydn.db.EventType = js.native
    /* CompleteClass */
    override def getKeys(): js.Array[_] = js.native
    /* CompleteClass */
    override def getStoreName(): String = js.native
    /* CompleteClass */
    override def getValues(): js.Array[_] = js.native
  }
  
}


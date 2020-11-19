package typingsSlinky.v8Profiler.mod

import typingsSlinky.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snapshot extends js.Object {
  
  /**
    * creates HEAP diff for two snapshots.
    */
  def compare(snapshot: Snapshot): Unit = js.native
  
  /**
    * removes snapshot from memory.
    */
  def delete(): js.Any = js.native
  
  /**
    * provides simple export API for snapshot.
    * callback(error, data) receives serialized snapshot as second argument. (Serialization is not equal to JSON.stringify result).
    * If callback will not be passed, export returns transform stream.
    */
  def export(): ReadStream = js.native
  /**
    * provides simple export API for snapshot.
    * callback(error, data) receives serialized snapshot as second argument. (Serialization is not equal to JSON.stringify result).
    * If callback will not be passed, export returns transform stream.
    */
  def export(callback: js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  
  /**
    * provides short information about snapshot.
    */
  def getHeader(): js.Any = js.native
  
  /**
    * low level serialization method.
    * Look Snapshot.export source for usage example.
    */
  var serialize: js.Function = js.native
}

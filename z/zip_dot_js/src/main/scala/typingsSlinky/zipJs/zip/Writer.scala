package typingsSlinky.zipJs.zip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Writer extends js.Object {
  
  def getData(callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  def getData(callback: js.Function1[/* data */ js.Any, Unit], onerror: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  def init(callback: js.Function0[Unit]): Unit = js.native
  def init(callback: js.Function0[Unit], onerror: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  def writeUint8Array(array: js.typedarray.Uint8Array, callback: js.Function0[Unit]): Unit = js.native
  def writeUint8Array(
    array: js.typedarray.Uint8Array,
    callback: js.Function0[Unit],
    onerror: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
}

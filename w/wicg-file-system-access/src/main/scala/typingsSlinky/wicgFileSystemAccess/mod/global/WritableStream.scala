package typingsSlinky.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: remove this once https://github.com/microsoft/TSJS-lib-generator/issues/881 is fixed.
// Native File System API especially needs this method.
@js.native
trait WritableStream extends StObject {
  
  def close(): js.Promise[Unit] = js.native
}
object WritableStream {
  
  @scala.inline
  def apply(close: () => js.Promise[Unit]): WritableStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[WritableStream]
  }
  
  @scala.inline
  implicit class WritableStreamMutableBuilder[Self <: WritableStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}

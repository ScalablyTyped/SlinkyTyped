package typingsSlinky.tern.ternMod

import typingsSlinky.tern.ternBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncConstructorOptions extends StObject {
  
  /** Indicates whether `getFile` is asynchronous. Default is `false`. */
  var async: js.UndefOr[`false`] = js.native
  
  /**
    * Provides a way for the server to try and fetch the content of files.
    * Depending on the `async` option, this is either a function that takes a filename and returns a string (when not `async`), or
    * a function that takes a `filename` and a `callback`, and calls the callback with an optional `error` as the first argument,
    * and the `content` string (if no error) as the second.
    */
  var getFile: js.UndefOr[js.Function1[/* filename */ String, String]] = js.native
}
object SyncConstructorOptions {
  
  @scala.inline
  def apply(): SyncConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncConstructorOptions]
  }
  
  @scala.inline
  implicit class SyncConstructorOptionsMutableBuilder[Self <: SyncConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: `false`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setGetFile(value: /* filename */ String => String): Self = StObject.set(x, "getFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFileUndefined: Self = StObject.set(x, "getFile", js.undefined)
  }
}

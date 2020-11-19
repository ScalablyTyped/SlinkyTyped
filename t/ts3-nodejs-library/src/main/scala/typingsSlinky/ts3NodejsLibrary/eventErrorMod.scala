package typingsSlinky.ts3NodejsLibrary

import typingsSlinky.std.Error
import typingsSlinky.ts3NodejsLibrary.anon.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts3-nodejs-library/lib/exception/EventError", JSImport.Namespace)
@js.native
object eventErrorMod extends js.Object {
  
  @js.native
  class EventError protected () extends Error {
    /**
      * @param message error message
      * @param eventName source event of this error
      */
    def this(message: String, eventName: String) = this()
    
    val eventName: String = js.native
    
    def toJSON(): EventName = js.native
  }
}

package typingsSlinky.ts3NodejsLibrary

import typingsSlinky.std.Error
import typingsSlinky.ts3NodejsLibrary.commandMod.Command
import typingsSlinky.ts3NodejsLibrary.responseTypesMod.QueryErrorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/exception/ResponseError", JSImport.Namespace)
@js.native
object responseErrorMod extends js.Object {
  @js.native
  class ResponseError protected ()
    extends Error
       with QueryErrorMessage {
    def this(error: QueryErrorMessage, source: Command) = this()
    val source: Command = js.native
    /**
      * returns a json encodeable object for this error
      */
    def toJSON(): AnonExtramsg = js.native
  }
  
}


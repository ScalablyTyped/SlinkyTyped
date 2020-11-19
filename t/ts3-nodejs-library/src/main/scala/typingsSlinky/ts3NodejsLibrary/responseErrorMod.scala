package typingsSlinky.ts3NodejsLibrary

import typingsSlinky.std.Error
import typingsSlinky.ts3NodejsLibrary.anon.ExtraMsg
import typingsSlinky.ts3NodejsLibrary.responseTypesMod.QueryErrorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts3-nodejs-library/lib/exception/ResponseError", JSImport.Namespace)
@js.native
object responseErrorMod extends js.Object {
  
  @js.native
  class ResponseError protected () extends Error {
    def this(error: QueryErrorMessage, stack: String) = this()
    
    val extraMsg: js.UndefOr[String] = js.native
    
    val failedPermid: js.UndefOr[Double] = js.native
    
    val id: String = js.native
    
    val msg: String = js.native
    
    /**
      * returns a json encodeable object for this error
      */
    def toJSON(): ExtraMsg = js.native
  }
}

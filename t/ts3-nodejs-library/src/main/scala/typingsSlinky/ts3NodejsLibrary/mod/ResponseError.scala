package typingsSlinky.ts3NodejsLibrary.mod

import typingsSlinky.ts3NodejsLibrary.responseTypesMod.QueryErrorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts3-nodejs-library/lib", "ResponseError")
@js.native
class ResponseError protected ()
  extends typingsSlinky.ts3NodejsLibrary.responseErrorMod.ResponseError {
  def this(error: QueryErrorMessage, stack: String) = this()
}

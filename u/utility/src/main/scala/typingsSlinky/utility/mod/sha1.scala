package typingsSlinky.utility.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("utility", "sha1")
@js.native
object sha1 extends js.Object {
  
  /**
    * sha1 hash
    *
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} sha1 hash string
    * @public
    */
  def apply(s: String): String = js.native
  def apply(s: Buffer): String = js.native
}

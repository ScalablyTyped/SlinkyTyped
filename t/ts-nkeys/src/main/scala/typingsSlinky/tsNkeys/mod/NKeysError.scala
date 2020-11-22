package typingsSlinky.tsNkeys.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-nkeys", "NKeysError")
@js.native
class NKeysError protected () extends Error {
  /**
    * @param {NKeysErrorCode} code
    * @param {Error} [chainedError]
    * @constructor
    *
    * @api private
    */
  def this(code: NKeysErrorCode) = this()
  def this(code: NKeysErrorCode, chainedError: js.Error) = this()
  
  var chainedError: js.UndefOr[js.Error] = js.native
  
  var code: String = js.native
}

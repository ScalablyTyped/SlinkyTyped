package typingsSlinky.socks

import typingsSlinky.socks.constantsMod.SocksClientChainOptions
import typingsSlinky.socks.constantsMod.SocksClientOptions
import typingsSlinky.std.Error
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("socks/typings/common/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  /**
    * Shuffles a given array.
    * @param array The array to shuffle.
    */
  def shuffleArray(array: js.Array[_]): Unit = js.native
  
  /**
    * Error wrapper for SocksClient
    */
  @js.native
  class SocksClientError protected () extends Error {
    def this(message: String, options: SocksClientChainOptions) = this()
    def this(message: String, options: SocksClientOptions) = this()
    
    var options: SocksClientOptions | SocksClientChainOptions = js.native
  }
  
  type RequireOnlyOne[T, Keys /* <: /* keyof T */ String */] = (Pick[T, Exclude[/* keyof T */ String, Keys]]) with (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]:? std.Required<std.Pick<T, K>> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] */ js.Any)
}

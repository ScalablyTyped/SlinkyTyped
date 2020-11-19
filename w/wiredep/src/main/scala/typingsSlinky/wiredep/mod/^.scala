package typingsSlinky.wiredep.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wiredep", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * @return {PathFiles} paths to your files by extension
    * @example:
    *  {
    *     js: [
    *       'paths/to/your/js/files.js',
    *       'in/their/order/of/dependency.js'
    *     ],
    *     css: [
    *       'paths/to/your/css/files.css'
    *     ],
    *     // etc.
    *   }
    */
  def apply(config: WiredepParams): PathFiles = js.native
}

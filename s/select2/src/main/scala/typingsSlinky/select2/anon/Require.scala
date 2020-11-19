package typingsSlinky.select2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Require extends js.Object {
  
  /**
    * CommonJS require call
    * @param module Module to load
    * @return The loaded module
    */
  def require(module: String): js.Any = js.native
  /**
    * Start the main app logic.
    * Callback is optional.
    * Can alternatively use deps and callback.
    * @param modules Required modules to load.
    **/
  def require(modules: js.Array[String]): Unit = js.native
  /**
    * @see Require()
    * @param ready Called when required modules are ready.
    **/
  def require(modules: js.Array[String], ready: js.Function): Unit = js.native
  /**
    * @see http://requirejs.org/docs/api.html#errbacks
    * @param ready Called when required modules are ready.
    **/
  def require(modules: js.Array[String], ready: js.Function, errback: js.Function): Unit = js.native
  @JSName("require")
  var require_Original: typingsSlinky.requirejs.Require = js.native
}

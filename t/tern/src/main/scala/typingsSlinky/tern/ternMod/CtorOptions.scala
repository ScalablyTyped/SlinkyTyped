package typingsSlinky.tern.ternMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tern.ternNumbers.`5`
import typingsSlinky.tern.ternNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CtorOptions extends StObject {
  
  /** The definition objects to load into the server’s environment. */
  var defs: js.UndefOr[js.Array[Def]] = js.native
  
  /** The ECMAScript version to parse. Should be either 5 or 6. Default is 6. */
  var ecmaVersion: js.UndefOr[`5` | `6`] = js.native
  
  /** Indicates the maximum amount of milliseconds to wait for an asynchronous getFile before giving up on it. Defaults to 1000. */
  var fetchTimeout: js.UndefOr[Double] = js.native
  
  /** Specifies the set of plugins that the server should load. The property names of the object name the plugins, and their values hold options that will be passed to them. */
  var plugins: js.UndefOr[StringDictionary[js.Object]] = js.native
}
object CtorOptions {
  
  @scala.inline
  def apply(): CtorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CtorOptions]
  }
  
  @scala.inline
  implicit class CtorOptionsMutableBuilder[Self <: CtorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefs(value: js.Array[Def]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
    
    @scala.inline
    def setDefsVarargs(value: Def*): Self = StObject.set(x, "defs", js.Array(value :_*))
    
    @scala.inline
    def setEcmaVersion(value: `5` | `6`): Self = StObject.set(x, "ecmaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcmaVersionUndefined: Self = StObject.set(x, "ecmaVersion", js.undefined)
    
    @scala.inline
    def setFetchTimeout(value: Double): Self = StObject.set(x, "fetchTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchTimeoutUndefined: Self = StObject.set(x, "fetchTimeout", js.undefined)
    
    @scala.inline
    def setPlugins(value: StringDictionary[js.Object]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
  }
}

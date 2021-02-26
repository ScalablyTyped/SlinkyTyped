package typingsSlinky.xadesjs.mod

import org.scalajs.dom.crypto.Crypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs", "Application")
@js.native
class Application ()
  extends typingsSlinky.xmldsigjs.mod.Application
/* static members */
object Application {
  
  @JSImport("xadesjs", "Application.isNodePlugin")
  @js.native
  def isNodePlugin(): Boolean = js.native
  
  /**
    * Sets crypto engine for the current Application
    * @param  {string} name
    * @param  {Crypto} crypto
    * @returns void
    */
  @JSImport("xadesjs", "Application.setEngine")
  @js.native
  def setEngine(name: String, crypto: Crypto): Unit = js.native
}

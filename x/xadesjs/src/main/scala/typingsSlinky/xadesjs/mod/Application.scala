package typingsSlinky.xadesjs.mod

import org.scalajs.dom.crypto.Crypto
import typingsSlinky.xmldsigjs.applicationMod.CryptoEx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs", "Application")
@js.native
class Application ()
  extends typingsSlinky.xmldsigjs.mod.Application
/* static members */
@JSImport("xadesjs", "Application")
@js.native
object Application extends js.Object {
  
  /**
    * Gets the crypto module from the Application
    */
  def crypto: CryptoEx = js.native
  
  def isNodePlugin(): Boolean = js.native
  
  /**
    * Sets crypto engine for the current Application
    * @param  {string} name
    * @param  {Crypto} crypto
    * @returns void
    */
  def setEngine(name: String, crypto: Crypto): Unit = js.native
}

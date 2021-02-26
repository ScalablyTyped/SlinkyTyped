package typingsSlinky.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFunctionIdentifier extends StObject {
  
  /**
    * Final byte, must be in range \x40 .. \x7e for CSI and DCS,
    * \x30 .. \x7e for ESC.
    */
  var `final`: String = js.native
  
  /**
    * Optional intermediate bytes, must be in range \x20 .. \x2f.
    * Usable in CSI, DCS and ESC.
    */
  var intermediates: js.UndefOr[String] = js.native
  
  /**
    * Optional prefix byte, must be in range \x3c .. \x3f.
    * Usable in CSI and DCS.
    */
  var prefix: js.UndefOr[String] = js.native
}
object IFunctionIdentifier {
  
  @scala.inline
  def apply(`final`: String): IFunctionIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFunctionIdentifier]
  }
  
  @scala.inline
  implicit class IFunctionIdentifierMutableBuilder[Self <: IFunctionIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinal(value: String): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntermediates(value: String): Self = StObject.set(x, "intermediates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntermediatesUndefined: Self = StObject.set(x, "intermediates", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}

package typingsSlinky.sinon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonExposeOptions extends StObject {
  
  var includeFail: Boolean = js.native
  
  var prefix: String = js.native
}
object SinonExposeOptions {
  
  @scala.inline
  def apply(includeFail: Boolean, prefix: String): SinonExposeOptions = {
    val __obj = js.Dynamic.literal(includeFail = includeFail.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinonExposeOptions]
  }
  
  @scala.inline
  implicit class SinonExposeOptionsMutableBuilder[Self <: SinonExposeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeFail(value: Boolean): Self = StObject.set(x, "includeFail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}

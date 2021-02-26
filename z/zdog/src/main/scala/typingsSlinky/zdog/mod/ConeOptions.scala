package typingsSlinky.zdog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConeOptions extends EllipseOptions {
  
  /** @default 1 */
  val length: js.UndefOr[Double] = js.native
}
object ConeOptions {
  
  @scala.inline
  def apply(): ConeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConeOptions]
  }
  
  @scala.inline
  implicit class ConeOptionsMutableBuilder[Self <: ConeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}

package typingsSlinky.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alignrests extends StObject {
  
  var align_rests: Boolean = js.native
  
  var auto_beam: Boolean = js.native
}
object Alignrests {
  
  @scala.inline
  def apply(align_rests: Boolean, auto_beam: Boolean): Alignrests = {
    val __obj = js.Dynamic.literal(align_rests = align_rests.asInstanceOf[js.Any], auto_beam = auto_beam.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alignrests]
  }
  
  @scala.inline
  implicit class AlignrestsMutableBuilder[Self <: Alignrests] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign_rests(value: Boolean): Self = StObject.set(x, "align_rests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_beam(value: Boolean): Self = StObject.set(x, "auto_beam", value.asInstanceOf[js.Any])
  }
}

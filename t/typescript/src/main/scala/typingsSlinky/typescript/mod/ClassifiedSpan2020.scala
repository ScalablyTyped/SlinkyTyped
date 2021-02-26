package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassifiedSpan2020 extends StObject {
  
  var classificationType: Double = js.native
  
  var textSpan: TextSpan = js.native
}
object ClassifiedSpan2020 {
  
  @scala.inline
  def apply(classificationType: Double, textSpan: TextSpan): ClassifiedSpan2020 = {
    val __obj = js.Dynamic.literal(classificationType = classificationType.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifiedSpan2020]
  }
  
  @scala.inline
  implicit class ClassifiedSpan2020MutableBuilder[Self <: ClassifiedSpan2020] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassificationType(value: Double): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.storybookUi.anon

import typingsSlinky.storybookUi.mobileMod.MobileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsMobileProps extends StObject {
  
  var props: MobileProps = js.native
}
object PropsMobileProps {
  
  @scala.inline
  def apply(props: MobileProps): PropsMobileProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsMobileProps]
  }
  
  @scala.inline
  implicit class PropsMobilePropsMutableBuilder[Self <: PropsMobileProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: MobileProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}

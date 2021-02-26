package typingsSlinky.winrt.Windows.ApplicationModel.Activation

import typingsSlinky.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplashScreen extends ISplashScreen
object SplashScreen {
  
  @scala.inline
  def apply(imageLocation: Rect, ondismissed: js.Any): SplashScreen = {
    val __obj = js.Dynamic.literal(imageLocation = imageLocation.asInstanceOf[js.Any], ondismissed = ondismissed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplashScreen]
  }
}

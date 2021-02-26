package typingsSlinky.winrt.Windows.ApplicationModel.Resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceLoader extends IResourceLoader
object ResourceLoader {
  
  @scala.inline
  def apply(getString: String => String): ResourceLoader = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction1(getString))
    __obj.asInstanceOf[ResourceLoader]
  }
}

package typingsSlinky.winrt.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHostNameFactory extends StObject {
  
  def createHostName(hostName: String): HostName = js.native
}
object IHostNameFactory {
  
  @scala.inline
  def apply(createHostName: String => HostName): IHostNameFactory = {
    val __obj = js.Dynamic.literal(createHostName = js.Any.fromFunction1(createHostName))
    __obj.asInstanceOf[IHostNameFactory]
  }
  
  @scala.inline
  implicit class IHostNameFactoryMutableBuilder[Self <: IHostNameFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateHostName(value: String => HostName): Self = StObject.set(x, "createHostName", js.Any.fromFunction1(value))
  }
}

package typingsSlinky.winrt.Windows.Networking.BackgroundTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundTransferContentPartFactory extends StObject {
  
  def createWithName(name: String): BackgroundTransferContentPart = js.native
  
  def createWithNameAndFileName(name: String, fileName: String): BackgroundTransferContentPart = js.native
}
object IBackgroundTransferContentPartFactory {
  
  @scala.inline
  def apply(
    createWithName: String => BackgroundTransferContentPart,
    createWithNameAndFileName: (String, String) => BackgroundTransferContentPart
  ): IBackgroundTransferContentPartFactory = {
    val __obj = js.Dynamic.literal(createWithName = js.Any.fromFunction1(createWithName), createWithNameAndFileName = js.Any.fromFunction2(createWithNameAndFileName))
    __obj.asInstanceOf[IBackgroundTransferContentPartFactory]
  }
  
  @scala.inline
  implicit class IBackgroundTransferContentPartFactoryMutableBuilder[Self <: IBackgroundTransferContentPartFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateWithName(value: String => BackgroundTransferContentPart): Self = StObject.set(x, "createWithName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWithNameAndFileName(value: (String, String) => BackgroundTransferContentPart): Self = StObject.set(x, "createWithNameAndFileName", js.Any.fromFunction2(value))
  }
}

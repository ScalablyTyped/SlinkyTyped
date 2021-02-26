package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.anon.Send
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationFeature[T /* <: js.Function */] extends StObject {
  
  /**
    * Triggers the corresponding RPC method.
    */
  def getProvider(document: typingsSlinky.vscode.mod.TextDocument): Send[T] = js.native
}
object NotificationFeature {
  
  @scala.inline
  def apply[T /* <: js.Function */](getProvider: typingsSlinky.vscode.mod.TextDocument => Send[T]): NotificationFeature[T] = {
    val __obj = js.Dynamic.literal(getProvider = js.Any.fromFunction1(getProvider))
    __obj.asInstanceOf[NotificationFeature[T]]
  }
  
  @scala.inline
  implicit class NotificationFeatureMutableBuilder[Self <: NotificationFeature[_], T /* <: js.Function */] (val x: Self with NotificationFeature[T]) extends AnyVal {
    
    @scala.inline
    def setGetProvider(value: typingsSlinky.vscode.mod.TextDocument => Send[T]): Self = StObject.set(x, "getProvider", js.Any.fromFunction1(value))
  }
}

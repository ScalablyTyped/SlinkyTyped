package typingsSlinky.vscodeLanguageclient.callHierarchyProposedMod

import typingsSlinky.vscode.mod.CallHierarchyIncomingCall
import typingsSlinky.vscode.mod.CallHierarchyItem
import typingsSlinky.vscode.mod.CallHierarchyOutgoingCall
import typingsSlinky.vscode.mod.CancellationToken
import typingsSlinky.vscode.mod.Position
import typingsSlinky.vscode.mod.ProviderResult
import typingsSlinky.vscode.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallHierarchyProvider
  extends typingsSlinky.vscode.mod.CallHierarchyProvider {
  
  var client: js.Any = js.native
  
  var middleware: js.Any = js.native
}
object CallHierarchyProvider {
  
  @scala.inline
  def apply(
    client: js.Any,
    middleware: js.Any,
    prepareCallHierarchy: (TextDocument, Position, CancellationToken) => ProviderResult[CallHierarchyItem | js.Array[CallHierarchyItem]],
    provideCallHierarchyIncomingCalls: (CallHierarchyItem, CancellationToken) => ProviderResult[js.Array[CallHierarchyIncomingCall]],
    provideCallHierarchyOutgoingCalls: (CallHierarchyItem, CancellationToken) => ProviderResult[js.Array[CallHierarchyOutgoingCall]]
  ): CallHierarchyProvider = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], prepareCallHierarchy = js.Any.fromFunction3(prepareCallHierarchy), provideCallHierarchyIncomingCalls = js.Any.fromFunction2(provideCallHierarchyIncomingCalls), provideCallHierarchyOutgoingCalls = js.Any.fromFunction2(provideCallHierarchyOutgoingCalls))
    __obj.asInstanceOf[CallHierarchyProvider]
  }
  
  @scala.inline
  implicit class CallHierarchyProviderOps[Self <: CallHierarchyProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClient(value: js.Any): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleware(value: js.Any): Self = this.set("middleware", value.asInstanceOf[js.Any])
  }
}

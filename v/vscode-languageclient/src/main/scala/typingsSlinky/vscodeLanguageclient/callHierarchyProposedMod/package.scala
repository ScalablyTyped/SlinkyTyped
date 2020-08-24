package typingsSlinky.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object callHierarchyProposedMod {
  type CallHierarchyIncomingCallsSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* item */ typingsSlinky.vscode.mod.CallHierarchyItem, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.CallHierarchyIncomingCall]]
  ]
  type CallHierarchyOutgoingCallsSignature = js.ThisFunction2[
    /* this */ scala.Unit, 
    /* item */ typingsSlinky.vscode.mod.CallHierarchyItem, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[js.Array[typingsSlinky.vscode.mod.CallHierarchyOutgoingCall]]
  ]
  type PrepareCallHierachySignature = js.ThisFunction3[
    /* this */ scala.Unit, 
    /* document */ typingsSlinky.vscode.mod.TextDocument, 
    /* position */ typingsSlinky.vscode.mod.Position, 
    /* token */ typingsSlinky.vscode.mod.CancellationToken, 
    typingsSlinky.vscode.mod.ProviderResult[typingsSlinky.vscode.mod.CallHierarchyItem]
  ]
}

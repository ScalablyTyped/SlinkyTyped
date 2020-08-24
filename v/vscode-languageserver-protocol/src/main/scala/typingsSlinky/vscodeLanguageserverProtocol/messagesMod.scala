package typingsSlinky.vscodeLanguageserverProtocol

import typingsSlinky.vscodeJsonrpc.messagesMod._EM
import typingsSlinky.vscodeJsonrpc.mod.NotificationType
import typingsSlinky.vscodeJsonrpc.mod.NotificationType0
import typingsSlinky.vscodeJsonrpc.mod.RequestType
import typingsSlinky.vscodeJsonrpc.mod.RequestType0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/messages", JSImport.Namespace)
@js.native
object messagesMod extends js.Object {
  @js.native
  class ProtocolNotificationType[P, RO] protected () extends NotificationType[P, RO] {
    def this(method: String) = this()
  }
  
  @js.native
  class ProtocolNotificationType0[RO] protected () extends NotificationType0[RO] {
    def this(method: String) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.vscodeJsonrpc.mod.ProgressType because Inheritance from two classes. Inlined __ */ @js.native
  class ProtocolRequestType[P, R, PR, E, RO] protected () extends RequestType[P, R, E, RO] {
    def this(method: String) = this()
    val __ : js.UndefOr[js.Tuple2[PR, _EM]] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.vscodeJsonrpc.mod.ProgressType because Inheritance from two classes. Inlined __ */ @js.native
  class ProtocolRequestType0[R, PR, E, RO] protected () extends RequestType0[R, E, RO] {
    def this(method: String) = this()
    val __ : js.UndefOr[js.Tuple2[PR, _EM]] = js.native
  }
  
}


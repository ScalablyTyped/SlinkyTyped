package typingsSlinky.vscodeJsonrpc.messageReaderMod

import typingsSlinky.node.NodeJS.Process
import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.vscodeJsonrpc.eventsMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messageReader", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends AbstractMessageReader
     with MessageReader {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
  var process: js.Any = js.native
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ Unit, _]): Disposable = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): Disposable = js.native
  /* InferMemberOverrides */
  override def onClose(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /* InferMemberOverrides */
  override def onError(listener: js.Function1[/* e */ js.Error, _]): Disposable = js.native
  /* InferMemberOverrides */
  override def onError(listener: js.Function1[/* e */ js.Error, _], thisArgs: js.Any): Disposable = js.native
  /* InferMemberOverrides */
  override def onError(listener: js.Function1[/* e */ js.Error, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /* InferMemberOverrides */
  override def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _]): Disposable = js.native
  /* InferMemberOverrides */
  override def onPartialMessage(listener: js.Function1[/* e */ PartialMessageInfo, _], thisArgs: js.Any): Disposable = js.native
  /* InferMemberOverrides */
  override def onPartialMessage(
    listener: js.Function1[/* e */ PartialMessageInfo, _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
}


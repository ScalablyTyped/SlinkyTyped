package typingsSlinky.sipDotJs.sipDotJsMod.Core

import typingsSlinky.sipDotJs.libCoreDialogsDialogDashStateMod.DialogState
import typingsSlinky.sipDotJs.libCoreSessionSessionDashDelegateMod.SessionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.SessionDialog")
@js.native
class SessionDialog protected ()
  extends typingsSlinky.sipDotJs.libCoreMod.SessionDialog {
  def this(
    initialTransaction: typingsSlinky.sipDotJs.libCoreTransactionsMod.InviteClientTransaction,
    core: typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typingsSlinky.sipDotJs.libCoreTransactionsMod.InviteServerTransaction,
    core: typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typingsSlinky.sipDotJs.libCoreTransactionsMod.InviteClientTransaction,
    core: typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
  def this(
    initialTransaction: typingsSlinky.sipDotJs.libCoreTransactionsMod.InviteServerTransaction,
    core: typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
}


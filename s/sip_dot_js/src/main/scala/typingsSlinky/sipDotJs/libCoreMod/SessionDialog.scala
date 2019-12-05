package typingsSlinky.sipDotJs.libCoreMod

import typingsSlinky.sipDotJs.libCoreDialogsDialogDashStateMod.DialogState
import typingsSlinky.sipDotJs.libCoreSessionSessionDashDelegateMod.SessionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "SessionDialog")
@js.native
class SessionDialog protected ()
  extends typingsSlinky.sipDotJs.libCoreDialogsMod.SessionDialog {
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


package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.dialogStateMod.DialogState
import typingsSlinky.sipJs.sessionSessionDelegateMod.SessionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "SessionDialog")
@js.native
class SessionDialog protected ()
  extends typingsSlinky.sipJs.dialogsMod.SessionDialog {
  def this(
    initialTransaction: typingsSlinky.sipJs.transactionsMod.InviteClientTransaction,
    core: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typingsSlinky.sipJs.transactionsMod.InviteServerTransaction,
    core: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typingsSlinky.sipJs.transactionsMod.InviteClientTransaction,
    core: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
  def this(
    initialTransaction: typingsSlinky.sipJs.transactionsMod.InviteServerTransaction,
    core: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
}


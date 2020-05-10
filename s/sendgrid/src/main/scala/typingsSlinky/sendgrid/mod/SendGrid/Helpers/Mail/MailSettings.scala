package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import typingsSlinky.sendgrid.AnonBcc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailSettings extends js.Object {
  def getBcc(): Bcc = js.native
  def getBypassListManagement(): BypassListManagement = js.native
  def getFooter(): Footer = js.native
  def getSandBoxMode(): SandBoxMode = js.native
  def getSpamCheck(): SpamCheck = js.native
  def setBcc(bcc: Bcc): Unit = js.native
  def setBypassListManagement(bypassListManagement: BypassListManagement): Unit = js.native
  def setFooter(footer: Footer): Unit = js.native
  def setSandBoxMode(sandBoxMode: SandBoxMode): Unit = js.native
  def setSpamCheck(spamCheck: SpamCheck): Unit = js.native
  def toJSON(): AnonBcc = js.native
}

object MailSettings {
  @scala.inline
  def apply(
    getBcc: () => Bcc,
    getBypassListManagement: () => BypassListManagement,
    getFooter: () => Footer,
    getSandBoxMode: () => SandBoxMode,
    getSpamCheck: () => SpamCheck,
    setBcc: Bcc => Unit,
    setBypassListManagement: BypassListManagement => Unit,
    setFooter: Footer => Unit,
    setSandBoxMode: SandBoxMode => Unit,
    setSpamCheck: SpamCheck => Unit,
    toJSON: () => AnonBcc
  ): MailSettings = {
    val __obj = js.Dynamic.literal(getBcc = js.Any.fromFunction0(getBcc), getBypassListManagement = js.Any.fromFunction0(getBypassListManagement), getFooter = js.Any.fromFunction0(getFooter), getSandBoxMode = js.Any.fromFunction0(getSandBoxMode), getSpamCheck = js.Any.fromFunction0(getSpamCheck), setBcc = js.Any.fromFunction1(setBcc), setBypassListManagement = js.Any.fromFunction1(setBypassListManagement), setFooter = js.Any.fromFunction1(setFooter), setSandBoxMode = js.Any.fromFunction1(setSandBoxMode), setSpamCheck = js.Any.fromFunction1(setSpamCheck), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[MailSettings]
  }
  @scala.inline
  implicit class MailSettingsOps[Self <: MailSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBcc(value: () => Bcc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBcc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBypassListManagement(value: () => BypassListManagement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBypassListManagement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFooter(value: () => Footer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFooter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSandBoxMode(value: () => SandBoxMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSandBoxMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSpamCheck(value: () => SpamCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSpamCheck")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetBcc(value: Bcc => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBcc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBypassListManagement(value: BypassListManagement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBypassListManagement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFooter(value: Footer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFooter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSandBoxMode(value: SandBoxMode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSandBoxMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSpamCheck(value: SpamCheck => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpamCheck")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => AnonBcc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


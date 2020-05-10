package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import typingsSlinky.sendgrid.AnonAsm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mail extends js.Object {
  def addAttachment(attachment: Attachment): Unit = js.native
  def addCategory(category: Category): Unit = js.native
  def addContent(content: Content): Unit = js.native
  def addCustomArg(customArg: CustomArgs): Unit = js.native
  def addHeader(header: Header): Unit = js.native
  def addMailSettings(settings: MailSettings): Unit = js.native
  def addPersonalization(personalization: Personalization): Unit = js.native
  def addSection(section: Section): Unit = js.native
  def addTrackingSettings(settings: TrackingSettings): Unit = js.native
  def getAsm(): Asm = js.native
  def getAttachments(): js.Array[Attachment] = js.native
  def getBatchId(): String = js.native
  def getCategories(): js.Array[Category] = js.native
  def getContents(): js.Array[Content] = js.native
  def getCustomArgs(): js.Array[CustomArgs] = js.native
  def getFrom(): Email = js.native
  def getHeaders(): js.Array[Header] = js.native
  def getIpPoolName(): String = js.native
  def getMailSettings(): MailSettings = js.native
  def getPersonalizations(): js.Array[Personalization] = js.native
  def getReplyTo(): Email = js.native
  def getSections(): js.Array[Section] = js.native
  def getSendAt(): Double = js.native
  def getSubject(): String = js.native
  def getTemplateId(): String = js.native
  def getTrackingSettings(): TrackingSettings = js.native
  def setAsm(asm: Asm): Unit = js.native
  def setBatchId(batch_id: String): Unit = js.native
  def setFrom(email: Email): Unit = js.native
  def setIpPoolName(name: String): Unit = js.native
  def setReplyTo(email: Email): Unit = js.native
  def setSendAt(sendAt: Double): Unit = js.native
  def setSubject(subject: String): Unit = js.native
  def setTemplateId(templateId: String): Unit = js.native
  def toJSON(): AnonAsm = js.native
}

object Mail {
  @scala.inline
  def apply(
    addAttachment: Attachment => Unit,
    addCategory: Category => Unit,
    addContent: Content => Unit,
    addCustomArg: CustomArgs => Unit,
    addHeader: Header => Unit,
    addMailSettings: MailSettings => Unit,
    addPersonalization: Personalization => Unit,
    addSection: Section => Unit,
    addTrackingSettings: TrackingSettings => Unit,
    getAsm: () => Asm,
    getAttachments: () => js.Array[Attachment],
    getBatchId: () => String,
    getCategories: () => js.Array[Category],
    getContents: () => js.Array[Content],
    getCustomArgs: () => js.Array[CustomArgs],
    getFrom: () => Email,
    getHeaders: () => js.Array[Header],
    getIpPoolName: () => String,
    getMailSettings: () => MailSettings,
    getPersonalizations: () => js.Array[Personalization],
    getReplyTo: () => Email,
    getSections: () => js.Array[Section],
    getSendAt: () => Double,
    getSubject: () => String,
    getTemplateId: () => String,
    getTrackingSettings: () => TrackingSettings,
    setAsm: Asm => Unit,
    setBatchId: String => Unit,
    setFrom: Email => Unit,
    setIpPoolName: String => Unit,
    setReplyTo: Email => Unit,
    setSendAt: Double => Unit,
    setSubject: String => Unit,
    setTemplateId: String => Unit,
    toJSON: () => AnonAsm
  ): Mail = {
    val __obj = js.Dynamic.literal(addAttachment = js.Any.fromFunction1(addAttachment), addCategory = js.Any.fromFunction1(addCategory), addContent = js.Any.fromFunction1(addContent), addCustomArg = js.Any.fromFunction1(addCustomArg), addHeader = js.Any.fromFunction1(addHeader), addMailSettings = js.Any.fromFunction1(addMailSettings), addPersonalization = js.Any.fromFunction1(addPersonalization), addSection = js.Any.fromFunction1(addSection), addTrackingSettings = js.Any.fromFunction1(addTrackingSettings), getAsm = js.Any.fromFunction0(getAsm), getAttachments = js.Any.fromFunction0(getAttachments), getBatchId = js.Any.fromFunction0(getBatchId), getCategories = js.Any.fromFunction0(getCategories), getContents = js.Any.fromFunction0(getContents), getCustomArgs = js.Any.fromFunction0(getCustomArgs), getFrom = js.Any.fromFunction0(getFrom), getHeaders = js.Any.fromFunction0(getHeaders), getIpPoolName = js.Any.fromFunction0(getIpPoolName), getMailSettings = js.Any.fromFunction0(getMailSettings), getPersonalizations = js.Any.fromFunction0(getPersonalizations), getReplyTo = js.Any.fromFunction0(getReplyTo), getSections = js.Any.fromFunction0(getSections), getSendAt = js.Any.fromFunction0(getSendAt), getSubject = js.Any.fromFunction0(getSubject), getTemplateId = js.Any.fromFunction0(getTemplateId), getTrackingSettings = js.Any.fromFunction0(getTrackingSettings), setAsm = js.Any.fromFunction1(setAsm), setBatchId = js.Any.fromFunction1(setBatchId), setFrom = js.Any.fromFunction1(setFrom), setIpPoolName = js.Any.fromFunction1(setIpPoolName), setReplyTo = js.Any.fromFunction1(setReplyTo), setSendAt = js.Any.fromFunction1(setSendAt), setSubject = js.Any.fromFunction1(setSubject), setTemplateId = js.Any.fromFunction1(setTemplateId), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Mail]
  }
  @scala.inline
  implicit class MailOps[Self <: typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail.Mail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAttachment(value: Attachment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAttachment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddCategory(value: Category => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCategory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddContent(value: Content => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddCustomArg(value: CustomArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCustomArg")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddHeader(value: Header => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddMailSettings(value: MailSettings => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMailSettings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddPersonalization(value: Personalization => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPersonalization")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddSection(value: Section => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddTrackingSettings(value: TrackingSettings => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTrackingSettings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAsm(value: () => Asm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAsm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttachments(value: () => js.Array[Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttachments")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBatchId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBatchId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCategories(value: () => js.Array[Category]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCategories")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContents(value: () => js.Array[Content]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCustomArgs(value: () => js.Array[CustomArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomArgs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFrom(value: () => Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeaders(value: () => js.Array[Header]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIpPoolName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIpPoolName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMailSettings(value: () => MailSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMailSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPersonalizations(value: () => js.Array[Personalization]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPersonalizations")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetReplyTo(value: () => Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReplyTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSections(value: () => js.Array[Section]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSections")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSendAt(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSendAt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubject(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTemplateId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTemplateId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTrackingSettings(value: () => TrackingSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrackingSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAsm(value: Asm => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAsm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBatchId(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBatchId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFrom(value: Email => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIpPoolName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIpPoolName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetReplyTo(value: Email => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReplyTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSendAt(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSendAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSubject(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTemplateId(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTemplateId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => AnonAsm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


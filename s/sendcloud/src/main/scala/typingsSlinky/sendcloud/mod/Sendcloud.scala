package typingsSlinky.sendcloud.mod

import typingsSlinky.nodemailer.mod.SentMessageInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sendcloud extends js.Object {
  val EmailList: typingsSlinky.sendcloud.mod.EmailList = js.native
  val ListMember: typingsSlinky.sendcloud.mod.ListMember = js.native
  def send(to: String, subject: String, html: String): js.Promise[SuccessResp | ErrorResp] = js.native
  def send(to: String, subject: String, html: String, options: SendOptions): js.Promise[SuccessResp | ErrorResp] = js.native
  def sendByMailList(to: String, subject: String, templateName: String, options: TemplateSendOptions): js.Promise[TemplateSendResponse] = js.native
  def sendByTemplate(
    to: js.Array[String],
    subject: String,
    templateName: String,
    sub: js.Object,
    options: TemplateSendOptions
  ): js.Promise[TemplateSendResponse] = js.native
  def sendEmailSmtp(to: String, subject: String, data: String): js.Promise[SentMessageInfo] = js.native
  def templateToOne(to: String, subject: String, templateName: String, sub: js.Object, options: TemplateSendOptions): js.Promise[TemplateSendResponse] = js.native
}


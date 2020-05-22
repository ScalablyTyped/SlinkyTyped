package typingsSlinky.sharepoint.SP.SiteHealth

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteHealthResult extends ClientValueObject {
  def get_messageAsText(): String
  def get_ruleHelpLink(): String
  def get_ruleId(): Guid
  def get_ruleIsRepairable(): Boolean
  def get_ruleName(): String
  def get_status(): SiteHealthStatusType
  def get_timeStamp(): js.Date
  def set_status(value: SiteHealthStatusType): Unit
  def set_timeStamp(value: js.Date): Unit
}

object SiteHealthResult {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_messageAsText: () => String,
    get_ruleHelpLink: () => String,
    get_ruleId: () => Guid,
    get_ruleIsRepairable: () => Boolean,
    get_ruleName: () => String,
    get_status: () => SiteHealthStatusType,
    get_timeStamp: () => js.Date,
    get_typeId: () => String,
    set_status: SiteHealthStatusType => Unit,
    set_timeStamp: js.Date => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SiteHealthResult = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_messageAsText = js.Any.fromFunction0(get_messageAsText), get_ruleHelpLink = js.Any.fromFunction0(get_ruleHelpLink), get_ruleId = js.Any.fromFunction0(get_ruleId), get_ruleIsRepairable = js.Any.fromFunction0(get_ruleIsRepairable), get_ruleName = js.Any.fromFunction0(get_ruleName), get_status = js.Any.fromFunction0(get_status), get_timeStamp = js.Any.fromFunction0(get_timeStamp), get_typeId = js.Any.fromFunction0(get_typeId), set_status = js.Any.fromFunction1(set_status), set_timeStamp = js.Any.fromFunction1(set_timeStamp), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SiteHealthResult]
  }
}


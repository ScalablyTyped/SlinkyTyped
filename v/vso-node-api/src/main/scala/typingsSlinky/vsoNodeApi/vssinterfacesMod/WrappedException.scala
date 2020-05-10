package typingsSlinky.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedException extends js.Object {
  var customProperties: StringDictionary[js.Any] = js.native
  var errorCode: Double = js.native
  var eventId: Double = js.native
  var helpLink: String = js.native
  var innerException: WrappedException = js.native
  var message: String = js.native
  var stackTrace: String = js.native
  var typeKey: String = js.native
  var typeName: String = js.native
}

object WrappedException {
  @scala.inline
  def apply(
    customProperties: StringDictionary[js.Any],
    errorCode: Double,
    eventId: Double,
    helpLink: String,
    innerException: WrappedException,
    message: String,
    stackTrace: String,
    typeKey: String,
    typeName: String
  ): WrappedException = {
    val __obj = js.Dynamic.literal(customProperties = customProperties.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], helpLink = helpLink.asInstanceOf[js.Any], innerException = innerException.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any], typeKey = typeKey.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedException]
  }
  @scala.inline
  implicit class WrappedExceptionOps[Self <: WrappedException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomProperties(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerException(value: WrappedException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackTrace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


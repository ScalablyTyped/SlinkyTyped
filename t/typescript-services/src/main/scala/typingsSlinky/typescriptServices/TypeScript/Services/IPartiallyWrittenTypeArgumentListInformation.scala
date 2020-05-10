package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.PositionedToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPartiallyWrittenTypeArgumentListInformation extends js.Object {
  var argumentIndex: Double = js.native
  var genericIdentifer: PositionedToken = js.native
  var lessThanToken: PositionedToken = js.native
}

object IPartiallyWrittenTypeArgumentListInformation {
  @scala.inline
  def apply(argumentIndex: Double, genericIdentifer: PositionedToken, lessThanToken: PositionedToken): IPartiallyWrittenTypeArgumentListInformation = {
    val __obj = js.Dynamic.literal(argumentIndex = argumentIndex.asInstanceOf[js.Any], genericIdentifer = genericIdentifer.asInstanceOf[js.Any], lessThanToken = lessThanToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPartiallyWrittenTypeArgumentListInformation]
  }
  @scala.inline
  implicit class IPartiallyWrittenTypeArgumentListInformationOps[Self <: IPartiallyWrittenTypeArgumentListInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgumentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenericIdentifer(value: PositionedToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genericIdentifer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLessThanToken(value: PositionedToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThanToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


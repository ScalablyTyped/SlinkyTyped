package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IFromJson extends js.Object {
  def customFromJson(initValue: js.Any): Boolean = js.native
  def fromJson(initValue: js.Any): Unit = js.native
}

object IFromJson {
  @scala.inline
  def apply(customFromJson: js.Any => Boolean, fromJson: js.Any => Unit): IFromJson = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), fromJson = js.Any.fromFunction1(fromJson))
    __obj.asInstanceOf[IFromJson]
  }
  @scala.inline
  implicit class IFromJsonOps[Self <: IFromJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomFromJson(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFromJson")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromJson(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromJson")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


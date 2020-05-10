package typingsSlinky.wiredep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnotherTypeOfBowerFile extends js.Object {
  /**
    * <format for this {{filePath}} to be injected>
    */
  var typeOfBowerFile: String = js.native
  /**
    * @exemple:
    *   return '<script class="random-' + Math.random() + '" src="' + filePath + '"></script>'
    */
  def anotherTypeOfBowerFile(filePath: String): String = js.native
}

object AnonAnotherTypeOfBowerFile {
  @scala.inline
  def apply(anotherTypeOfBowerFile: String => String, typeOfBowerFile: String): AnonAnotherTypeOfBowerFile = {
    val __obj = js.Dynamic.literal(anotherTypeOfBowerFile = js.Any.fromFunction1(anotherTypeOfBowerFile), typeOfBowerFile = typeOfBowerFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnotherTypeOfBowerFile]
  }
  @scala.inline
  implicit class AnonAnotherTypeOfBowerFileOps[Self <: AnonAnotherTypeOfBowerFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnotherTypeOfBowerFile(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anotherTypeOfBowerFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTypeOfBowerFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeOfBowerFile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


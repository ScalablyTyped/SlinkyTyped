package typingsSlinky.wiredep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTypeOfBowerFile extends js.Object {
  /**
    * match the way this type of file is included
    */
  var typeOfBowerFile: js.RegExp = js.native
}

object AnonTypeOfBowerFile {
  @scala.inline
  def apply(typeOfBowerFile: js.RegExp): AnonTypeOfBowerFile = {
    val __obj = js.Dynamic.literal(typeOfBowerFile = typeOfBowerFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeOfBowerFile]
  }
  @scala.inline
  implicit class AnonTypeOfBowerFileOps[Self <: AnonTypeOfBowerFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeOfBowerFile(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeOfBowerFile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


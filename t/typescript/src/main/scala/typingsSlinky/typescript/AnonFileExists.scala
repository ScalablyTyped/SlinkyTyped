package typingsSlinky.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFileExists extends js.Object {
  def fileExists(fileName: String): Boolean = js.native
  def getExecutingFilePath(): String = js.native
  def readFile(fileName: String): js.UndefOr[String] = js.native
  def resolvePath(path: String): String = js.native
}

object AnonFileExists {
  @scala.inline
  def apply(
    fileExists: String => Boolean,
    getExecutingFilePath: () => String,
    readFile: String => js.UndefOr[String],
    resolvePath: String => String
  ): AnonFileExists = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), getExecutingFilePath = js.Any.fromFunction0(getExecutingFilePath), readFile = js.Any.fromFunction1(readFile), resolvePath = js.Any.fromFunction1(resolvePath))
    __obj.asInstanceOf[AnonFileExists]
  }
  @scala.inline
  implicit class AnonFileExistsOps[Self <: AnonFileExists] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileExists(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetExecutingFilePath(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExecutingFilePath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadFile(value: String => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolvePath(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvePath")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


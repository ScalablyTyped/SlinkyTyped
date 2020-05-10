package typingsSlinky.serverless.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utils extends js.Object {
  def appendFileSync(filePath: String, contents: String): js.Thenable[js.Object] = js.native
  def copyDirContentsSync(srcDir: String, destDir: String): Unit = js.native
  def dirExistsSync(dirPath: String): Boolean = js.native
  def fileExistsSync(filePath: String): Boolean = js.native
  def findServicePath(): String = js.native
  def generateShortId(length: Double): String = js.native
  def getVersion(): String = js.native
  def logStat(serverless: typingsSlinky.serverless.mod.^, context: String): js.Thenable[js.Object] = js.native
  def readFile(filePath: String): js.Thenable[js.Object] = js.native
  def readFileSync(filePath: String): js.Object = js.native
  def walkDirSync(dirPath: String): js.Array[String] = js.native
  def writeFile(filePath: String, contents: String): js.Thenable[js.Object] = js.native
  def writeFileDir(filePath: String): Unit = js.native
  def writeFileSync(filePath: String, contents: String): Unit = js.native
}

object Utils {
  @scala.inline
  def apply(
    appendFileSync: (String, String) => js.Thenable[js.Object],
    copyDirContentsSync: (String, String) => Unit,
    dirExistsSync: String => Boolean,
    fileExistsSync: String => Boolean,
    findServicePath: () => String,
    generateShortId: Double => String,
    getVersion: () => String,
    logStat: (typingsSlinky.serverless.mod.^, String) => js.Thenable[js.Object],
    readFile: String => js.Thenable[js.Object],
    readFileSync: String => js.Object,
    walkDirSync: String => js.Array[String],
    writeFile: (String, String) => js.Thenable[js.Object],
    writeFileDir: String => Unit,
    writeFileSync: (String, String) => Unit
  ): Utils = {
    val __obj = js.Dynamic.literal(appendFileSync = js.Any.fromFunction2(appendFileSync), copyDirContentsSync = js.Any.fromFunction2(copyDirContentsSync), dirExistsSync = js.Any.fromFunction1(dirExistsSync), fileExistsSync = js.Any.fromFunction1(fileExistsSync), findServicePath = js.Any.fromFunction0(findServicePath), generateShortId = js.Any.fromFunction1(generateShortId), getVersion = js.Any.fromFunction0(getVersion), logStat = js.Any.fromFunction2(logStat), readFile = js.Any.fromFunction1(readFile), readFileSync = js.Any.fromFunction1(readFileSync), walkDirSync = js.Any.fromFunction1(walkDirSync), writeFile = js.Any.fromFunction2(writeFile), writeFileDir = js.Any.fromFunction1(writeFileDir), writeFileSync = js.Any.fromFunction2(writeFileSync))
    __obj.asInstanceOf[Utils]
  }
  @scala.inline
  implicit class UtilsOps[Self <: Utils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendFileSync(value: (String, String) => js.Thenable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendFileSync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCopyDirContentsSync(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyDirContentsSync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDirExistsSync(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirExistsSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFileExistsSync(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExistsSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindServicePath(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findServicePath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGenerateShortId(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateShortId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetVersion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogStat(value: (typingsSlinky.serverless.mod.^, String) => js.Thenable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStat")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReadFile(value: String => js.Thenable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadFileSync(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFileSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWalkDirSync(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walkDirSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteFile(value: (String, String) => js.Thenable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWriteFileDir(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeFileDir")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWriteFileSync(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeFileSync")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


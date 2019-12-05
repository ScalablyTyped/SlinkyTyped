package typingsSlinky.typescriptDashServices.TypeScript

import typingsSlinky.std.ITextWriter
import typingsSlinky.typescriptDashServices.Anon_Recursive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEnvironment extends js.Object {
  var arguments: js.Array[String] = js.native
  var newLine: String = js.native
  var standardOut: ITextWriter = js.native
  def currentDirectory(): String = js.native
  def deleteFile(path: String): Unit = js.native
  def directoryExists(path: String): Boolean = js.native
  def fileExists(path: String): Boolean = js.native
  def listFiles(path: String): js.Array[String] = js.native
  def listFiles(path: String, re: js.RegExp): js.Array[String] = js.native
  def listFiles(path: String, re: js.RegExp, options: Anon_Recursive): js.Array[String] = js.native
  def readFile(path: String, codepage: Double): FileInformation = js.native
  def supportsCodePage(): Boolean = js.native
  def writeFile(path: String, contents: String, writeByteOrderMark: Boolean): Unit = js.native
}


package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.CompilationSettings
import typingsSlinky.typescriptServices.TypeScript.IPreProcessedFileInfo
import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreServices extends js.Object {
  var host: ICoreServicesHost
  def collectGarbage(): Unit
  def dumpMemory(): String
  def getDefaultCompilationSettings(): CompilationSettings
  def getMemoryInfo(): js.Array[_]
  def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo
}

object CoreServices {
  @scala.inline
  def apply(
    collectGarbage: () => Unit,
    dumpMemory: () => String,
    getDefaultCompilationSettings: () => CompilationSettings,
    getMemoryInfo: () => js.Array[_],
    getPreProcessedFileInfo: (String, IScriptSnapshot) => IPreProcessedFileInfo,
    host: ICoreServicesHost
  ): CoreServices = {
    val __obj = js.Dynamic.literal(collectGarbage = js.Any.fromFunction0(collectGarbage), dumpMemory = js.Any.fromFunction0(dumpMemory), getDefaultCompilationSettings = js.Any.fromFunction0(getDefaultCompilationSettings), getMemoryInfo = js.Any.fromFunction0(getMemoryInfo), getPreProcessedFileInfo = js.Any.fromFunction2(getPreProcessedFileInfo), host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreServices]
  }
}


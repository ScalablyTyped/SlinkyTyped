package typingsSlinky.typescriptServices.global.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.CompilationSettings
import typingsSlinky.typescriptServices.TypeScript.IPreProcessedFileInfo
import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import typingsSlinky.typescriptServices.TypeScript.Services.ICoreServicesHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.CoreServices")
@js.native
class CoreServices protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.CoreServices {
  def this(host: ICoreServicesHost) = this()
  /* CompleteClass */
  override var host: ICoreServicesHost = js.native
  /* CompleteClass */
  override def collectGarbage(): Unit = js.native
  /* CompleteClass */
  override def dumpMemory(): String = js.native
  /* CompleteClass */
  override def getDefaultCompilationSettings(): CompilationSettings = js.native
  /* CompleteClass */
  override def getMemoryInfo(): js.Array[_] = js.native
  /* CompleteClass */
  override def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo = js.native
}


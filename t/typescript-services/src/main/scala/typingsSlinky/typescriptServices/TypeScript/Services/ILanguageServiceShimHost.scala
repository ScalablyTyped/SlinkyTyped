package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanguageServiceShimHost extends ILogger {
  def directoryExists(path: String): Boolean = js.native
  def fileExists(path: String): Boolean = js.native
  def getCompilationSettings(): String = js.native
  def getDiagnosticsObject(): ILanguageServicesDiagnostics = js.native
  def getLocalizedDiagnosticMessages(): String = js.native
  def getParentDirectory(path: String): String = js.native
  def getScriptByteOrderMark(fileName: String): Double = js.native
  def getScriptFileNames(): String = js.native
  def getScriptIsOpen(fileName: String): Boolean = js.native
  def getScriptSnapshot(fileName: String): IScriptSnapshotShim = js.native
  def getScriptVersion(fileName: String): Double = js.native
  def resolveRelativePath(path: String, directory: String): String = js.native
}

object ILanguageServiceShimHost {
  @scala.inline
  def apply(
    debug: () => Boolean,
    directoryExists: String => Boolean,
    error: () => Boolean,
    fatal: () => Boolean,
    fileExists: String => Boolean,
    getCompilationSettings: () => String,
    getDiagnosticsObject: () => ILanguageServicesDiagnostics,
    getLocalizedDiagnosticMessages: () => String,
    getParentDirectory: String => String,
    getScriptByteOrderMark: String => Double,
    getScriptFileNames: () => String,
    getScriptIsOpen: String => Boolean,
    getScriptSnapshot: String => IScriptSnapshotShim,
    getScriptVersion: String => Double,
    information: () => Boolean,
    log: String => Unit,
    resolveRelativePath: (String, String) => String,
    warning: () => Boolean
  ): ILanguageServiceShimHost = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), directoryExists = js.Any.fromFunction1(directoryExists), error = js.Any.fromFunction0(error), fatal = js.Any.fromFunction0(fatal), fileExists = js.Any.fromFunction1(fileExists), getCompilationSettings = js.Any.fromFunction0(getCompilationSettings), getDiagnosticsObject = js.Any.fromFunction0(getDiagnosticsObject), getLocalizedDiagnosticMessages = js.Any.fromFunction0(getLocalizedDiagnosticMessages), getParentDirectory = js.Any.fromFunction1(getParentDirectory), getScriptByteOrderMark = js.Any.fromFunction1(getScriptByteOrderMark), getScriptFileNames = js.Any.fromFunction0(getScriptFileNames), getScriptIsOpen = js.Any.fromFunction1(getScriptIsOpen), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getScriptVersion = js.Any.fromFunction1(getScriptVersion), information = js.Any.fromFunction0(information), log = js.Any.fromFunction1(log), resolveRelativePath = js.Any.fromFunction2(resolveRelativePath), warning = js.Any.fromFunction0(warning))
    __obj.asInstanceOf[ILanguageServiceShimHost]
  }
  @scala.inline
  implicit class ILanguageServiceShimHostOps[Self <: ILanguageServiceShimHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryExists(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryExists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFileExists(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCompilationSettings(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompilationSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDiagnosticsObject(value: () => ILanguageServicesDiagnostics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDiagnosticsObject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLocalizedDiagnosticMessages(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalizedDiagnosticMessages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParentDirectory(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentDirectory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScriptByteOrderMark(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptByteOrderMark")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScriptFileNames(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptFileNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScriptIsOpen(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptIsOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScriptSnapshot(value: String => IScriptSnapshotShim): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptSnapshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScriptVersion(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptVersion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolveRelativePath(value: (String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveRelativePath")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


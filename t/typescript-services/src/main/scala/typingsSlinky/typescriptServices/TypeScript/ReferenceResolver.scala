package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceResolver extends js.Object {
  var host: js.Any = js.native
  var inputFileNames: js.Any = js.native
  var useCaseSensitiveFileResolution: js.Any = js.native
  var visited: js.Any = js.native
  /* private */ def getNormalizedFilePath(path: js.Any, parentFilePath: js.Any): js.Any = js.native
  /* private */ def getUniqueFileId(filePath: js.Any): js.Any = js.native
  /* private */ def isSameFile(filePath1: js.Any, filePath2: js.Any): js.Any = js.native
  /* private */ def isVisited(filePath: js.Any): js.Any = js.native
  /* private */ def recordVisitedFile(filePath: js.Any): js.Any = js.native
  /* private */ def resolveFile(normalizedPath: js.Any, resolutionResult: js.Any): js.Any = js.native
  /* private */ def resolveImportedFile(path: js.Any, referenceLocation: js.Any, resolutionResult: js.Any): js.Any = js.native
  /* private */ def resolveIncludedFile(path: js.Any, referenceLocation: js.Any, resolutionResult: js.Any): js.Any = js.native
  def resolveInputFiles(): ReferenceResolutionResult = js.native
}

object ReferenceResolver {
  @scala.inline
  def apply(
    getNormalizedFilePath: (js.Any, js.Any) => js.Any,
    getUniqueFileId: js.Any => js.Any,
    host: js.Any,
    inputFileNames: js.Any,
    isSameFile: (js.Any, js.Any) => js.Any,
    isVisited: js.Any => js.Any,
    recordVisitedFile: js.Any => js.Any,
    resolveFile: (js.Any, js.Any) => js.Any,
    resolveImportedFile: (js.Any, js.Any, js.Any) => js.Any,
    resolveIncludedFile: (js.Any, js.Any, js.Any) => js.Any,
    resolveInputFiles: () => ReferenceResolutionResult,
    useCaseSensitiveFileResolution: js.Any,
    visited: js.Any
  ): ReferenceResolver = {
    val __obj = js.Dynamic.literal(getNormalizedFilePath = js.Any.fromFunction2(getNormalizedFilePath), getUniqueFileId = js.Any.fromFunction1(getUniqueFileId), host = host.asInstanceOf[js.Any], inputFileNames = inputFileNames.asInstanceOf[js.Any], isSameFile = js.Any.fromFunction2(isSameFile), isVisited = js.Any.fromFunction1(isVisited), recordVisitedFile = js.Any.fromFunction1(recordVisitedFile), resolveFile = js.Any.fromFunction2(resolveFile), resolveImportedFile = js.Any.fromFunction3(resolveImportedFile), resolveIncludedFile = js.Any.fromFunction3(resolveIncludedFile), resolveInputFiles = js.Any.fromFunction0(resolveInputFiles), useCaseSensitiveFileResolution = useCaseSensitiveFileResolution.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceResolver]
  }
  @scala.inline
  implicit class ReferenceResolverOps[Self <: ReferenceResolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetNormalizedFilePath(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNormalizedFilePath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetUniqueFileId(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUniqueFileId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHost(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputFileNames(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSameFile(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSameFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsVisited(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisited")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRecordVisitedFile(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordVisitedFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolveFile(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResolveImportedFile(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveImportedFile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withResolveIncludedFile(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveIncludedFile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withResolveInputFiles(value: () => ReferenceResolutionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveInputFiles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUseCaseSensitiveFileResolution(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCaseSensitiveFileResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisited(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visited")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


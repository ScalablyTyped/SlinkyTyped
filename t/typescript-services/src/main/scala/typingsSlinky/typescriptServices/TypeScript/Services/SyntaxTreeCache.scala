package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.SyntaxTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxTreeCache extends js.Object {
  var _currentFileName: js.Any = js.native
  var _currentFileScriptSnapshot: js.Any = js.native
  var _currentFileSyntaxTree: js.Any = js.native
  var _currentFileVersion: js.Any = js.native
  var _host: js.Any = js.native
  var _hostCache: js.Any = js.native
  /* private */ def createSyntaxTree(fileName: js.Any, scriptSnapshot: js.Any): js.Any = js.native
  /* private */ def ensureInvariants(
    fileName: js.Any,
    editRange: js.Any,
    incrementalTree: js.Any,
    oldScriptSnapshot: js.Any,
    newScriptSnapshot: js.Any
  ): js.Any = js.native
  def getCurrentFileSyntaxTree(fileName: String): SyntaxTree = js.native
  /* private */ def updateSyntaxTree(fileName: js.Any, scriptSnapshot: js.Any, previousSyntaxTree: js.Any, previousFileVersion: js.Any): js.Any = js.native
}

object SyntaxTreeCache {
  @scala.inline
  def apply(
    _currentFileName: js.Any,
    _currentFileScriptSnapshot: js.Any,
    _currentFileSyntaxTree: js.Any,
    _currentFileVersion: js.Any,
    _host: js.Any,
    _hostCache: js.Any,
    createSyntaxTree: (js.Any, js.Any) => js.Any,
    ensureInvariants: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    getCurrentFileSyntaxTree: String => SyntaxTree,
    updateSyntaxTree: (js.Any, js.Any, js.Any, js.Any) => js.Any
  ): SyntaxTreeCache = {
    val __obj = js.Dynamic.literal(_currentFileName = _currentFileName.asInstanceOf[js.Any], _currentFileScriptSnapshot = _currentFileScriptSnapshot.asInstanceOf[js.Any], _currentFileSyntaxTree = _currentFileSyntaxTree.asInstanceOf[js.Any], _currentFileVersion = _currentFileVersion.asInstanceOf[js.Any], _host = _host.asInstanceOf[js.Any], _hostCache = _hostCache.asInstanceOf[js.Any], createSyntaxTree = js.Any.fromFunction2(createSyntaxTree), ensureInvariants = js.Any.fromFunction5(ensureInvariants), getCurrentFileSyntaxTree = js.Any.fromFunction1(getCurrentFileSyntaxTree), updateSyntaxTree = js.Any.fromFunction4(updateSyntaxTree))
    __obj.asInstanceOf[SyntaxTreeCache]
  }
  @scala.inline
  implicit class SyntaxTreeCacheOps[Self <: SyntaxTreeCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_currentFileName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentFileScriptSnapshot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentFileScriptSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentFileSyntaxTree(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentFileSyntaxTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentFileVersion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentFileVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_host(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_hostCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hostCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateSyntaxTree(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSyntaxTree")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEnsureInvariants(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ensureInvariants")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withGetCurrentFileSyntaxTree(value: String => SyntaxTree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentFileSyntaxTree")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateSyntaxTree(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSyntaxTree")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}


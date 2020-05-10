package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageServiceHost extends ModuleSpecifierResolutionHost {
  var error: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.native
  var getCancellationToken: js.UndefOr[js.Function0[HostCancellationToken]] = js.native
  /**
    * Gets a set of custom transformers to use during emit.
    */
  var getCustomTransformers: js.UndefOr[js.Function0[js.UndefOr[CustomTransformers]]] = js.native
  var getDirectories: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, js.Array[java.lang.String]]] = js.native
  var getLocalizedDiagnosticMessages: js.UndefOr[js.Function0[_]] = js.native
  var getNewLine: js.UndefOr[js.Function0[java.lang.String]] = js.native
  var getProjectReferences: js.UndefOr[js.Function0[js.UndefOr[js.Array[ProjectReference]]]] = js.native
  var getProjectVersion: js.UndefOr[js.Function0[java.lang.String]] = js.native
  var getResolvedModuleWithFailedLookupLocationsFromCache: js.UndefOr[
    js.Function2[
      /* modulename */ java.lang.String, 
      /* containingFile */ java.lang.String, 
      js.UndefOr[ResolvedModuleWithFailedLookupLocations]
    ]
  ] = js.native
  var getScriptKind: js.UndefOr[js.Function1[/* fileName */ java.lang.String, ScriptKind]] = js.native
  var getTypeRootsVersion: js.UndefOr[js.Function0[Double]] = js.native
  var installPackage: js.UndefOr[
    js.Function1[/* options */ InstallPackageOptions, js.Promise[ApplyCodeActionCommandResult]]
  ] = js.native
  var isKnownTypesPackageName: js.UndefOr[js.Function1[/* name */ java.lang.String, Boolean]] = js.native
  var log: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.native
  var readDirectory: js.UndefOr[
    js.Function5[
      /* path */ java.lang.String, 
      /* extensions */ js.UndefOr[js.Array[java.lang.String]], 
      /* exclude */ js.UndefOr[js.Array[java.lang.String]], 
      /* include */ js.UndefOr[js.Array[java.lang.String]], 
      /* depth */ js.UndefOr[Double], 
      js.Array[java.lang.String]
    ]
  ] = js.native
  @JSName("readFile")
  var readFile_LanguageServiceHost: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* encoding */ js.UndefOr[java.lang.String], 
      js.UndefOr[java.lang.String]
    ]
  ] = js.native
  var realpath: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.native
  var resolveModuleNames: js.UndefOr[
    js.Function5[
      /* moduleNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* reusedNames */ js.UndefOr[js.Array[java.lang.String]], 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      js.Array[js.UndefOr[ResolvedModule]]
    ]
  ] = js.native
  var resolveTypeReferenceDirectives: js.UndefOr[
    js.Function4[
      /* typeDirectiveNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ]
  ] = js.native
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.native
  var writeFile: js.UndefOr[
    js.Function2[/* fileName */ java.lang.String, /* content */ java.lang.String, Unit]
  ] = js.native
  def getCompilationSettings(): CompilerOptions = js.native
  @JSName("getCurrentDirectory")
  def getCurrentDirectory_MLanguageServiceHost(): java.lang.String = js.native
  def getDefaultLibFileName(options: CompilerOptions): java.lang.String = js.native
  def getScriptFileNames(): js.Array[java.lang.String] = js.native
  def getScriptSnapshot(fileName: java.lang.String): js.UndefOr[IScriptSnapshot] = js.native
  def getScriptVersion(fileName: java.lang.String): java.lang.String = js.native
}

object LanguageServiceHost {
  @scala.inline
  def apply(
    getCompilationSettings: () => CompilerOptions,
    getCurrentDirectory: () => java.lang.String,
    getDefaultLibFileName: CompilerOptions => java.lang.String,
    getScriptFileNames: () => js.Array[java.lang.String],
    getScriptSnapshot: java.lang.String => js.UndefOr[IScriptSnapshot],
    getScriptVersion: java.lang.String => java.lang.String
  ): LanguageServiceHost = {
    val __obj = js.Dynamic.literal(getCompilationSettings = js.Any.fromFunction0(getCompilationSettings), getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory), getDefaultLibFileName = js.Any.fromFunction1(getDefaultLibFileName), getScriptFileNames = js.Any.fromFunction0(getScriptFileNames), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getScriptVersion = js.Any.fromFunction1(getScriptVersion))
    __obj.asInstanceOf[LanguageServiceHost]
  }
  @scala.inline
  implicit class LanguageServiceHostOps[Self <: LanguageServiceHost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCompilationSettings(value: () => CompilerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompilationSettings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentDirectory(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentDirectory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDefaultLibFileName(value: CompilerOptions => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultLibFileName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScriptFileNames(value: () => js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptFileNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScriptSnapshot(value: java.lang.String => js.UndefOr[IScriptSnapshot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptSnapshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetScriptVersion(value: java.lang.String => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptVersion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withError(value: /* s */ java.lang.String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCancellationToken(value: () => HostCancellationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCancellationToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCancellationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCancellationToken")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCustomTransformers(value: () => js.UndefOr[CustomTransformers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomTransformers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCustomTransformers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomTransformers")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDirectories(value: /* directoryName */ java.lang.String => js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirectories")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDirectories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirectories")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLocalizedDiagnosticMessages(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalizedDiagnosticMessages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLocalizedDiagnosticMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocalizedDiagnosticMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNewLine(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNewLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNewLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNewLine")(js.undefined)
        ret
    }
    @scala.inline
    def withGetProjectReferences(value: () => js.UndefOr[js.Array[ProjectReference]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProjectReferences")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetProjectReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProjectReferences")(js.undefined)
        ret
    }
    @scala.inline
    def withGetProjectVersion(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProjectVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetProjectVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProjectVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withGetResolvedModuleWithFailedLookupLocationsFromCache(
      value: (/* modulename */ java.lang.String, /* containingFile */ java.lang.String) => js.UndefOr[ResolvedModuleWithFailedLookupLocations]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResolvedModuleWithFailedLookupLocationsFromCache")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetResolvedModuleWithFailedLookupLocationsFromCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResolvedModuleWithFailedLookupLocationsFromCache")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScriptKind(value: /* fileName */ java.lang.String => ScriptKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptKind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetScriptKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptKind")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTypeRootsVersion(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypeRootsVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTypeRootsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypeRootsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallPackage(value: /* options */ InstallPackageOptions => js.Promise[ApplyCodeActionCommandResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installPackage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInstallPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withIsKnownTypesPackageName(value: /* name */ java.lang.String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKnownTypesPackageName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsKnownTypesPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKnownTypesPackageName")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: /* s */ java.lang.String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withReadDirectory(
      value: (/* path */ java.lang.String, /* extensions */ js.UndefOr[js.Array[java.lang.String]], /* exclude */ js.UndefOr[js.Array[java.lang.String]], /* include */ js.UndefOr[js.Array[java.lang.String]], /* depth */ js.UndefOr[Double]) => js.Array[java.lang.String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readDirectory")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutReadDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withReadFile(
      value: (/* path */ java.lang.String, /* encoding */ js.UndefOr[java.lang.String]) => js.UndefOr[java.lang.String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReadFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(js.undefined)
        ret
    }
    @scala.inline
    def withRealpath(value: /* path */ java.lang.String => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realpath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRealpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realpath")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveModuleNames(
      value: (/* moduleNames */ js.Array[java.lang.String], /* containingFile */ java.lang.String, /* reusedNames */ js.UndefOr[js.Array[java.lang.String]], /* redirectedReference */ js.UndefOr[ResolvedProjectReference], /* options */ CompilerOptions) => js.Array[js.UndefOr[ResolvedModule]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleNames")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutResolveModuleNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveModuleNames")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveTypeReferenceDirectives(
      value: (/* typeDirectiveNames */ js.Array[java.lang.String], /* containingFile */ java.lang.String, /* redirectedReference */ js.UndefOr[ResolvedProjectReference], /* options */ CompilerOptions) => js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveTypeReferenceDirectives")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutResolveTypeReferenceDirectives: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveTypeReferenceDirectives")(js.undefined)
        ret
    }
    @scala.inline
    def withTrace(value: /* s */ java.lang.String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteFile(value: (/* fileName */ java.lang.String, /* content */ java.lang.String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWriteFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeFile")(js.undefined)
        ret
    }
  }
  
}


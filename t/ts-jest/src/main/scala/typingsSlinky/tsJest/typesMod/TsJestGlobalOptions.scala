package typingsSlinky.tsJest.typesMod

import typingsSlinky.std.Record
import typingsSlinky.tsJest.anon.IgnoreCodes
import typingsSlinky.typescript.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TsJestGlobalOptions extends js.Object {
  
  var astTransformers: js.UndefOr[js.Array[String] | ConfigCustomTransformer] = js.native
  
  var babelConfig: js.UndefOr[Boolean | String | BabelConfig] = js.native
  
  var compiler: js.UndefOr[String] = js.native
  
  var diagnostics: js.UndefOr[Boolean | IgnoreCodes] = js.native
  
  var isolatedModules: js.UndefOr[Boolean] = js.native
  
  var packageJson: js.UndefOr[Boolean | String | (Record[String, _])] = js.native
  
  var stringifyContentPathRegex: js.UndefOr[String | js.RegExp] = js.native
  
  var tsConfig: js.UndefOr[Boolean | String | CompilerOptions] = js.native
  
  var tsconfig: js.UndefOr[Boolean | String | CompilerOptions] = js.native
}
object TsJestGlobalOptions {
  
  @scala.inline
  def apply(): TsJestGlobalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TsJestGlobalOptions]
  }
  
  @scala.inline
  implicit class TsJestGlobalOptionsOps[Self <: TsJestGlobalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAstTransformersVarargs(value: String*): Self = this.set("astTransformers", js.Array(value :_*))
    
    @scala.inline
    def setAstTransformers(value: js.Array[String] | ConfigCustomTransformer): Self = this.set("astTransformers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAstTransformers: Self = this.set("astTransformers", js.undefined)
    
    @scala.inline
    def setBabelConfig(value: Boolean | String | BabelConfig): Self = this.set("babelConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBabelConfig: Self = this.set("babelConfig", js.undefined)
    
    @scala.inline
    def setCompiler(value: String): Self = this.set("compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiler: Self = this.set("compiler", js.undefined)
    
    @scala.inline
    def setDiagnostics(value: Boolean | IgnoreCodes): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagnostics: Self = this.set("diagnostics", js.undefined)
    
    @scala.inline
    def setIsolatedModules(value: Boolean): Self = this.set("isolatedModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsolatedModules: Self = this.set("isolatedModules", js.undefined)
    
    @scala.inline
    def setPackageJson(value: Boolean | String | (Record[String, _])): Self = this.set("packageJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageJson: Self = this.set("packageJson", js.undefined)
    
    @scala.inline
    def setStringifyContentPathRegexRegExp(value: js.RegExp): Self = this.set("stringifyContentPathRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringifyContentPathRegex(value: String | js.RegExp): Self = this.set("stringifyContentPathRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringifyContentPathRegex: Self = this.set("stringifyContentPathRegex", js.undefined)
    
    @scala.inline
    def setTsConfig(value: Boolean | String | CompilerOptions): Self = this.set("tsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTsConfig: Self = this.set("tsConfig", js.undefined)
  }
}

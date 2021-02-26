package typingsSlinky.vueCompilerSfc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AssetURLTagConfig = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  
  @scala.inline
  def compileScript(sfc: typingsSlinky.vueCompilerSfc.mod.SFCDescriptor): typingsSlinky.vueCompilerSfc.mod.SFCScriptBlock = typingsSlinky.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compileScript")(sfc.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerSfc.mod.SFCScriptBlock]
  @scala.inline
  def compileScript(
    sfc: typingsSlinky.vueCompilerSfc.mod.SFCDescriptor,
    options: typingsSlinky.vueCompilerSfc.mod.SFCScriptCompileOptions
  ): typingsSlinky.vueCompilerSfc.mod.SFCScriptBlock = (typingsSlinky.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compileScript")(sfc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerSfc.mod.SFCScriptBlock]
  
  @scala.inline
  def compileStyle(options: typingsSlinky.vueCompilerSfc.mod.SFCStyleCompileOptions): typingsSlinky.vueCompilerSfc.mod.SFCStyleCompileResults = typingsSlinky.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compileStyle")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerSfc.mod.SFCStyleCompileResults]
  
  @scala.inline
  def compileStyleAsync(options: typingsSlinky.vueCompilerSfc.mod.SFCAsyncStyleCompileOptions): js.Promise[typingsSlinky.vueCompilerSfc.mod.SFCStyleCompileResults] = typingsSlinky.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compileStyleAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.vueCompilerSfc.mod.SFCStyleCompileResults]]
  
  @scala.inline
  def compileTemplate(options: typingsSlinky.vueCompilerSfc.mod.SFCTemplateCompileOptions): typingsSlinky.vueCompilerSfc.mod.SFCTemplateCompileResults = typingsSlinky.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compileTemplate")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerSfc.mod.SFCTemplateCompileResults]
  
  @scala.inline
  def generateCodeFrame(source: java.lang.String): java.lang.String = typingsSlinky.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def generateCodeFrame(source: java.lang.String, start: js.UndefOr[scala.Nothing], end: scala.Double): java.lang.String = (typingsSlinky.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def generateCodeFrame(source: java.lang.String, start: scala.Double): java.lang.String = (typingsSlinky.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def generateCodeFrame(source: java.lang.String, start: scala.Double, end: scala.Double): java.lang.String = (typingsSlinky.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def parse(source: java.lang.String): typingsSlinky.vueCompilerSfc.mod.SFCParseResult = typingsSlinky.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueCompilerSfc.mod.SFCParseResult]
  @scala.inline
  def parse(
    source: java.lang.String,
    hasSourceMapFilenameSourceRootPadCompiler: typingsSlinky.vueCompilerSfc.mod.SFCParseOptions
  ): typingsSlinky.vueCompilerSfc.mod.SFCParseResult = (typingsSlinky.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], hasSourceMapFilenameSourceRootPadCompiler.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueCompilerSfc.mod.SFCParseResult]
  
  @scala.inline
  def rewriteDefault(input: java.lang.String, as: java.lang.String): java.lang.String = (typingsSlinky.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rewriteDefault")(input.asInstanceOf[js.Any], as.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def rewriteDefault(
    input: java.lang.String,
    as: java.lang.String,
    parserPlugins: js.Array[typingsSlinky.babelParser.mod.ParserPlugin]
  ): java.lang.String = (typingsSlinky.vueCompilerSfc.mod.^.asInstanceOf[js.Dynamic].applyDynamic("rewriteDefault")(input.asInstanceOf[js.Any], as.asInstanceOf[js.Any], parserPlugins.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}

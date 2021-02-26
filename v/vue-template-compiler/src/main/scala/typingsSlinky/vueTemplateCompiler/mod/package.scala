package typingsSlinky.vueTemplateCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ASTElementHandlers = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.vueTemplateCompiler.mod.ASTElementHandler | js.Array[typingsSlinky.vueTemplateCompiler.mod.ASTElementHandler]
  ]
  
  type ASTModifiers = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  type DirectiveFunction = js.Function2[
    /* node */ typingsSlinky.vueTemplateCompiler.mod.ASTElement, 
    /* directiveMeta */ typingsSlinky.vueTemplateCompiler.mod.ASTDirective, 
    scala.Unit
  ]
  
  @scala.inline
  def compile(template: java.lang.String): typingsSlinky.vueTemplateCompiler.mod.CompiledResult[java.lang.String] = typingsSlinky.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueTemplateCompiler.mod.CompiledResult[java.lang.String]]
  @scala.inline
  def compile(template: java.lang.String, options: typingsSlinky.vueTemplateCompiler.mod.CompilerOptions): typingsSlinky.vueTemplateCompiler.mod.CompiledResult[java.lang.String] = (typingsSlinky.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueTemplateCompiler.mod.CompiledResult[java.lang.String]]
  @scala.inline
  def compile(
    template: java.lang.String,
    options: typingsSlinky.vueTemplateCompiler.mod.CompilerOptionsWithSourceRange
  ): typingsSlinky.vueTemplateCompiler.mod.CompiledResult[typingsSlinky.vueTemplateCompiler.mod.ErrorWithRange] = (typingsSlinky.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueTemplateCompiler.mod.CompiledResult[typingsSlinky.vueTemplateCompiler.mod.ErrorWithRange]]
  
  @scala.inline
  def compileToFunctions(template: java.lang.String): typingsSlinky.vueTemplateCompiler.mod.CompiledResultFunctions = typingsSlinky.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compileToFunctions")(template.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueTemplateCompiler.mod.CompiledResultFunctions]
  
  @scala.inline
  def generateCodeFrame(template: java.lang.String, start: scala.Double, end: scala.Double): java.lang.String = (typingsSlinky.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(template.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def parseComponent(file: java.lang.String): typingsSlinky.vueTemplateCompiler.mod.SFCDescriptor = typingsSlinky.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseComponent")(file.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueTemplateCompiler.mod.SFCDescriptor]
  @scala.inline
  def parseComponent(file: java.lang.String, options: typingsSlinky.vueTemplateCompiler.mod.SFCParserOptions): typingsSlinky.vueTemplateCompiler.mod.SFCDescriptor = (typingsSlinky.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseComponent")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueTemplateCompiler.mod.SFCDescriptor]
  
  @scala.inline
  def ssrCompile(template: java.lang.String): typingsSlinky.vueTemplateCompiler.mod.CompiledResult[java.lang.String] = typingsSlinky.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ssrCompile")(template.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueTemplateCompiler.mod.CompiledResult[java.lang.String]]
  @scala.inline
  def ssrCompile(template: java.lang.String, options: typingsSlinky.vueTemplateCompiler.mod.CompilerOptions): typingsSlinky.vueTemplateCompiler.mod.CompiledResult[java.lang.String] = (typingsSlinky.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ssrCompile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueTemplateCompiler.mod.CompiledResult[java.lang.String]]
  @scala.inline
  def ssrCompile(
    template: java.lang.String,
    options: typingsSlinky.vueTemplateCompiler.mod.CompilerOptionsWithSourceRange
  ): typingsSlinky.vueTemplateCompiler.mod.CompiledResult[typingsSlinky.vueTemplateCompiler.mod.ErrorWithRange] = (typingsSlinky.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ssrCompile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vueTemplateCompiler.mod.CompiledResult[typingsSlinky.vueTemplateCompiler.mod.ErrorWithRange]]
  
  @scala.inline
  def ssrCompileToFunctions(template: java.lang.String): typingsSlinky.vueTemplateCompiler.mod.CompiledResultFunctions = typingsSlinky.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ssrCompileToFunctions")(template.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vueTemplateCompiler.mod.CompiledResultFunctions]
}
